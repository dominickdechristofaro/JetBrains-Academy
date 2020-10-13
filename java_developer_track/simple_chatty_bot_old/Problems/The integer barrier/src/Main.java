import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while (true) {
            int userInput = scanner.nextInt();
            if (userInput == 0) {
                break;
            }
            if (sum < 1000) {
                sum += userInput;
            } else {
                break;
            }
        }

        if (sum >= 1000) {
            sum -= 1000;
        }

        System.out.println(sum);
    }
}