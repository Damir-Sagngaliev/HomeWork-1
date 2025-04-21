import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        System.out.println("Задание 10");
        final int height, weight;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите Ваш рост и вес ");
        height = scan.nextInt();
        weight = scan.nextInt();
        int s = height - 110;
        int k = weight - s;
        String idealHeight = ((s - weight) == 0) ? "Идеальный вес" : "Не идеальный вес";
        System.out.println(idealHeight);
        int neIdeal = s - weight;
        System.out.println("Нужно " + neIdeal + "кг");


    }
}
