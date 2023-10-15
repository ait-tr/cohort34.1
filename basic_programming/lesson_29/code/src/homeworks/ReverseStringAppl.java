package ait.string;

public class ReverseStringAppl {
    public static void main(String[] args) {
        String str = "mama mila ramu";
        String reverseStr = reverseString(str);
        System.out.println(reverseStr);
    }

    public static String reverseString(String string) {
        return new StringBuilder(string).reverse().toString();
    }
}
