package Task3_1;

public class Main {
    public static void main(String[] args) {
        String text = "An information system is designed to collect, " +
                "process, store and distribute information" +
                "An information system is designed to collect, " +
                "process, store and distribute information";
        getUniq(text);
    }

    public static void getUniq (String text) {
        int index = 0;
        String res = "";
        while (index < text.length()) {
            if (!res.contains(String.valueOf(text.charAt(index)))){
                res += text.charAt(index);
            }
            index++;
        }
        System.out.println(res);
    }
}
