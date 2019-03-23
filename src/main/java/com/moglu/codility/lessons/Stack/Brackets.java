package com.moglu.codility.lessons.Stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class Brackets {
    public static void main(String[] args) {
        System.out.println(solution(")("));
        System.out.println(solution("(((()"));
    }

    public static int solution(String S) {
        if (S.length() == 1) return 0;
        Deque<Character> stack = new ArrayDeque<>();
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '(' || S.charAt(i) == '{' || S.charAt(i) == '[') {
                stack.push(S.charAt(i));
            } else {
                if (stack.size() == 0) return 0;
                char last = stack.pop();
                if (!isValidPair(last, S.charAt(i))) return 0;
            }
        }
        if (stack.size() != 0) return 0;
        return 1;
    }

    public static boolean isValidPair(char left, char right) {
        if (left == '(' && right == ')') return true;
        if (left == '{' && right == '}') return true;
        if (left == '[' && right == ']') return true;
        return false;
    }
}
