package design_patterns.bridge;

public abstract class Shape {
    private Drawing drawing;

    public Shape(Drawing drawing) {
        this.drawing = drawing;
    }

    public abstract void draw();

    public void drawLine(int x) {
        drawing.drawLine(x);
    }
}
