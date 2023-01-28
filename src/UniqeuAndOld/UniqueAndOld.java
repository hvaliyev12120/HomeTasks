package UniqeuAndOld;

import java.util.*;


public class UniqueAndOld {
    public static void main(String[] args) {

        List<Person> persons = new ArrayList<>();

        persons.add(new Person("John", 21));
        persons.add(new Person("John", 25));
        persons.add(new Person("John", 19));
        persons.add(new Person("Bill", 72));
        persons.add(new Person("Bill", 21));
        persons.add(new Person("Ann", 55));
        persons.add(new Person("Ann", 21));
        persons.add(new Person("Jane", 72));


        Collections.sort(persons, new Comparator<>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge() - o2.getAge();
            }
        });

        HashMap<String, Integer> map = convertingListToMap(persons);

        persons.clear();


        for (Map.Entry<String, Integer> maps : map.entrySet()) {

            persons.add(new Person(maps.getKey(), maps.getValue()));
        }



        for (Person a : persons) {
            System.out.println(a);
        }
    }

    public static HashMap<String, Integer> convertingListToMap(List<Person> persons) {

        HashMap<String, Integer> map = new HashMap<>();
        for (Person str : persons) {
            map.put(str.getName(), str.getAge());
        }
        return map;

    }
}
