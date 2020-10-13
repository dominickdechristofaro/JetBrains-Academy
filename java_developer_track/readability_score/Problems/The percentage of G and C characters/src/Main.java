import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] input = scanner.nextLine().toLowerCase().toCharArray();
        int gcContent = 0;
        for (char c : input) {
            if (c == 'g' || c == 'c') {
                gcContent++;
            }
        }
        System.out.println(gcContent * 1.0 / input.length * 100);
    }
}