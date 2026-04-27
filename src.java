import java.util.*;

// 1. Custom Exception
class InvalidCapacityException extends Exception {
    public InvalidCapacityException(String message) {
        super(message);
    }
}

// 2. Passenger Bogie Class
class PassengerBogie {
    private String type;
    private int capacity;

    public PassengerBogie(String type, int capacity) throws InvalidCapacityException {

        // 3. Validation (Fail Fast)
        if (capacity <= 0) {
            throw new InvalidCapacityException(
                "Invalid capacity for " + type + " bogie: " + capacity
            );
        }

        this.type = type;
        this.capacity = capacity;
    }

    public String getType() {
        return type;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return type + " | Capacity: " + capacity;
    }
}

// 4. Main Application
public class UC14_CustomExceptionDemo {

    public static void main(String[] args) {

        List<PassengerBogie> train = new ArrayList<>();

        // 5. Test Data (Valid + Invalid)
        int[] capacities = {72, 0, -10, 60};

        for (int cap : capacities) {
            try {
                PassengerBogie bogie = new PassengerBogie("Sleeper", cap);
                train.add(bogie);
                System.out.println("Added: " + bogie);
            } 
            catch (InvalidCapacityException e) {
                // 6. Handle Invalid Input
                System.out.println("Error: " + e.getMessage());
            }
        }

        // 7. Final Train Composition
        System.out.println("\nValid Bogies in Train:");
        for (PassengerBogie b : train) {
            System.out.println(b);
        }
    }
}
