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
        int triplesCount = 0;

        // Count the number of triples
        for (int i = 0; i < arraySize - 2; i++) {
            if (numbers[i] == numbers[i + 1] - 1 && numbers[i + 1] == numbers[i + 2] - 1) {
                triplesCount++;
            }
        }

        System.out.println(triplesCount);
    }
}