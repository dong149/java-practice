package design_patterns.sigleton;

public class Singleton {

    private static Singleton singleton = new Singleton();

    private Singleton() {
        System.out.println("create singleton");
    }

    public static Singleton getInstance() {
        return singleton;
    }
}
