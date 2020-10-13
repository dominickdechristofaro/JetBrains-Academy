import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // Accept user input
        Scanner scanner = new Scanner(System.in);
        int arraySize = Integer.parseInt(scanner.nextLine());
        String stringOfNumbers = scanner.nextLine();
        String numberToFind = scanner.nextLine();
        String[] arrayOfNumbers = stringOfNumbers.split(" ");
        boolean isNumberInArray = false;

        // Look for the number
        for (int i = 0; i < arraySize; i++) {
            if (arrayOfNumbers[i].equals(numberToFind)) {
                isNumberInArray = true;
                break;
            }
        }

        // Output result
        System.out.println(isNumberInArray);
    }
}