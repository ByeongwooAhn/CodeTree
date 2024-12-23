import java.util.Scanner;

public class Main {
    public static void func(int N, int M) {
        int num = N < M ? N : M;
        int answer = 0;

        if(num == 1) {
            System.out.print(num);
        } else {
            for(int i = 1; i < num; i++) {
            if(N % i == 0 && M % i == 0) {
                answer = i;
            }
        }
        }

        System.out.print(answer);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        func(n, m);
    }
}