/**
 * User:DELL
 * Date:2021-01-11
 * Time:18:51
 */

class Shape {
    public void draw() {
// 啥都不用干
    }
}
class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("○");
    }
}
class Rect extends Shape {
    @Override
    public void draw() {
        System.out.println("□");
    }
}
class Flower extends Shape {
    @Override
    public void draw() {
        System.out.println("❀");
    }
}
public class TestDemo {
    public static void main(String[] args) {
        Shape shape1 = new Flower();
        Shape shape2 = new Circle();
        Shape shape3 = new Rect();
        drawShape(shape1);
        drawShape(shape2);
        drawShape(shape3);
    }
    // 打印单个图形
    public static void drawShape(Shape shape) {
        shape.draw();
    }
}
