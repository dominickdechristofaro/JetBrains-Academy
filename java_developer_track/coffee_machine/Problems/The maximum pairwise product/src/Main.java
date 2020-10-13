import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrayLength = scanner.nextInt();
        int num1 = scanner.nextInt();
        int maxProduct = 0;
        for (int i = 1; i < arrayLength; i++) {
            int num2 = scanner.nextInt();
            int tempProduct = num1 * num2;
            if (tempProduct > maxProduct) {
                maxProduct = tempProduct;
            }
            num1 = num2;
        }
        System.out.println(maxProduct);
    }
}