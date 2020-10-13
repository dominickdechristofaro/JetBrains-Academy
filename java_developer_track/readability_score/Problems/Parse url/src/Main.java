import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // Obtain user input
        Scanner scanner = new Scanner(System.in);
        String url = scanner.nextLine();

        // Truncate URL so it only contains parameters
        String parameters = urlParameters(url);

        // Is password in parameter list
        boolean isPasswordInParameterList = false;
        String password = "password : ";

        // Iterate through the parameters printing out key value pairs
        String[] parameterArray = parameters.split("&");
        for (String s : parameterArray) {
            // Determine if the parameter has a value
            if (s.indexOf("=") == s.length() - 1) {
                System.out.println(s.substring(0, s.length() - 1) + " : not found");
            } else {
                String[] parameter = s.split("=");
                String key = parameter[0];
                String value = parameter[1];
                if ("pass".equals(key)) {
                    isPasswordInParameterList = true;
                    password += value;
                }
                System.out.println(key + " : " + value);
            }
        }

        // If pass is in the parameter list, print it out again
        if (isPasswordInParameterList) {
            System.out.println(password);
        }
    }

    private static String urlParameters(String url) {
        return url.substring(url.lastIndexOf("?") + 1);
    }
}