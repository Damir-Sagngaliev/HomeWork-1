public class Task12 {
    public static void main(String[] args) {
        System.out.println("Задание 12");
        int n = 25;
        int a = 1;
        float b = 0.2f;
        System.out.println("Первое условие");
        float c = ((n+n) * a);
        float d = (n * b);
        float e = Math.round(d / 0.9);
        System.out.println("Кол-во пирожков = " + c + " Кол-во пакетов молока = " + e);
        System.out.println("Второе условие");
        float c1 = (float) Math.round((n * a) + (n * a) * 0.6);
        float d1 = (float) ((n * b) * 0.6);
        int e1 = (int) Math.ceil(d1 / 0.9);
        System.out.println("Кол-во пирожков = " + c1 + " Кол-во пакетов молока = " + e1);
        System.out.println("Третье условие");
        float c2 = (float) Math.round((n * a) + (n * a) * 0.01);
        float d2 = (float) ((n * b) * 0.01);
        int e2 = (int) Math.ceil(d2 / 0.9);
        System.out.println("Кол-во пирожков = " + c2 + " Кол-во пакетов молока = " + e2);

    }
}
