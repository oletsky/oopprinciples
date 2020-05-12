package oletsky.java.demoobjects;

import java.util.ArrayList;

public class Demo3 {
    public static void main(String[] args) {
        //List of people
        ArrayList<Person3> listOfPeople = new ArrayList<>();
        listOfPeople.add(new Person3("Іваненко Іван", 92, Person3.Gender.MALE));
        listOfPeople.add(new Person3("Петренко Марія", 25, Person3.Gender.FEMALE));
        //Looking through the list of people
        for (var p : listOfPeople) {
            System.out.println(p.name + " - " + p.age + " - " + p.gender);
        }
    }
}
