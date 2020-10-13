import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfElements = scanner.nextInt();
        int maximum = 0;
        for (int i = 0; i < numOfElements; i++) {
            int number = scanner.nextInt();
            if (number % 4 == 0 && number > maximum) {
                maximum = number;
            }
        }
        System.out.println(maximum);
    }
}