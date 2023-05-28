public class Main {
    public static void main(String[] args) {

        //First half -> Outer loop
        for(int i=1; i<=5; i++){

            //Inner loop 1 -> will print - space of first half first part
            for(int j=1; j<=(5-i); j++){
                System.out.print(" ");
            }

            //Inner loop 2 -> will print - stars of first half first part
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            //Inner loop 3 -> will print - stars of first half second part
            for(int j=2; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //Second half -> outer loop
        for(int i=5; i>=1; i--){

            //1st Inner loop of second half, will print space of second half of first part
            for(int j=1; j<=(5-i); j++){
                System.out.print(" ");
            }

            //2nd Inner loop of second half, will print stars of second half of first part
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            //3rd inner loop of second half, will print stars of second half of second part
            for(int j=2; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}