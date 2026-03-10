# Dynamic Programming Algorithms in Java

This repository contains implementations of important **Dynamic Programming (DP)** problems written in **Java**.
These programs demonstrate how complex problems can be solved efficiently by breaking them into smaller subproblems and storing intermediate results.

The repository is useful for:

* Students learning **Data Structures and Algorithms**
* Interview preparation
* Understanding **Dynamic Programming patterns**

---

## Algorithms Included

### 1. Minimum Path Sum (Grid DP)

Find the minimum cost path from the **top-left to bottom-right** of a grid.

Example Grid:

```
1 3 1
1 5 1
4 2 1
```

Allowed moves:

* Right →
* Down ↓

---

### 2. Falling Path Sum

Find the **minimum falling path sum** from the first row to the last row in a matrix.

Example Matrix:

```
2 1 3
6 5 4
7 8 9
```

Allowed moves:

* Down
* Down-left
* Down-right

---

### 3. Triangle Minimum Path Sum

Find the minimum path from **top to bottom of a triangle**.

Example:

```
      2
     3 4
    6 5 7
   4 1 8 3
```

---

### 4. Longest Increasing Subsequence (LIS)

Find the longest subsequence where elements are strictly increasing.

Example:

```
3 10 2 1 20
```

Output:

```
LIS length = 3
```

---

### 5. Longest Common Subsequence (LCS)

Find the longest subsequence common to two strings.

Example:

```
String1 = "abcbdab"
String2 = "bdcab"
```

---

### 6. Edit Distance

Find the minimum number of operations required to convert one string into another.

Allowed operations:

* Insert
* Delete
* Replace

Example:

```
word1 = horse
word2 = ros
```

---

## Technologies Used

* Java
* Dynamic Programming
* 2D Arrays
* Algorithm Design

---

## How to Run the Programs

1. Clone the repository

```
git clone https://github.com/yourusername/repository-name.git
```

2. Compile the Java file

```
javac FileName.java
```

3. Run the program

```
java FileName
```

---

## Learning Outcomes

By studying these programs, you will learn:

* How **Dynamic Programming** works
* How to build **DP tables**
* How to optimize recursive solutions
* Common **grid and sequence DP patterns**

---

## Author

**Bhuvanesh Jujare**
B.Tech Computer Science Engineering Student
Focused on AI, Full-Stack Development, and Algorithmic Problem Solving.

---

## License

This project is open-source and free to use for educational purposes.
