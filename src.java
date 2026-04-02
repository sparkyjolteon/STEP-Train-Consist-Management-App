class TrainAppUC2 {

    public static void main(String[] args) {

        // Welcome Message
        System.out.println("=== Train Consist Management App (UC2) ===");

        // Initialize passenger bogies list
        List<String> passengerBogies = new ArrayList<>();

        // Add bogies dynamically
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        // Display list after insertion
        System.out.println("Passenger bogies after addition: " + passengerBogies);

        // Remove a bogie
        passengerBogies.remove("AC Chair");
        System.out.println("Passenger bogies after removal of AC Chair: " + passengerBogies);

        // Check existence of a bogie
        if (passengerBogies.contains("Sleeper")) {
            System.out.println("Sleeper bogie exists in the train.");
        } else {
            System.out.println("Sleeper bogie does not exist.");
        }

        // Final state of the list
        System.out.println("Final passenger bogies: " + passengerBogies);
    }
}
