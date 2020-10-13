import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput = "";

        while (true) {
            try {
                userInput = scanner.nextLine();
                int userInputInteger = Integer.parseInt(userInput);
                if (userInputInteger == 0) {
                    break;
                } else {
                    System.out.println(userInputInteger * 10);
                }
            } catch (Exception e) {
                System.out.println("Invalid user input: " + userInput);
            }
        }
    }
}