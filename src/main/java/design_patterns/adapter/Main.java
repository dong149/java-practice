package design_patterns.adapter;

public class Main {

    public static void main(String[] args) {
        Adapter adapter = new AdapterImpl();
        System.out.println(adapter.twiceOf(100f)); // 200.0
        System.out.println(adapter.halfOf(100f)); // 50.0
    }
}
