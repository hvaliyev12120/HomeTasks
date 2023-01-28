package Homeworks;

import java.util.HashSet;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.TreeSet;

/*
    1. Write a Java program to add element to the hash set
    2. Write a Java program to convert a hash set to a List/ArrayList
    3. Write a Java program to convert a hash set to an array.
    4. Write a Java program to convert a hash set to a tree set
    5. Write a Java program to compare two sets and retain elements which are same on both sets
    6. Write a Java program to remove all of the elements from a hash set
    7. Write a Java program to create a new tree set, add some colors (string) and print out the tree set
    8. Write a Java program to iterate through all elements in a tree set.
    9. Write a Java program to get the number of elements in a tree set
    10. Write a Java program to compare two tree sets
    11. Write a Java program to retrieve and remove the first element of a tree set
    12. Write a Java program to retrieve and remove the last element of a tree set
 */

public class addElementHashset {
    public static void main(String[] args) {
        HashSet<String> string_1 = new HashSet<>();
        string_1.add("Red");
        string_1.add("Blue");
        string_1.add("Orange");
        string_1.add("Black");
        string_1.add("Green");
        string_1.add("Purple");

        System.out.println("First HashSet: " + string_1);

        HashSet<String> string_2 = new HashSet<>();

        string_2.add("Red");
        string_2.add("Green");
        string_2.add("Black");
        string_2.add("White");

        System.out.println("Second HashSet: " + string_2);

        numberOfAllElementsInTreeSet(string_1);
    }


    //------------------------------------------------------------------------------------------------------------------
    // 1 ci task;
    private static void AddElementHashset(HashSet<String> string_1) {

        Iterator itr = string_1.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

    }

    //--------------------------------------------------------------------------------------------------
    // 2 ci task;
    private static void ConvertToArratList(HashSet<String> string_1) {

        ArrayList<String> Color_array = new ArrayList<>(string_1);

        System.out.println(string_1);
    }


    //---------------------------------------------------------------------------------------------------
    // 3 cu task;

    private static void ConvertingArray(HashSet<String> string_1) {

        String[] array = new String[string_1.size()];

        string_1.toArray(array);

        for (String n : array)
            System.out.println(n);
    }


    //---------------------------------------------------------------------------------------------------
    // 4 cu task;

    private static void ConvertingToTreeSet(HashSet<String> string_1) {

        TreeSet<String> hashSetToTreeSet = new TreeSet<>(string_1);

        System.out.println("TreeSet: " + hashSetToTreeSet);
    }

    //---------------------------------------------------------------------------------------------------
    // 5 ci task;

    private static void  compareTwoSetsRetainElementsWhichSameOnBothSets(HashSet<String> string_1, HashSet<String> string_2) {

        string_1.retainAll(string_2);
        System.out.println("HashSet content: " + string_1);
    }

    //---------------------------------------------------------------------------------------------------
    // 6 ci task;

    private static void removeElementsFromHashSet(HashSet<String> string_1) {
        string_1.clear();
        System.out.println(string_1);
    }


    //---------------------------------------------------------------------------------------------------
    // 7 ci task

    private static void addSomeColorsToTreeSet(HashSet<String> string_1) {

        TreeSet<String> addcolor = new TreeSet<>(string_1);
        addcolor.add("Grey");
        System.out.println(addcolor);
    }

    //---------------------------------------------------------------------------------------------------
    // 8 ci task

    private static void iterateAllElementsInTreeSet(HashSet<String> string_1) {

        TreeSet<String> treeSet = new TreeSet<>(string_1);

        Iterator<String> iterator = treeSet.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }



    //---------------------------------------------------------------------------------------------------
    // 9 cu task
    //Write a Java program to get the number of elements in a tree set

    private static void numberOfAllElementsInTreeSet(HashSet<String> string_1) {

        TreeSet<String> treeSet = new TreeSet<>(string_1);
        Iterator<String> iterator = treeSet.iterator();

        int sum = 0;

        while (iterator.hasNext()){
            String s = iterator.next();
            sum += 1;
        }
        System.out.println(sum);
    }



    //---------------------------------------------------------------------------------------------------
    // 10 cu task

    private static void  compareTwoTreeSet(HashSet<String> string_1, HashSet<String> string_2) {

        TreeSet<String> treeSet1 = new TreeSet<>(string_1);
        TreeSet<String> treeSet2 = new TreeSet<>(string_2);

        boolean compared  = string_1.equals(string_2);
        System.out.println("Are both set equal: " + compared);
    }


    //---------------------------------------------------------------------------------------------------
    // 11 ci task

    private static void  firsElement(HashSet<String> string_1){
        //Write a Java program to retrieve and remove the first element of a tree set
        TreeSet<Integer> treeSet = new TreeSet<>();


        int removedNumber = treeSet.pollFirst();
        System.out.println(removedNumber);
    }


    //---------------------------------------------------------------------------------------------------
    // 12 ci task

    private static void  lastElement(HashSet<String> string_1){
        //Write a Java program to retrieve and remove the first element of a tree set
        TreeSet<Integer> treeSet = new TreeSet<>();


        int removedNumber = treeSet.pollLast();
        System.out.println(removedNumber);
    }

}