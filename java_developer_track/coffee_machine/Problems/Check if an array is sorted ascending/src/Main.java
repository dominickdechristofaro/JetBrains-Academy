import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrayLength = scanner.nextInt();
        int num1 = scanner.nextInt();
        boolean isArrayInAscendingOrder = true;
        for (int i = 1; i < arrayLength; i++) {
            int num2 = scanner.nextInt();
            if (num2 <= num1) {
                isArrayInAscendingOrder = false;
                break;
            }
            num1 = num2;
        }
        System.out.println(isArrayInAscendingOrder);
    }
}