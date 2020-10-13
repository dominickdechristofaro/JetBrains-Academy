import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        while (true) {
            int userInput = scanner.nextInt();
            count++;
            if (userInput == 0) {
                break;
            }
        }
        System.out.println(count - 1);
    }
}