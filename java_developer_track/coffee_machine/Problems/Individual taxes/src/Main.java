import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfCompanies = scanner.nextInt();
        int[] yearlyIncomes = new int[numberOfCompanies];
        for (int i = 0; i < numberOfCompanies; i++) {
            yearlyIncomes[i] = scanner.nextInt();
        }
        int[] taxPercentages = new int[numberOfCompanies];
        for (int i = 0; i < numberOfCompanies; i++) {
            taxPercentages[i] = scanner.nextInt();
        }
        int maxTax = yearlyIncomes[0] * taxPercentages[0];
        int index = 1;
        for (int i = 1; i < numberOfCompanies; i++) {
            int tempTax = yearlyIncomes[i] * taxPercentages[i];
            if (tempTax > maxTax) {
                maxTax = tempTax;
                index = i + 1;
            }
        }
        System.out.println(index);
    }
}