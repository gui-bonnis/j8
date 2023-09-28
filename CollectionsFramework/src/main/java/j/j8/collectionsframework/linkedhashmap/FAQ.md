Java 8 doesn't introduce significant changes to the `LinkedHashMap` data structure itself compared to earlier Java
versions. However, I can provide you with information about `LinkedHashMap` in general, which can apply to Java 8 as
well.

1. **When to use?**
    - Use `LinkedHashMap` when you need to maintain the order of elements as they were inserted, in addition to the
      basic functionality provided by a regular `HashMap`.

2. **Principal Usage:**
    - It is used when you need a combination of fast access times (like a `HashMap`) and the ability to maintain the
      order of elements.

3. **Main Advantage:**
    - Maintains the order of elements based on insertion or access order, which can be useful for scenarios where
      iteration order matters.

4. **Main Disadvantage:**
    - Slightly higher memory consumption compared to a regular `HashMap` due to maintaining the linked list for order.

5. **When Not to Use?**
    - If you don't need to maintain the order of elements, and memory usage is a concern, a regular `HashMap` might be
      more suitable.

6. **Main Methods:**
    - `put(key, value)`: Inserts an entry into the map.
    - `get(key)`: Retrieves the value associated with a key.
    - `remove(key)`: Removes an entry by key.
    - `clear()`: Removes all entries.
    - `size()`: Returns the number of entries.

7. **Big O Cost:**
    - The average time complexity for operations like `put`, `get`, `remove`, etc., is O(1) because it's based on a hash
      table. However, it may degrade to O(n) in certain cases (e.g., if there are hash collisions and many entries with
      the same hash code).

8. **Memory and HDD Costs:**
    - `LinkedHashMap` consumes slightly more memory than a `HashMap` due to the additional linked list for maintaining
      order. HDD costs would depend on how much memory the JVM uses and how the data is serialized, but it's generally
      higher than a simple `HashMap`.

9. **Similar Data Structure:**
    - `HashMap` is similar in functionality but doesn't guarantee order preservation. If you need a sorted map, consider
      using `TreeMap`.

10. **Thread Safety:**
    - `LinkedHashMap` is not inherently thread-safe. You need to synchronize access externally if you plan to use it in
      a multi-threaded environment.

11. **How to Make it Immutable:**
    - You can make a `LinkedHashMap` immutable by creating an unmodifiable wrapper
      using `Collections.unmodifiableMap(linkedHashMap)`.

12. **How to Make it Singleton:**
    - To create a singleton `LinkedHashMap`, you can use the Singleton design pattern to ensure that only one instance
      is ever created.

13. **Memory Storage:**
    - `LinkedHashMap` is stored in the heap memory. It's an object that resides on the heap, and its size depends on the
      number of entries and other factors.

Remember that Java 8 doesn't introduce any specific changes to `LinkedHashMap`. The information provided here applies to
Java 8 and earlier versions as well.