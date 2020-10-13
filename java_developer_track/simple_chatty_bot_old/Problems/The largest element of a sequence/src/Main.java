import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maximum = scanner.nextInt();
        while (true) {
            int userInput = scanner.nextInt();
            if (userInput == 0) {
                break;
            }
            if (userInput > maximum) {
                maximum = userInput;
            }
        }
        System.out.println(maximum);
    }
}