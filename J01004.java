import java.util.Scanner;

public class J01004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            int x = sc.nextInt();
            boolean check = true;
            if (x < 2) {
                check = false;
            } else {
                for (int i = 2; i * i < x; i++) {
                    if (x % i == 0) {
                        check = false;
                        break;
                    }
                }
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
