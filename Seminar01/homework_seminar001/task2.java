package Seminar01.homework_seminar001;
public class task2 {
    public static boolean isPrime(int n) {
        if (n != 2 && n % 2 == 0) {
            return false;
        }
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        for (int i = 2; i <= 1000; ++i) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }    
}

