import java.util.Scanner;

class ConcatenateStringsProblem {

    public static String concatenateStringsWithoutDigits(String[] strings) {
        String longStringWithoutDigits = new String();
        for (String string : strings) {
            String temp = string.replaceAll("[\\d]", "");
            longStringWithoutDigits += temp;
        }
        return longStringWithoutDigits;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strings = scanner.nextLine().split("\\s+");
        String result = concatenateStringsWithoutDigits(strings);
        System.out.println(result);
    }
}