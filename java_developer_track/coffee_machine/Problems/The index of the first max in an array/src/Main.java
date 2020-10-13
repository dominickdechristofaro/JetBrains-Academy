import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        int maximum = scanner.nextInt();
        int index = 0;

        for (int i = 1; i < arraySize; i++) {
            int temp = scanner.nextInt();
            if (temp > maximum) {
                maximum = temp;
                index = i;
            }
        }

        System.out.println(index);
    }
}