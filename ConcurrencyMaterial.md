This is a crucial addition. `Future` and `CompletableFuture` are the backbone of modern Java backend development (especially in Microservices).

The narrative flow works perfectly:

1. **Executors** give you a Pool.
2. **Futures** give you the *result* from that Pool.
3. **CompletableFutures** let you fix the fatal flaw of standard Futures (Blocking).

Here is the updated, complete **1-Hour Concurrency Masterclass** notes in Markdown. I have integrated the `Future` vs `CompletableFuture` module as the "Advanced" bridge.

```markdown
# Java Concurrency: The Execution Model
**Objective:** Stop using `new Thread()`. Master Async Composition.
**Duration:** 60 Minutes
**Audience:** Interns (Java Backend)

---

## 0. The Hook: The "OutOfMemory" Crash (00:00 - 05:00)
*Start with this code on the screen. Do not say hello.*

**The Setup:**
"We have a requirement to send 100,000 emails. A junior dev writes this. I am going to run this live. What happens?"

```java
public static void main(String[] args) {
    for (int i = 0; i < 100_000; i++) {
        // Creating a new thread for every single task
        new Thread(() -> {
            try { Thread.sleep(10000); } catch (Exception e) {}
        }).start();
        System.out.println("Thread " + i + " created");
    }
}

```

**The Reality:**

* **Prediction:** "It runs slow?"
* **Result:** `java.lang.OutOfMemoryError: unable to create new native thread` (or the OS freezes).
* **The Lesson:** Threads are expensive (~1MB stack). You cannot create them infinitely. You need a **Budget**.

---

## 1. The Executor Framework: The Budget (05:00 - 20:00)

**Concept:** Instead of creating a new worker for every task, we hire a fixed team (Pool) and queue the work.

### The Analogy: The Restaurant

* **`new Thread()`:** Hiring a brand new chef for *every single order* and firing them immediately.
* **`ExecutorService`:** Hiring 5 chefs. Orders go into a Queue. Chefs pick up the next order when they are free.

### The Code Drill

"I have 1000 image processing tasks. Which pool do I use?"

**Scenario A: Heavy CPU Tasks (Video Processing)**

* **Option 1:** `newCachedThreadPool()`
* **Option 2:** `newFixedThreadPool(10)`
* **Answer:** **Fixed**.
* **Why?** Cached creates threads if everyone is busy. If 10k videos come in, it creates 10k threads -> Crash.

**Scenario B: Tiny Wait Tasks (HTTP Requests)**

* **Option 1:** `newCachedThreadPool()`
* **Option 2:** `newFixedThreadPool(1)`
* **Answer:** **Cached** (or Fixed with high count).
* **Why?** Tasks are short. We want to spin up threads quickly to handle the burst.

### 🟢 The Solution Code

```java
// Create a pool of 2 threads
ExecutorService es = Executors.newFixedThreadPool(2);

for (int i = 0; i < 5; i++) {
    es.submit(() -> System.out.println("Task by " + Thread.currentThread().getName()));
}
es.shutdown(); // Mandatory!

```

---

## 2. The Return Value: `Future` (20:00 - 30:00)

**Concept:** `Runnable` is void. What if I need the result (e.g., the API response)?

### The Problem: The "Stare"

"I submit a task to the pool. I get a `Future<String>` back. How do I get the value?"

```java
ExecutorService es = Executors.newFixedThreadPool(2);
Future<Integer> future = es.submit(() -> {
    Thread.sleep(2000); // Simulate slow API
    return 42;
});

System.out.println("Doing other work...");
Integer result = future.get(); // <--- DANGER LINE
System.out.println("Result: " + result);

```

**The Trap:**

* **Q:** What happens at `future.get()`?
* **A:** The main thread **BLOCKS** (Stops). It waits 2 seconds.
* **Analogy:** Ordering coffee and staring at the barista for 2 minutes, refusing to check your phone or talk to anyone until the coffee is in your hand. This kills performance.

---

## 3. The Fix: `CompletableFuture` (30:00 - 45:00)

**Concept:** Don't block. Tell Java *what to do next* when the result arrives.

### The Code Drill

"We need to:

1. Fetch a User ID (Async)
2. **Then** fetch their Order History (Async)
3. **Then** send an Email."

**The Old Way (`Future`):**
Blocking hell. `user = f1.get(); orders = f2.get(user);`

**The Modern Way (`CompletableFuture`):**

```java
CompletableFuture.supplyAsync(() -> {
    return "User: Rishabh"; // Step 1: Run in ForkJoinPool
}).thenApply(user -> {
    return user + " | Order: iPhone"; // Step 2: Use result from Step 1
}).thenAccept(details -> {
    System.out.println("Emailing: " + details); // Step 3: Consume result
}); 

// Note: Main thread is FREE to do other things here!

```

**Key API Methods:**

* `supplyAsync()`: Start a job.
* `thenApply()`: Transform data (map).
* `thenAccept()`: Finish/Consume data (void).
* `exceptionally()`: Handle errors (try/catch equivalent).

---

## 4. Parallel Streams: The Magic Button (45:00 - 55:00)

**Concept:** "I don't want to write Executors or Futures. I just want my loop to be faster."

### The Visualization

### The Code

```java
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5...);

// Sequential
numbers.stream()
       .map(n -> slowTask(n))
       .forEach(System.out::println);

// Parallel (Uses all CPU cores automatically)
numbers.parallelStream() // <--- The Change
       .map(n -> slowTask(n))
       .forEach(System.out::println);

```

**The "Gotcha" Quiz:**
"I have a list of 10 integers. Should I use Parallel Stream?"

* **Answer:** **NO.**
* **Why?** The overhead of splitting the tasks and merging threads is slower than just doing the math sequentially. Only use Parallel Streams for **massive** datasets (10k+ items) or **IO-intensive** work.

---

## 5. Lab Challenge: The Stock Ticker (55:00 - 60:00)

**Task:**
"Use `CompletableFuture` to fetch the price of 'Apple' and 'Google' at the same time. Combine them and print 'Total Market Value'."

**Solution:**

```java
CompletableFuture<Integer> apple = CompletableFuture.supplyAsync(() -> getPrice("Apple"));
CompletableFuture<Integer> google = CompletableFuture.supplyAsync(() -> getPrice("Google"));

// Combine both results when BOTH are done
apple.thenCombine(google, (p1, p2) -> p1 + p2)
     .thenAccept(total -> System.out.println("Total Value: " + total));

```

```

```
