import java.util.HashMap;
import java.util.Map;

class TrainAppUC6 {

    public static void main(String[] args) {

        // Welcome message
        System.out.println("=== Train Consist Management App (UC6) ===");

        // Initialize HashMap to store bogie capacities
        Map<String, Integer> bogieCapacityMap = new HashMap<>();

        // Add bogie-capacity entries
        bogieCapacityMap.put("Engine", 0);       // Engine has no seating
        bogieCapacityMap.put("Sleeper", 72);
        bogieCapacityMap.put("AC", 54);
        bogieCapacityMap.put("Cargo", 1000);     // Load in kg
        bogieCapacityMap.put("Guard", 0);

        // Display bogie capacities
        System.out.println("Train bogie capacities:");
        for (Map.Entry<String, Integer> entry : bogieCapacityMap.entrySet()) {
            System.out.println("Bogie: " + entry.getKey() + ", Capacity: " + entry.getValue());
        }
    }
}
