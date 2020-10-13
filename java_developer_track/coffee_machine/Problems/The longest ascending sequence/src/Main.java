import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrayLength = scanner.nextInt();
        int num1 = scanner.nextInt();
        int longestStreak = 1;
        int currentStreak = 1;
        for (int i = 1; i < arrayLength; i++) {
            int num2 = scanner.nextInt();
            if (num1 < num2) {
                currentStreak++;
            } else {
                currentStreak = 1;
            }
            if (currentStreak > longestStreak) {
                longestStreak = currentStreak;
            }
            num1 = num2;
        }
        System.out.println(longestStreak);
    }
}