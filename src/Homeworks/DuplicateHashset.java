package Homeworks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;

public class DuplicateHashset {
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

        HashSet<String> duplicateElements = new HashSet<>(arrayList);
        for (String r : duplicateElements){
            System.out.println(r + " duplicate " + Collections.frequency(arrayList, r));
        }


    }
}
