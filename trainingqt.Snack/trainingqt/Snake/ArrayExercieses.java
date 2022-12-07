package trainingqt.Snake;

public class ArrayExercieses {
    public static void main(String[] args) {

        int[] array = {2, 5, 8, 10, 32, 22, 11, 66, 12, 30};
        //Տպել bolor elementnere
        for (int i = 0; i < array.length; i++) {
            System.out.print(" | " + array[i] + " | ");
        }
        //Nor tox tanenq
        System.out.println();
        //Masivi max number
        int maxNumber = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxNumber) {
                maxNumber = array[i];
            }
        }
        System.out.print("Max number is |" + maxNumber + "|");
        System.out.println();
        //Tpel massivi amenapoqr tive
        int minNumber = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minNumber) {
                minNumber = array[i];
            }
        }
        System.out.println("Min number is |" + minNumber + "|");

        //Tpel bolor kent tvere
        int oddNumbers = array[0];
        for (int i = 0; i < array.length; i++) {
            if ((array[i] % 2) != 0) {
                oddNumbers = array[i];
                System.out.println("The odd numbers are" + oddNumbers);
            }
        }
        //kent tver erkrord tarberak
        int kentNumbers = -1;
        System.out.println("Below numbers are odd:");
        for (int i = 0; i < array.length; i++) {
            if ((array[i] % 2) != 0) {
                System.out.print(array[i] + " ");
            }
        }
        //Tpel bolor zuyg tvere
        int evenNumbers = -1;
        System.out.println();
        System.out.println("Below numbers are even:");
        for (int i = 0; i < array.length; i++) {
            if ((array[i] % 2) == 0) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();

        //Mijin tvabanakane
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            result = result + array[i];
        }
        System.out.print("Mijin tvabanakane " + result / 10);
        System.out.println();
        //gumare tveri
        int gumar = 0;
        for (int i = 0; i < array.length; i++) {
            gumar = gumar + array[i];
        }
        System.out.println("Gumare " + gumar);

        //Kent u zuyg tveri qananke
        int evenNumber = 0;
        int oddNumber = 0;
        //int evenNumber=array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                evenNumber++;
            }
        }
        System.out.println("Even numbers are: "+ evenNumber);
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                oddNumber++;
            }
        }
        System.out.println("Odd numbers are:"+ oddNumber);


    }

}
