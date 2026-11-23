### 1. What is the current page after each operation?

| Operation | Current page |
| :--- | :--- |
| Initial state | `null` (no page open) |
| Visit Google | `google.com` |
| Visit YouTube | `youtube.com` |
| Go back | `google.com` |
| Visit Facebook | `Facebook.com` |
| Go back | `google.com` |
| Go forward | `Facebook.com` |
| Visit StackOverflow | `stackoverflow.com` |

---

### 2. What happens to the forward stack when a new page is visited?

When a new webpage is visited (`visit(url)`), the forward stack is **cleared** (all elements are removed until it becomes empty). Visiting a new page starts a brand-new navigation path, so the old forward history is no longer valid.

---

### 3. Why are stacks appropriate for this problem?

Stacks follow the **Last-In, First-Out (LIFO)** principle, which matches how browser navigation works:
- The most recently visited page is the first one you return to when pressing **Back** (`backStack`).
- The most recently left page from going backward is the first one you return to when pressing **Forward** (`forwardStack`).

---

### 4. Find the time complexity of each method below:

| Method | Time Complexity | Explanation |
| :--- | :--- | :--- |
| `push()` | $O(1)$ | Creates a new `Node`, points its `next` reference to the current `top`, and updates `top` in constant time regardless of stack size. |
| `pop()` | $O(1)$ | Checks `top`, saves its `data`, and moves `top` to `top.next` in constant time without traversing the list. |
| `peek()` | $O(1)$ | Directly reads and returns `top.data` (or `null` if empty) without modifying or traversing the stack. |
| `visit()` *(worst case)* | $O(n)$ | Pushing to `backStack` and updating `currentPage` take $O(1)$, but clearing `forwardStack` calls `pop()` repeatedly until empty—taking $O(n)$ in the worst case where $n$ is the number of pages in `forwardStack`. |
| `goBack()` | $O(1)$ | Performs a constant number of `push()` and `pop()` operations on the stacks and updates `currentPage` in $O(1)$ time. |
| `goForward()` | $O(1)$ | Performs a constant number of `push()` and `pop()` operations on the stacks and updates `currentPage` in $O(1)$ time. |