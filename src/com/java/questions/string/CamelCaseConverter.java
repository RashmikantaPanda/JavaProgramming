package com.java.questions.string;

public class CamelCaseConverter {
    public static void main(String[] args) {
        String input = "hello world Hii helloIam rashmikanta Panda";
        String camelCase = convertToCamelCase(input);
        System.out.println(camelCase);
    }
    
    public static String convertToCamelCase(String str) {
        StringBuilder camelCaseString = new StringBuilder();
        boolean capitalizeNext = false;

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);

            if (currentChar == ' ' || currentChar == '_' || currentChar == '-') {
                capitalizeNext = true;
            } else if (capitalizeNext) {
                camelCaseString.append(Character.toUpperCase(currentChar));
                capitalizeNext = false;
            } else {
                camelCaseString.append(Character.toLowerCase(currentChar));
            }
        }
        return camelCaseString.toString();

    }
}
