import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        String[] words = userInput.split(" ");
        int maxWordSize = 0;
        int maxWordIndex = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > maxWordSize) {
                maxWordSize = words[i].length();
                maxWordIndex = i;
            }
        }
        System.out.println(words[maxWordIndex]);
    }
}