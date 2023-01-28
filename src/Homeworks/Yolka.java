package Homeworks;

/*
print the following figure

     *
    * *
   * * *
  * * * *
 * * * * *

 */

public class Yolka {
    public static void main(String[] args) {


        for (int i = 0; i < 7; i++) {
            for (int j = 7 - i; j > 1; j--){
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
