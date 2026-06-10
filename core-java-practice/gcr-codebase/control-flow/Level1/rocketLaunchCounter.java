import java.util.Scanner;
public class rocketLaunchCounter {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Set a counter to lauch a rockeet: ");
        int counter=sc.nextInt();
        System.out.println("Rocket launching in: ");
        while(counter>0){
            System.out.println(counter);
            counter--;
        }
        sc.close();
    }
}