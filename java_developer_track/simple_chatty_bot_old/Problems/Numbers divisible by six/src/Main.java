import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfElements = scanner.nextInt();
        int sumOfElementsDivisibleBy6 = 0;
        for (int i = 0; i < numOfElements; i++) {
            int number = scanner.nextInt();
            if (number % 6 == 0) {
                sumOfElementsDivisibleBy6 += number;
            }
        }
        System.out.println(sumOfElementsDivisibleBy6);
    }
}