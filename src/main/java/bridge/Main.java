package bridge;

public class Main {

    public static void main(String[] args) {
        Shape shape = new Rectangle(new RectangleDrawing());

        shape.drawLine(5);
        shape.draw();
    }
}
