import java.util.Scanner;

public class J01001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lenght = sc.nextInt();
        int width = sc.nextInt();
        System.out.println((lenght + width) * 2 + " " + lenght * width);
        sc.close();
    }
}
