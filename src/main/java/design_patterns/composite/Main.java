package design_patterns.composite;

public class Main {

    public static void main(String[] args) {
        Ellipse ellipse1 = new Ellipse();
        Ellipse ellipse2 = new Ellipse();

        CompositeGraphic graphic = new CompositeGraphic();
        graphic.add(ellipse1);
        graphic.add(ellipse2);

        graphic.print();

        System.out.println();

        CompositeGraphic graphic1 = new CompositeGraphic();
        graphic1.add(ellipse1);
        graphic.add(graphic1);

        graphic.print();
    }
}
