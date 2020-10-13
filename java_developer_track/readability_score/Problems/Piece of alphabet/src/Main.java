import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        char[] characters = userInput.toCharArray();
        int currentIndex = characters[0];
        boolean sequentialCharacters = true;
        for (int i = 1; i < characters.length; i++) {
            if (characters[i] == currentIndex + 1) {
                currentIndex = characters[i];
            } else {
                sequentialCharacters = false;
                break;
            }
        }
        if (sequentialCharacters) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}