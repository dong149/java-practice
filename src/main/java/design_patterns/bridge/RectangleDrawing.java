package design_patterns.bridge;

public class RectangleDrawing implements Drawing {

    @Override
    public void drawLine(int x) {
        System.out.println("drawLine Rectangle : " + x);
    }
}
