package das.src.das;

import java.util.Arrays;
import java.util.Scanner;

public class Game {
    static String[] swap(String[] snakeArray, int firstElement, int secondElement) {
        for (int j = 0; j < snakeArray.length; j++) {
            String temp = snakeArray[secondElement + 2];
            snakeArray[secondElement + 2] = snakeArray[firstElement];
            snakeArray[firstElement] = temp;
            break;
        }
        return snakeArray;
    }

    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of the array:");
        int lengthOfArray = scanner.nextInt();

        String[] firstSnake = new String[lengthOfArray];
        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < lengthOfArray; i++) {
            firstSnake[i] = scanner.next();
        }

        System.out.println(Arrays.toString(firstSnake));
        System.out.println("\n");

        System.out.println("Game is start:");

        for (int n = 0; n < firstSnake.length; n++) {
            System.out.print(firstSnake[n] + " ");
        }
        System.out.println("\n");

        int M = 0;
        for (int k = 0; k < firstSnake.length - 3; k++) {
            M++;
            String[] secondSnake = swap(firstSnake, k, M);
            for (int i = 0; i < secondSnake.length; i++)

                System.out.print(secondSnake[i] + " ");
            Thread.sleep(350);
            System.out.println("\n");
        }
        System.out.println("Finish!");
    }

}
