package assignment_3.people_package;
/*
    This is the class you need to work on
    If you were to create a class from scratch, please remember that the name of the class should match
    the name of the file the class resides in. (this is more of a convention thing)

    Reference:
    1) https://stackoverflow.com/questions/1841847/can-i-compile-a-java-file-with-a-different-name-than-the-class
 */

import java.util.Scanner;

public class Person {
    private String name;
    public String getName(){
        return this.name;
    }

    private int age;
    public int getAge(){
        return this.age;
    }

    private int id;
    public int getId() {
        return this.id;
    }

    public void setName(String name){
        if(!name.isEmpty()) {
            this.name = name;
        }
    }
    public void setAge(int age) {
        Scanner scan = new Scanner(System.in);
        if (scan.hasNextInt()) {
            this.age = age;
        }
    }
    public void setID(int id) {
        Scanner scan = new Scanner(System.in);
        if (scan.hasNextInt()) {
            this.id = id;
        }
    }
}
