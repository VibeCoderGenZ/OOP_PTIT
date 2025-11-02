import java.util.Scanner;

public class J01006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            int n = sc.nextInt();
            long[] fibo = new long[n + 1];
            fibo[1] = 1;
            fibo[2] = 1;
            for (int i = 3; i <= n; i++) {
                fibo[i] = fibo[i - 1] + fibo[i - 2];
            }
            System.out.println(fibo[n]);
        }
        sc.close();
    }
}
