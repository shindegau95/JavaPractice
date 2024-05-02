### Problem Statement

---

Given an input array of size n

[−2, 1, −3, 4, −1, 2, 1, −5, 4]

the contiguous subarray with the largest sum is [4, −1, 2, 1], with sum 6.


1) Initialization

localMax = -2

globalMax = -2

2) update

   localMax = max(a[i], a[i] + localMax)

   globalMax = max(localMax, globalMax)


| i         | 0  | 1 | 2  | 3 | 4  | 5 | 6 | 7  | 8 |
| --------- | -- | - | -- | - | -- | - | - | -- | - |
| a[i]      | -2 | 1 | -3 | 4 | -1 | 2 | 1 | -5 | 4 |
| localMax  | -2 | 1 | -2 | 4 | 3  | 5 | 6 | 1  | 5 |
| globalMax | -2 | 1 | 1  | 4 | 4  | 5 | 6 | 6  | 6 |
