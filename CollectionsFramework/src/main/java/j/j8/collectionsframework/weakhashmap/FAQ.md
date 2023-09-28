Java 8 introduced various enhancements and features, but it didn't specifically introduce a new version of
the `WeakHashMap` data structure. The `WeakHashMap` has been part of the Java Collections Framework since earlier
versions of Java, and its characteristics and usage remain largely the same in Java 8 as well.

Here are answers to your questions based on `WeakHashMap` in Java:

1. **When to use?**
    - Use `WeakHashMap` when you need a map where the keys are weakly referenced, and they can be garbage collected when
      they are no longer referenced elsewhere in your program. This can be useful in scenarios where you want to
      associate metadata or auxiliary data with objects that should not prevent those objects from being garbage
      collected when they are no longer needed.

2. **What is the principal usage?**
    - The principal usage is to create a map with keys that allow automatic garbage collection when no longer strongly
      referenced, which can be valuable in managing memory resources.

3. **What is the main advantage?**
    - The main advantage is that it helps prevent memory leaks by allowing keys to be reclaimed by the garbage collector
      when they are no longer used elsewhere in the program.

4. **What is the main disadvantage?**
    - The main disadvantage is that it can be less predictable than strong references in terms of when entries will be
      removed from the map since it relies on garbage collection.

5. **When not to use?**
    - Do not use `WeakHashMap` when you need strong references to keys, or when the order of keys matters,
      as `WeakHashMap` does not guarantee any specific order.

6. **What are the main methods of this structure?**
    - `put(key, value)`: Inserts a key-value pair into the map.
    - `get(key)`: Retrieves the value associated with a key.
    - `remove(key)`: Removes a key-value pair from the map.
    - `size()`: Returns the number of key-value pairs in the map.
    - `clear()`: Removes all key-value pairs from the map.

7. **What is the BigO cost?**
    - The time complexity for most operations is O(1), assuming the cost of garbage collection is constant. However, the
      behavior regarding garbage collection and key removal can make the performance less predictable in practice.

8. **What is the Memory and HD costs?**
    - Memory usage is typically higher compared to a regular `HashMap` because of the additional objects needed for
      managing weak references. The disk (HD) cost is not applicable, as this is an in-memory data structure.

9. **What other data structure is similar?**
    - `WeakHashMap` is unique in its ability to use weak references for keys. Other map implementations like `HashMap`
      or `TreeMap` use strong references.

10. **Is it thread safe?**
    - `WeakHashMap` is not inherently thread-safe. If you need thread safety, you should consider
      using `Collections.synchronizedMap()` or other concurrent map implementations.

11. **How to make it immutable?**
    - You cannot make a `WeakHashMap` itself immutable, but you can create an immutable wrapper around it
      using `Collections.unmodifiableMap()`.

12. **How to make it singleton?**
    - You can create a singleton `WeakHashMap` instance like you would with any other Java class by using a private
      constructor and a static instance field.

13. **What part of Java Memory this structure is stored (Heap, stack, other)?**
    - `WeakHashMap` is stored in the heap memory, like most other objects in Java. The heap is where all runtime objects
      are allocated and managed.