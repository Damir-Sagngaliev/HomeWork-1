public class Task5 {
    public static void main(String[] args) {
        System.out.println("Задание 5");
        final int RADIUS = 5;
        double area = Math.PI * (RADIUS * RADIUS);
        System.out.println("Площадь равна " + Math.round(area));
        double circumference = Math.PI * 2 * RADIUS;
        System.out.println("Длинна окружности равна " + Math.round(circumference));
    }
}
