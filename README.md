# DSA Practice – Java

A 6-month journey learning Data Structures & Algorithms from scratch (Nov 2026 – May 2027),
following the [AlgoMaster DSA](https://algomaster.io/learn/dsa/course-introduction) course.

- **Language:** Java 21
- **Goal:** pass the coding interview round for a Backend internship; solve most LeetCode Easy/Medium problems
- **LeetCode:** [Nghia Nguyen](https://leetcode.com/u/nghiang02/)

## Progress
| Month | Topics | Status |
|---|---|---|
| 1 | Java for DSA, Warmup, Big O, Basic Sorting | ⏳ |
| 2 | Sorting, Arrays, Strings, Hash Tables, Two Pointers | ☐ |
| 3 | Sliding Window, Prefix Sum, Binary Search, Matrix | ☐ |
| 4 | Linked List, Stack, Queue, Backtracking | ☐ |
| 5 | Binary Tree, BST, Heap, Intervals, Trie, Greedy | ☐ |
| 6 | Graphs, Dynamic Programming, Mock Interviews | ☐ |

**Total solved:** 1 (Easy: 1 · Medium: 0 · Hard: 0)

## Solved Problems
| # | Date | Problem | Difficulty | Pattern | Time / Space | Code | Notes |
|---|---|---|---|---|---|---|---|
| 1 | 2026-11-09 | [Swap Two Numbers](https://algomaster.io/learn/dsa/swap-two-numbers) | Easy | Warmup | O(1) / O(1) | [Java](src/main/java/dsa/warmup/variables/SwapTwoNumbers.java) | Arithmetic swap fails when i == j |

> 🔁 = needed hints, must redo

## Lessons Learned
- Swapping with `+`/`-` or XOR sets the element to 0 when both indices are the same → use a temp variable.
- `int` overflow wraps around silently; `double` loses precision, so never compare `double` values with `==`.

## How to Run
Open the project in IntelliJ IDEA and run the `main` method in each file.