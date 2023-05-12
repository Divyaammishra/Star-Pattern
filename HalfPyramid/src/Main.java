import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Taking input from the user
        System.out.print("Enter the number : ");
        int num = sc.nextInt();

        //Outer loop
        for(int i=1; i<=num; i++){
            //Inner loop
            for(int j=1; j<=i; j++){
                System.out.print("*" + " "); //Printing star including some space
            }
            System.out.println(); //For the next line
        }
    }
}