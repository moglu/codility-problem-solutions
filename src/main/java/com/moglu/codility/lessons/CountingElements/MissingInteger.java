package com.moglu.codility.lessons.CountingElements;

import java.util.Arrays;

public class MissingInteger {

    public static void main(String[] args) {

    }

    public static int solution(int[] A) {
        // write your code in Java SE 8

        Arrays.sort(A);
        int positiveIndex = -1;
        for (int i = 0; i < A.length; i++) {
            if (A[i] > 0) {
                positiveIndex = i;
                if (A[i] > 1) return 1;
                break;
            }
        }

        if (positiveIndex == -1) return 1;

        for (int i = positiveIndex; i < A.length - 1; i++) {
            if (A[i + 1] - A[i] > 1) {
                return A[i] + 1;
            }
        }
        return A[A.length - 1] + 1;
    }
}
