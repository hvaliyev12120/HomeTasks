package Homeworks;
// second big num here: 35
public class second_big_num_inArray {
    public static void main(String[] args) {

        int[] array = {2, 35, 3, 7, 8, 4, -5, 33, 90};

        int second = Integer.MIN_VALUE;
        int first = Integer.MIN_VALUE;

        for(int i = 0; i < array.length; i++){
            if(array[i] > first){
                second = first;
                first = array[i];
            }
            else if (array[i] > second && array[i] != first) {
                second = array[i];

            }
        }

        System.out.println(second);
    }
}