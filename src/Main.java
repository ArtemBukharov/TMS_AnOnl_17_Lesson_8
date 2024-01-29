import Figure.Circle;
import Figure.Figure;
import Figure.Rectangle;
import Figure.Triangle;
//Фигура -> Треугольник -> Прямоугольник -> Круг.
//Реализовать ф-ю подсчета площади для каждого типа фигуры и подсчет
//периметра.
//Создать массив из 5 фигур.
//Вывести на экран сумму периметра всех фигур в массиве
public class Main {
    public static void main(String[] args) {

        Circle circle1 = new Circle(5.5);
        Circle circle2 = new Circle(10.5);
        Circle circle3 =new Circle(20.5);
        Triangle triangle = new Triangle(5,6,7,3);
        Rectangle rectangle =new Rectangle(5,2);
        System.out.println(circle1.calculayionPerimeter());
        System.out.println(circle2.calculayionPerimeter());
        System.out.println(circle3.calculayionPerimeter());
        System.out.println(triangle.calculayionPerimeter());
        System.out.println(rectangle.calculayionPerimeter());
        System.out.println(circle1.calculationOfArea());
        System.out.println(circle2.calculationOfArea());
        System.out.println(circle3.calculationOfArea());
        Figure[] figures = {circle1,circle2,circle3,triangle,rectangle};
        double summ=0;
        for (Figure figure : figures ) {
            summ += figure.calculayionPerimeter();
        }
        System.out.println(summ);

    }
}