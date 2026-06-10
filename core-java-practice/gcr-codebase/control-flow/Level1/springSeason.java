import java.util.Scanner;
public class springSeason {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Month: ");
        int month=sc.nextInt();
        System.out.print("Enter day: ");
        int day=sc.nextInt();
        //spring season march 3/20 to june 6/20
        if((month==3 && day>=20) || (month==4) || (month==5) || (month==6 && day<=20)){
            System.out.println("It's Spring season");
        }
        else{
            System.out.println("It's not a Spring season");
        }
        sc.close();
    }
}