
public class Dog extends Animal {
    private static int dogCount = 0;
    public Dog(String name) {
        super(name);
        dogCount++;
    }
    @Override
    public void run(int distance) {
        if (distance <= 500 && distance > 0) {
            System.out.println("\uD83D\uDC15 " + name + " пробежал " + distance + "м.");
        } else if (distance < 0) {
            System.out.println("Нельзя использовать отрицательные числа!");
        } else {
            System.out.println("\uD83D\uDC15 " + name + " не может пробежать " + distance + " метров!");
        }
    }
    @Override
    public void swim(int distance) {
        if (distance <= 10 && distance > 0) {
            System.out.println("\uD83D\uDC15 " + name + " проплыл " + distance + "м.");
        } else if (distance < 0) {
            System.out.println("Нельзя использовать отрицательные числа!");
        }  else {
            System.out.println("\uD83D\uDC15 " + name + " не может проплыть " + distance + " метров!");
        }
    }
    public static int getDogCount() {
        return dogCount;
    }
}
