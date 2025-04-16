import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        System.out.println("Задание 11");
        final long timeL;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите кол-во секунд ");
        long time = scan.nextLong();
        long day = time / 86400;
        long hour = (time % 86400) / 3600;
        long min = ((time % 86400) % 3600) / 60;
        long sec = ((time % 86400) % 3600) % 60) /60;
        System.out.println(day + " - дней, " + hour + " - часов, " + min + " минут, " + sec + "секунд.");
    }
}
