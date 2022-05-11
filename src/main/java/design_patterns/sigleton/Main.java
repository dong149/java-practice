package design_patterns.sigleton;

public class Main {

    public static void main(String[] args) {
        System.out.println("start");
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        if (singleton1 == singleton2) {
            System.out.println("is same");
        } else {
            System.out.println("is not same!");
        }
    }
}
