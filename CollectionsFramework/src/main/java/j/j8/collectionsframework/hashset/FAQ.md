Let's go through your questions about the HashSet data structure in Java 8:

1. **When to use HashSet?**
    - HashSet is a good choice when you need to store a collection of unique elements.

2. **What is the principal usage?**
    - HashSet is commonly used to store and manage a set of elements where duplicates are not allowed.

3. **What is the main advantage?**
    - The main advantage of HashSet is its constant-time average complexity for basic operations like add, remove, and
      contains, which makes it efficient for large datasets.

4. **What is the main disadvantage?**
    - HashSet does not guarantee any specific order of elements. If you need elements to be stored in a specific order,
      HashSet may not be the best choice.

5. **When not to use?**
    - HashSet is not suitable when you need to maintain the order of elements, as it doesn't provide any ordering
      guarantees.

6. **What are the main methods of this structure?**
    - Some of the main methods of HashSet include `add`, `remove`, `contains`, `size`, `isEmpty`, and `clear`, among
      others.

7. **What is the Big O cost?**
    - The average time complexity for basic operations (add, remove, contains) in a HashSet is O(1) under normal
      circumstances. However, in the worst case, when there are many hash collisions, it can degrade to O(n).

8. **What is the Memory and HD costs?**
    - HashSet consumes memory proportional to the number of elements it stores. The memory cost per element is generally
      low, but it can add up for a large number of elements. Hard disk (HD) cost would depend on serialization and
      storage requirements if you're persisting the data.

9. **What other data structure is similar?**
    - LinkedHashSet and TreeSet are similar data structures. LinkedHashSet maintains the order of elements, while
      TreeSet stores elements in sorted order.

10. **Is it thread safe?**
    - No, HashSet is not inherently thread-safe. If you need thread safety, you can use `Collections.synchronizedSet()`
      to wrap a HashSet or use `java.util.concurrent.ConcurrentHashMap` or other concurrent data structures.

11. **How to make it immutable?**
    - You can make a HashSet immutable by wrapping it using `Collections.unmodifiableSet()`:

    ```java
    Set<Type> immutableSet = Collections.unmodifiableSet(yourHashSet);
    ```

12. **How to make it singleton?**
    - You can't directly make a HashSet a singleton. Singletons typically use a design pattern like Singleton Pattern or
      enums in Java.

13. **What part of Java Memory this structure is stored (Heap, stack, other)?**
    - The HashSet, like most objects in Java, is stored in the heap memory. The heap is where objects and data
      structures are allocated and managed by the Java Virtual Machine (JVM).

Remember that Java 8 introduced some enhancements like default methods in interfaces, but the fundamental
characteristics of HashSet remain largely consistent with earlier Java versions.