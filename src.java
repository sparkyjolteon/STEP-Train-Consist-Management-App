import java.util.*;

public class UC19_BinarySearch {

    public static void main(String[] args) {

        // 1. Sorted bogie IDs (Precondition)
        String[] bogieIDs = {
            "A101", "B205", "C309", "D410", "E512"
        };

        Scanner sc = new Scanner(System.in);

        // 2. User provides search key
        System.out.print("Enter Bogie ID to search: ");
        String key = sc.nextLine();

        int low = 0;
        int high = bogieIDs.length - 1;
        boolean found = false;

        // 3. Binary Search Logic
        while (low <= high) {

            // 4. Compute mid index
            int mid = (low + high) / 2;

            // 5. Compare using compareTo()
            int result = key.compareTo(bogieIDs[mid]);

            if (result == 0) {
                System.out.println("Bogie found at position: " + mid);
                found = true;
                break;
            }
            else if (result < 0) {
                // Search left half
                high = mid - 1;
            }
            else {
                // Search right half
                low = mid + 1;
            }
        }

        // 6. Result if not found
        if (!found) {
            System.out.println("Bogie ID not found.");
        }

        // Program continues
        System.out.println("Program continues...");
    }
}
