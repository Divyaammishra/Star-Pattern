import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Taking input from user
        System.out.print("Enter the number : ");
        int num = sc.nextInt();

        //Outer loop - as we want to inverted pyramid, so we will print star in decreasing order
        for(int i=num; i>=1; i--){

            //Inner loop
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println(); //To take the next line
        }
    }
}