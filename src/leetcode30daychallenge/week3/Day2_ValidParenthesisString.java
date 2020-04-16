package leetcode30daychallenge.week3;

import java.util.HashMap;
import java.util.Stack;

public class Day2_ValidParenthesisString {
    public static void main(String[] args) {
        /*
        Given a string containing only three types of characters: '(', ')' and '*', write a function to check whether this string is valid. We define the validity of a string by these rules:

        Any left parenthesis '(' must have a corresponding right parenthesis ')'.
        Any right parenthesis ')' must have a corresponding left parenthesis '('.
        Left parenthesis '(' must go before the corresponding right parenthesis ')'.
        '*' could be treated as a single right parenthesis ')' or a single left parenthesis '(' or an empty string.
        An empty string is also valid.
        Example 1:
        Input: "()"
        Output: True
        Example 2:
        Input: "(*)"
        Output: True
        Example 3:
        Input: "(*))"
        Output: True
        Note:
        The string size will be in the range [1, 100].
        */

        String input1 = "()";
        String input2 = "(*)";
        String input3 = "(*))";

        System.out.println(checkValidString(input1));
        System.out.println(checkValidString(input2));
        System.out.println(checkValidString(input3));
    }

    public static boolean checkValidString(String s) {
        int bal = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '*') bal++;
            else if (bal-- == 0) return false;
        }
        if (bal == 0) return true;
        bal = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ')' || s.charAt(i) == '*') bal++;
            else if (bal-- == 0) return false;
        }
        return true;
    }
}
