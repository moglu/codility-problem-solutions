package com.moglu.codility.lessons.MaxSlice;

public class MaxProfit {
    public static void main(String[] args) {
        int[] arr1 = {23171, 21011, 21123, 21366, 21013, 21367};
        System.out.println(solution(arr1));
    }

    public static int solution1(int[] A) {
        // write your code in Java SE 8
        int minIndex = 0;
        int maxIndex = 0;
        int maxProfit = 0;
        for (int i = 1; i < A.length; i++) {
            if (A[i] > A[maxIndex]) {
                maxIndex = i;
                if (maxIndex > minIndex) {
                    maxProfit = Math.max(maxProfit, A[maxIndex] - A[minIndex]);
                }
            }

            if (A[i] < A[minIndex]) {
                minIndex = i;
                maxIndex = i;
            }

        }
        return maxProfit;
    }

    public static int solution(int[] A) {
        if (A.length == 1 || A.length == 0) {
            return 0;
        }

        int maxSoFar = 0;
        int maxEndingHere = 0;
        int minPrice = A[0];

        for (int i = 1; i < A.length; i++) {
            maxEndingHere = Math.max(0, A[i] - minPrice);
            minPrice = Math.min(minPrice, A[i]);
            maxSoFar = Math.max(maxEndingHere, maxSoFar);
        }

        return maxSoFar;
    }
}
