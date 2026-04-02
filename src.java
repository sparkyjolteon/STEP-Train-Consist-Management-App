import java.util.LinkedHashSet;
import java.util.Set;

class TrainAppUC5 {

    public static void main(String[] args) {

        // Welcome message
        System.out.println("=== Train Consist Management App (UC5) ===");

        // Initialize LinkedHashSet for train formation
        Set<String> trainFormation = new LinkedHashSet<>();

        // Add bogies (duplicates will be ignored)
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");
        trainFormation.add("Sleeper"); // duplicate, will be ignored

        // Display final train formation
        System.out.println("Final train formation (unique & in order): " + trainFormation);
    }
}
