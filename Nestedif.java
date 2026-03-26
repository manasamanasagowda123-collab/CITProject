import java.util.Scanner;

public class Nestedif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age");
        int age =sc.nextInt();
        if(age>=18){
            if (age>=65){
                System.out.println("Eligible to vote and avail goverment fund");
            }
            else
                System.out.println("we are Eligible to vote and no avil to avail goverment ");
        }else
            System.out.println("we are not eligible to vote");
                
    }

}
