public class Task7 {
    public static void main(String[] args) {
        System.out.println("Задание 7");
        int VKLAD = 100000;
        final int PROCENT = 4;
        int a = (VKLAD / 100) * PROCENT;
        int b = ((VKLAD + a) / 100) * PROCENT;
        int c = VKLAD + b + a;
        System.out.println("Сумма вклада через два года равна " + c);
    }
}
