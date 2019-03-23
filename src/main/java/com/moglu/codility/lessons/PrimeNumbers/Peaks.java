package com.moglu.codility.lessons.PrimeNumbers;

import java.util.ArrayList;

public class Peaks {
    public static void main(String[] args) {
        int[] arr1 = {3, 6, 4, 21, 29, 12, 13, 15};
        System.out.println(solution1(arr1));
    }

    //I used prefix sum for storing peaks
    //for each block i look for diff between
    // the current group's last element peak count and preceding group's peak count
    public static int solution(int[] A) {
        // write your code in Java SE 8
        if (A.length == 1) return 0;

        int[] prefixSum = new int[A.length];

        for (int i = 1; i < prefixSum.length - 1; i++) {
            if (A[i] > A[i + 1] && (A[i] > A[i - 1])) {
                prefixSum[i] = prefixSum[i - 1] + 1;
            } else {
                prefixSum[i] = prefixSum[i - 1];
            }
        }
        prefixSum[prefixSum.length - 1] = prefixSum[prefixSum.length - 2];

        int blockCount = 0;
        for (int blockSize = 2; blockSize <= A.length; blockSize++) {
            if (A.length % blockSize != 0) continue;

            int j = blockSize - 1;
            if (prefixSum[j] - prefixSum[0] == 0) continue;
            blockCount++;
            j += blockSize;
            while (j < A.length) {
                if (prefixSum[j] - prefixSum[j - blockSize] == 0) break;
                blockCount++;
                j += blockSize;
            }
            if ((blockCount == A.length / blockSize)) return blockCount;
            blockCount = 0;
        }
        return 0;
    }

    public static int solution1(int[] A) {
        int N = A.length;

        // Find all the peaks
        ArrayList<Integer> peaks = new ArrayList<Integer>();
        for (int i = 1; i < N - 1; i++) {
            if (A[i] > A[i - 1] && A[i] > A[i + 1]) peaks.add(i);
        }

        for (int size = 1; size <= N; size++) {
            if (N % size != 0) continue; // skip if non-divisible
            int find = 0;
            int groups = N / size;
            boolean ok = true;
            // Find whether every group has a peak
            for (int peakIdx : peaks) {
                if (peakIdx / size > find) {
                    ok = false;
                    break;
                }
                if (peakIdx / size == find) find++;
            }
            if (find != groups) ok = false;
            if (ok) return groups;
        }
        return 0;
    }
}
