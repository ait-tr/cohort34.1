package ait.regex;

public class RegExAppl {
    public static void main(String[] args) {
        String str = "Java11";
        String pattern = " *(J|j)ava([1-9]|[1-4]\\d|5[0-5])?";
        boolean check = str.matches(pattern);
        System.out.println(check);
//        System.out.println("\\\\");
        String domain = "abrakadabra.org"; //.com, .org, .de, .il
        pattern = "\\w+-?\\w+\\.(com|org|de|il)";
        check = domain.matches(pattern);
        System.out.println(check);
        /*
            1) @ exists and only one (done)
            2) dot after @ (done)
            3) after last dot 2 and more symbols (done)
            4) alphabetic, digits, '_', '-', '.', '@' (done)
        */
        String email = "pe.ter-1_1@gmail.com";
        pattern = "(\\w|-|\\.)+@[A-Za-z0-9](\\w|-|\\.)*\\.[A-Za-z]{2,6}";
        check = email.matches(pattern);
        System.out.println(check);
        String text = "Java\n , RegEx ,Javascript,Typescript\n,    HTML, CSS   ,   SQL";
        String[] data = text.split("\\s*,\\s*");
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }

    }
}
