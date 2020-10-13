import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int height = scanner.nextInt();
        int dayHeight = scanner.nextInt();
        int nightHeight = scanner.nextInt();
        int heightDifferential = dayHeight - nightHeight;
        int startHeight = height - dayHeight;
        int numberOfDays = startHeight / heightDifferential;
        if (startHeight % heightDifferential > 0) {
            numberOfDays++;
        }
        System.out.println(numberOfDays + 1);
    }
}