package com.moglu.codility.lessons.Arrays;

import java.util.Arrays;

public class OddOccurrencesInArray {
    public static void main(String[] args) {
        int[] arr1 = {9, 3, 9, 3, 9, 7, 9};
        int[] arr2 = {9};
        int[] arr3 = {1, 1, 1, 1, 2};
        int[] arr4 = {2, 8, 8, 7, 7};
        int[] arr5 = {2, 3, 3};
        int[] arr6 = {4, 4, 5, 6, 6};
        System.out.println(solution(arr1));
        System.out.println(solution(arr2));
        System.out.println(solution(arr3));
        System.out.println(solution(arr4));
        System.out.println(solution(arr5));
        System.out.println(solution(arr6));
    }

    //https://app.codility.com/demo/results/trainingD284FJ-C96/
    //O(N)
    public static int solution(int[] A) {
        if (A.length == 1) return A[0];
        Arrays.sort(A);
        for (int i = 0; i < A.length - 1; i += 2) {
            if (A[i + 1] != A[i]) return A[i];
        }
        return A[A.length - 1];
    }
}
