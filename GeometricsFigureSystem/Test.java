package GeometricsFigureSystem;
public class Test {
    public static void main(String[] args) {
        Circle c = new Circle(5);
        Rectangle r = new Rectangle(5, 10);
        
        System.out.printf("El area del circulo es: %.2f%n", c.calcArea());
        System.out.printf("El area del rectangulo es: %.2f%n", r.calcArea());
    }
}
