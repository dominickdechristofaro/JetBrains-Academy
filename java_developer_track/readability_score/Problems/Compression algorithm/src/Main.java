import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] userInput = scanner.nextLine().toCharArray();
        StringBuilder algorithm = new StringBuilder();
        char currentChar = userInput[0];
        int count = 1;
        if (userInput.length == 1) {
            System.out.println(userInput[0] + "1");
        } else {
            for (int i = 1; i < userInput.length; i++) {
                if (currentChar == userInput[i]) {
                    count++;
                } else {
                    algorithm.append(currentChar);
                    algorithm.append(count);
                    currentChar = userInput[i];
                    count = 1;
                }
            }
        }
        if (userInput.length > 1) {
            System.out.println(algorithm.append(currentChar).append(count));
        }
    }
}