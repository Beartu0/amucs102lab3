CPE102 Lab 3 — Java Sorting Algorithms & Triangle Class (Plain README)
=======================================================================

Author: Beartu
Course: CPE 102 – Computer Programming II (Spring 2024–2025)
Assignment: Lab 3

--------------------------------------------------

Project Goals
-------------

This Java project demonstrates the following:

1. Implementation of **Bubble Sort** algorithm on an integer array.
2. Implementation of **Binary Search** algorithm.
3. Implementation of **Selection Sort** in both ascending and descending orders.
4. Definition and usage of a **Triangle** class with fields and methods:
   - Constructors (default and parameterized)
   - Getters and setters for base and height
   - Method to compute area
   - Method to triple the base (returns new triangle)
   - Equality checking between triangle objects
   - toString representation
5. Testing all sorting algorithms and triangle operations in `main(...)` methods.

All array operations are written using static methods. The triangle class is encapsulated properly and tested via user input.

--------------------------------------------------

Folder Structure
----------------

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources (App.java, TriangleMain.java, triangle2.java)
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder.

--------------------------------------------------

Build & Run
-----------

Requirements:
- JDK 17 or later
- Command-line interface

To compile:
    javac -d bin src/*.java

To run any part of the lab, use:
    java -cp bin App           # For sorting algorithms
    java -cp bin TriangleMain  # For triangle class tests

--------------------------------------------------

Implementation Notes
--------------------

- Bubble sort compares adjacent elements and swaps them iteratively.
- Binary search is performed on sorted arrays to locate a target index or return -1.
- Selection sort finds the smallest/largest element and swaps it forward.
- Array input and triangle dimensions are obtained via `Scanner`.
- Triangle objects support proper encapsulation and are tested for correctness.

--------------------------------------------------

End of README