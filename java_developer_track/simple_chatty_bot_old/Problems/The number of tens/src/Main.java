import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        number %= 100;
        if (number < 10) {
            System.out.println(0);
        } else {
            System.out.println(number / 10);
        }
    }
}