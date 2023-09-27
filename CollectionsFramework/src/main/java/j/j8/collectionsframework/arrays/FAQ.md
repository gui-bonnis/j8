In Java 8, the concept of data structures typically refers to the use of arrays and other collections. Let's address your questions with a focus on arrays:

1. **When to use?**
    - Use arrays when you have a fixed-size collection of elements, and you know the size in advance.

2. **What is the principal usage?**
    - Arrays are used to store elements of the same data type in contiguous memory locations. They are widely used for storing and manipulating collections of data.

3. **What is the main advantage?**
    - Arrays have constant-time access (O(1)) to elements using an index, making them efficient for random access.

4. **What is the main disadvantage?**
    - Arrays in Java have a fixed size, which means you cannot easily change their size once they are created. This limitation can be a disadvantage when you need dynamic resizing.

5. **When not to use?**
    - Don't use arrays when you need a dynamic collection that can grow or shrink in size dynamically. In such cases, you should consider using ArrayList, LinkedList, or other dynamic data structures.

6. **What is the BigO cost?**
    - Accessing an element in an array is O(1) because it directly computes the memory address of the element based on the index.

7. **What is the Memory and HD costs?**
    - Arrays have a relatively low memory overhead, as they store elements in contiguous memory locations. However, the memory is allocated statically, so if you allocate more space than needed, it can be wasteful.

8. **What other data structure is similar?**
    - ArrayList is a dynamic alternative to arrays, providing the ability to resize as needed. Other data structures like LinkedList, HashSet, and TreeSet can serve different purposes and offer different performance characteristics.

9. **Is it thread-safe?**
    - Arrays in Java are not inherently thread-safe. If you need thread safety, you should use appropriate synchronization mechanisms or consider thread-safe collections like ConcurrentHashMap or CopyOnWriteArrayList.

10. **How to make it immutable?**
    - You can make an array effectively immutable by ensuring that no references to it are exposed outside of the class that encapsulates it. This way, you prevent external modification of the array.

11. **How to make it singleton?**
    - Arrays are not typically made as singletons because they are usually used to store multiple elements. Singleton design patterns are more relevant for classes where you want to ensure that only one instance exists. To achieve this, you can use the Singleton design pattern, but it's unrelated to arrays.

Remember that in Java, you often have better alternatives like ArrayList or other collections for dynamic data storage needs. Arrays are most suitable when you know the size in advance and need efficient random access.

In Java, arrays are stored in the heap memory. The heap is a region of memory that is used for dynamic memory allocation, and it is where objects and data structures, including arrays, are stored. When you create an array in Java, memory is allocated for it on the heap.

Each element of the array is stored as an object (even for primitive arrays, such as `int[]`, `char[]`, etc.), and these objects are allocated memory on the heap. The array itself is also an object in Java, and it contains a reference to the memory location where the elements are stored.

It's important to note that the size of the array (the number of elements it can hold) determines the amount of memory allocated for it on the heap. The actual data values are stored in contiguous memory locations within the allocated space for the array.

The heap memory in Java is managed by the Java Virtual Machine (JVM), and it is responsible for allocating and deallocating memory as needed for objects, including arrays, during the program's execution.