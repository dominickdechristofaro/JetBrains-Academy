import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int hundredsPlace = number / 100;
        int tensPlace = (number - (hundredsPlace * 100)) / 10;
        int onesPlace = number - (hundredsPlace * 100) - (tensPlace * 10);
        System.out.println(hundredsPlace + tensPlace + onesPlace);
    }
}