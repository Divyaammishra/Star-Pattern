import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Taking input from user
        System.out.print("Enter the length : ");
        int length = sc.nextInt(); //As square's all sides are equal, we are taking only one input

        //outer loop
        for(int i=1; i<=length; i++){
            //inner loop to print stars
            for(int j=1; j<=length; j++){
                //Giving condition, where to print star and where to print space
                if(i == 1 || j == 1 || i == length || j == length){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println(); //for next line
        }
    }
}