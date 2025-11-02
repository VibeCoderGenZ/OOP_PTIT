import java.util.Scanner;

public class J01007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            long n = sc.nextLong();
            long[] fibo = new long[93];
            fibo[1] = 1;
            fibo[2] = 1;
            for (int i = 3; i < 93; i++) {
                fibo[i] = fibo[i - 1] + fibo[i - 2];
            }
            boolean check = false;
            for (int i = 0; i < 93; i++) {
                if (n == fibo[i]) {
                    check = true;
                    break;
                }
                if (fibo[i] > n)
                    break;
            }
            if (check) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
