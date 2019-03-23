package com.moglu.codility.lessons.Sorting;

import java.util.Arrays;

public class Distinct {
    public static void main(String[] args) {
        int arr1[] = {2, 1, 1, 2, 3, 1};
        int[] bigArr = new int[100000];
        Arrays.fill(bigArr, 5);
        int arr2[] = {1, 1};
        System.out.println(solution(arr1));
        System.out.println(solution(bigArr));
        System.out.println(solution(arr2));
    }

    public static int solution(int[] A) {
        if (A.length == 0) return 0;
        if (A.length == 1) return 1;

        Arrays.sort(A);

        int distinctCount = 1;
        for (int i = 1; i < A.length; i++) {
            if (A[i] != A[i - 1]) distinctCount++;
        }
        return distinctCount;
    }
}
