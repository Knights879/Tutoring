package shapes;

public abstract class Shape {
    public String myName;

    // Constructor
    public Shape(String name) {
        myName = name;
    }

    public abstract double area();
    public abstract double perimeter();

    public double semiPerimeter() {
        return perimeter() / 2;
    }

    public String getName() {
        return myName;
    }
}
