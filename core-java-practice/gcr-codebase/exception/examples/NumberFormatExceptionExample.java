public class NumberFormatExceptionExample {
    public static void main(String[] args) {
        try {
            int number = Integer.parseInt("XYZ"); // This will throw NumberFormatException
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught: " + e.getMessage());
        }
    }
}

