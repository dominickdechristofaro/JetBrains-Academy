import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String substring = scanner.nextLine();
        int numOfOccurrences = 0;
        while (input.contains(substring)) {
            numOfOccurrences++;
            input = input.substring(input.indexOf(substring) + substring.length());
        }
        System.out.println(numOfOccurrences);
    }
}