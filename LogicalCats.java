package oletsky.java.demoobjects;

public class LogicalCats {
    public static void main(String[] args) {
        System.out.println(isPredator("cat"));
    }

    static boolean eatsMeat(String animal) {
        if ("cat".equals(animal)) return true;
        else return false;
    }

    static boolean isPredator(String animal) {
        return eatsMeat(animal);
    }
}
