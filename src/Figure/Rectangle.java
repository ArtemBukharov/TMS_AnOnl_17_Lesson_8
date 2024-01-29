package Figure;

public class Rectangle extends Figure {
    double width;

    double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculationOfArea() {
        return width * height;
    }

    @Override
    public double calculayionPerimeter() {
        return 2 * (width + height);
    }
}
