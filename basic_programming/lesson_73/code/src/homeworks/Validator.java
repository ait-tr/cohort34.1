package ait.validator.utils;

public class Validator {
    public static boolean checkCreditCardNumber(String str){
        return str.matches("\\d{8,16}");
    }

    public static boolean checkDateFormatEU(String str){
        return str.matches("((0[1-9])|([12][0-9])|(3[01]))\\.((0[1-9])|(1[0-2]))\\.\\d{4}");
    }

    public static boolean checkDateFormatUS(String str){
        return str.matches("\\d{4}-((0[1-9])|(1[0-2]))-((0[1-9])|([12][0-9])|(3[01]))");
    }

    public static boolean checkPhoneNumber(String str){
        return str.matches("\\+\\d{2}\\(\\d{2}\\)\\d{4}-\\d{4}");
    }

    public static boolean checkLessEquals255(String str){
        return str.matches("(1?\\d?\\d)|(2[0-4]\\d)|(25[0-5])");
    }
}
