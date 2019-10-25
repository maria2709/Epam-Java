package Task3_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String text = sc.nextLine();
        System.out.println(getUniq(text));
    }

    public static String getUniq (String text) {
        int index = 0;
        String res = "";
        while (index < text.length()) {
            if (!res.contains(String.valueOf(text.charAt(index)))){
                res += text.charAt(index);
            }
            index++;
        }
        return res;
    }
}
