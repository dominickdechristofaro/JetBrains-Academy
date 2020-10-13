import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        int[] a = new int[arraySize];
        for (int i = 1; i < arraySize; i++) {
            int number = scanner.nextInt();
            a[i] = number;
        }
        a[0] = scanner.nextInt();

        for (int i = 0; i < arraySize; i++) {
            System.out.print(a[i] + " ");
        }
    }
}