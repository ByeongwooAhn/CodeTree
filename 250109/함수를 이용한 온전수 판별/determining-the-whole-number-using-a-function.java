import java.util.Scanner;

public class Main {
    public static boolean wholeNumber(int i) {
        if(i % 2 == 0) {
            return false;
        }

        if(i % 10 == 5) {
            return false;
        }

        if(i % 3 == 0 && i % 9 != 0) {
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int count = 0;

        for(int i = a; i <= b; i++) {
            if(wholeNumber(i)) {
                count++;
            }
        }

        System.out.print(count);
    }
}