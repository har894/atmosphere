import java.util.Scanner;

public class SnakeScanner10 {

    public static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner(System.in);
        System.out.print("Are you going to start the game(Yes/No): ");
        if(input.nextLine().equals("Yes")) {
            char[] charArray = new char[10];

            for(int i = 0; i < 10; i++) {
                charArray[i] = '*';

                for (int g = 3; g < 10; g++) {
                    charArray[g] = '-';
                }

            }

            System.out.println(charArray);



            for(int g = 0; g < 7; g++) {

                for(int i = g; i < 10; i++) {
                    if(i == g) {
                        charArray[i] = '-';
                    } else if (i < g+4) {
                        charArray[i] = '*';
                    } else {
                        charArray[i] = '-';
                    }
                }
                Thread.sleep(100);
                System.out.println(charArray);
            }
            Scanner input2 = new Scanner(System.in);
            System.out.print("Do you want to go back?(Yes/No): ");
            if(input2.next().equals("Yes")) {
                for(int i = 9; i >= 0; i--) {
                    charArray[i] = '*';


                    for(int g = 6; g>=0; g--) {
                        charArray[g] = '-';
                    }

                }

                System.out.println(charArray);


                for(int g = 7; g>0; g--) {
                    for (int i = g + 2; i >= 0; i--) {
                        if (i == g + 2) {
                            charArray[i] = '-';
                        } else if (i > g - 2) {
                            charArray[i] = '*';
                        } else {
                            charArray[i] = '-';
                        }

                    }
                    Thread.sleep(100);
                    System.out.println(charArray);
                }
            } else {
                System.out.println("You chose \"No\"... Game over");
            }
        } else {
            System.out.println("You do not want to start the game...");
        }
      }
    }

