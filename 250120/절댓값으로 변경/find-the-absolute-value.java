import java.util.Scanner;

public class Main {
    public static void absolute(int [] num) {
        for(int i = 0; i < num.length; i++) {
            if(num[i] < 0) {
                num[i] *= -1;
            }
            System.out.print(num[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int [] num = new int[N];

        for(int i = 0; i < N; i++) {
            num[i] = sc.nextInt();
        }

        absolute(num);
    }
}