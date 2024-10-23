
public class Main {
    public static void main(String[] args) {
        Cat murka = new Cat("Мурка");
        Cat ryzaya = new Cat("Рыжая");
        Cat seraya = new Cat("Серая");
        Dog haska = new Dog("Хася");
        Dog taksa = new Dog("Ося");
        murka.run(199);
        ryzaya.run(201);
        seraya.swim(0);
        haska.run(600);
        taksa.swim(30);
        System.out.println();
        //task 1.2
        Bowl bowl = new Bowl();
        Cat[] kittens = new Cat[5];
        kittens[0] = new Cat("Лала");
        kittens[1] = new Cat("Лулу");
        kittens[2] = new Cat("Лоло");
        kittens[3] = new Cat("Ляля");
        kittens[4] = new Cat("Лула");
        for (Cat kitten : kittens) {
            bowl.food();
            kitten.eat(bowl);
            bowl.putFood();
        }
        // Задание 2
        GeometricFigure[] figures = new GeometricFigure[3];
        figures[0] = new Circle(7.0, " синий", " фиолетовый");
        figures[1] = new Square(9.0, " черный", " зеленый");
        figures[2] = new Triangle(11.0, 2.0, " красный", " желтый");
        for (GeometricFigure figure: figures) {
            System.out.println(figure + " Периметр: " + figure.perimeter() +  "  Площадь: " + figure.area());
        }
    }
}