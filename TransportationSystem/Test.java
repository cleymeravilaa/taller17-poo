package TransportationSystem;

public class Test {
    public static void main(String[] args) {
        Bike b = new Bike("Mountain Bike");
        Car c = new Car("Toyota", "Gasolina");
        
        System.out.println("Modelo: " + b.getModel());
        System.out.println("Velocidad actual: " + b.getCurrentSpeed());
        System.out.println("Velocidad máxima: " + b.getMaxSpeed());
        System.out.println("Modelo: " + c.getModel());
        System.out.println("Velocidad actual: " + c.getCurrentSpeed());
        System.out.println("Velocidad máxima: " + c.getMaxSpeed());
        System.out.println("Tipo de combustión: " + c.getCombustionType());
        
        b.accelerate(10);
        b.brake(5);
        c.accelerate(10);
        c.brake(5);
        
        System.out.println("Modelo: " + b.getModel());
        System.out.println("Velocidad actual: " + b.getCurrentSpeed());
        System.out.println("Velocidad máxima: " + b.getMaxSpeed());
        System.out.println("Modelo: " + c.getModel());
        System.out.println("Velocidad actual: " + c.getCurrentSpeed());
        System.out.println("Velocidad máxima: " + c.getMaxSpeed());
        System.out.println("Tipo de combustión: " + c.getCombustionType());
    }
}
