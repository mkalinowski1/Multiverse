# Multiverse
Take home test for technical interview

Important Note on Grid Coordinate System:

This problem uses a coordinate system where:
1. The southwestern-most corner of the grid is at (0, 0).
2. For a grid of size m x n, the northeastern-most corner is at (m, n).
3. A robot is considered "LOST" if it moves to a position where x < 0, x > m, y < 0, or y > n.

Key points to remember:

1. The grid coordinates include both 0 and the maximum value specified for each dimension.
2. Input and output should use this coordinate system.
3. The internal implementation may use a different indexing system depending on your programming language of choice.
4. Your solution should handle any necessary translation between the problem's coordinate system and your implementation's indexing system.

The goal is to create a solution that correctly interprets the input and produces the expected output according to this coordinate system, regardless of how you choose to implement it internally.
