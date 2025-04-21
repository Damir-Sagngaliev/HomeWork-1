import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        System.out.println("Задание 8");
        final float V = 343.1f;
        float t,s;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите " + "временной промежуток " + "между вспышкой " + "молниии " + "громом(секунд):");
        t = scan.nextFloat();
        s = V * t;
        System.out.println("Расстояние до места удара молнии:" + s + " метров");

    }
}
