import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfLoops = scanner.nextInt();
        int count = 1;
        int maximum = 0;
        while (count <= numOfLoops) {
            count++;
            int number = scanner.nextInt();
            if (number % 4 == 0 && number > maximum) {
                maximum = number;
            }
        }
        System.out.println(maximum);
    }
}