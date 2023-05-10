import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //taking input from user
        System.out.print("Enter the length : ");
        int length = sc.nextInt(); //as square's all sides are equal, we'll take a single input

        //Outer loop
        for(int i=1; i<=length; i++){
            //inner loop to print star
            for(int j=1; j<=length; j++){
                System.out.print("*" + " ");
            }
            System.out.println(); //for next line
        }
    }
}