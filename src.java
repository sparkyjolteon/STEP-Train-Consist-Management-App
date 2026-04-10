import java.util.*;

class Bogie {
    String name;
    int capacity;

    public Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }
}

class Train {
    private List<Bogie> bogies = new ArrayList<>();

    public void addBogie(Bogie bogie) {
        bogies.add(bogie);
    }

    // Search operation with fail-fast validation
    public Bogie searchBogieByName(String name) {

        // Defensive check (Fail-Fast)
        if (bogies.isEmpty()) {
            throw new IllegalStateException("Search cannot be performed: No bogies available in the train.");
        }

        // Search logic (only runs if valid state)
        for (Bogie b : bogies) {
            if (b.getName().equalsIgnoreCase(name)) {
                return b;
            }
        }

        return null; // or Optional for better design
    }
}

public class Main {
    public static void main(String[] args) {

        Train train = new Train();

        // No bogies added → triggers exception
        try {
            train.searchBogieByName("B1");
        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Program continues safely
        System.out.println("Program continues...");
    }
}
