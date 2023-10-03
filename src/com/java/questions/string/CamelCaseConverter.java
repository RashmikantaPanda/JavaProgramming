package com.java.questions.string;

public class CamelCaseConverter {
    public static void main(String[] args) {
        String input = "hello world Hii hello";
        String camelCase = convertToCamelCase(input);
        System.out.println(camelCase);
    }
    
    public static String convertToCamelCase(String str) {
        StringBuilder camelCase = new StringBuilder();
        boolean capitalizeNext = false;

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);

            if (currentChar == ' ' || currentChar == '_' || currentChar == '-') {
                capitalizeNext = true;
            } else if (capitalizeNext) {
                camelCase.append(Character.toUpperCase(currentChar));
                capitalizeNext = false;
            } else {
                camelCase.append(Character.toLowerCase(currentChar));
            }
        }
        return camelCase.toString();

    }
}
