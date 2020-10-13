import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] userInput = scanner.nextLine().split(" ");
        String word = userInput[0];
        int substringIndex = Integer.parseInt(userInput[1]);
        if (substringIndex >= word.length()) {
            System.out.println(word);
        } else {
            System.out.println(word.substring(substringIndex) + word.substring(0, substringIndex));
        }
    }
}