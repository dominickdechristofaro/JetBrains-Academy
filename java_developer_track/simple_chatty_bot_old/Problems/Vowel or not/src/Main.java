import java.util.Scanner;

public class Main {

    public static boolean isVowel(char ch) {
        char up = Character.toUpperCase(ch);
        return up == 'A' || up == 'E' || up == 'I' || up == 'O' || up == 'U';
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char letter = scanner.nextLine().charAt(0);
        System.out.println(isVowel(letter) ? "YES" : "NO");
    }
}