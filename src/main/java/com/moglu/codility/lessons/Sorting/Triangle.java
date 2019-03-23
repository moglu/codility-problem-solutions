package com.moglu.codility.lessons.Sorting;

import java.util.Arrays;

public class Triangle {
    public static void main(String[] args) {
        int[] arr1 = {10, 2, 5, 1, 8, 20};
        int[] arr2 = {10, 50, 5, 1};
        int[] arr3 = {-Integer.MAX_VALUE, Integer.MAX_VALUE - 4, Integer.MAX_VALUE - 20, Integer.MAX_VALUE - 15};

        System.out.println(solution(arr1));
        System.out.println(solution(arr2));
        System.out.println(solution(arr3));
        //Why didn't fail??
    }

    public static int solution(int[] A) {
        // write your code in Java SE 8
        Arrays.sort(A);
        int a, b, c;
        for (int i = 0; i < A.length - 2; i++) {
            a = A[i];
            b = A[i + 1];
            c = A[i + 2];

            if ((c - b < a) && (b - c < a) && (a - c < b)) return 1;
        }
        return 0;
    }
}
