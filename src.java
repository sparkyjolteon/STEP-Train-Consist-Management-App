import java.util.*;

public class UC16_BubbleSortDemo {

    public static void main(String[] args) {

        // 1. User provides passenger bogie capacities
        int[] capacities = {72, 60, 45, 80, 30};

        System.out.println("Original Capacities:");
        printArray(capacities);

        // 2. Bubble Sort Logic
        int n = capacities.length;

        for (int i = 0; i < n - 1; i++) {

            // Optimization: check if any swap happens
            boolean swapped = false;

            for (int j = 0; j < n - i - 1; j++) {

                // 3. Compare adjacent elements
                if (capacities[j] > capacities[j + 1]) {

                    // 4. Swap values
                    int temp = capacities[j];
                    capacities[j] = capacities[j + 1];
                    capacities[j + 1] = temp;

                    swapped = true;
                }
            }

            // If no swaps → already sorted
            if (!swapped) {
                break;
            }
        }

        // 5. Display sorted result
        System.out.println("\nSorted Capacities:");
        printArray(capacities);

        System.out.println("\nProgram continues...");
    }

    // Utility method to print array
    public static void printArray(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
