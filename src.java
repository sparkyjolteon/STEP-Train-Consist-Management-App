import java.util.*;

// 1. Custom Runtime Exception
class CargoSafetyException extends RuntimeException {
    public CargoSafetyException(String message) {
        super(message);
    }
}

// 2. Goods Bogie Class
class GoodsBogie {
    private String shape;     // Rectangular / Cylindrical
    private String cargoType;

    public GoodsBogie(String shape) {
        this.shape = shape;
    }

    // 3. Cargo Assignment Method
    public void assignCargo(String cargoType) {
        try {
            // Validate safety rule
            if (cargoType.equalsIgnoreCase("Petroleum") &&
                shape.equalsIgnoreCase("Rectangular")) {

                // 4. Throw exception (unsafe condition)
                throw new CargoSafetyException(
                    "Unsafe assignment: Petroleum cannot be loaded in Rectangular bogie"
                );
            }

            // Safe assignment
            this.cargoType = cargoType;
            System.out.println("Cargo assigned successfully: " + cargoType);

        } catch (CargoSafetyException e) {
            // 5. Handle exception
            System.out.println("Error: " + e.getMessage());

        } finally {
            // 6. Always executes
            System.out.println("Assignment attempt completed for bogie shape: " + shape);
        }
    }

    @Override
    public String toString() {
        return "Shape: " + shape + " | Cargo: " +
               (cargoType == null ? "None" : cargoType);
    }
}

// 7. Main Application
public class UC15_CargoSafetyDemo {
    public static void main(String[] args) {

        List<GoodsBogie> train = new ArrayList<>();

        // Create bogies
        GoodsBogie b1 = new GoodsBogie("Rectangular");
        GoodsBogie b2 = new GoodsBogie("Cylindrical");

        train.add(b1);
        train.add(b2);

        // 8. Test cargo assignments
        System.out.println("---- Assigning Cargo ----");

        b1.assignCargo("Petroleum");   // Unsafe case
        b2.assignCargo("Petroleum");   // Safe case
        b1.assignCargo("Coal");        // Safe case

        // 9. Program continues safely
        System.out.println("\nFinal Train Composition:");
        for (GoodsBogie b : train) {
            System.out.println(b);
        }
    }
}
