import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfDays = Integer.valueOf(scanner.next());
        int foodCostPerDay = Integer.valueOf(scanner.next());
        int oneWayFlightCost = Integer.valueOf(scanner.next());
        int oneNightInHotelCost = Integer.valueOf(scanner.next());
        // 7 30 100 40
        // 650 = (100 * 2) + (7 * 30) + (6 * 40)
        // 650 = 200 + 210 + 240 = 650

        System.out.println(oneWayFlightCost * 2 + numOfDays * foodCostPerDay + (numOfDays - 1) *
                oneNightInHotelCost);
    }
}