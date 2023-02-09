# Search-a-2D-Matrix

You are given an m x n integer matrix matrix with the following two properties:

Each row is sorted in non-decreasing order.
The first integer of each row is greater than the last integer of the previous row.
Given an integer target, return true if target is in matrix or false otherwise.

You must write a solution in O(log(m * n)) time complexity.

 

Example 1:

![mat](https://user-images.githubusercontent.com/88260025/217848682-25b4d32d-1159-499c-a681-ea5325f77506.jpg)

Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
Output: true

Example 2:

![mat2 (1)](https://user-images.githubusercontent.com/88260025/217848741-cb44aa99-8d43-4463-bd18-6dc15c14d488.jpg)

Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 13
Output: false
 

Constraints:

m == matrix.length
n == matrix[i].length
1 <= m, n <= 100
-104 <= matrix[i][j], target <= 104
