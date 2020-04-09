package Week2;

import java.util.Stack;

public class Day2_BackspaceStringCompare {
    public static void main(String[] args) {
        /*
        Given two strings S and T, return if they are equal when both are typed into empty text editors. # means a backspace character.

        Example 1:

        Input: S = "ab#c", T = "ad#c"
        Output: true
        Explanation: Both S and T become "ac".
        Example 2:

        Input: S = "ab##", T = "c#d#"
        Output: true
        Explanation: Both S and T become "".
        Example 3:

        Input: S = "a##c", T = "#a#c"
        Output: true
        Explanation: Both S and T become "c".
        Example 4:

        Input: S = "a#c", T = "b"
        Output: false
        Explanation: S becomes "c" while T becomes "b".
        Note:

        1 <= S.length <= 200
        1 <= T.length <= 200
        S and T only contain lowercase letters and '#' characters.
        Follow up:

        Can you solve it in O(N) time and O(1) space?
        */

        System.out.println(backspaceCompare("ab#c", "ad#c"));
        System.out.println(backspaceCompare("ab##", "c#d#"));
        System.out.println(backspaceCompare("a##c", "#a#c"));
        System.out.println(backspaceCompare("a#c", "b"));


    }

    public static boolean backspaceCompare(String S, String T) {
        if (S == null || T == null) return false;

        return type(S).equals(type(T));
    }

    private static String type(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '#') {
                if (!stack.isEmpty()) stack.pop();
            } else {
                stack.push(c);
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        return sb.toString();
    }
}
