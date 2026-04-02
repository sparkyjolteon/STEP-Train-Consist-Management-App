import java.util.ArrayList;
import java.util.List;

class TrainApp {

    public static void main(String[] args) {

        // Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // Initialize train consist using ArrayList
        List<String> trainConsist = new ArrayList<>();

        // Display initial bogie count
        System.out.println("Initial bogie count: " + trainConsist.size());

        // Program continues...
        System.out.println("System ready for further operations.");
    }
}
