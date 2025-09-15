//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
package shapes;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);
        Shape square = new Square(3);

        System.out.println("Область кола: " + circle.area());
        System.out.println("Площа прямокутника: " + rectangle.area());
        System.out.println("Квадратна площа: " + square.area());
    }
}