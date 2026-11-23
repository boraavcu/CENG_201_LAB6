/**
 * Exercise2.ReverseArray.java
 * Your Name:        Bora Avcu
 * Your Student ID:  250444902
 * Your Date:        23.11.2026
 */


package Exercise2;

public class ReverseArray {

    public static void reverseArray(int[] arr, int left, int right) {

        // Step 1: Base case - stop when pointers meet or cross.
        if (left >= right) {
            return;
        }

        // Step 2: Store the left element temporarily.
        int temp = arr[left];

        // Step 3: Move the right element into the left position.
        arr[left] = arr[right];

        // Step 4: Put the temporary (original left) element into the right position.
        arr[right] = temp;

        // Step 5: Recurse inward on the remaining subarray.
        reverseArray(arr, left + 1, right - 1);
    }

    public static void displayArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        // Create numbers array with 10, 20, 30, 40, 50.
        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println("Original array:");
        displayArray(numbers);

        // Call reverseArray with start index 0 and end index (length - 1).
        reverseArray(numbers, 0, numbers.length - 1);

        System.out.println("Reversed array:");
        displayArray(numbers);
    }
}
