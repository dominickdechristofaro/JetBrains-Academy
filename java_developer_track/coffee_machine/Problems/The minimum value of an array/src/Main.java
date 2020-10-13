import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        int minimum = scanner.nextInt();

        for (int i = 1; i < arraySize; i++) {
            int temp = scanner.nextInt();
            if (temp < minimum) {
                minimum = temp;
            }
        }

        System.out.println(minimum);
    }
}