package Seminar01.homework_seminar001;

import java.util.Scanner;

public class task3 {
    public static void Calculator() {

        double num1;
        double num2;
        double ans;
        char op;
        try (Scanner reader = new Scanner(System.in)) {
            System.out.print("Введите два числа: ");
            num1 = reader.nextDouble();
            num2 = reader.nextDouble();
            System.out.print("\nВведите операторr (+, -, *, /): ");
            op = reader.next().charAt(0);
        }
        switch (op) {
            case '+':
                ans = num1 + num2;
                break;
            case '-':
                ans = num1 - num2;
                break;
            case '*':
                ans = num1 * num2;
                break;
            case '/':
                ans = num1 / num2;
                break;
            default:
                System.out.printf("Ошибка! Не верный оператор");
                return;
        }
        System.out.print("\nРезультат выражения:\n");
        System.out.printf(num1 + " " + op + " " + num2 + " = " + ans);
    }

    public static void main(String[] args) {
        Factorial();
        SimpleNumbers();
        Calculator();

    }

    private static void Factorial() {
    }

    private static void SimpleNumbers() {
    }
}
