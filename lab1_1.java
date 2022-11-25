import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Программа посчитает возраст на 26.11.2022");
        System.out.print("Чтобы начать нажмите ENTER");
        String ENTER = in.nextLine();
        System.out.println();
        Scanner year = new Scanner(System.in);
        System.out.print("Введите год рождения: ");
        int Byear = 0;
        if (year.hasNextInt()){
            Byear = year.nextInt();
        }
        else {
            while (!year.hasNextInt()) {
                System.out.println("Ошибка!");
                System.out.print("Введите год рождения: ");
                year.next();
            }
            Byear = year.nextInt();
        }
        Scanner month = new Scanner(System.in);
        System.out.print("Введите месяц рождения: ");
        int Bmonth = 0;
        if (month.hasNextInt()) {
            Bmonth = month.nextInt();
        }
        else {
            while (!month.hasNextInt()) {
                System.out.println("Ошибка!");
                System.out.print("Введите месяц рождения: ");
                month.next();
            }
            Bmonth = month.nextInt();
        }
        Scanner day = new Scanner(System.in);
        System.out.print("Введите день рождения: ");
        int Bday = 0;
        if (day.hasNextInt()) {
            Bday = day.nextInt();
        }
        else {
            while (!day.hasNextInt()) {
                System.out.println("Ошибка!");
                System.out.print("Введите день рождения: ");
                day.next();
            }
            Bday = day.nextInt();
        }
        year.close();
        month.close();
        day.close();
        System.out.println();
        System.out.println("Дата рождения: " + Bday + "." + Bmonth + "." + Byear);
        int Resyear = 2022 - Byear;
        int Resmonth = 0;
        int Resday = 0;
        if (25 >= Bday)
            Resday = 26 - Bday;
        else
            Resday = 30 - (Bday - 26);
        if (11 >= Bmonth)
            Resmonth = 11 - Bmonth;
        else
            Resmonth = 12 - (Bmonth - 11);
        if (Resyear < 0 || Bmonth > 12 || Bday > 31 || Bmonth < 0 || Bday < 0 || Byear < 0)
            System.out.println("Упс, где-то ошибка, я не могу сосчитать");
        else
            System.out.println("Вам " + Resyear + " лет " + Resmonth + " месяцев " + Resday + " дней");
    }
}