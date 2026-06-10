import java.util.*;
public class checkNumber {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        if(number<0){
            System.out.println("This number is negative.");
        }
        else if(number==0){
            System.out.println("This number is zero.");
        }
        else{
            System.out.println("This number is positive.");
        }
        sc.close();
    }
}