import java.util.LinkedList;
import java.util.List;
class TrainAppUC4 {

    public static void main(String[] args) {

        // Welcome message
        System.out.println("=== Train Consist Management App (UC4) ===");

        // Initialize LinkedList for train consist
        LinkedList<String> trainConsist = new LinkedList<>();

        // Add bogies in order
        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");

        System.out.println("Train consist after initial addition: " + trainConsist);

        // Insert a Pantry Car at position 2 (indexing starts at 0)
        trainConsist.add(2, "Pantry Car");
        System.out.println("After inserting Pantry Car at position 2: " + trainConsist);

        // Remove first and last bogies
        trainConsist.removeFirst(); // Engine
        trainConsist.removeLast();  // Guard
        System.out.println("After removing first and last bogies: " + trainConsist);
    }
}
