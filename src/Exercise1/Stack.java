/**
 * Exercise1.Stack.java
 * Your Name:        Bora Avcu
 * Your Student ID:  250444902
 * Your Date:        23.11.2026
 */

package Exercise1;

public class Stack {

    private Node top;

    public Stack() {
        top = null;
    }

    // STEP 1: Push a new element onto the top of the stack.
    public void push(String value) {
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
    }

    // STEP 2: Pop and return the top element, or return null if empty.
    public String pop() {
        if (isEmpty()) {
            return null;
        }
        String value = top.data;
        top = top.next;
        return value;
    }

    // STEP 3: Return the top element without removing it, or null if empty.
    public String peek() {
        if (isEmpty()) {
            return null;
        }
        return top.data;
    }

    // STEP 4: Return true if the stack has no elements, otherwise false.
    public boolean isEmpty() {
        return top == null;
    }

    // STEP 5: Display all elements from top to bottom, or "Empty" if empty.
    public void display() {
        if (isEmpty()) {
            System.out.println("Empty");
            return;
        }

        Node current = top;

        while (current != null) {
            System.out.print(current.data);

            if (current.next != null) {
                System.out.print(" -> ");
            }

            current = current.next;
        }

        System.out.println();
    }
}