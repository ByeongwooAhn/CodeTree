import java.util.Scanner;

public class Main {
            public static void add(int a, int c) {
            System.out.printf("%d + %d = %d", a, c, a + c);
        }

        public static void sub(int a, int c) {
           System.out.printf("%d - %d = %d", a, c, a - c);
        }

        public static void mul(int a, int c) {
            System.out.printf("%d * %d = %d", a, c, a * c);
        }

        public static void div(int a, int c) {
            System.out.printf("%d / %d = %d", a, c, a / c);
        }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        String op = sc.next();
        int c = sc.nextInt();

        char o = op.charAt(0);

        if(o == '+') {
            add(a, c);
        }
        else if(o == '-') {
            sub(a, c);
        }
        else if(o == '*') {
            mul(a, c);
        }
        else if(o == '/') {
            div(a, c);
        } else {
            System.out.print("False");
        }
    }
}