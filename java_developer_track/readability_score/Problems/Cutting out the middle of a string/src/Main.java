import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // Gather userInput
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();

        // If userInput length is 1 or 2, output a blank line
        if (userInput.length() == 1 || userInput.length() == 2) {
            System.out.println("");
            // If userInput is greater than 2 and of even length remove the middle 2 letters of the word
        } else if (userInput.length() > 2 && userInput.length() % 2 == 0) {
            int mc = userInput.length() / 2 - 1;
            System.out.println(userInput.substring(0, mc) + userInput.substring(mc + 2));
            // If userInput is greater than 2 and of odd length, remove only the middle letter
        } else if (userInput.length() > 2) {
            int mc = userInput.length() / 2;
            System.out.println(userInput.substring(0, mc) + userInput.substring(mc + 1));
        }
    }
}