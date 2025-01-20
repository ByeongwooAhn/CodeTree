import java.util.Scanner;

class number {
    int num;

    public number(int num) {
        this.num = num;
    }
}

public class Main {
    public static void calc(number a, number b) {
        int temp1 = a.num, temp2 = b.num;

        a.num = temp1 < temp2 ? temp1 * 2 : temp1 + 25;
        b.num = temp1 < temp2 ? temp2 + 25 : temp2 * 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        number num1 = new number(a);
        number num2 = new number(b);

        calc(num1, num2);

        System.out.print(num1.num + " " + num2.num);
    }
}