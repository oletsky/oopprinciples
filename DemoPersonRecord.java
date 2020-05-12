package oletsky.java.demoobjects;

import java.util.ArrayList;

/**
 * @author O.Oletsky
 * Demonstrating records
 */
public class DemoPersonRecord {
    public static void main(String[] args) {
        //List of people
        ArrayList<PersonRecord> listOfPeople = new ArrayList<>();
        listOfPeople.add(new PersonRecord("Іваненко Іван", 92, PersonRecord.GenderRecord.MALE));
        listOfPeople.add(new PersonRecord("Петренко Марія", 25, PersonRecord.GenderRecord.FEMALE));
        //Looking through the list of people
        for (var p : listOfPeople) {
            System.out.println(p.name() + " - " + p.age() + " - " + p.gender());
        }
    }
}
