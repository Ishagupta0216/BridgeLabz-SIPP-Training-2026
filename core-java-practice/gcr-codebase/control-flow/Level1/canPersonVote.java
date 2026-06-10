import java.util.*;
public class canPersonVote {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        if(age>=18){
            System.out.println("This Person is eligible to vote");
        }
        else{
            System.out.println("This Person is not eligible to vote");
        }
        sc.close();
    }
}