import java.sql.SQLOutput;
import java.util.Scanner;

public class Try {
    public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
        System.out.print("Enter the first no. : ");
        int a= sc.nextInt();

        System.out.print("Enter the second no. : ");
        int b= sc.nextInt();

        if (a>b) {
            System.out.println("#First number is greater than your second number");

        }
        if (b>a){
            System.out.println("#Second number is greater than your first number");

        }
    }
}
