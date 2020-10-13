class Converter {

    /**
     * It returns a double value or 0 if an exception occurred
     */
    public static double convertStringToDouble(String input) {
        try {
            if (input == null) {
                return 0;
            } else {
                return Double.parseDouble(input);
            }
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}