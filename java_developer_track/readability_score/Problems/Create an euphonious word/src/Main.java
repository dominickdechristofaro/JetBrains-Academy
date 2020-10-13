import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] characterArray = scanner.nextLine().toCharArray();
        int count = 0;

        for (int i = 0; i < characterArray.length - 2; i++) {
            char fc = characterArray[i];
            char sc = characterArray[i+1];
            char tc = characterArray[i+2];
            if (fc == 'a' || fc == 'e' || fc == 'i' || fc == 'o' || fc == 'u' || fc == 'y') {
                if (sc == 'a' || sc == 'e' || sc == 'i' || sc == 'o' || sc == 'u' || sc == 'y') {
                    if (tc == 'a' || tc == 'e' || tc == 'i' || tc == 'o' || tc == 'u' || tc == 'y') {
                        i += 1;
                        count += 1;
                        continue;
                    }
                }
            }
            if (fc == 'a' || sc == 'a' || tc == 'a') {
                continue;
            }
            if (fc == 'e' || sc == 'e' || tc == 'e') {
                continue;
            }
            if (fc == 'i' || sc == 'i' || tc == 'i') {
                continue;
            }
            if (fc == 'o' || sc == 'o' || tc == 'o') {
                continue;
            }
            if (fc == 'u' || sc == 'u' || tc == 'u') {
                continue;
            }
            if (fc == 'y' || sc == 'y' || tc == 'y') {
                continue;
            }
            i += 1;
            count += 1;
        }
        System.out.println(count);
    }


}