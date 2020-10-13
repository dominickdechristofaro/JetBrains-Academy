import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] userInput = scanner.nextLine().toCharArray();
        StringBuilder output = new StringBuilder();
        for (char c : userInput) {
            output.append(c);
            output.append(c);
        }
        System.out.println(output);
    }
}