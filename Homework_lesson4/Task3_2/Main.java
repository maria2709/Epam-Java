package Task3_2;

public class Main {
    public static void main(String[] args) {
        int decimal = 10;
        System.out.println(getBinary(decimal));
    }

    public static String getBinary (int decimal) {
        int quotient = 1; //частное
        Integer remainder; //остаток
        String remStr = ""; //остаток преобразованный в строку

        while (quotient >= 1) {
            quotient = decimal / 2;
            remainder = decimal % 2;
            remStr += remainder.toString();
            decimal = quotient;
        }
        String binary = new StringBuffer(remStr).reverse().toString();
        return binary;
    }
}
