import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // Collect the number of students in each group
        Scanner scanner = new Scanner(System.in);
        int group1 = scanner.nextInt();
        int group2 = scanner.nextInt();
        int group3 = scanner.nextInt();

        // Calculate the number of desks for group1
        if (group1 % 2 == 0) {
            group1 = group1 / 2;
        } else {
            group1 = group1 / 2 + 1;
        }

        // Calculate the number of desks for group2
        if (group2 % 2 == 0) {
            group2 = group2 / 2;
        } else {
            group2 = group2 / 2 + 1;
        }

        // Calculate the number of desks for group3
        if (group3 % 2 == 0) {
            group3 = group3 / 2;
        } else {
            group3 = group3 / 2 + 1;
        }

        System.out.println(group1 + group2 + group3);
    }
}