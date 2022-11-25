import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Чтобы продолжить нажмите ENTER");
        String ENTER = in.nextLine();
        System.out.println();
        System.out.print("Введите кол-во точек: ");
        int size = in.nextInt();
        System.out.print("Введите радиус окружности: ");
        float R = in.nextInt();
        System.out.println();
        int HowMuch = 0;
        for (int i = 1; i <= size; i++) {
            System.out.print("Введите координату X" + i + ": ");
            float x = in.nextFloat();
            System.out.print("Введите координату Y" + i + ": ");
            float y = in.nextFloat();
            if (x * x + y * y <= R * R) {
                HowMuch++;
            }
        }
        System.out.println();
        System.out.println(HowMuch + " точек попали в окружность");
    }
}