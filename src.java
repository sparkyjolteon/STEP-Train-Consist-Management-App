import java.util.*;
import java.util.stream.*;

class Bogie {
    int id;
    int capacity;

    public Bogie(int id, int capacity) {
        this.id = id;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Bogie ID: " + id + ", Capacity: " + capacity;
    }
}
class TrainSystem {
    public static void main(String[] args) {

        // Step 1: Create list of bogies (reuse from UC7)
        List<Bogie> bogies = Arrays.asList(
            new Bogie(1, 50),
            new Bogie(2, 75),
            new Bogie(3, 60),
            new Bogie(4, 80),
            new Bogie(5, 55)
        );

        // Step 2–4: Convert to stream, filter, and collect
        List<Bogie> filteredBogies = bogies.stream()
            .filter(b -> b.capacity > 60)   // Lambda condition
            .collect(Collectors.toList());

        // Step 5: Display filtered bogies
        System.out.println("Bogies with capacity > 60:");
        filteredBogies.forEach(System.out::println);

        // Step 6: Program continues...
    }
}
