package mission.ShapeArea2;

public class Rectangle extends Shape{

    private double width;
    private double height;

    public Rectangle(double width, double height) {
        super(2, "기본색");
        this.width = width;
        this.height = height;
    }

    public double calculateDiagonal(){
        return Math.sqrt(Math.pow(width,2)+Math.pow(height,2));
    }

    @Override
    public double calculateArea() {
        return width*height;
    }

    @Override
    public double calculatePerimeter() {
        return 2*(width+height);
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
}
