package Figure;

public class Circle extends Figure {
   double radius ;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculationOfArea() {
        return Math.PI * (radius * radius);
    }

    @Override
    public double calculayionPerimeter() {
        return 2 * (Math.PI * radius);
    }
}
