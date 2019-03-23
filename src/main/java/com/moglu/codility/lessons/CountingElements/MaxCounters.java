package com.moglu.codility.lessons.CountingElements;

import java.util.Arrays;

public class MaxCounters {
    public static void main(String[] args) {
        int[] arr1 = {3, 4, 4, 6, 1, 4, 4};
        int[] arr2 = {1, 1, 4};
        int[] arr4 = {1, 1, 1, 5};
        System.out.println(Arrays.toString(solution(5, arr1)));
        System.out.println(Arrays.toString(solution(3, arr2)));
        System.out.println(Arrays.toString(solution(4, arr4)));
    }

    //https://app.codility.com/demo/results/trainingGWH6DD-8J4/
    //TODO performance fix!!!
    public static int[] solution(int N, int[] A) {
        int[] arr = new int[N];
        int maxCounter = 0;
        int lastMax = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] <= N) {
                //increase(counter i)
                arr[A[i] - 1] += 1;
                if (arr[A[i] - 1] > maxCounter) maxCounter = arr[A[i] - 1];
            }
            if (A[i] == N + 1) {
                lastMax = lastMax + maxCounter;
            }

        }
        for (int j = 0; j < arr.length; j++) {
            arr[j] += lastMax;
        }
        return arr;
    }
}

