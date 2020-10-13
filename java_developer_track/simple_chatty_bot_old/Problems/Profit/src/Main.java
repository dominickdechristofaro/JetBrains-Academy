import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double m = scanner.nextInt();
        int p = scanner.nextInt();
        int k = scanner.nextInt();
        int count = 0;
        while (m < k) {
            m = m * p / 100.0 + m;
            count++;
        }
        System.out.println(count);
    }
}