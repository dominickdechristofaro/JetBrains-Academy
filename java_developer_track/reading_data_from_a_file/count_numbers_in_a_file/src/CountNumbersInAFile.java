import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CountNumbersInAFile {
    public static void main(String[] args) {
        int numbersGreaterOrEqualTo9999 = 0;
        File pathToFile = new File("./dataset_91022.txt");
        try (Scanner scanner = new Scanner(pathToFile)) {
            while (scanner.hasNext()) {
                if (scanner.nextInt() >= 9999) {
                    numbersGreaterOrEqualTo9999++;
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found: " + pathToFile);
        }
        System.out.println(numbersGreaterOrEqualTo9999);
    }
}
