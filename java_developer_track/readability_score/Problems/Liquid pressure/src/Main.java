import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double rho = scanner.nextDouble();
        double h = scanner.nextDouble();
        System.out.println(rho * h * 9.8);
    }
}