import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] numbers = input.split(" ");
        double a = Double.parseDouble(numbers[0]);
        double b = Double.parseDouble(numbers[1]);
        System.out.println(Math.pow(a, b));
    }
}