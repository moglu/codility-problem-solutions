package com.moglu.codility.lessons.Stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class Fish {
    public static void main(String[] args) {
        int A[] = {4, 3, 2, 1, 5};
        int B[] = {0, 1, 0, 0, 0};

        int A1[] = {8, 7, 12, 14, 25, 16};
        int B1[] = {0, 0, 1, 0, 1, 0};

        int A2[] = {25, 12};
        int B2[] = {0, 0};
        System.out.println(solution(A2, B2));
    }

    public static int solution(int[] A, int[] B) {
        // write your code in Java SE 8
        Deque<Integer> ones = new ArrayDeque<Integer>();

        int aliveCount = 0;
        for (int i = 0; i < A.length; i++) {
            if (B[i] == 1) {
                ones.push(A[i]);
            } else {
                while (ones.size() != 0) {
                    if (ones.peek() > A[i]) break;
                    ones.pop();
                }
                if (ones.size() == 0) aliveCount += 1;
            }
        }
        aliveCount += ones.size();
        return aliveCount;
    }
}
