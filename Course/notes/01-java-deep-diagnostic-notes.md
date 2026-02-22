# Java Deep Diagnostic — JVM to Streams

**File name suggestion:** `java-deep-diagnostic-notes.md`

---

# 1) JVM & Memory Model

## Scenario

```java
Object create() {
    Object obj = new Object();
    return obj;
}
```

---

## Where Is the Object Allocated?

### Definition

Objects created using `new` are allocated in the **heap memory region** of the JVM.

### Precise Answer

* The `new Object()` allocates memory on the **heap**
* The **local variable `obj` (reference)** is stored in the **stack frame** of the method

### Memory Model Layout

```
Stack Frame (create())
-----------------------
obj  ----->  Heap Object (Object instance)
```

---

## Where Is the Reference Stored?

* `obj` is a **reference variable**
* Stored in the **method's stack frame**
* It contains a pointer (or handle) to heap memory

---

## When & How Is It Garbage Collected?

### Garbage Collection Trigger

An object becomes eligible for GC when:

* It is **no longer reachable** from any GC root

### GC Roots Include:

* Local variables in active stack frames
* Static fields
* JNI references
* Active threads

### In This Example

If:

```java
Object x = create();
```

The returned object remains reachable via `x`.

If:

```java
create();
```

No reference holds it → eligible after method exits.

### How It Is Collected

Modern JVM uses:

* **Generational GC**
* Young generation first
* Minor GC → Major GC → Full GC

Object typically starts in **Eden space**

---

## What If Escape Analysis Kicks In?

### Escape Analysis (JIT Optimization)

If JVM detects object does NOT escape the method:

* It may allocate it on the **stack**
* Or eliminate allocation entirely (scalar replacement)

### Meaning

Instead of:

```
Heap allocation
```

It becomes:

```
Stack allocation or no allocation
```

This reduces:

* GC pressure
* Allocation overhead

### Important

Escape analysis happens at **JIT compilation time**, not bytecode level.

---

## Why This Matters

* High object allocation → GC overhead
* Escape analysis is crucial for high-performance systems
* Understanding stack vs heap affects debugging memory leaks

---

# 2) HashMap Internals

## Example

```java
map.put("abc", 10);
```

---

## Full Flow

### Step 1: Hash Calculation

```java
int hash = key.hashCode();
hash ^= (hash >>> 16);
```

Purpose:

* Spread higher bits into lower bits
* Reduce collision clustering

---

### Step 2: Bucket Selection

```java
index = (n - 1) & hash;
```

Where:

* `n` = table length (power of 2)

Bit masking is faster than modulo.

---

### Step 3: Collision Handling

Three cases:

1. Bucket empty → insert node
2. Same key → replace value
3. Collision → traverse linked list

---

## Java 8+ Treeification

If:

* Bucket size ≥ 8
* AND table size ≥ 64

Linked list converts to **Red-Black Tree**

Why?
Worst case linked list = O(n)
Tree = O(log n)

---

## Resizing

Triggered when:

```
size > capacity × loadFactor
(default loadFactor = 0.75)
```

Process:

* New array = double size
* Rehash all entries

Cost:
O(n)

---

## Time Complexity

| Case               | Complexity |
| ------------------ | ---------- |
| Average            | O(1)       |
| Worst (pre Java 8) | O(n)       |
| Worst (Java 8+)    | O(log n)   |

---

## Why This Matters

Poor `hashCode()` → collisions → performance collapse

---

# 3) Pass-by-Value Reality

## Code

```java
void modify(List<Integer> list) {
    list.add(10);
}
```

---

## Java Is Pass-by-Value — Precisely

Java passes:

* A **copy of the reference value**

Not:

* The object itself
* Not the variable itself

---

## Memory Explanation

Caller:

```
main stack:
list  ---> Heap List Object
```

Method call:

```
modify stack:
list_copy ---> SAME Heap List Object
```

Both references point to same object.

Modifying object state → visible outside.

Reassigning reference inside method → NOT visible.

---

## Why It Matters

Understanding prevents confusion in:

* Multithreading
* Immutable design
* Defensive copying

---

# 4) Concurrency — The Counter Problem

## Code

```java
class Counter {
    int count = 0;
    void increment() {
        count++;
    }
}
```

---

## Exact Failure Scenario

`count++` is NOT atomic.

It translates to:

1. Read count
2. Add 1
3. Write back

Two threads:

```
T1 reads 5
T2 reads 5
T1 writes 6
T2 writes 6
```

Expected 7 → got 6.

Lost update.

---

## CPU-Level Cause

* CPU caches
* Reordering
* No memory barriers
* No atomic instruction

---

## How synchronized Fixes It

```java
synchronized void increment() {
    count++;
}
```

Ensures:

* Mutual exclusion
* Memory visibility
* Happens-before relationship

Uses monitor lock.

Cost:

* Blocking
* Context switching

---

## How AtomicInteger Fixes It

```java
AtomicInteger count = new AtomicInteger(0);
count.incrementAndGet();
```

Uses:

* CAS (Compare-And-Swap)

CAS:

* Compare memory value
* Swap if unchanged
* Retry if failed

Non-blocking.

---

## Which For High Throughput?

Use:

* `AtomicInteger`
* Or `LongAdder` for heavy contention

Reason:

* Avoids blocking
* Better scalability

---

# 5) Generics & Type Erasure

## Illegal Code

```java
List<String>[] arr = new List<String>[10];
```

---

## Why Illegal?

Arrays are:

* Reified (know element type at runtime)

Generics are:

* Erased at compile time

If allowed:

```
Object[] arr = new List<String>[10];
arr[0] = new ArrayList<Integer>(); // runtime issue
```

Breaks type safety.

---

## What Type Erasure Removes

* Generic type parameters
* Replaces with raw type
* Inserts casts where needed

`List<String>` → `List`

---

## Where Type Info Still Exists

* In bytecode metadata
* Reflection (via `getGenericType()`)
* Not in runtime object itself

---

## Why Same Class Object?

```java
List<String>.class == List<Integer>.class
```

Because both erased to `List`.

---

# 6) Exception Design in Payments API

## Checked Exceptions

Use when:

* Caller must handle it
* Recoverable scenario
* Business rule violations

Example:
`InsufficientFundsException`

---

## Unchecked Exceptions

Use when:

* Programming error
* Illegal state
* Null pointer

Example:
`IllegalArgumentException`

---

## Custom Hierarchy

```
PaymentException
 ├── ValidationException
 ├── ProcessingException
 └── ExternalGatewayException
```

Benefits:

* Clean API
* Structured handling
* Clear error contracts

---

## When Exceptions Are Bad Design

Bad when:

* Used for control flow
* Used in hot loops
* For expected conditions

Exceptions are expensive:

* Stack trace capture
* Object creation

---

# 7) Streams vs Loops

## Stream Version

```java
list.stream()
    .filter(x -> x > 10)
    .map(x -> x * 2)
    .toList();
```

---

## Loop Version

```java
for (int x : list) {
   if (x > 10) result.add(x * 2);
}
```

---

## Runtime Behavior

Streams:

* Build pipeline
* Lazy evaluation
* Internal iteration
* Lambda objects created

Loops:

* Direct bytecode
* No lambda overhead

---

## Allocation Cost

Streams:

* Lambda instances
* Intermediate objects (sometimes optimized)

Loops:

* Minimal allocation

---

## Parallelization

Streams:

```java
parallelStream()
```

Uses:

* ForkJoinPool
* Spliterator

Loops:

* Manual thread management required

---

## When Streams Degrade Performance

* Small collections
* Tight loops
* High-frequency calls
* Boxing/unboxing overhead

---

## When Streams Are Architecturally Superior

* Complex transformations
* Functional composition
* Parallelizable workloads
* Declarative pipelines

---

# Mental Models

| Concept | Mental Model            |
| ------- | ----------------------- |
| Heap    | Shared warehouse        |
| Stack   | Call-specific clipboard |
| HashMap | Indexed buckets         |
| CAS     | Optimistic retry        |
| Streams | Data conveyor belt      |

---

# Quick Revision (5 Points)

1. Objects live on heap; references live on stack.
2. HashMap uses bit-masked hashing and treeifies at 8 entries.
3. Java passes copy of reference value.
4. `count++` is read-modify-write → not atomic.
5. Generics erased → arrays reified → unsafe combination.

---

# 3 Interview Questions

1. Explain how escape analysis can eliminate object allocation.
2. Why does HashMap require power-of-two capacity?
3. How does CAS guarantee atomicity without locking?

---

If you want the next step:

We identify your weakest conceptual layer:

* JVM internals
* Concurrency
* Memory model
* Generics
* Or performance tuning

That’s where serious interviews break candidates.
