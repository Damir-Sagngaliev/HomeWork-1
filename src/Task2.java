public class Task2 {
    public static void main(String[] args) {
        System.out.println("Задание №2");
        int n = 123;
        int x = n / 100; // 1
        int y = n % 10; // 3
        int z = n / 10; // 12
        int zs = z % 10; // 2
        int r = x + y + zs; // 6
        System.out.println(" Ответ - " + r);
    }
}
