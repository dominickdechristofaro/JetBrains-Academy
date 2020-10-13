import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int sumOfNumbersDivisibleBy3BetweenAAndB = 0;
        int count = 0;
        for (int i = a; i <= b; i++) {
            if (i % 3 == 0) {
                sumOfNumbersDivisibleBy3BetweenAAndB += i;
                count++;
            }
        }
        System.out.println(1.0 * sumOfNumbersDivisibleBy3BetweenAAndB / count);
    }
}