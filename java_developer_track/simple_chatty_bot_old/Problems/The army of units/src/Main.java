import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        if (userInput < 1) {
            System.out.println("no army");
        } else if (userInput <= 19) {
            System.out.println("pack");
        } else if (userInput <= 249) {
            System.out.println("throng");
        } else if (userInput <= 999) {
            System.out.println("zounds");
        } else {
            System.out.println("legion");
        }
    }
}