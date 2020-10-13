import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // Collect User Input
        Scanner scanner = new Scanner(System.in);
        int arraySize = Integer.parseInt(scanner.nextLine());
        String stringOfNumbers = scanner.nextLine();
        int number = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        // Convert String to String[]
        String[] stringArray = stringOfNumbers.split(" ");

        // If String[i] > number, add to sum
        for (int i = 0; i < arraySize; i++) {
            if (Integer.parseInt(stringArray[i]) > number) {
                sum += Integer.parseInt(stringArray[i]);
            }
        }

        System.out.println(sum);
    }
}