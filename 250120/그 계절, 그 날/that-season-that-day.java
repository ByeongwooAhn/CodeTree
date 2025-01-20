import java.util.Scanner;

public class Main {
    public static boolean date(int Y, int M, int D) {
        int [] day = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if(M < 1 || 12 < M) {
            return false;
        }
        else if(Y % 4 == 0 || (Y % 4 == 0 && Y % 100 == 0 && Y % 400 == 0)) {
            day[2] = 29;
            return D <= day[M];
        } else {
            return D <= day[M];
        }
    }

    public static void season(int M) {
        if(3 <= M && M <= 5) {
            System.out.print("Spring");
        }
        else if(6 <= M && M <= 8) {
            System.out.print("Summer");
        }
        else if(9 <= M && M <= 11) {
            System.out.print("Fall");
        } else {
             System.out.print("Winter");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int Y = sc.nextInt();
        int M = sc.nextInt();
        int D = sc.nextInt();

        if(date(Y, M, D)) {
            season(M);
        } else {
            System.out.print("-1");
        }
    }
}