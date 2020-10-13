import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int uppercaseLetterRequirement = scanner.nextInt();
        int lowercaseLetterRequirement = scanner.nextInt();
        int digitRequirement = scanner.nextInt();
        int symbolRequirement = scanner.nextInt();
        StringBuilder password = new StringBuilder();
        for (int i = 0; i < symbolRequirement; i++) {
            if (i < uppercaseLetterRequirement) {
                if (i % 2 == 0) {
                    password.append("A");
                } else {
                    password.append("B");
                }
            } else if (i < uppercaseLetterRequirement + lowercaseLetterRequirement) {
                if (i % 2 == 0) {
                    password.append("a");
                } else {
                    password.append("b");
                }
            } else if (i < uppercaseLetterRequirement + lowercaseLetterRequirement + digitRequirement) {
                if (i % 2 == 0) {
                    password.append("1");
                } else {
                    password.append("2");
                }
            } else {
                if (i % 2 == 0) {
                    password.append("A");
                } else {
                    password.append("B");
                }
            }
        }
        System.out.println(password);
    }
}