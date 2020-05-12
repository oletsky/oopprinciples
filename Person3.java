package oletsky.java.demoobjects;

public class Person3 {
    enum Gender {MALE, FEMALE}

    String name;
    int age;
    Gender gender;

    public Person3(String name, int age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
}
