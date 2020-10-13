import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrayLength = scanner.nextInt();
        int[] numbers = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            numbers[i] = scanner.nextInt();
        }
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        boolean doNumbersAppearNextToOneAnother = false;
        for (int i = 0; i < arrayLength - 1; i++) {
            if (numbers[i] == n && numbers[i + 1] == m) {
                doNumbersAppearNextToOneAnother = true;
                break;
            } else if (numbers[i] == m && numbers[i + 1] == n) {
                doNumbersAppearNextToOneAnother = true;
                break;
            }
        }
        System.out.println(!doNumbersAppearNextToOneAnother);
    }
}