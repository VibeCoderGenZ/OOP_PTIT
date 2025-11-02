import java.util.Scanner;

public class J01005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            int N = sc.nextInt();
            int H = sc.nextInt();
            for (int i = 1; i < N; i++) {
                double hi = (double) H * Math.sqrt((double) i / N);
                System.out.printf("%.6f", hi);
                System.out.print(" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
