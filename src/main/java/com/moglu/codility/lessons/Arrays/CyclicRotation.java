package com.moglu.codility.lessons.Arrays;

import java.util.Arrays;

public class CyclicRotation {
    public static void main(String[] args) {
        int arr1[] = {3, 8, 9, 7, 6};
        int arr2[] = {3, 8, 9, 7, 6};
        int arr3[] = {0, 0, 0};
        int arr4[] = {1, 2, 3, 4};
        int arr5[] = {4, 4, 5, 6, 2, 3};
        int arr6[] = {};
        System.out.println(Arrays.toString(solution(arr1, 1)));
        System.out.println(Arrays.toString(solution(arr2, 3)));
        System.out.println(Arrays.toString(solution(arr3, 3)));
        System.out.println(Arrays.toString(solution(arr4, 4)));
        System.out.println(Arrays.toString(solution(arr5, 4)));
        System.out.println(Arrays.toString(solution(arr6, 4)));
    }

    //https://app.codility.com/demo/results/trainingRBB5FU-G8R/
    //in first try, i missed the empty array case
    public static int[] solution(int[] A, int K) {
        if (A.length == K || A.length == 0) return A;

        for (int i = 0; i < K; i++) {
            int temp1 = A[0];
            for (int j = 0; j < A.length - 1; j++) {
                int temp2 = A[j + 1];
                A[j + 1] = temp1;
                temp1 = temp2;
            }
            A[0] = temp1;
        }
        return A;
    }
}
