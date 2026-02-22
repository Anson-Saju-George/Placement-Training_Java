# Java Assignment — Value vs Reference (Ultra Core)

If this is unclear, everything later breaks.

---

## 1️⃣ Primitive = Value Copy

```java
int a = 10;
int b = a;

b = 20;

System.out.println(a); // 10
System.out.println(b); // 20
````

**Why?**

* `a` and `b` store raw values
* `b = a` copies `10`
* No shared memory

Memory:

```
Stack:
a → 10
b → 20
```

---

## 2️⃣ Object = Reference Copy

```java
String s1 = "hello";
String s2 = s1;

s2 = "world";

System.out.println(s1); // hello
System.out.println(s2); // world
```

**What happened?**

* Variables live in stack
* Objects live in heap
* `s2 = s1` copied the reference
* `s2 = "world"` changed what s2 points to
* `"hello"` never changed

Memory:

```
Stack:        Heap:
s1 ────────> "hello"
s2 ────────> "world"
```

---

## 3️⃣ Method Calls

Java is **always pass-by-value**.

### Primitive

```java
int x = 5;
modify(x);  // still 5
```

Value copied → original untouched.

### Immutable Object

```java
String s = "hello";
modify(s);  // still "hello"
```

Reference copied → reassignment local only.

### Mutable Object

```java
StringBuilder sb = new StringBuilder("hello");
modify(sb);  // modified
```

Reference copied → mutation affects same heap object.

---

# Final Law

Java has only two assignment behaviors:

* Primitive → copy value
* Object → copy reference

Java never auto-copies full objects.

