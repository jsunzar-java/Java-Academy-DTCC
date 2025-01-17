package assignment_3.people_package;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class PeopleOperations {
    public static void main (String args []) throws Exception {
        /*
            Please ensure that you create an ArrayList of Person(s) with at least
            4 members
         */


        ArrayList<String> names = new ArrayList<>();
        names.add("Jaleel");
        names.add("Jack");
        names.add("John");
        names.add("Joe");
        names.add("Justin");

        ArrayList<Person> people = new ArrayList<Person>();

        int limit = 50;
        int counter = 0;
        while (counter < limit) {
            int index =  ThreadLocalRandom.current().nextInt(0, names.size());
            String name = names.get(index) + Integer.valueOf(counter);
            Person p = new Person();
            p.setName(name);
            people.add(p);
            counter = counter + 1;
        }

        Person youngestPerson = getYoungestPerson(people);
        Person oldestPerson = getOldestPerson(people);
        ArrayList<Person> sortedByAgeList = getSortedListByAge(people);
        ArrayList<Person> sortedByNameList = getSortedListByName(people, false);


        /*
            For the below to work where you can see what you've done, you must have
            done the section 1 recap portion where you override the toString() method of the
            Person class!
         */

        for(Person p : sortedByAgeList) {
            System.out.println(p);
        }

        for(Person p : sortedByNameList) {
            System.out.println(p);
        }
    }

    public static Person getYoungestPerson(ArrayList<Person> list) throws Exception {
        throw new Exception("Please implement this method");
    }

    public static Person getOldestPerson(ArrayList<Person> list) throws Exception {
        throw new Exception("Please implement this method");
    }

    public static ArrayList<Person> getSortedListByAge(ArrayList<Person> list) throws Exception {
        throw new Exception("Please implement this method");
    }

    public static ArrayList<Person> getSortedListByName(ArrayList<Person> list, boolean isAscending) throws Exception {
        throw new Exception("Please implement this method");
    }

}
