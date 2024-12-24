import java.util.Scanner;

public class Main {
    public static void func(int N, int M) {
        int big = N > M ? N : M;
        int small = N < M ? N : M;

        while(small != 0) {
            int temp = small;
            small = big % small;
            big = temp;
        }

        int answer = N * M / big;

        System.out.print(answer);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        func(n, m);
    }
}