import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfElements = scanner.nextInt();
        int element = 1;
        int currentIteration = 1;
        int count = 0;
        while (count < numOfElements) {
            if (currentIteration > element) {
                currentIteration = 1;
                element++;
            }
            System.out.println(element);
            currentIteration++;
            count++;
        }
    }
}