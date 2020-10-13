import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean areStringsInAlphabeticalOrder = true;
        String words = scanner.nextLine();
        String[] strings = words.split(" ");
        for (int i = 0; i < strings.length - 1; i++) {
            int alphabeticalOrder = strings[i + 1].compareTo(strings[i]);
            if (alphabeticalOrder < 0) {
                areStringsInAlphabeticalOrder = false;
                break;
            }
        }
        System.out.println(areStringsInAlphabeticalOrder);
    }
}