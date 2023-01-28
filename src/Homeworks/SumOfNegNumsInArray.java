package Homeworks;

import java.util.Scanner;

public class SumOfNegNumsInArray {
        public static void main(String[] args) {
            int sum = 0;

            Scanner scanner = new Scanner(System.in);

            int[] array = new int[scanner.nextInt()];

            for (int i = 0; i < array.length; i++) {
                array[i] = scanner.nextInt();
            }

            for (int i = 0; i < array.length; i++) {
                if (array[i] <= 0) {
                    sum += array[i];
                }
            }
            System.out.println(sum);
        }
}

