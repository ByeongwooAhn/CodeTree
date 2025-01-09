import java.util.Scanner;

public class Main {
    public static boolean primeNumber(int prime) {
        for(int i = 2; i < prime; i++) {
            if(prime % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static boolean sum(int num) {
        int placeOfTen = num / 10;
        int placeOfOne = num % 10;

        if((placeOfTen + placeOfOne) % 2 == 0) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int count = 0;

        for(int i = a; i <= b; i++) {
            if(primeNumber(i)) {
                if(sum(i)) {
                    count++;
                }
            }
        }

        System.out.print(count);
    }
}