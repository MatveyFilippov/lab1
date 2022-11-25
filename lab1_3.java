import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Возведу целое число  x  в целую степень  n");
        System.out.print("Чтобы начать нажмите ENTER");
        String ENTER = in.nextLine();
        System.out.println();
        System.out.print("Введите х: ");
        int x = in.nextInt();
        int n;
        do {
            System.out.print("Введите n в диапазоне (-15;15): ");
            n = in.nextInt();
        } while (n < -15 | n > 15);
        System.out.println();
        if (n<0) {
            double res = 1;
            for (int i = 0; i < Math.abs(n); i++) {
                res = res * x;
            }
            res = 1/res;
            System.out.println(x + " в степени " + n + " = " + res);
        }
        else {
            long res = 1;
            for (int i = 0; i < n; i++) {
                res = res * x;
            }
            System.out.println(x + " в степени " + n + " = " + res);
        }
    }
}