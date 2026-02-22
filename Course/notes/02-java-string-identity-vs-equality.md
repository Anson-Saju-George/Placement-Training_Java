# Java String Identity vs Equality — Runtime Breakdown

You got `false` because two *different objects* existed in memory.  
Not because Java behaves unpredictably.

Let’s analyze what actually happens at runtime.

---

## Step-by-step — Memory State

```java
String a = "hello";
String b = "hello";
String c = new String("hello");
````

---

### 1) `String a = "hello";`

* JVM checks the **String Constant Pool**
* `"hello"` not present
* Creates one String object in the pool
* `a` points to that pooled object

---

### 2) `String b = "hello";`

* JVM checks pool again
* `"hello"` already exists
* No new object created
* `b` points to the SAME pooled object as `a`

```
a ─┐
   ├──> "hello" (String Pool)
b ─┘
```

---

### 3) `String c = new String("hello");`

You explicitly force object creation.

* JVM still uses pooled `"hello"` as base
* Allocates a new String object in heap memory
* `c` points to this heap object

```
a ─┐
   ├──> "hello" (pool)
b ─┘

c ─────> "hello" (heap object, different identity)
```

---

## Evaluating Comparisons

### `a == b`

* `==` checks **reference identity**
* Both point to same pooled object

Result:

```java
true
```

---

### `a == c`

* `a` → pooled object
* `c` → heap object
* Different memory addresses

Result:

```java
false
```

---

### `a.equals(c)`

`equals()` checks **value equality**, not identity.

Internally:

```java
return Arrays.equals(this.value, another.value);
```

Both contain `"hello"`.

Result:

```java
true
```

---

## Core Concept Most Candidates Miss

There are two distinct layers:

| Concept  | Meaning               |
| -------- | --------------------- |
| Identity | Same object in memory |
| Equality | Same logical value    |

* `==` → identity comparison
* `equals()` → logical equality (if overridden)

This distinction appears across:

* HashMap keys
* Caching systems
* Deduplication logic
* ORM entity comparisons
* Concurrency debugging

---

## When `==` Is Correct in Real Code

It is not “never.” That assumption is incorrect.

Use `==` when identity is required:

### 1) Enums

```java
if (status == Status.SUCCESS)
```

Enums are singletons.

### 2) Null Checks

```java
if (obj == null)
```

### 3) Singleton Instances

### 4) Comparing Class Objects

```java
if (obj.getClass() == String.class)
```

### 5) Identity-Based Logic

* Caches
* Flyweight patterns
* Object lifecycle tracking

---

## Real Production Bug from Misusing `==`

Common failure case:

```java
String role = request.getRole();

if (role == "ADMIN") {
    allowAccess();
}
```

Why it fails:

* `"ADMIN"` literal is pooled
* `request.getRole()` may return heap string (DB / JSON)

Identity mismatch → access denied.

Correct approach:

```java
if ("ADMIN".equals(role)) {
    allowAccess();
}
```

Also null-safe.

---

# Coding Round Check

Implement:

```java
boolean containsDuplicate(int[] nums)
```

### Requirements

* O(n) time complexity
* Java-specific reasoning
* Explain:

  * Why `HashSet` works internally
  * What happens during collisions
  * Space tradeoff
  * Worst-case performance

Do not jump directly to code.
Reasoning must come first.

```
```
