import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = Double.parseDouble(scanner.nextLine());
        double b = Double.parseDouble(scanner.nextLine());
        double c = Double.parseDouble(scanner.nextLine());
        double discriminant = Math.sqrt(Math.pow(b, 2.0) - (4 * a * c));
        double x1 = (-1.0 * b + discriminant) / (2 * a);
        double x2 = (-1.0 * b - discriminant) / (2 * a);
        if (x1 < x2) {
            System.out.println(x1 + " " + x2);
        } else {
            System.out.println(x2 + " " + x1);
        }
    }
}