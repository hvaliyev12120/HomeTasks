package Homeworks;
import java.util.Scanner;

public class Print_Negative_Num_in_Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[scanner.nextInt()];

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] <= 0) {
                System.out.println(array[i]);
            }
        }
    }
}
