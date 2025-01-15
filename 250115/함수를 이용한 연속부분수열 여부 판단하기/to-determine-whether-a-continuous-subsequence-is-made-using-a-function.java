import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static boolean sequence(int [] A, int [] B) {
        if(A.length < B.length) {
            return false;
        }

        for(int i = 0; i <= B.length; i++) {
            if(Arrays.equals(Arrays.copyOfRange(A, i, i + B.length), B)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int [] A = new int[n1];
        int [] B = new int[n2];

        for(int i = 0; i < n1; i++) {
            A[i] = sc.nextInt();
        }

        for(int i = 0; i < n2; i++) {
            B[i] = sc.nextInt();
        }

        if(sequence(A, B)) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }
}