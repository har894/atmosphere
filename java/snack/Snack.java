public class Snack {

    private static char[] returnMap(char[] arr, int point) {
        char swap = arr[point];
        arr[point] = arr[point + 3];
        arr[point + 3] = swap;
        return arr;
    }

    public static void main(String[] args) {

        char[] map = {'*', '*', '*', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-'};

        for (int i = 0; i < map.length; i++) {
            System.out.print(map[i]);
        }

        int firstPoint = -1;

        for (int i = 0; i < map.length; i++) {
            if (map[i] == '*') {
                firstPoint = i;
                break;
            }
        }

        long startTime = System.nanoTime();
        System.out.println();
        System.out.println(startTime);

        for (int i = 0; i < map.length - 3; i++) {
            char swap = map[firstPoint];
            map[firstPoint] = map[firstPoint + 3];
            map[firstPoint + 3] = swap;
            firstPoint++;
        }

        long endTime = System.nanoTime();

        System.out.println(endTime);

        long time = endTime - startTime;

        for (int i = 0; i < map.length; i++) {
            System.out.print(map[i]);
        }
        System.out.println();

        System.out.println(time);
    }
}
