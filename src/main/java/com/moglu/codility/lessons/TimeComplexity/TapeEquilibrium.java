package com.moglu.codility.lessons.TimeComplexity;

public class TapeEquilibrium {
    public static void main(String[] args) {
        int[] arr1 = {-10, 9};
        /*int [] arr2 = new int[100000];
        Arrays.fill(arr2,0,50000,1000);
        Arrays.fill(arr2,50000,100000,-1000);*/
        System.out.println(solution(arr1));
    }


    public static int solution(int[] A) {
        // write your code in Java SE 8
        long rightSum = 0L;

        for (int i = 1; i < A.length; i++) {
            rightSum += A[i];
        }

        long leftSum = A[0];
        long minEq = Math.abs(rightSum - leftSum);
        for (int P = 1; P < A.length; P++) {
            long diff = Math.abs(leftSum - rightSum);
            if (diff < minEq) minEq = diff;
            leftSum += A[P];
            rightSum -= A[P];
        }
        return (int) minEq;
    }
}
