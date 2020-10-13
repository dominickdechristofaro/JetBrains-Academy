/* Please, do not rename it */
class Problem {

    public static void main(String[] args) {
        if ("MAX".equals(args[0])) {
            int maxNumber = Integer.parseInt(args[1]);
            for (int i = 1; i < args.length; i++) {
                if (Integer.parseInt(args[i]) > maxNumber) {
                    maxNumber = Integer.parseInt(args[i]);
                }
            }
            System.out.println(maxNumber);
        } else if ("MIN".equals(args[0])) {
            int minNumber = Integer.parseInt(args[1]);
            for (int i = 1; i < args.length; i++) {
                if (Integer.parseInt(args[i]) < minNumber) {
                    minNumber = Integer.parseInt(args[i]);
                }
            }
            System.out.println(minNumber);
        } else if ("SUM".equals(args[0])) {
            int sum = 0;
            for (int i = 1; i < args.length; i++) {
                sum += Integer.parseInt(args[i]);
            }
            System.out.println(sum);
        }
    }
}