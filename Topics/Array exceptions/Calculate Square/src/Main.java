
class FixingExceptions {

    public static void calculateSquare(int[] array, int index) {
        // write your code here
        if (index < 0) {
            System.out.println("Exception!");
        } else if (array == null) {
            System.out.println("Exception!");
        } else if (index > array.length) {
            System.out.println("Exception!");
        } else {
            System.out.println(array[index] * array[index]);
        }
    }
}