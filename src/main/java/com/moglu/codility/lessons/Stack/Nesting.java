package com.moglu.codility.lessons.Stack;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Nesting {
    public static void main(String[] args) {
        System.out.println(solution("(()(())())"));
        System.out.println(solution("())"));
        System.out.println(solution("()((())"));
        System.out.println(solution("(((((())))"));


        char[] chars = new char[1000000];
        Arrays.fill(chars, ')');
        String s = new String(chars);
        System.out.println(solution(s));

    }

    public static int solution(String S) {
        // write your code in Java SE 8
        Deque<Character> opStack = new ArrayDeque<>();
        for (int i = 0; i < S.length() && !(opStack.size() > (S.length() - i)); i++) {
            if (S.charAt(i) == '(') {
                opStack.push(S.charAt(i));
            } else {
                if (opStack.size() == 0) return 0;
                opStack.pop();
            }
        }
        if (opStack.size() != 0) return 0;
        return 1;
    }
}
