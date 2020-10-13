import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long userInput = scanner.nextLong();
        int count = 1;
        long factorialSum = 1;
        while (factorialSum <= userInput) {
            count++;
            factorialSum *= count;
        }
        System.out.println(count);
    }
}