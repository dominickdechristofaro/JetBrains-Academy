import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingFromAFile {
    public static void main(String[] args) {
        double maximumDelta = 0;
        double currentDelta = 0;
        int maxDeltaYear = 0;
        double previousPopulation = 0;
        double currentPopulation = 0;
        File pathToFile = new File("./dataset_91069.txt");
        try (Scanner scanner = new Scanner(pathToFile)) {
            // Capture the first data point
            scanner.nextLine();
            String[] startingData = scanner.nextLine().split("\\s+");
            maxDeltaYear = Integer.parseInt(startingData[0]);
            currentPopulation = Long.parseLong(startingData[1].replace(",", ""));
            System.out.println("Max Delta Year || Current Population || Delta");
            System.out.println(maxDeltaYear + "           || " + currentPopulation + "      || " + currentDelta);
            while(scanner.hasNext()) {
                String[] data = scanner.nextLine().split("\\s+");
                previousPopulation = currentPopulation;
                currentPopulation = Double.parseDouble(data[1].replace(",", ""));
                currentDelta = currentPopulation - previousPopulation;
                if (currentDelta > maximumDelta) {
                    maximumDelta = currentDelta;
                    maxDeltaYear = Integer.parseInt(data[0]);
                }
                System.out.println("Max Delta Year || Current Population || Delta");
                System.out.println(maxDeltaYear + "           || " + currentPopulation + "      || " + currentDelta);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + pathToFile);
        }
        System.out.println(maxDeltaYear);
    }
}
