import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Taking Input from user
        System.out.print("Enter the number : ");
        int num = sc.nextInt();

        //Outer loop
        for(int i=1; i<=num; i++){
            //Inner loop
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println(); //Taking next line
        }
    }
}