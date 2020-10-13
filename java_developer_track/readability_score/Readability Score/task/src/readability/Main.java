package readability;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Global Variables
        int sentences = 0;
        int words = 0;
        int characters = 0;
        int syllables = 0;
        int polysyllables = 0;
        double L = 0.0;
        double S = 0.0;

        // Read the input into a file for parsing
        File file = new File(args[0]);

        // Parsing the file for sentences, words, and characters
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNext()) {
                System.out.println("The text is:");
                String tempLine = scanner.nextLine();
                System.out.println(tempLine);
                tempLine = tempLine.replace(".", ";");
                tempLine = tempLine.replace("!", ";");
                tempLine = tempLine.replace("?", ";");
                String[] stringArray = tempLine.split("(?<=;)");
                for (int k = 0; k < stringArray.length; k++) {
                    stringArray[k] = stringArray[k].trim();
                }
                sentences += stringArray.length;
                for (int i = 0; i < stringArray.length; i++) {
                    String[] tempWordArray = stringArray[i].split(" ");
                    words += tempWordArray.length;
                    for (int l = 0; l < tempWordArray.length; l++) {
                        int syllablesInWord = countSyllables(tempWordArray[l]);
                        if (syllablesInWord > 2) {
                            polysyllables++;
                        }
                        syllables += syllablesInWord;
                    }
                    for (int j = 0; j < tempWordArray.length; j++) {
                        characters += tempWordArray[j].length();
                    }
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found: " + file.toString());
        }

        // Print out the results
        System.out.println(" ");
        System.out.println("Words: " + words);
        System.out.println("Sentences: " + sentences);
        System.out.println("Characters: " + characters);
        System.out.println("Syllables: " + syllables);
        System.out.println("Polysyllables: " + polysyllables);

        // Input the score you would like to calculate
        System.out.print("Enter the score you want to calculate (ARI, FK, SMOG, CL, all): ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(" ");

        // Calculate the Scores of all the Index's
        double ariScore = 4.71 * (characters * 1.0 / words) + 0.5 * (words * 1.0 / sentences) - 21.43;
        double fkScore = 0.39 * (words * 1.0 / sentences) + 11.8 * (syllables * 1.0 / words) - 15.59;
        double smogScore = 1.043 * Math.sqrt(polysyllables * (30 * 1.0 / sentences)) + 3.1291;
        L = characters * 1.0 / words  * 100;
        S = sentences * 1.0 / words * 100;
        double clScore = 0.0588 * L - 0.296 * S - 15.8;

        // Calculate and output the ARI score
        if ("ARI".equals(input)) {
            int ariAge = scoreToAge(ariScore);
            System.out.println("Automated Readability Index: " + scoreToString(ariScore));
        // Calculate and output the FK score
        } else if ("FK".equals(input)) {
            int fkAge = scoreToAge(fkScore);
            System.out.println("Flesch-Kincaid readability: " + scoreToString(fkScore));
        // Calculate and output the SMOG score
        } else if ("SMOG".equals(input)) {
            int smogAge = scoreToAge(smogScore);
            System.out.println("Simple Measure of Gobbledygook: " + scoreToString(smogScore));
        // Calculate and output the CL score
        } else if ("CL".equals(input)) {
            int clAge = scoreToAge(clScore);
            System.out.println("Coleman-Liau index: " + scoreToString(clScore));
        // Calculate and output all the scores
        } else if ("all".equals(input)) {
            // ARI
            int ariAge = scoreToAge(ariScore);
            System.out.println("Automated Readability Index: " + scoreToString(ariScore));

            // FK
            int fkAge = scoreToAge(fkScore);
            System.out.println("Flesch–Kincaid readability tests: " + scoreToString(fkScore));

            // SMOG
            int smogAge = scoreToAge(smogScore);
            System.out.println("Simple Measure of Gobbledygook: " + scoreToString(smogScore));

            // CL
            int clAge = scoreToAge(clScore);
            System.out.println("Coleman–Liau index: " + scoreToString(clScore));

            // Average
            double average = (ariAge + fkAge + smogAge + clAge) / 4.0;
            System.out.println(" ");
            System.out.println("This text should be understood in average by " + average + " year olds.");
        }

    }

    // Convert the Score to Age
    public static int scoreToAge(double score) {
        int scoreRounded = (int) Math.ceil(score);
        switch(scoreRounded) {
            case 1:
                return 6;
            case 2:
                return 7;
            case 3:
                return 9;
            case 4:
                return 10;
            case 5:
                return 11;
            case 6:
                return 12;
            case 7:
                return 13;
            case 8:
                return 14;
            case 9:
                return 15;
            case 10:
                return 16;
            case 11:
                return 17;
            case 12:
                return 18;
            default:
                return 24;
        }
    }

    // Return the String version of the ARI results
    public static String scoreToString(double score) {
        String result = String.format("%.2f", score);
        int scoreRounded = (int) Math.ceil(score);
        switch(scoreRounded) {
            case 1:
                return result + " (about 6 year olds).";
            case 2:
                return result + " (about 7 year olds).";
            case 3:
                return result + " (about 9 year olds).";
            case 4:
                return result + " (about 10 year olds).";
            case 5:
                return result + " (about 11 year olds).";
            case 6:
                return result + " (about 12 year olds).";
            case 7:
                return result + " (about 13 year olds).";
            case 8:
                return result + " (about 14 year olds).";
            case 9:
                return result + " (about 15 year olds).";
            case 10:
                return result + " (about 16 year olds).";
            case 11:
                return result + " (about 17 year olds).";
            case 12:
                return result + " (about 18 year olds).";
            default:
                return result + " (about 24 year olds).";
        }
    }

    // Calculate the syllables
    public static int countSyllables(String word) {
        char[] characters;
        if (word.contains(",") || word.contains(";")) {
            String trimmedWord = word.substring(0, word.length() - 1);
            characters = trimmedWord.toCharArray();
        } else {
            characters = word.toCharArray();
        }
        boolean skip = false;
        int vowelCount = 0;
        for (int i = 0; i < characters.length - 1; i++) {
            if (skip) {
                skip = false;
            } else {
                char test = characters[i];
                if (test == 'a' || test == 'e' || test == 'i' || test == 'o' || test == 'u' || test == 'y') {
                    vowelCount++;
                    skip = true;
                }
            }
        }

        if (!skip) {
            char test = characters[characters.length - 1];
            if (test == 'a' || test == 'i' || test == 'o' || test == 'u' || test == 'y') {
                vowelCount++;
            }
        }

//        if (vowelCount > 2) {
//            System.out.println("Vowel Count: " + vowelCount + ", " + word);
//        }

        if (vowelCount == 0) {
            return 1;
        } else {
            return vowelCount;
        }
    }
}
