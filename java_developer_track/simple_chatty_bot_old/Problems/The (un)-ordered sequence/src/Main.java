import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isSequenceInAscendingOrder = true;
        boolean isSequenceInDescendingOrder = true;
        int firstNumber = scanner.nextInt();
        while (firstNumber != 0) {
            int secondNumber = scanner.nextInt();
            if (firstNumber > secondNumber && secondNumber != 0) {
                isSequenceInAscendingOrder = false;
            }
            if (secondNumber > firstNumber && secondNumber != 0) {
                isSequenceInDescendingOrder = false;
            }
            firstNumber = secondNumber;
        }
        System.out.println(isSequenceInAscendingOrder || isSequenceInDescendingOrder);
    }
}