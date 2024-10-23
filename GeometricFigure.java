
public interface GeometricFigure {
    default double perimeter() {
        System.out.println("Введите значение");
        return 0;
    }
    default double area(){
        System.out.println("Введите значение");
        return 0;
    }
}
