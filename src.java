import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

// Bogie class representing each passenger bogie
class Bogie {
    private String name;
    private int capacity;

    public Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return name + " (" + capacity + " seats)";
    }
}

class TrainAppUC7 {

    public static void main(String[] args) {

        // Welcome message
        System.out.println("=== Train Consist Management App (UC7) ===");

        // Create a list of passenger bogies
        List<Bogie> passengerBogies = new ArrayList<>();
        passengerBogies.add(new Bogie("Sleeper", 72));
        passengerBogies.add(new Bogie("AC Chair", 54));
        passengerBogies.add(new Bogie("First Class", 36));

        // Display unsorted bogies
        System.out.println("Passenger bogies (unsorted): " + passengerBogies);

        // Sort bogies based on seating capacity
        passengerBogies.sort(Comparator.comparingInt(Bogie::getCapacity));

        // Display sorted bogies
        System.out.println("Passenger bogies sorted by capacity: " + passengerBogies);
    }
}
