import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        String firstHalf = userInput.substring(0, userInput.length() / 2);
        //System.out.println(firstHalf);
        String secondHalfReversed = reverseSecondHalf(userInput);
        //System.out.println(secondHalfReversed);
        if (firstHalf.equals(secondHalfReversed)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }

    private static String reverseSecondHalf(String word) {
        int wordSplitIndex = 0;
        if (word.length() % 2 == 0) {
            wordSplitIndex = word.length() / 2;
        } else {
            wordSplitIndex = word.length() / 2 + 1;
        }
        String secondHalf = word.substring(wordSplitIndex);
        char[] characters = secondHalf.toCharArray();
        String reversedWord = "";
        for (int i = characters.length - 1; i >= 0; i--) {
            reversedWord += characters[i];
        }
        return reversedWord;
    }
}