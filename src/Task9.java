public class Task9 {
    public static void main(String[] args) {
        System.out.println("Задание 9");
        double number = 13.11;
        String answer = ((number - (int) number) == 0) ? "Целое число" : "Дробное число";
        System.out.println(answer); // тернарный оператор
    }
}
