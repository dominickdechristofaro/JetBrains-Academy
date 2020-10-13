import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maximum = scanner.nextInt();
        int count = 1;
        int squared = 1;
        while (squared <= maximum) {
            System.out.println(squared);
            count++;
            squared = count * count;
        }
    }
}