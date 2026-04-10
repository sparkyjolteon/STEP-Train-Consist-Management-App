import java.util.*;
import java.util.stream.*;
class Bogie {
    String name;
    int capacity;
    public Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }
    public int getCapacity() {
        return capacity;
    }
}
class TrainCapacity {
    public static void main(String[] args) {
        List<Bogie> bogies = Arrays.asList(
                new Bogie("B1", 72),
                new Bogie("B2", 64),
                new Bogie("B3", 80),
                new Bogie("B4", 70)
        );
        int totalCapacity = bogies.stream()
                .map(Bogie::getCapacity)   
                .reduce(0, Integer::sum);  

        System.out.println("Total Seating Capacity: " + totalCapacity);
    }
}
