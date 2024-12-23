import java.util.Scanner;

public class Main {
    public static void rectangle(int n) {
        int num = 1;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                System.out.printf("%d ", num);
                num = num == 9 ? 1 : num + 1;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        rectangle(N);
    }
}