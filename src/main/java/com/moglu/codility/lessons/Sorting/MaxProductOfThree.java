package com.moglu.codility.lessons.Sorting;

import java.util.Arrays;

public class MaxProductOfThree {
    public static void main(String[] args) {
        int[] arr1 = {-3, 1, 2, -2, 5, 6};
        int[] arr2 = {-20, -10, -3, 0, -2, 5, 6};
        int[] arr3 = {-20, -10, -6, -3};

        System.out.println(solution(arr1));
        System.out.println(solution(arr2));
        System.out.println(solution(arr3));
    }

    public static int solution(int[] A) {
        // write your code in Java SE 8
        Arrays.sort(A);

        int firstTwo = A[0] * A[1];

        int n = A.length;
        int lastThree = A[n - 1] * A[n - 2] * A[n - 3];
        int negProduct = firstTwo * A[n - 1];
        if (negProduct > lastThree) {
            return negProduct;
        } else {
            return lastThree;
        }

    }
}
