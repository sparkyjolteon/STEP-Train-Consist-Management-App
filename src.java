import java.util.ArrayList;
import java.util.List;

class GoodsBogie {
    private String bogieId;
    private String cargoType;
    private boolean hazardous;

    public GoodsBogie(String bogieId, String cargoType, boolean hazardous) {
        this.bogieId = bogieId;
        this.cargoType = cargoType;
        this.hazardous = hazardous;
    }

    public boolean isHazardous() {
        return hazardous;
    }

    public String getCargoType() {
        return cargoType;
    }
}

public class UC13PerformanceComparison {
    public static void main(String[] args) {

        // Prepare a large collection of goods bogies
        List<GoodsBogie> bogies = new ArrayList<>();

        for (int i = 1; i <= 100000; i++) {
            boolean hazardous = (i % 10 == 0); // every 10th bogie is hazardous
            bogies.add(new GoodsBogie("G" + i, "Chemical", hazardous));
        }

        // -------------------------------
        // LOOP-BASED PERFORMANCE TEST
        // -------------------------------
        long loopStart = System.nanoTime();

        int hazardousCountLoop = 0;
        for (GoodsBogie bogie : bogies) {
            if (bogie.isHazardous()) {
                hazardousCountLoop++;
            }
        }

        long loopEnd = System.nanoTime();
        long loopTime = loopEnd - loopStart;

        // -------------------------------
        // STREAM-BASED PERFORMANCE TEST
        // -------------------------------
        long streamStart = System.nanoTime();

        long hazardousCountStream = bogies.stream()
                                          .filter(GoodsBogie::isHazardous)
                                          .count();

        long streamEnd = System.nanoTime();
        long streamTime = streamEnd - streamStart;

        // -------------------------------
        // DISPLAY RESULTS
        // -------------------------------
        System.out.println("=== Performance Comparison: Loop vs Stream ===");
        System.out.println("Hazardous Bogies Count using Loop   : " + hazardousCountLoop);
        System.out.println("Loop Execution Time   : " + loopTime + " ns");

        System.out.println();

        System.out.println("Hazardous Bogies Count using Stream : " + hazardousCountStream);
        System.out.println("Stream Execution Time : " + streamTime + " ns");

        System.out.println();

        if (loopTime < streamTime) {
            System.out.println("Loop was faster.");
        } else if (streamTime < loopTime) {
            System.out.println("Stream was faster.");
        } else {
            System.out.println("Both performed equally.");
        }
    }
}
