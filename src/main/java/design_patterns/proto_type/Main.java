package design_patterns.proto_type;

public class Main {
    private static final String TEST = "TEST";
    public static void main(String[] args) {
        Manager manager = new Manager();
        UnderlinePen underlinePen = new UnderlinePen('_');
        PlusPen plusPen1 =  new PlusPen('+');
        PlusPen plusPen2 =  new PlusPen('!');

        manager.register("under1", underlinePen);
        manager.register("plusPen1", plusPen1);
        manager.register("plusPen2", plusPen2);

        Product p1 = manager.create("under1");
        Product p2 = manager.create("plusPen1");
        Product p3 = manager.create("plusPen2");

        p1.use(TEST);
        p2.use(TEST);
        p3.use(TEST);
    }
}
