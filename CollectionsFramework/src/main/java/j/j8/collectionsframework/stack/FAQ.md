In Java 8, the `Stack` data structure is typically implemented using the `java.util.Stack` class, which is part of the
Java Collections Framework. Let's address your questions one by one:

1. **When to use?**
    - Use a `Stack` when you need to implement a last-in-first-out (LIFO) data structure. Common scenarios include
      parsing expressions, backtracking algorithms, and managing function call history.

2. **What is the principal usage?**
    - The primary use of a `Stack` is to store and manage elements in a LIFO order.

3. **What is the main advantage?**
    - The main advantage of using a `Stack` is its simplicity and efficiency for certain operations like push and pop.

4. **What is the main disadvantage?**
    - The main disadvantage of using a `Stack` is that it has a fixed size and may not be the best choice for dynamic
      data storage. Also, the `java.util.Stack` class is considered somewhat outdated, and it's recommended to
      use `Deque` (Double-ended queue) implementations like `java.util.ArrayDeque` for better performance and more
      functionality.

5. **When not to use?**
    - Avoid using a `Stack` when you need to access elements in a different order, such as first-in-first-out (FIFO). In
      such cases, you should use a `Queue`.

6. **What are the main methods of this structure?**
    - Common methods include `push`, `pop`, `peek`, `isEmpty`, and `size`.

7. **What is the BigO cost?**
    - The time complexity for typical `Stack` operations (`push`, `pop`, `peek`) is O(1), which means they have constant
      time complexity.

8. **What is the Memory and HD costs?**
    - The memory usage depends on the number of elements stored in the `Stack`. It will consume memory proportional to
      the number of elements.

9. **What other data structure is similar?**
    - A similar data structure to a `Stack` is a `Deque` (Double-ended queue). `java.util.ArrayDeque` is often
      recommended as a more versatile alternative to `java.util.Stack`.

10. **Is it thread-safe?**
- The `java.util.Stack` class is not considered thread-safe. If you need a thread-safe stack, you can
  use `java.util.concurrent.ConcurrentLinkedDeque` or use synchronization mechanisms.

11. **How to make it immutable?**
- To make a `Stack` immutable, you can wrap it with the `Collections.unmodifiableStack()` method.

12. **How to make it singleton?**
- You can create a singleton `Stack` by using the Singleton design pattern.

13. **What part of Java Memory this structure is stored (Heap, stack, other)?**
- The `Stack` data structure itself is stored on the heap memory. The elements it holds are also stored on the heap.

Keep in mind that if you need a more modern and versatile alternative to the `java.util.Stack`, you should consider
using a `Deque` implementation like `java.util.ArrayDeque`, which is generally recommended over the older `Stack` class.

