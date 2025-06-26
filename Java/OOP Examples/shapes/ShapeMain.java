package shapes;

public class ShapeMain {
    public static void main(String args[]) {
        // 1. Create a new 'Cirle' object. Pick your own name and radius.
        Shape c = new Circle("circle", 1.5);
        // 2. Print out the name, radius, and area of the Circle.
        System.out.println("Name: " + c.getName());
        System.out.println("Radius: " + ((Circle) c).getRadius());
        System.out.println("Area: " + c.area());
    }
}
