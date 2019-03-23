package com.moglu.codility.lessons.CountingElements;

import java.util.Arrays;

public class PermCheck {
    public static void main(String[] args) {
        int[] arr1 = {4, 1, 3, 2};
        int[] arr2 = {15, 20};
        int[] arr3 = new int[100000];
        for (int i = 0; i < 99999; i++) {
            arr3[i] = i + 1;
        }
        arr3[99999] = 13;
        int[] arr4 = {2};
        int[] arr5 = {2, 3};
        System.out.println(solution(arr1));
        System.out.println(solution(arr2));
        System.out.println(solution(arr3));
        System.out.println(solution(arr4));
        System.out.println(solution(arr5));
    }

    public static int solution(int[] A) {
        if (A.length == 1) {
            if (A[0] == 1) {
                return 1;
            } else {
                return 0;
            }
        }
        Arrays.sort(A);

        int rangeMax = A.length;

        for (int i = 0; i < A.length - 1; i++) {
            if (!(A[i + 1] != A[i]
                    && A[i] <= rangeMax
                    && A[i + 1] <= rangeMax))
                return 0;
        }
        return 1;
    }
}
