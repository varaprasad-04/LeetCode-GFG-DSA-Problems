Given a height h, find the maximum number of distinct balanced binary trees of height exactly h.

A binary tree is balanced if, for every node, the heights of its left and right subtrees differ by at most 1. A tree with a single node has height 1. An empty tree has height 0.

Note: Since the answer can be very large, return it modulo 109 + 7.

Examples:

Input: h = 1
Output: 1
Explanation: Only one tree of height 1 exists i.e. a single node.
Input: h = 2
Output: 3
Explanation: 3 distinct balanced trees of height 2 exist.

1. What is a Balanced Binary Tree?
   A binary tree is height-balanced if, for every node, the difference between the heights of its left and right subtrees is at most 1.

That means:

|H(left)-H(right)|\leq 1

For a tree of height h, the possible combinations of subtree heights are:

1. Left = h-1, Right = h-1
2. Left = h-1, Right = h-2
3. Left = h-2, Right = h-1
4. Derive the recurrence relation
   Let:

f(h)=\text{Number of balanced binary trees of height h}

Consider the three possibilities.

Case 1: Both subtrees have height h-1

Number of combinations:

f(h-1)\times f(h-1)

Case 2: Left subtree has height h-1 and right has height h-2

f(h-1)\times f(h-2)

Case 3: Left subtree has height h-2 and right has height h-1
f(h-2)\times f(h-1)

Adding all three cases:

f(h)=f(h-1)^2+2f(h-1)f(h-2)
