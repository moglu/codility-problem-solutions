package com.moglu.codility.lessons.TimeComplexity;

public class PermMissingElement {
    public static void main(String[] args) {
        int[] arr1 = {2};
        int[] arr2 = new int[100000];

        System.out.println(solution(arr1));
    }

    //https://app.codility.com/demo/results/trainingN6UHJ3-MZR/
    //long is used for not to overflow
    // Time complexity: O(N)
    public static int solution(int[] A) {
        long range = A.length + 1;
        long rangeSum = (range * (range + 1)) / 2;

        long totalSum = 0L;
        for (int i = 0; i < A.length; i++) {
            totalSum = totalSum + A[i];
        }
        return (int) (rangeSum - totalSum);
    }

}
