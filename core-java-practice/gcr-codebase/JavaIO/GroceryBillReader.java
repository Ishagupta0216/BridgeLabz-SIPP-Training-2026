import java.io.*;

public class GroceryBillReader {
    public static void main(String[] args) {

        int lineCount = 0;

        try {

            FileReader fr = new FileReader("bill.txt");
            BufferedReader br = new BufferedReader(fr);

            String line;

            System.out.println("Bill Contents:");

            while ((line = br.readLine()) != null) {
                System.out.println(line);
                lineCount++;
            }

            br.close();

            System.out.println("\nTotal Lines = " + lineCount);

        } catch (FileNotFoundException e) {
            System.out.println("bill.txt not found.");
        } catch (IOException e) {
            System.out.println("Error reading file.");
        }
    }
}