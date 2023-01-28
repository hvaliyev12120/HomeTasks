package Homeworks;

import java.util.*;

import java.util.ArrayList;

public class MinAndMaxInArrayList {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(10);
        arr.add(20);
        arr.add(5);
        arr.add(8);


        Integer max = Collections.max(arr);
        Integer min = Collections.min(arr);

        System.out.println(max);
        System.out.println(min);

    }
}
