import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dim = scanner.nextInt();
        int[][] arr = new int[dim][dim];

        int squares = (int) Math.ceil(dim / 2.0);

        int j;
        int sideLen = dim;
        int currNum = 1;

        for (int i = 0; i < squares; i++) {
            // do top side
            for (j = 0; j < sideLen; j++) {
                arr[i][i + j] = currNum++;
            }

            // do right side
            for (j = 1; j < sideLen; j++) {
                arr[i + j][dim - 1 - i] = currNum++;
            }

            // do bottom side
            for (j = sideLen - 2; j > -1; j--) {
                arr[dim - 1 - i][i + j] = currNum++;
            }

            // do left side
            for (j = sideLen - 2; j > 0; j--) {
                arr[i + j][i] = currNum++;
            }

            sideLen -= 2;
        }

        for (int k = 0; k < dim; k++) {
            for (int l = 0; l < dim; l++) {
                System.out.print(arr[k][l] + " ");
            }
            System.out.println();
        }
    }
}