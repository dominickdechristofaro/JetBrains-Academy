import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // Get a user input number
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();

        // Modify the number to have exactly 4 digits
        if (number.length() == 1) {
            // insert 3 digits to the left
            number = "000" + number;
        } else if (number.length() == 2) {
            // insert 2 digits to the left
            number = "00" + number;
        } else if (number.length() == 3) {
            // insert 1 digit to the left
            number = "0" + number;
        }

        // look if its symetrical
        if (number.charAt(0) == number.charAt(3) && number.charAt(1) == number.charAt(2)) {
            System.out.println(1);
        } else {
            System.out.println(2);
        }
    }
}