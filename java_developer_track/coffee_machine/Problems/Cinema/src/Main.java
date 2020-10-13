import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // Construct the available seats
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] seats = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                seats[i][j] = scanner.nextInt();
            }
        }

        // Obtain the number of consecutive seats required
        int k = scanner.nextInt();
        int countOfConsecutiveSeats = 0;
        int maxNumberOfConsecutiveSeats = 0;
        int rowWhereKWillFit = 0;
        boolean isThereEnoughConsecutiveSeats = false;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (seats[i][j] == 0) {
                    countOfConsecutiveSeats++;
                } else {
                    countOfConsecutiveSeats = 0;
                }
                if (countOfConsecutiveSeats > maxNumberOfConsecutiveSeats) {
                    maxNumberOfConsecutiveSeats = countOfConsecutiveSeats;
                }
                if (maxNumberOfConsecutiveSeats == k) {
                    isThereEnoughConsecutiveSeats = true;
                    rowWhereKWillFit = i + 1;
                    break;
                }
            }
            if (isThereEnoughConsecutiveSeats) {
                break;
            }
            countOfConsecutiveSeats = 0;
        }

        System.out.println(rowWhereKWillFit);
    }
}