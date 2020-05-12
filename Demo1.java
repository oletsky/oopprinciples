package oletsky.java.demoobjects;

/**
 * @author O.Oletsky
 * The first version of a progrsm
 * demonstrating the class Person1 without constructors
 */

import java.util.ArrayList;

public class Demo1 {
    public static void main(String[] args) {
        //First instance
        Person1 ivanenko = new Person1();
        ivanenko.name="Іваненко Іван";
        ivanenko.age=92;
        ivanenko.temper="сангвінік";
        //First instance
        Person1 petrenko = new Person1();
        petrenko.name="Петренко Марія";
        petrenko.age=25;
        petrenko.temper="флегматик";
        //List of people
        ArrayList<Person1> listOfPeople = new ArrayList<>();
        listOfPeople.add(ivanenko);
        listOfPeople.add(petrenko);
        //Looking through the list of people
        for (var p:listOfPeople) {
            System.out.println(p.name+" - "+p.age+" - "+p.temper);
        }
    }
}
