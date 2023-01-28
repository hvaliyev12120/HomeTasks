package Homeworks;
import java.util.Scanner;

public class Foktarial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int x = scanner.nextInt();
        int i;
        int sum = 1;

        for(i = 1; i <= x; i++){
            sum = sum * i;
        }
        System.out.println(sum);
    }

}
