import java.util.Scanner;

public class UC18_LinearSearch {

    public static void main(String[] args) {

        // 1. User provides a list of bogie IDs
        String[] bogieIDs = {
            "B101", "A205", "C309", "D410", "E512"
        };

        Scanner sc = new Scanner(System.in);

        // 2. User provides search key
        System.out.print("Enter Bogie ID to search: ");
        String searchKey = sc.nextLine();

        boolean found = false;

        // 3. Traverse array sequentially
        for (int i = 0; i < bogieIDs.length; i++) {

            // 4. Compare using equals()
            if (bogieIDs[i].equals(searchKey)) {
                System.out.println("Bogie found at position: " + i);
                found = true;

                // 5. Early termination
                break;
            }
        }

        // 6. Display result if not found
        if (!found) {
            System.out.println("Bogie ID not found.");
        }

        // Program continues
        System.out.println("Program continues...");
    }
}
