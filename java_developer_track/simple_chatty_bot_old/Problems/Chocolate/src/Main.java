import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int width = scanner.nextInt();
        int segments = scanner.nextInt();
        boolean isCleanBreak = false;

        // Check along length
        for (int i = 1; i <= length; i++) {
            if (i * width == segments) {
                System.out.println("YES");
                isCleanBreak = true;
            }
        }

        // Check along width
        if (!isCleanBreak) {
            for (int i = 1; i <= width; i++) {
                if (i * length == segments) {
                    System.out.println("YES");
                    isCleanBreak = true;
                }
            }
        }

        if (!isCleanBreak) {
            System.out.println("NO");
        }
    }
}