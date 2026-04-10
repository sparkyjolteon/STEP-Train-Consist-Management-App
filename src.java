import java.util.regex.*;

class TrainValidator {

    public static void main(String[] args) {

        // Sample user inputs
        String trainId = "TRN-1234";
        String cargoCode = "PET-AB";

        // Define regex patterns
        String trainPatternStr = "TRN-\\d{4}";
        String cargoPatternStr = "PET-[A-Z]{2}";

        // Compile patterns
        Pattern trainPattern = Pattern.compile(trainPatternStr);
        Pattern cargoPattern = Pattern.compile(cargoPatternStr);

        // Create matchers
        Matcher trainMatcher = trainPattern.matcher(trainId);
        Matcher cargoMatcher = cargoPattern.matcher(cargoCode);

        // Validate inputs
        if (trainMatcher.matches()) {
            System.out.println("Train ID is valid.");
        } else {
            System.out.println("Invalid Train ID format.");
        }

        if (cargoMatcher.matches()) {
            System.out.println("Cargo Code is valid.");
        } else {
            System.out.println("Invalid Cargo Code format.");
        }

        // Program continues...
        System.out.println("Validation process completed.");
    }
}
