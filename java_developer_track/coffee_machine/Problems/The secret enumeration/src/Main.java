public class Main {

    public static void main(String[] args) {
        Secret[] values = Secret.values();
        String[] names = new String[values.length];
        int count = 0;
        for (int i = 0; i < values.length; i++) {
            names[i] = values[i].toString();
        }
        for (String name : names) {
            String word = name.substring(0, 4);
            if ("STAR".equals(word)) {
                count++;
            }
        }
        System.out.println(count);
    }
}


//enum Secret {
//    STAR, CRASH, START, // ...
//}
