package Figure;

public class Triangle extends Figure {
double a  ;
double b ;

double c ;

double h ;

    public Triangle(double a, double b, double c, double h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
    }

    @Override
    public double calculationOfArea() {
        return (a * h)/2 ;
    }

    @Override
    public double calculayionPerimeter() {
        return a + b + c ;

    }
}
