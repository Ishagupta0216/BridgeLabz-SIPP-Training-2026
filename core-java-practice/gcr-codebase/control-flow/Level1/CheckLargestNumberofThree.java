import java.util.*;
public class CheckLargestNumberofThree {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int number1=sc.nextInt();
        int number2=sc.nextInt();
        int number3=sc.nextInt();
        if(number1>number2 && number1>number3){
            System.out.println("Number 1 is largest");
        }
        else if(number2>number1 && number2>number3){
            System.out.println("Number 2 is largest");
        }
        else{
            System.out.println("Number 3 is largest");
        }
        sc.close();
    }
}