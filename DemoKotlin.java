package oletsky.java.demoobjects;

public class DemoKotlin {
    public static void main(String[] args) {
        KotlinClass kol = new KotlinClass(20);
        System.out.println("Kotlin variable is "+kol.getS());
        kol.setS(100);
        System.out.println("Updated variable is "+kol.getS());
    }

}
