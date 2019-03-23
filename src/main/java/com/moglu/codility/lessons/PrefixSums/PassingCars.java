package com.moglu.codility.lessons.PrefixSums;

import java.util.Arrays;

public class PassingCars {
    public static void main(String[] args) {
        int[] arr1 = {0, 1, 0, 1, 1};
        int[] arr2 = new int[100000];
        Arrays.fill(arr2, 0, 15000, 0);
        Arrays.fill(arr2, 15000, 100000, 1);

        System.out.println(solution(arr1));
        System.out.println(solution(arr2));
    }

    //https://app.codility.com/demo/results/trainingGA93XJ-G5G/
    //Time complexity O(N)
    public static int solution(int[] A) {
        int zeros = 0;
        long pairs = 0L;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == 0) {
                zeros++;
            } else {
                pairs += zeros;
            }
            if (pairs > 1000000000) return -1;
        }
        return (int) pairs;
    }
}
