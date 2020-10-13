import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class GreatestNumberInAFile {
    public static void main(String[] args) {
        int greatestNumberInFile = 0;
        File pathToFile = new File("./dataset_91007.txt");
        try (Scanner scanner = new Scanner(pathToFile)) {
            greatestNumberInFile = scanner.nextInt();
            while (scanner.hasNext()) {
                int tempNumber = scanner.nextInt();
                if (tempNumber > greatestNumberInFile) {
                    greatestNumberInFile = tempNumber;
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found: " + pathToFile);
        }
        System.out.println(greatestNumberInFile);
    }
}
