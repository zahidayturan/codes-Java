package org.example;


public class Main {
    public static void main(String[] args) {
        String input = "2 * 3 / 0";

        input =  input.replaceAll("\\s", "");

        boolean isValid = checkMathExpression(input);
        if (isValid) {
            System.out.println("Verilen ifade matematiksel bir ifadedir.");
        } else {
            System.out.println("Verilen ifade matematiksel bir ifade değildir.");
        }
    }

    public static boolean checkMathExpression(String expression) {
        int parenthesesCount = 0;


        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            if (c == '(') {
                parenthesesCount++;
                if(expression.charAt(i+1) == ')'){
                    return false;
                }
            } else if (c == ')') {
                if (parenthesesCount == 0) {
                    return false;
                }
                parenthesesCount--;
            } else if (c == '/') {
                if (i + 1 < expression.length() && expression.charAt(i + 1) == '0') {
                    return false;
                }
            }

            if(!Character.isDigit(c)){
                System.out.println(c);
                if(i + 1 < expression.length() && expression.charAt(i + 1) != '('){
                    System.out.println("a");
                    if(i + 1 < expression.length() && !Character.isDigit(expression.charAt(i + 1))
                            && c != ')'
                            && c != '('){
                        System.out.println("b");
                        return false;
                    }
                }
                if( i+1 == expression.length() && c != ')' || i == 0 && c != '(' ){
                    System.out.println("c");
                    return false;
                }
            }

        }

        return parenthesesCount == 0;
    }
}
