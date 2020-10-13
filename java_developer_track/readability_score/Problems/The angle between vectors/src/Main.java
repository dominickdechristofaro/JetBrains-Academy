import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // Convert input to doubles
        Scanner scanner = new Scanner(System.in);
        String[] vectorU = scanner.nextLine().split(" ");
        String[] vectorV = scanner.nextLine().split(" ");
        double u1 = Double.parseDouble(vectorU[0]);
        double u2 = Double.parseDouble(vectorU[1]);
        double v1 = Double.parseDouble(vectorV[0]);
        double v2 = Double.parseDouble(vectorV[1]);

        // Calculate uDotV
        double uDotV = u1 * v1 + u2 * v2;

        // Calculate the Lengths of the vectors
        double uLength = Math.sqrt(Math.pow(u1, 2.0) + Math.pow(u2, 2.0));
        double vLength = Math.sqrt(Math.pow(v1, 2.0) + Math.pow(v2, 2.0));

        // Calculate the bottom of the fraction
        double uxv = uLength * vLength;

        // Calculate the fraction
        double cos = uDotV / uxv;

        // Calculate the angle
        double angle = Math.acos(cos) * (180 / Math.PI);
        System.out.println(angle);
    }
}