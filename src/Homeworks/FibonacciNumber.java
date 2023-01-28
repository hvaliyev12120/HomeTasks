package Homeworks;
import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n_s_Fibonacci = scanner.nextInt();
        int num1 = 0;
        int num2 = 1;

        int counter = 0;

        while (counter < n_s_Fibonacci){
            System.out.println(num1 + " ");

            int num3 = num1 + num2;
            num1 = num2;
            num2 = num3;

            ++counter;
        }


    }
}
