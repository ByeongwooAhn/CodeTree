import java.util.Scanner;

public class Main {
    public static void square(int a, int b) {
        int answer = 1;
        for(int i = 0; i < b; i++) {
            answer *= a;
        }
        System.out.print(answer);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        
        square(a, b);
    }
}