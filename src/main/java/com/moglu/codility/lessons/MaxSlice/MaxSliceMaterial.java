package com.moglu.codility.lessons.MaxSlice;

public class MaxSliceMaterial {
    public static void main(String[] args) {
        int[] arr1 = {-10, -6, -3};
        System.out.println(solution1(arr1));
    }

    //the difference from this and example in material is
    //material assumes that a slice can be empty and its sum is equal 0
    public static int solution(int[] A) {
        int sliceSum = A[0];
        int maxSliceSum = A[0];
        for (int i = 1; i < A.length; i++) {

            sliceSum = Math.max(A[i], sliceSum + A[i]);
            maxSliceSum = Math.max(sliceSum, maxSliceSum);

        }
        return maxSliceSum;
    }

    public static int solution1(int[] A) {
        int maxEndingHere = A[0];
        int maxSoFar = A[0];
        for (int i = 1; i < A.length; i++) {
            maxEndingHere = Math.max(A[i], maxEndingHere + A[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }
        return maxSoFar;
    }
}
