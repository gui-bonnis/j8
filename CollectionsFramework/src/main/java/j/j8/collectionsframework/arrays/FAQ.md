In Java 8, the concept of data structures typically refers to the use of arrays and other collections. Let's address
your questions with a focus on arrays:

1. **When to use?**
    - Use arrays when you have a fixed-size collection of elements, and you know the size in advance.

2. **What is the principal usage?**
    - Arrays are used to store elements of the same data type in contiguous memory locations. They are widely used for
      storing and manipulating collections of data.

3. **What is the main advantage?**
    - Arrays have constant-time access (O(1)) to elements using an index, making them efficient for random access.

4. **What is the main disadvantage?**
    - Arrays in Java have a fixed size, which means you cannot easily change their size once they are created. This
      limitation can be a disadvantage when you need dynamic resizing.

5. **When not to use?**
    - Don't use arrays when you need a dynamic collection that can grow or shrink in size dynamically. In such cases,
      you should consider using ArrayList, LinkedList, or other dynamic data structures.

6. **What is the BigO cost?**
    - Accessing an element in an array is O(1) because it directly computes the memory address of the element based on
      the index.

7. **What is the Memory and HD costs?**
    - Arrays have a relatively low memory overhead, as they store elements in contiguous memory locations. However, the
      memory is allocated statically, so if you allocate more space than needed, it can be wasteful.

8. **What other data structure is similar?**
    - ArrayList is a dynamic alternative to arrays, providing the ability to resize as needed. Other data structures
      like LinkedList, HashSet, and TreeSet can serve different purposes and offer different performance
      characteristics.

9. **Is it thread-safe?**
    - Arrays in Java are not inherently thread-safe. If you need thread safety, you should use appropriate
      synchronization mechanisms or consider thread-safe collections like ConcurrentHashMap or CopyOnWriteArrayList.

10. **How to make it immutable?**
    - You can make an array effectively immutable by ensuring that no references to it are exposed outside of the class
      that encapsulates it. This way, you prevent external modification of the array.

11. **How to make it singleton?**
    - Arrays are not typically made as singletons because they are usually used to store multiple elements. Singleton
      design patterns are more relevant for classes where you want to ensure that only one instance exists. To achieve
      this, you can use the Singleton design pattern, but it's unrelated to arrays.

Remember that in Java, you often have better alternatives like ArrayList or other collections for dynamic data storage
needs. Arrays are most suitable when you know the size in advance and need efficient random access.

In Java, arrays are stored in the heap memory. The heap is a region of memory that is used for dynamic memory
allocation, and it is where objects and data structures, including arrays, are stored. When you create an array in Java,
memory is allocated for it on the heap.

Each element of the array is stored as an object (even for primitive arrays, such as `int[]`, `char[]`, etc.), and these
objects are allocated memory on the heap. The array itself is also an object in Java, and it contains a reference to the
memory location where the elements are stored.

It's important to note that the size of the array (the number of elements it can hold) determines the amount of memory
allocated for it on the heap. The actual data values are stored in contiguous memory locations within the allocated
space for the array.

The heap memory in Java is managed by the Java Virtual Machine (JVM), and it is responsible for allocating and
deallocating memory as needed for objects, including arrays, during the program's execution.

Arrays in Java are a fundamental data structure, and they come with several methods and properties that you can use to
work with them. Here are some of the main methods and properties associated with arrays:

**1. `length` Property:**

- `length` is a property of arrays that returns the number of elements in the array. It provides the size of the array.

   ```java
   int[] numbers = {1, 2, 3, 4, 5};
   int length = numbers.length; // Returns 5
   ```

**2. Accessing Elements:**

- You can access individual elements of an array using square brackets and an index.

   ```java
   int[] numbers = {1, 2, 3, 4, 5};
   int thirdElement = numbers[2]; // Accesses the third element (3)
   ```

**3. Modifying Elements:**

- You can modify elements in an array by assigning new values to specific indices.

   ```java
   int[] numbers = {1, 2, 3, 4, 5};
   numbers[0] = 100; // Modifies the first element to 100
   ```

**4. `clone()` Method (Shallow Copy):**

- The `clone()` method creates and returns a shallow copy of the array. Changes to the copied array affect the original
  array, as they share references to the same elements.

   ```java
   int[] originalArray = {1, 2, 3, 4, 5};
   int[] shallowCopy = originalArray.clone();
   ```

**5. `toString()` Method:**

- Arrays provide a default `toString()` method that returns a string representation of the array, which is useful for
  debugging and printing arrays.

   ```java
   int[] numbers = {1, 2, 3, 4, 5};
   String arrayString = Arrays.toString(numbers); // Returns "[1, 2, 3, 4, 5]"
   ```

**6. `equals()` Method:**

- The `equals()` method allows you to compare arrays for equality based on their content.

   ```java
   int[] array1 = {1, 2, 3};
   int[] array2 = {1, 2, 3};
   boolean areEqual = Arrays.equals(array1, array2); // Returns true
   ```

**7. `sort()` Method:**

- The `sort()` method sorts the elements of an array in ascending order.

   ```java
   int[] numbers = {5, 2, 8, 1, 3};
   Arrays.sort(numbers); // Sorts the array in ascending order
   ```

**8. `fill()` Method:**

- The `fill()` method assigns a specified value to all elements in an array.

   ```java
   int[] numbers = new int[5];
   Arrays.fill(numbers, 0); // Fills the array with zeros
   ```

These are some of the main methods and properties associated with arrays in Java. Arrays in Java have limited built-in
methods, and for more advanced operations, you may need to implement custom logic or use data structures from the Java
Collections Framework.