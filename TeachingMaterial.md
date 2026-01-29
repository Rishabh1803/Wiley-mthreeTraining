```markdown
# Java Backend Survival Guide: Exceptions & I/O
**Session Goal:** Move beyond "syntax that compiles" to "architecture that survives production."
**Audience:** Interns / Junior Developers
**Duration:** 45 Minutes

---

## 0. The Hook (0-5 Mins)
*Write this on the whiteboard immediately. Do not say hello first.*

```java
public int sanityCheck() {
    try {
        return 1;
    } catch (Exception e) {
        return 2;
    } finally {
        return 3;
    }
}


**The Question:** "What does this return? 1, 2, or 3?"
**The Answer:** **3**.
**The Lesson:** A `return` in `finally` swallows everything. It overrides exceptions and previous returns. **Never do this.**

---

## 1. The "Senior Dev" Bug: Mutation (5-15 Mins)

**Context:** *A developer tried to clean up a session object in `finally` to be safe. It caused a production bug.*

### 🔴 The Trap (Bad Code)

```java
public UserSession login(String user) {
    UserSession session = new UserSession(user); // Status: ACTIVE
    try {
        // ... auth logic ...
        return session; // We intend to return the ACTIVE session
    } finally {
        // Cleanup attempt
        session.setStatus(null); // <--- DANGER: Mutates the object on the Heap
        session = null;          // <--- RED HERRING: Only changes local variable
    }
}


**Discussion:**

* **Q:** Does the caller get `null` (the object) or `null` (the status)?
* **A:** They get the object, but the status is `null`.
* **Why?**
* `return session` puts the *reference* (memory address) on the stack.
* `finally` runs and follows that address to modify the data.
* `session = null` only clears the local variable, not the returned address.



**[Visual Aid Idea]:** Draw a Stack (variables) vs. Heap (objects) diagram to show how the reference is preserved but the object inside is changed.

---

## 2. I/O Mechanics: Performance & Buffering (15-30 Mins)

**Context:** *Ops is complaining that the server CPU is spiking during file processing.*

### 🔴 The Trap (Byte-by-Byte Processing)

```java
// Terrible Performance
FileInputStream in = new FileInputStream("large_video.mp4");
FileOutputStream out = new FileOutputStream("copy.mp4");
int data;

// This loop makes a system call for EVERY SINGLE BYTE.
// For a 1MB file, that is 1,000,000 interactions with the OS.
while ((data = in.read()) != -1) {
    out.write(data);
}


### 🟢 The Solution (Buffering)

```java
// High Performance
BufferedInputStream bin = new BufferedInputStream(new FileInputStream("input.dat"));
BufferedOutputStream bout = new BufferedOutputStream(new FileOutputStream("output.dat"));

int data;
// Reads chunks (8KB default) into memory.
// Only hits the disk when the buffer is empty.
while ((data = bin.read()) != -1) {
    bout.write(data);
}


**The Rule:** Never use `FileInputStream` or `FileOutputStream` directly. Always wrap them in a **Buffer**.

---

## 3. Modern Resource Management: Try-With-Resources (30-40 Mins)

**Context:** *We are leaking file descriptors because someone forgot a `close()` or handled it wrong.*

### 🔴 The Trap (The "Old School" Way)

```java
FileInputStream in = null;
try {
    in = new FileInputStream("data.txt");
    // read...
} catch (IOException e) {
    throw e;
} finally {
    if (in != null) {
        try {
            in.close(); // If this throws, it MASKS the original error!
        } catch (IOException e) {
            // Log? Ignore? Messy.
        }
    }
}


### 🟢 The Solution (Try-With-Resources)

```java
// Java 7+: Resources in the parenthesis are auto-closed
try (var in = new BufferedInputStream(new FileInputStream("data.txt"))) {
    // Process data
} catch (IOException e) {
    // If read() failed AND close() failed:
    // 'e' is the read error.
    // The close error is preserved in e.getSuppressed()
    logger.error("File processing failed", e);
}


### 🚀 Pro Tip: The Java 9+ Transfer

```java
try (var in = new BufferedInputStream(new FileInputStream("src"));
     var out = new BufferedOutputStream(new FileOutputStream("dest"))) {
    
    in.transferTo(out); // Optimized one-liner
}


---

## 4. Text vs. Bytes: Encoding (40-45 Mins)

**Context:** *Why are my log files full of weird question marks?*

### 🔴 The Trap

```java
// Uses system default encoding (Dangerous!)
FileWriter writer = new FileWriter("log.txt"); 


### 🟢 The Solution

```java
// Explicitly define Charset (Standard)
BufferedWriter writer = Files.newBufferedWriter(Paths.get("log.txt"), StandardCharsets.UTF_8);

```

```

```
