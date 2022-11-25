import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Здесь можно узнать время года по вашему месяцу");
        System.out.print("Чтобы начать нажмите ENTER");
        String ENTER = in.nextLine();
        System.out.println();
        Scanner check = new Scanner(System.in);
        System.out.print("Введите месяц рождения: ");
        int month = 0;
        if (check.hasNextInt()) {
            month = check.nextInt();
            while (month > 12 || month <= 0) {
                System.out.println("Подсказка, месяцев всего 12");
                System.out.print("Введите месяц рождения: ");
                check.hasNextInt();
                if (check.hasNextInt()) {
                    month = check.nextInt();
                }
                else {
                    while (!check.hasNextInt()) {
                        System.out.println("Ошибка!");
                        System.out.print("Введите месяц рождения числом: ");
                        check.next();
                    }
                    month = check.nextInt();
                }
            }
        }
        else {
            while (!check.hasNextInt()) {
                System.out.println("Ошибка!");
                System.out.print("Введите месяц рождения числом: ");
                check.next();
            }
            month = check.nextInt();
            while (month > 12 || month <= 0) {
                System.out.println("Подсказка, месяцев всего 12");
                System.out.print("Введите месяц рождения: ");
                check.hasNextInt();
                if (check.hasNextInt()) {
                    month = check.nextInt();
                }
                else {
                    while (!check.hasNextInt()) {
                        System.out.println("Ошибка!");
                        System.out.print("Введите месяц рождения: ");
                        check.next();
                    }
                    month = check.nextInt();
                }
            }
        }
        System.out.println();
        if (month == 12 || month == 1 || month == 2)
            System.out.println ("Холодное время года? Зима!");
        if (month ==3 || month == 4 || month == 5)
            System.out.println ("Ого, похоже вы родились весной;)");
        if (month ==6 || month == 7 || month == 8)
            System.out.println ("Наверное, вы не приносили сладости в школу, ведь родились летом...");
        if (month == 9|| month == 10 || month == 11)
            System.out.println ("Поздравляю, вы, так же как и я, родились осенью!");
    }
}