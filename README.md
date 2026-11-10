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

**Total solved:** 10 (Easy: 10 · Medium: 0 · Hard: 0)

## Solved Problems
| # | Date | Problem | Difficulty | Pattern | Time / Space | Code | Notes |
|---|---|---|---|---|---|---|---|
| 1 | 2026-11-09 | [Swap Two Numbers](https://algomaster.io/learn/dsa/swap-two-numbers) | Easy | Warmup | O(1) / O(1) | [Java](src/main/java/dsa/warmup/variables/SwapTwoNumbers.java) | Arithmetic swap fails when refer to the same memory slot |
| 2 | 2026-11-09 | [Temperature Converter](https://algomaster.io/learn/dsa/temperature-converter) | Easy | Warmup | O(1) / O(1) | [Java](src/main/java/dsa/warmup/variables/TemperatureConverter.java) | Integer division 9/5 is 1 not 1.8 |
| 3 | 2026-11-09 | [Convert Seconds to Hours, Minutes, Seconds](https://algomaster.io/learn/dsa/convert-seconds-to-hms) | Easy | Warmup | O(1) / O(1) | [Java](src/main/java/dsa/warmup/variables/ConvertSecondsToHms.java) |  |
| 4 | 2026-11-09 | [Absolute Value](https://algomaster.io/learn/dsa/absolute-value) | Easy | Warmup | O(1) / O(1) | [Java](src/main/java/dsa/warmup/variables/AbsoluteValue.java) |  |
| 5 | 2026-11-09 | [Quotient and Remainder ](https://algomaster.io/learn/dsa/quotient-and-remainder) | Easy | Warmup | O(1) / O(1) | [Java](src/main/java/dsa/warmup/variables/QuotientAndRemainder.java) | n % 2 == 1 fail when n is negative |
| 6 | 2026-11-10 | [Simple and Compound Interest](https://algomaster.io/learn/dsa/simple-and-compound-interest) | Easy | Warmup | O(time) / O(1) | [Java](src/main/java/dsa/warmup/variables/SimpleAndCompoundInterest.java) | rate is a %, divide by 100.0; Math.pow makes it O(1) |
| 7 | 2026-11-10 | [Area and Perimeter of Shapes](https://algomaster.io/learn/dsa/area-and-perimeter-of-shapes) | Easy | Warmup | O(1) / O(1) | [Java](src/main/java/dsa/warmup/variables/AreaAndPerimeterOfShapes.java) | Heron's formula for triangle; sqrt of a degenerate triangle can be NaN |
| 8 | 2026-11-10 | [Even or Odd](https://algomaster.io/learn/dsa/even-or-odd) | Easy | Warmup | O(1) / O(1) | [Java](src/main/java/dsa/warmup/conditionals/EvenOrOdd.java) | Check n % 2 == 0 (safe for negatives); bitwise needs parentheses: (n & 1) == 1 |
| 9 | 2026-11-10 | [Positive, Negative, or Zero](https://algomaster.io/learn/dsa/positive-negative-or-zero) | Easy | Warmup | O(1) / O(1) | [Java](src/main/java/dsa/warmup/conditionals/PositiveNegativeOrZero.java) |  |
| 10 | 2026-11-10 | [Leap Year Check](https://algomaster.io/learn/dsa/leap-year-check) | Easy | Warmup | O(1) / O(1) | [Java](src/main/java/dsa/warmup/conditionals/LeapYearCheck.java) | 1900 is not a leap year, 2000 is; return the boolean expression directly |

> 🔁 = needed hints, must redo

## How to Run
Open the project in IntelliJ IDEA and run the `main` method in each file.