import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // Collect the user input
        Scanner scanner = new Scanner(System.in);
        int hour1 = scanner.nextInt();
        int minute1 = scanner.nextInt();
        int second1 = scanner.nextInt();
        int hour2 = scanner.nextInt();
        int minute2 = scanner.nextInt();
        int second2 = scanner.nextInt();

        // Calculate the differential
        int hour =  hour2 - hour1;
        int minute = minute2 - minute1;
        int second = second2 - second1;

        // Adjust for negative values
        if (second < 0) {
            second += 60;
            minute -= 1;
        }
        if (minute < 0) {
            minute += 60;
            hour -= 1;
        }

        // Output the time in only seconds
        System.out.println(hour * 3600 + minute * 60 + second);
    }
}