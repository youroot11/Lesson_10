
import java.util.Random;
public class Cat extends Animal {
    private boolean isHungry;
    private final int needToBeFull;
    private static int catCount = 0;
    public Cat(String name) {
        super(name);
        catCount++;
        isHungry = true;
        needToBeFull = catNeedsToEat();
    }
    private int catNeedsToEat() {
        Random random = new Random();
        return random.nextInt(25) + 5;
    }
    @Override
    public void run(int distance) {
        if (distance <= 200 && distance > 0) {
            System.out.println("\uD83D\uDC08 " + name + " пробежал " + distance + "м.");
        } else if (distance < 0) {
            System.out.println("Нельзя использовать отрицательные числа");
        }  else {
            System.out.println("\uD83D\uDC08 " + name + " не может пробежать " + distance + " метров!");
        }
    }
    @Override
    public void swim(int distance) {
        System.out.println("\uD83D\uDC08 Кот не умеет плавать!");
    }
    public void eat(Bowl bowl) {
        if (!isHungry) {
            System.out.println(name + " не голоден.");
            return;
        }
        if (bowl.getFoodAmount() < needToBeFull) {
            System.out.println("Просто добавь еды! " + name + " необходимо " + needToBeFull + ". " + name + " голодненький.");
            return;
        }
        isHungry = false;
        bowl.setFoodAmount(bowl.getFoodAmount() - needToBeFull);
        System.out.println(name + " доволен.");
    }
    public static int getCatCount() {
        return catCount;
    }
}
