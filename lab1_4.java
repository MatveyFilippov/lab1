import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Найду кол-во точек, попавших в окружность");
        System.out.print("Чтобы продолжить нажмите ENTER");
        String ENTER = in.nextLine();
        System.out.println();
        int size;
        float R;
        do{
            System.out.print("Введите кол-во точек: ");
            size = in.nextInt();
        } while (size < 0);
        do{
            System.out.print("Введите положительный радиус окружности: ");
            R = in.nextFloat();
        } while (R < 0);
        System.out.println();
        int HowMuch = 0;
        for (int i = 1; i <= size; i++) {
            System.out.println();
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