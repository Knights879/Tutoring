package shapes;

public class Circle extends Shape {
    public double myRadius;
    public double circ;

    // Constructor
    public Circle(String name) {
        super(name);
        myRadius = 0;
        circ = 0;
    }
    public Circle(String name, double radius) {
        super(name);
        myRadius = radius;
        circ = 0;
    }
    public Circle(String name, double radius, double circum) {
        super(name);
        myRadius = radius;
        circ = circum;
    }

    public double perimeter() {
        return 2 * Math.PI * myRadius;
    }

    public double area() {
        return Math.PI * myRadius * myRadius;
    }

    public double getRadius() {
        return myRadius;
    }
}
