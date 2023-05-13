import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Taking input from user
        System.out.print("Enter the number : ");
        int num = sc.nextInt();

        //Outer loop
        for(int i=num; i>=1; i--){
            //Inner loop for printing space
            for(int j=1; j<=num-i; j++){
                System.out.print(" ");
            }
            //Inner loop for printing stars
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println(); //For the next line
        }
    }
}