package src.das;

import java.util.Collections;

public class Game {
    static String[] swap(String[] strings, int n, int m) {
        for (int j = 0; j < strings.length; j++) {
            String temp = strings[m];
            strings[m] = strings[n];
            strings[n] = temp;
        }
        return strings;
    }

    public static void main(String[] args) {


        String[] strings = new String[5];
        strings[0] = "*";
        strings[1] = "-";
        strings[2] = "-";
        strings[3] = "-";
        strings[4] = "-";
        int K =4;
        int M = 0;
        String[] secondString = swap(strings,K,M);
        for (int i = 0; i < strings.length; i++)
            System.out.print(secondString[i] + " ");
    }
}
