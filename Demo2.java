package oletsky.java.demoobjects;

import java.util.ArrayList;

/**
 * @author O.Oletsky
 * The version of a program
 * demonstrating the class Person2 with constructors
 */
public class Demo2 {
    public static void main(String[] args) {
        //List of people
        ArrayList<Person2> listOfPeople = new ArrayList<>();
        listOfPeople.add(new Person2("Іваненко Іван", 92, "male"));
        listOfPeople.add(new Person2("Петренко Марія", 25, "female"));
        //Looking through the list of people
        for (var p : listOfPeople) {
            System.out.println(p.name + " - " + p.age + " - " + p.gender);
        }
    }
}
