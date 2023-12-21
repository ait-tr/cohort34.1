package ait.validator.utils;

public class Validator {
    public static boolean checkCreditCardNumber(String str){
        return str.matches("\\d{8,16}");
    }

    public static boolean checkDateFormatEU(String str){
        // TODO Homework
        return false;
    }

    public static boolean checkDateFormatUS(String str){
        // TODO Homework
        return false;
    }

    public static boolean checkPhoneNumber(String str){
        // TODO Homework
        return false;
    }

    public static boolean checkLessEquals255(String str){
        // TODO Homework
        return false;
    }
}
