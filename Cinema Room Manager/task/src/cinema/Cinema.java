package cinema;

import java.util.Scanner;

public class Cinema {

    private static final Scanner scanner = new Scanner(System.in);
    private static int reservedSeats = 0;
    private static int currentIncome = 0;
    private static int totalSeats;
    private static int totalIncome;

    public static void main(String[] args) {

        // Collect user input for cinema layout
        System.out.println("Enter the number of rows:");
        int numRows = scanner.nextInt();
        System.out.println("Enter the number of seats in each row:");
        int numSeatsPerRow = scanner.nextInt();
        System.out.println(" ");

        // Create the cinemaSeating Chart
        char[][] cinemaSeatingChart = createCinemaSeatingChart(numRows, numSeatsPerRow);

        // Set totalSeats, totalIncome
        totalSeats = numRows * numSeatsPerRow;
        totalIncome = calculateTotalIncome(numRows, numSeatsPerRow);

        // print the menu
        printMenu();
        int userInput = scanner.nextInt();

        // loop through the program until the user selects 0
        while (userInput != 0) {
            System.out.println(" ");
            if (userInput == 1) {
                printCinemaSeatingChart(cinemaSeatingChart);
            }

            if (userInput == 2) {
                // Collect user input of seat selection
                System.out.println("Enter a row number:");
                int userSelectedRow = scanner.nextInt();
                System.out.println("Enter a seat number in that row:");
                int userSelectedSeatNumber = scanner.nextInt();
                System.out.println(" ");

                // If the seat is available, reserve it
                while (!validUserInput(userSelectedRow, userSelectedSeatNumber, numRows, numSeatsPerRow, cinemaSeatingChart)) {

                    // Collect user input of seat selection
                    System.out.println("Enter a row number:");
                    userSelectedRow = scanner.nextInt();
                    System.out.println("Enter a seat number in that row:");
                    userSelectedSeatNumber = scanner.nextInt();
                    System.out.println(" ");
                }

                // Calculate ticket price
                int ticketPrice = calculateTicketPriceByUserSelectedRow(numRows, numSeatsPerRow, userSelectedRow);
                currentIncome += ticketPrice;
                System.out.println("Ticket price: $" + ticketPrice);
                System.out.println(" ");

                // Reserve the seat
                reservedSeats++;
                cinemaSeatingChart[userSelectedRow - 1][userSelectedSeatNumber - 1] = 'B';
            }

            if (userInput == 3) {
                printStatistics();
            }
            printMenu();
            userInput = scanner.nextInt();
        }
    }

    private static boolean validUserInput(int userSelectedRow, int userSelectedSeatNumber, int numRows, int numSeatsPerRow, char[][] cinemaSeatingChart) {
        if (userSelectedRow > numRows || userSelectedRow <= 0) {
            System.out.println("Wrong input!");
            System.out.println(" ");
            return false;
        }

        if (userSelectedSeatNumber > numSeatsPerRow || userSelectedSeatNumber <= 0) {
            System.out.println("Wrong input!");
            System.out.println(" ");
            return false;
        }

        if (cinemaSeatingChart[userSelectedRow - 1][userSelectedSeatNumber - 1] == 'B') {
            System.out.println("That ticket has already been purchased!");
            System.out.println(" ");
            return false;
        }

        return true;
    }

    private static void printMenu() {
        System.out.println("1. Show the seats");
        System.out.println("2. Buy a ticket");
        System.out.println("3. Statistics");
        System.out.println("0. Exit");
    }

    private static void printStatistics() {
        float percentageOfTicketsPurchased = (float)reservedSeats / (float)totalSeats * 100;
        System.out.println("Number of purchased tickets: " + reservedSeats);
        System.out.printf("Percentage: %.2f", percentageOfTicketsPurchased);
        System.out.println("%");
        System.out.println("Current income: $" + currentIncome);
        System.out.println("Total income: $" + totalIncome);
        System.out.println(" ");
    }

    private static char[][] createCinemaSeatingChart(int numRows, int numSeatsPerRow) {
        char[][] cinemaSeatingChart = new char[numRows][numSeatsPerRow];
        // Place an S in every element in the 2D array
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numSeatsPerRow; j++) {
                cinemaSeatingChart[i][j] = 'S';
            }
        }
        return cinemaSeatingChart;
    }

    private static void printCinemaSeatingChart(char[][] cinemaSeatingChart) {
        System.out.println("Cinema:");
        System.out.print("  ");
        for (int i = 1; i <= cinemaSeatingChart[0].length; i++) {
            if (i == cinemaSeatingChart[0].length) {
                System.out.print(i);
            } else {
                System.out.print(i + " ");
            }
        }
        System.out.print("\n");
        for (int i = 0; i < cinemaSeatingChart.length; i++) {
            System.out.print(i + 1 + " ");
            for (int j = 0; j < cinemaSeatingChart[0].length; j++) {
                if (j + 1 == cinemaSeatingChart[0].length) {
                    System.out.print(cinemaSeatingChart[i][j]);
                } else {
                    System.out.print(cinemaSeatingChart[i][j]);
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
        System.out.println(" ");
    }

    private static int calculateTicketPriceByUserSelectedRow(int numRows, int numSeatsPerRow, int userSelectedRow) {
        int totalNumSeats = numRows * numSeatsPerRow;
        // Set the ticket price depending on the number of seats in the theatre
        // If numSeats < 60, then $10/ticket
        // else numSeats > 60, then $10 for front half row seats, $8 back half row seats
        if (totalNumSeats <= 60) {
            return 10;
        } else {
            if (userSelectedRow <= numRows / 2) {
                return 10;
            } else {
                return 8;
            }
        }
    }

    private static int calculateTotalIncome(int numRows, int numSeatsPerRow) {
        int totalSeats = numRows * numSeatsPerRow;
        if (totalSeats <= 60) {
            return numRows * numSeatsPerRow * 10;
        } else {
            if (numRows % 2 == 0) {
                return (numRows / 2 * numSeatsPerRow * 10) + (numRows / 2 * numSeatsPerRow * 8);
            } else {
                return (numRows / 2 * numSeatsPerRow * 10) + ((numRows / 2 + 1) * numSeatsPerRow * 8);
            }
        }
    }
}