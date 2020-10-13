import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // Collect user input
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        int[] numbers = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            numbers[i] = scanner.nextInt();
        }
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        boolean areNum1AndNum2InTheArraySequentially = false;
        for (int i = 0; i < arraySize - 1; i++) {
            if (numbers[i] == num1 && numbers[i + 1] == num2) {
                areNum1AndNum2InTheArraySequentially = true;
                break;
            } else if (numbers[i] == num2 && numbers[i + 1] == num1) {
                areNum1AndNum2InTheArraySequentially = true;
                break;
            }
        }
        System.out.println(areNum1AndNum2InTheArraySequentially);
    }
}