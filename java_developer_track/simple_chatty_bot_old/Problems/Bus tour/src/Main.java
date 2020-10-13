import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int heightOfBus = scanner.nextInt();
        int numOfBridges = scanner.nextInt();
        int bridgeNumber = 0;
        boolean willBusCrash = false;
        for (int i = 1; i <= numOfBridges; i++) {
            int bridgeHeight = scanner.nextInt();
            if (bridgeHeight <= heightOfBus) {
                willBusCrash = true;
                bridgeNumber = i;
                break;
            }
        }

        if (willBusCrash) {
            System.out.println("Will crash on bridge " + bridgeNumber);
        } else {
            System.out.println("Will not crash");
        }
    }
}