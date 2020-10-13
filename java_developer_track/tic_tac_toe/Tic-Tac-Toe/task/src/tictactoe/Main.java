package tictactoe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Variables
        Scanner scanner = new Scanner(System.in);
        String board = "         ";
        int moveCount = 0;

        // Set the board and print
        String[][] boardArray = setBoard(board);
        printBoard(boardArray);

        // Loop for the game
        while (true) {
            // Collect the user input
            System.out.print("Enter the coordinates: ");
            String coordinates = scanner.nextLine();

            // Verify that user input is integers
            int[] coordinateArray = isInputIntegers(coordinates);

            // If user input is not of integer type, redo the loop
            if (coordinateArray[2] == -1) {
                continue;
            }

            // Make a move if the coordinates input are between 1 and 3
            if (coordinateArray[0] >= 1 && coordinateArray[0] <= 3 && coordinateArray[1] >= 1 && coordinateArray[1] <= 3) {
                // If the space is taken, redo the loop
                if (isSpaceTaken(boardArray, (coordinateArray[0] - 1), (coordinateArray[1] - 1))) {
                    System.out.println("This cell is occupied! Choose another one!");
                    continue;
                    // If input is between 1 and 3 and space isn't taken, make a move
                } else {
                    if (moveCount % 2 == 0) {
                        boardArray[coordinateArray[0] - 1][coordinateArray[1] - 1] = "X";
                    } else {
                        boardArray[coordinateArray[0] - 1][coordinateArray[1] - 1] = "O";
                    }
                    moveCount++;
                }
            } else {
                System.out.println("Coordinates should be from 1 to 3!");
                continue;
            }

            printBoard(boardArray);
            String isGameFinished = checkForWins(boardArray);
            if (!isGameFinished.equals("Game not finished")) {
                System.out.println(isGameFinished);
                break;
            }
        }
    }

    // Determines if the coordinates input are integers.
    ///// coordinateArray[2] = -1 if either is not an integer input.
    ///// coordinateArray[2] = 0 if both inputs are of integer types.
    public static int[] isInputIntegers(String coordinates) {
        int[] coordinateArray = new int[3];
        String[] coordinatesSplit = coordinates.split(" ");
        try {
            coordinateArray[0] = Integer.parseInt(coordinatesSplit[0]);
            coordinateArray[1] = Integer.parseInt(coordinatesSplit[1]);
        } catch (NumberFormatException exception) {
            System.out.println("You should enter numbers!");
            coordinateArray[2] = -1;
        }
        return coordinateArray;
    }

    // Returns true of the space on the board is occupied
    public static boolean isSpaceTaken(String[][] boardArray, int x, int y) {
        return boardArray[x][y].equals("X") || boardArray[x][y].equals("O");
    }

    // Set the board
    public static String[][] setBoard(String board) {
        String[] splitBoard = board.split("");
        String[][] boardArray = new String[3][3];
        int count = 0;
        for (int j = 2; j >= 0; j--) {
            for (int i = 0; i <= 2; i++) {
                boardArray[i][j] = splitBoard[count];
                count++;
            }
        }
        return boardArray;
    }

    // Print the current state of the board
    public static void printBoard(String[][] boardArray) {
        System.out.println("---------");
        System.out.println("| " + boardArray[0][2] + " " + boardArray[1][2] + " " + boardArray[2][2] + " |");
        System.out.println("| " + boardArray[0][1] + " " + boardArray[1][1] + " " + boardArray[2][1] + " |");
        System.out.println("| " + boardArray[0][0] + " " + boardArray[1][0] + " " + boardArray[2][0] + " |");
        System.out.println("---------");
    }

    // Check if the user has won the game
    public static String checkForWins(String[][] boardArray) {
        // Convert boardArray into a string
        StringBuilder input = new StringBuilder();
        for (int j = 2; j >= 0; j--) {
            for (int i = 0; i <= 2; i++) {
                input.append(boardArray[i][j]);
            }
        }

        String[] c = input.toString().split("");
        boolean xWins = false;
        boolean oWins = false;
        int xCount = 0;
        int oCount = 0;

        // Count the moves on the board
        for (String s : c) {
            if (s.equals("X")) {
                xCount++;
            } else if (s.equals("O")) {
                oCount++;
            }
        }

        // Check if the game is valid
        if (Math.abs(xCount - oCount) > 1) {
            return "Impossible";
        }

        // Top Row Win
        if (c[0].equals(c[1]) && c[1].equals(c[2])) {
            if (c[0].equals("X")) {
                xWins = true;
            } else if (c[0].equals("O")){
                oWins = true;
            }
        }

        // Middle Row Win
        if (c[3].equals(c[4]) && c[4].equals(c[5])) {
            if (c[3].equals("X")) {
                xWins = true;
            } else if (c[3].equals("O")){
                oWins = true;
            }
        }

        // Bottom Row Win
        if (c[6].equals(c[7]) && c[7].equals(c[8])) {
            if (c[6].equals("X")) {
                xWins = true;
            } else if (c[6].equals("O")){
                oWins = true;
            }
        }

        // Left Column Win
        if (c[0].equals(c[3]) && c[3].equals(c[6])) {
            if (c[0].equals("X")) {
                xWins = true;
            } else if (c[0].equals("O")){
                oWins = true;
            }
        }

        // Middle Column Win
        if (c[1].equals(c[4]) && c[4].equals(c[7])) {
            if (c[1].equals("X")) {
                xWins = true;
            } else if (c[1].equals("O")){
                oWins = true;
            }
        }

        // Right Column Win
        if (c[2].equals(c[5]) && c[5].equals(c[8])) {
            if (c[2].equals("X")) {
                xWins = true;
            } else if (c[2].equals("O")){
                oWins = true;
            }
        }

        // Diagonal Win (Top Left -> Bottom Right)
        if (c[0].equals(c[4]) && c[4].equals(c[8])) {
            if (c[0].equals("X")) {
                xWins = true;
            } else if (c[0].equals("O")){
                oWins = true;
            }
        }

        // Diagonal Win (Bottom Left -> Top Right)
        if (c[6].equals(c[4]) && c[4].equals(c[2])) {
            if (c[6].equals("X")) {
                xWins = true;
            } else if (c[6].equals("O")){
                oWins = true;
            }
        }

        if (xWins && !oWins) {
            return "X wins";
        } else if (oWins && !xWins) {
            return "O wins";
        } else if (xWins) {
            return "Impossible";
        } else if (input.toString().contains(" ") || input.toString().contains("_")){
            return "Game not finished";
        }

        return "Draw";
    }
}