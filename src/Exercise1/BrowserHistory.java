/**
 * Exercise1.BrowserHistory.java
 * Your Name:        Bora Avcu
 * Your Student ID:  250444902
 * Your Date:        23.11.2026
 */

package Exercise1;

public class BrowserHistory {

    private Stack backStack;
    private Stack forwardStack;
    private String currentPage;

    public BrowserHistory() {
        backStack = new Stack();
        forwardStack = new Stack();
        currentPage = null;
    }

    // STEP 1: Push currentPage to backStack (if non-null), set new page, and clear forwardStack.
    public void visit(String url) {
        if (currentPage != null) {
            backStack.push(currentPage);
        }
        currentPage = url;
        clearStack(forwardStack);
        System.out.println("Visited: " + currentPage);
    }

    // STEP 2: Move currentPage to forwardStack and pop previous page from backStack.
    public void goBack() {
        if (backStack.isEmpty()) {
            System.out.println("Cannot go back!");
            return;
        }
        forwardStack.push(currentPage);
        currentPage = backStack.pop();
        System.out.println("Went back to: " + currentPage);
    }

    // STEP 3: Move currentPage to backStack and pop next page from forwardStack.
    public void goForward() {
        if (forwardStack.isEmpty()) {
            System.out.println("Cannot go forward!");
            return;
        }
        backStack.push(currentPage);
        currentPage = forwardStack.pop();
        System.out.println("Went forward to: " + currentPage);
    }

    // STEP 4: Print the currently open webpage or a message if none is open.
    public void displayCurrentPage() {
        if (currentPage == null) {
            System.out.println("No page is currently open.");
        } else {
            System.out.println("Current page: " + currentPage);
        }
    }

    // STEP 5: Pop all elements until the given stack becomes empty.
    private void clearStack(Stack stack) {
        while (!stack.isEmpty()) {
            stack.pop();
        }
    }

    // STEP 6: Display current page along with back and forward stacks.
    public void displayHistory() {
        System.out.println("\n========== BROWSER HISTORY ==========");

        System.out.println("Current page: " + currentPage);

        System.out.print("Back stack (top -> bottom): ");
        backStack.display();

        System.out.print("Forward stack (top -> bottom): ");
        forwardStack.display();

        System.out.println("=====================================");
    }
}