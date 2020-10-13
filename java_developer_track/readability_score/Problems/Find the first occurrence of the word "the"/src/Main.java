import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        String lowerCaseString = userInput.toLowerCase();
        if (lowerCaseString.contains("the")) {
            System.out.println(lowerCaseString.indexOf("the"));
        } else {
            System.out.println(-1);
        }
    }
}