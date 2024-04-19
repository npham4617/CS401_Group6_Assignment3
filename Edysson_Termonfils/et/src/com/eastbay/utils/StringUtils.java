package com.eastbay.utils;

public class StringUtils {

    // Concatenates section for two strings and the result for the return
    public static String concatenate(String str1, String str2) {
        if (str1 == null) str1 = "";
        if (str2 == null) str2 = "";
        return str1 + str2;
    }

    // Reverses of the string 
    public static String reverse(String str) {
        if (str == null) return null;
        return new StringBuilder(str).reverse().toString();
    }

    // Converting the string to Uppercase
    public static String toUpperCase(String str) {
        if (str == null) return null;
        return str.toUpperCase();
    }

    public static String trim(String str) {
        if (str == null) return null;
        return str.trim();
    }
}
