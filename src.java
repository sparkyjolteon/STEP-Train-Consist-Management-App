import java.util.*;
import java.util.stream.Collectors;

// Base Bogie class
class Bogie {
    private String type;

    public Bogie(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}

public class UC13_PerformanceComparison {

    public static void main(String[] args) {

        // 1. User prepares a collection of bogies
        List<Bogie> bogies = new ArrayList<>();

        // Simulating large dataset
        for (int i = 0; i < 200000; i++) {
            if (i % 3 == 0)
                bogies.add(new Bogie("Sleeper"));
            else if (i % 3 == 1)
                bogies.add(new Bogie("AC Chair"));
            else
                bogies.add(new Bogie("Goods"));
        }

        // ----------------------------------------
        // LOOP-BASED PROCESSING
        // ----------------------------------------

        long loopStart = System.nanoTime();   // Start time

        List<Bogie> loopFiltered = new ArrayList<>();

        for (Bogie b : bogies) {
            if (b.getType().equals("Sleeper")) {
                loopFiltered.add(b);
            }
        }

        long loopEnd = System.nanoTime();     // End time
        long loopTime = loopEnd - loopStart;  // Elapsed time

        // ----------------------------------------
        // STREAM-BASED PROCESSING
        // ----------------------------------------

        long streamStart = System.nanoTime(); // Start time

        List<Bogie> streamFiltered = bogies.stream()
                .filter(b -> b.getType().equals("Sleeper"))
                .collect(Collectors.toList());

        long streamEnd = System.nanoTime();   // End time
        long streamTime = streamEnd - streamStart; // Elapsed time

        // ----------------------------------------
        // OUTPUT RESULTS
        // ----------------------------------------

        System.out.println("\n===== UC13 PERFORMANCE RESULT =====");
        System.out.println("Loop Time   : " + loopTime + " ns");
        System.out.println("Stream Time : " + streamTime + " ns");

        if (loopTime < streamTime) {
            System.out.println("Result: Loop is faster");
        } else if (streamTime < loopTime) {
            System.out.println("Result: Stream is faster");
        } else {
            System.out.println("Result: Both are equal");
        }

        // Program continues...
        System.out.println("\nProgram execution continues...");
    }
}
