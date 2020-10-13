import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CountEvenNumbers {
    public static void main(String[] args) {
        int countOfEvenNumbers = 0;
        File pathToFile = new File("./dataset_91065.txt");
        try (Scanner scanner = new Scanner(pathToFile)) {
            while (scanner.hasNext()) {
                int tempNumber = scanner.nextInt();
                if (tempNumber == 0) {
                    break;
                }
                if (tempNumber % 2 == 0) {
                    countOfEvenNumbers++;
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found: " + pathToFile);
        }
        System.out.println(countOfEvenNumbers);
    }
}
