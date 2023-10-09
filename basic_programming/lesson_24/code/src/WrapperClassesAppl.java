package ait.wrapper;

public class WrapperClassesAppl {
    public static void main(String[] args) {
        int a = 42;
        Integer b = 20;
        System.out.println(a);
        System.out.println(b);
        b = b - a;
        System.out.println(b);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Long.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Long.MIN_VALUE);
        String strB = b.toString();
        System.out.println(strB);
        System.out.println(strB instanceof String);
//        String strA = a + "";
        String strA = Integer.toString(a);
        System.out.println(strA);
        strA = "125";
        int c = Integer.parseInt(strA);
        System.out.println(c);
        c = c - 10;
        System.out.println(c);
        strB = "3.1415926";
        double pi = Double.parseDouble(strB);
        System.out.println(pi);
        double circleLength = 2 * pi * 10;
        System.out.println(circleLength);
        strB = "TrUe";
        boolean check = Boolean.parseBoolean(strB);
        System.out.println(check);
        double res = 10. / 20;
        if (Double.isInfinite(res) || Double.isNaN(res)) {
            System.out.println("Wrong result");
        } else {
            System.out.println(res);
        }

    }
}
