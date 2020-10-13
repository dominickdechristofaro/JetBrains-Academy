import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        if (userInput > -15 && userInput <= 12 || userInput > 14 && userInput < 17 || userInput >= 19) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}