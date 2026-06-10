import java.util.Scanner;
public class checkNaturalNumberAndWriteSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();
        int sum = 0;
        if (n > 0) {
            for (int i = 1; i <= n; i++) {
                sum += i;
            }
            System.out.println("Sum of natural numbers from 1 to " + n + " is: " + sum);
        } else {
            System.out.println("Please enter a valid natural number.");
        }
        sc.close();
    }   
}