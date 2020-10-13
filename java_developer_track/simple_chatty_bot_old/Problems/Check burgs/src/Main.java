import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String city = scanner.nextLine();
        if (city.length() >= 4) {
            System.out.println(city.endsWith("burg"));
        } else {
            System.out.println(false);
        }
    }
}