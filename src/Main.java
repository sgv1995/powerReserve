import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите расход топлива в литрах на 100 км: ");
        double consumption = in.nextDouble();
        System.out.println("Введите остаток топлива в литрах: ");
        double fuel = in.nextDouble();
        double powerReserve = fuel / consumption * 100;
        System.out.println("Запас хода (км) = ");
        System.out.println(Math.round(powerReserve));

    }

}