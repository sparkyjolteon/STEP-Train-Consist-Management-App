import java.util.HashSet;
import java.util.Set;

class TrainAppUC3 {

    public static void main(String[] args) {

        // Welcome message
        System.out.println("=== Train Consist Management App (UC3) ===");

        // Initialize HashSet for bogie IDs
        Set<String> bogieIDs = new HashSet<>();

        // Attempt to add bogie IDs (duplicates included)
        bogieIDs.add("B001");
        bogieIDs.add("B002");
        bogieIDs.add("B003");
        bogieIDs.add("B002"); // duplicate
        bogieIDs.add("B001"); // duplicate

        // Display unique bogie IDs
        System.out.println("Unique bogie IDs in the train: " + bogieIDs);
    }
}
