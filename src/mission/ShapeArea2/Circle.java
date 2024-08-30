package mission.ShapeArea2;

public class Circle extends Shape {

    private double radius;

    public Circle(double radius) {
        super(2, "기본색");
        this.radius = radius;
    }

    public double calculateDiameter() {
        return 2 * radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    public double getRadius() {
        return radius;
    }
}
