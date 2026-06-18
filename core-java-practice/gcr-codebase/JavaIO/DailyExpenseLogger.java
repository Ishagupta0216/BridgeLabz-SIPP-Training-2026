import java.io.*;
import java.util.Scanner;

public class DailyExpenseLogger {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            FileWriter fw = new FileWriter("expenses.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);

            System.out.print("Enter Expense Category: ");
            String category = sc.nextLine();

            System.out.print("Enter Amount: ");
            int amount = sc.nextInt();

            bw.write(category + " - " + amount);
            bw.newLine();

            bw.close();

            System.out.println("Expense saved successfully.");

        } catch (IOException e) {
            System.out.println("Error writing to file.");
        }

        sc.close();
    }
}