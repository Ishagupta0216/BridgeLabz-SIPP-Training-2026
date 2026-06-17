class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

public class hospital{

    // Method to calculate average bill per item
    public static double calculateAverageBill(double totalBill, int itemCount) {
        try {
            return totalBill / itemCount;
        } catch (ArithmeticException e) {
            System.out.println("Error: Bill cannot have zero items.");
            return 0;
        }
    }

    // Method to process payment
    public static void processPayment(double billAmount, double paidAmount)
            throws InsufficientFundsException {

        if (paidAmount < billAmount) {
            throw new InsufficientFundsException(
                    "Payment failed: Insufficient funds. Need ₹"
                            + (billAmount - paidAmount) + " more.");
        }

        System.out.println("Payment successful!");
    }

    public static void main(String[] args) {

        // 1. Division by Zero Handling
        try {
            int totalBill = 5000;
            int itemCount = 0;

            double avg = totalBill / itemCount;
            System.out.println("Average Bill: ₹" + avg);

        } catch (ArithmeticException e) {
            System.out.println("Error: Bill cannot have zero items.");
        }

        // 2. Array Index Out of Bounds Handling
        try {
            String[] patients = {"Aman", "Riya", "Karan"};

            System.out.println("Patient: " + patients[5]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid patient index selected.");
        }

        // 3. Number Format Exception Handling
        try {
            String input = "ABC123";

            int patientId = Integer.parseInt(input);
            System.out.println("Patient ID: " + patientId);

        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid numeric input provided.");
        }

        // 4. Custom Exception Handling
        try {
            processPayment(10000, 7000);

        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Hospital billing system continues running safely.");
    }
}