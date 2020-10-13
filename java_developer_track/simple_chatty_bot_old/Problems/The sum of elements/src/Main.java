import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while (true) {
            int userInput = scanner.nextInt();
            sum += userInput;
            if (userInput == 0) {
                break;
            }
        }
        System.out.println(sum);
    }
}