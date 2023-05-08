import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //importing scanner class to take input from user
        Scanner sc = new Scanner(System.in); //sc is object of scanner

        //Taking input from user
        System.out.print("Enter the number : ");
        int num = sc.nextInt();


        //Outer loop for the first-half
        for(int i=1; i<=num; i++){
            //inner loop for space
            for(int j=1; j<=num-i; j++){
                System.out.print(" "); // printing space
            }
            //inner loop for printing star of first-half of left side
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            //inner loop for printing the star of first-half of right side
            for(int j=2; j<=i; j++){
                System.out.print("*");
            }
            //Taking next line
            System.out.println();
        }

        //Outer loop for the second-half
        for(int i=1; i<=num; i++ ){
            //inner loop for second-half
            for(int j=1; j<=num*2; j++){
                //Giving condition for printing stars and space
                if(j==1 || j == 2 || j ==(num*2)-2 || j ==(num*2)-1){
                    System.out.print("*");
                }else{
                    System.out.print(" "); //printing space
                }
            }
            System.out.println(); //Taking next line
        }
    }
}