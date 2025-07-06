public class Main {
    public static void main(String[] args) {
        Turtle t = new Turtle();
        t.speed(10);
        t.up();
        t.home();

        //ดอกบัวดอกไม้ประจำเดือน
        // Draw three layers of lotus petals with different colors and sizes
        drawLayer(t, 18, 100, "lightpink", 0);     // Outer layer
        drawLayer(t, 12, 70, "deeppink", 22);      // Middle layer
        drawLayer(t, 12, 40, "mediumvioletred", 11);// Inner layer
        t.up();
        t.hide();  
    }

    // Draw one layer of petals
    public static void drawLayer(Turtle t, int petals, int length, String color, int rotationOffset) {
        t.penColor(color);
        t.width(3);
        t.right(rotationOffset);  
        for (int i = 0; i < petals; i++) {
            drawSharpPetal(t, length);  // draw one petal
            t.right(360 / petals);      // Move to next petal position
        }
        t.left(rotationOffset);   // Rotate back after finishing the layer
    }

    // Draw a single sharp petal with two curved sides
    public static void drawSharpPetal(Turtle t, int length) {
        t.down();
        for (int i = 0; i < 20; i++) {
            t.forward(length / 20.0);
            t.left(3);
        }
        t.left(120);
        for (int i = 0; i < 20; i++) {
            t.forward(length / 20.0);
            t.left(3);
        }
        t.right(180);
        t.up();
    }
}
