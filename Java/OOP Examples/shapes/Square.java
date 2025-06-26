package shapes;

public class Square extends Shape {
    public double mySide;

    // Constructor
    public Square(String name, double side) {
        super(name);
        mySide = side;
    }

    public double perimeter() {
        return 4 * mySide;
    }

    public double area() {
        return mySide * mySide;
    }
}
