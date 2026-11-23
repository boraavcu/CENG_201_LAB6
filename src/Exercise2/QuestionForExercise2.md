- Find the Time complexity and explain:

| Measurement | Complexity | Explanation |
| :--- | :--- | :--- |
| **Time complexity** | $O(n)$ | Let $n$ be the length of the array (`arr.length`). Each recursive call swaps a pair of elements (`arr[left]` and `arr[right]`) in $O(1)$ time and moves `left` forward by $1$ while moving `right` backward by $1$. Because the distance between `left` and `right` decreases by $2$ at each step until `left >= right`, there are approximately $\frac{n}{2}$ recursive calls in total, giving a linear time complexity of $O(n)$. |