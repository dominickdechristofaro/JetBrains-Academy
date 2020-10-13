import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfReeses = scanner.nextInt();
        boolean isWeekend = scanner.nextBoolean();
        if (isWeekend) {
            System.out.println(numOfReeses >= 15 && numOfReeses <= 25);
        } else {
            System.out.println(numOfReeses >= 10 && numOfReeses <= 20);
        }
    }
}