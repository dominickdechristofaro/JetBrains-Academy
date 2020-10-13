import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        char[] numbers = userInput.toCharArray();
        int firstHalf = (int) numbers[0] + (int) numbers[1] + (int) numbers[2];
        int secondHalf = (int) numbers[3] + (int) numbers[4] + (int) numbers[5];
        if (firstHalf == secondHalf) {
            System.out.println("Lucky");
        } else {
            System.out.println("Regular");
        }
    }
}