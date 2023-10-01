# Data Structures

## What to answer:

### When to use?

### What is the principal usage?

### What is the main advantage?

### What is the main disadvantage?

### When not use?

### How to instantiate?

### How to destroy?

### Where it is located in memory?

### Is it an Enumerator, Iterator, other?

### What is the BigO cost?

### What is the Memory and HD costs?

### What other data structure is similar?

### Is it thread safe?

### How to make it immutable?

### How to make it singleton?

## Structures

**Arrays:** Arrays are fixed-size collections of elements of the same data type.

**ArrayList:** A dynamic array that can grow or shrink in size, providing a more flexible alternative to traditional
arrays.

**LinkedList:** A data structure where elements are stored in nodes, and each node points to the next node in the
sequence, forming a linked list.

**Stack:** A Last-In-First-Out (LIFO) data structure that is often used for tasks like implementing function calls and
managing undo operations.

**Queue:** A First-In-First-Out (FIFO) data structure used for tasks like managing tasks in a printer queue or
implementing breadth-first search algorithms.

**PriorityQueue:** A queue in which elements are dequeued based on their priority, rather than their order of insertion.

**HashMap:** An implementation of a hash table that stores key-value pairs, allowing for fast retrieval of values based
on keys.

**LinkedHashMap:** Similar to HashMap, but it maintains the order of key-value pairs, which means it can be used to
iterate through entries in the order they were added.

**HashSet:** A collection that does not allow duplicate elements. It is implemented using a hash table.

**LinkedHashSet:** Similar to HashSet but maintains the order of insertion of elements.

**TreeSet:** A set that stores elements in a sorted order. It uses a Red-Black Tree internally.

**HashTable:** An older version of a hash table in Java, similar to HashMap, but it's synchronized, making it
thread-safe.

**TreeMap:** A map that stores key-value pairs in a sorted order based on the keys. It uses a Red-Black Tree internally.

**BitSet:** A collection that represents a set of bits or flags, typically used for tasks involving bit manipulation.

**Vector:** A dynamic array similar to ArrayList but synchronized, making it thread-safe.

**Deque (Double-ended Queue):** A double-ended queue that supports adding and removing elements from both ends
efficiently.

**LinkedBlockingQueue:** A thread-safe implementation of a blocking queue.

**ConcurrentHashMap:** A thread-safe version of HashMap, designed for concurrent access by multiple threads.

**ConcurrentLinkedQueue:** A thread-safe implementation of a non-blocking queue.

**ConcurrentSkipListMap:** A thread-safe and sorted map implemented as a skip list.

**WeakHashMap:** A special type of map where keys are weakly referenced, allowing them to be garbage collected when no
longer in use.

**IdentityHashMap:** A map that uses reference equality (==) rather than object equality (equals) to compare keys

## Generics

### Declaration

### Wildcards

### Bounded Type Parameters

### Generic Methods

TODO:

**Study Queue:** If the queue is blocking, the thread also blocks while trying to add an object to a full queue or
remove an object
from an empty one. The following classes implement the BlockingQueue interface: LinkedBlockingQueue,
ArrayBlockingQueue, SynchronousQueue, PriorityBlockingQueue, and DelayQueue. To add an
object to a queue you can use such methods as add(), put(), and offer(). To retrieve an object from a queue
use poll(), remove(), take(), or peek().
Unbound queues don’t place limitations on the number of elements. ConcurrentLinkedQueue is an example
of such a queue.

**Study Collections**
Using concurrent collections is a recommended way of creating thread-safe data structures. Such collections
include ConcurrentHashMap, ConcurrentSkipListMap, ConcurrentSkipListSet,
CopyOnWriteArrayList, and CopyOnWriteArraySet. Java documentation describes when to use each of
these collections. For example, a CopyOnWriteArrayList is preferable to a synchronized ArrayList
when the expected number of reads and traversals is much greater than the number of updates to a list. These
collections were written to minimize the time during which data is locked.