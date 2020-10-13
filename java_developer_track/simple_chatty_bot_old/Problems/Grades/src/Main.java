import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfGrades = scanner.nextInt();
        int countOfDGrades = 0;
        int countOfCGrades = 0;
        int countOfBGrades = 0;
        int countOfAGrades = 0;

        for (int i = 0; i < numOfGrades; i++) {
            int grade = scanner.nextInt();
            if (grade == 2) {
                countOfDGrades++;
            } else if (grade == 3) {
                countOfCGrades++;
            } else if (grade == 4) {
                countOfBGrades++;
            } else {
                countOfAGrades++;
            }
        }

        System.out.println(countOfDGrades + " " + countOfCGrades
            + " " + countOfBGrades + " " + countOfAGrades);
    }
}