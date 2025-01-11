import java.util.Scanner;

public class Main {
    public static boolean sequence(StringBuilder A, StringBuilder B) {
        for(int i = 0; i < A.length() - B.length(); i++) {
            if(A.substring(i, i + B.length()).equals(B.substring(0))) {
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

        StringBuilder a = new StringBuilder();
        StringBuilder b = new StringBuilder();

        for(int i = 0; i < n1; i++) {
            A[i] = sc.nextInt();
            a.append(A[i]);
        }

        for(int i = 0; i < n2; i++) {
            B[i] = sc.nextInt();
            b.append(B[i]);
        }

        if(sequence(a, b)) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }
}