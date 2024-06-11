public class Triangle {
    public void draw() {
        Turtle t = new Turtle();

        t.move(10, 200);
        t.penDown();

        t.go(100);
        t.rotate(120);
        t.go(100);
        t.rotate(120);
        t.go(100);
    }
    public static void main(String[] args) {
        Triangle tri = new Triangle();
        tri.draw();
    }
}