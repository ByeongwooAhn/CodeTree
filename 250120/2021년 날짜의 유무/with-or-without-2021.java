import java.util.Scanner;

public class Main {
    //1, 3, 5, 7, 8, 10, 12 = 31
    //2 = 28
    //4, 6, 9, 11 = 30
    public static boolean date(int M, int D) {
        if(M == 2) {
            if(D <= 28) {
                return true;
            } else {
                return false;
            }
        }
        else if(M == 1 || M == 3 || M == 5 || M == 7 || M == 8 || M == 10 || M == 12) {
            if(D <= 31) {
                return true;
            } else {
                return false;
            }
        }
        else if(M == 4 || M == 6 || M == 9 || M == 11) {
            if(D <= 30) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt();
        int D = sc.nextInt();

        if(date(M, D)) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }
}