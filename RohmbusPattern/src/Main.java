import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Taking input from user
        System.out.print("Enter the number : ");
        int num = sc.nextInt();

        //Outer loop
        for(int i=1; i<=num; i++){
            //Inner loop for space
            for(int j=1; j<=num-i; j++){
                System.out.print(" ");
            }
            //Outer loop
            for(int j=num; j>=1; j--){
                System.out.print("*" + " ");
            }
            System.out.println(); //Taking next line
        }
    }
}