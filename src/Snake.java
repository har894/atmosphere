public class Snake {

    public static void main(String[] args) throws InterruptedException {

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
            Thread.sleep(200);
            System.out.println(charArray);
        }
    }
}
