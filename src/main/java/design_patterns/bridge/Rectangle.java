package design_patterns.bridge;

public class Rectangle extends Shape{

    public Rectangle(Drawing drawing) {
        super(drawing);
    }

    @Override
    public void draw() {
        System.out.println("draw Rectangle");
    }
}
