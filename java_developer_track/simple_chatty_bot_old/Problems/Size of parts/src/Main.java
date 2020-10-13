import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfParts = scanner.nextInt();
        int countOfLarger = 0;
        int countOfSmaller = 0;
        int countOfPerfect = 0;

        for (int i = 0; i < numOfParts; i++) {
            int part = scanner.nextInt();
            if (part == 1) {
                countOfLarger++;
            } else if (part == -1) {
                countOfSmaller++;
            } else {
                countOfPerfect++;
            }
        }

        System.out.println(countOfPerfect + " " + countOfLarger + " " + countOfSmaller);
    }
}