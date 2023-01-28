package Homeworks;
import com.sun.source.tree.Tree;

import java.util.*;

public class DuplicateElements {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Red");
        arrayList.add("Blue");
        arrayList.add("Blue");
        arrayList.add("Blue");
        arrayList.add("Orange");
        arrayList.add("Black");
        arrayList.add("Black");
        arrayList.add("Black");
        arrayList.add("Green");
        arrayList.add("Purple");
        arrayList.add("Purple");

        TreeSet<String> duplicateElements = new TreeSet<>();
        TreeSet<String> justTree = new TreeSet<>();


        for(String a : arrayList) {
            if(!justTree.add(a)){
                duplicateElements.add(a);
            }
        }

        for(String b : arrayList) {
            System.out.println(b + ": " + Collections.frequency(arrayList, b));
        }

        System.out.println("Duplicate elements : " + duplicateElements);




    }


}

