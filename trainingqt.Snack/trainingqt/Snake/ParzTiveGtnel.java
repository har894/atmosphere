package trainingqt.Snake;


import java.util.Scanner;

public class ParzTiveGtnel {
    public static void main(String[] args) {
        int number;
        int count=0;
//option 1.0
       Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number");
        number= scanner.nextInt();
        for(int i=2;i<=number/2;i++){
            if (number%2==0){
                count++;
            }
        }
        if(count==0 && number!=1){
            System.out.println(number+" Is a Prime");

        }
        else {
            System.out.println(number+" Is not Prime");
        }

        //Option 2.0
        for (int i=2;i<=100;i++){
            for (int j=2;j<=i;j++){
                if (j==i){
                    System.out.println(i);
                }
                if (i%j==0){
                    break;
                }
            }
        }


    }
}
