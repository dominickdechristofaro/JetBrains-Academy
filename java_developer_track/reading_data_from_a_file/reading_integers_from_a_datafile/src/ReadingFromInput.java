import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingFromInput {
    public static void main(String[] args) {
        int sum = 0;
        File pathToFile = new File("./dataset_91033.txt");
        try (Scanner scanner = new Scanner(pathToFile)) {
            while (scanner.hasNext()) {
                sum += Integer.parseInt(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("No file found " + pathToFile);
        }
        System.out.println(sum);
    }
}
