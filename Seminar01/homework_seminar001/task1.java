package Seminar01.homework_seminar001;
import java.util.Scanner;
public class task1 {
    public static void main(String[] args){
        Scanner Scanner = new Scanner(System.in);
        System.out.print("\n\nВведите число : ");
        int a = Scanner.nextInt();
        Scanner.close();
        System.out.println("Треугольное число от " + a + " = " + Triangle(a) + "\n");
    }

    public static int Triangle(int num) {
        if (num == 1) {
            return 1;
        }
        return Triangle(num - 1) + num;
    }
}


