import java.util.Arrays;

public class UC17_SortBogieTypes {

    public static void main(String[] args) {

        // 1. User provides bogie type names
        String[] bogieTypes = {
            "Sleeper",
            "AC Chair",
            "First Class",
            "Cylindrical",
            "Rectangular"
        };

        System.out.println("Original Bogie Types:");
        System.out.println(Arrays.toString(bogieTypes));

        // 2. Sorting using built-in method
        Arrays.sort(bogieTypes);

        // 3. Display sorted result
        System.out.println("\nSorted Bogie Types:");
        System.out.println(Arrays.toString(bogieTypes));

        // Program continues...
        System.out.println("\nProgram continues...");
    }
}
