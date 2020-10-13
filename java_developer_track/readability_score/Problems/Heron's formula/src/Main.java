import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int intA = scanner.nextInt();
        int intB = scanner.nextInt();
        int intC = scanner.nextInt();
        double a = Double.parseDouble(String.valueOf(intA));
        double b = Double.parseDouble(String.valueOf(intB));
        double c = Double.parseDouble(String.valueOf(intC));
        double p = (a + b + c) / 2;
        System.out.println(Math.sqrt(p * (p - a) * (p - b) * (p - c)));
    }
}