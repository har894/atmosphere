public class Snack {
    public static void main(String[] args) {
    char[] mapt = {'*', '*', '*', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-'};

        long startTime = System.nanoTime();
        System.out.println(startTime);

    for(int i = 0; i < mapt.length; i++) {
        if (mapt[i] == '-'){
            mapt[i] = '*';
            mapt[i-3] = '-';
            System.out.println(mapt);
        }

    }


        long endTime = System.nanoTime();
        System.out.println(endTime);
        long time = endTime - startTime;
        System.out.println(time);

    }

}
