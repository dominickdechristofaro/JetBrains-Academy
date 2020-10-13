import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // Read the lines for user input
        Scanner scanner = new Scanner(System.in);
        String numberString = scanner.nextLine();
        int numOfRotations = scanner.nextInt();

        // Separate the string into an array of string numbers
        String[] numberStringArray = numberString.split(" ");

        // Convert String[] to Integer[]
        int[] numbers = new int[numberStringArray.length];
        for (int i = 0; i < numberStringArray.length; i++) {
            numbers[i] = Integer.parseInt(numberStringArray[i]);
        }

        // Reduce the number of rotations if numOfRotations > numbers.length
        if (numOfRotations > numbers.length) {
            numOfRotations %= numbers.length;
        }

        // Loop for the number of rotations
        for (int i = 0; i < numOfRotations; i++) {
            int lastNumber = numbers[numbers.length - 1];
            // Reverse loop through the numbers array
            for (int j = numbers.length - 2; j >= 0; j--) {
                int temp = numbers[j];
                numbers[j + 1] = temp;
            }
            numbers[0] = lastNumber;
        }

        // Print out the new array
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}