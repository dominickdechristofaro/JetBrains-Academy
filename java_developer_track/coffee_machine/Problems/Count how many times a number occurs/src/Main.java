import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arraySize = Integer.parseInt(scanner.nextLine());
        String stringOfNumbers = scanner.nextLine();
        String number = scanner.nextLine();
        int counter = 0;
        String[] arrayOfNumbers = stringOfNumbers.split(" ");

        for (int i = 0; i < arraySize; i++) {
            if (arrayOfNumbers[i].equals(number)) {
                counter++;
            }
        }

        System.out.println(counter);
    }
}