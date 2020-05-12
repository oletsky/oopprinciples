package oletsky.java.demoobjects;

public record PersonRecord(String name, int age,
                           GenderRecord gender) {
    enum GenderRecord {MALE, FEMALE}
}
