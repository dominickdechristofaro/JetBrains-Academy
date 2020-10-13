class Application {

    public static String name;

    public static void run(String[] args) {
        System.out.println(Application.name);
        for (String arg : args) {
            System.out.println(arg);
        }
    }
}