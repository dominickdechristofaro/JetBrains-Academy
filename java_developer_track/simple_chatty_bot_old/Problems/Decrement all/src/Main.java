import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.print(scanner.nextInt() - 1);
            System.out.print(" ");
        }
        System.out.print(scanner.nextInt() - 1);
    }
}