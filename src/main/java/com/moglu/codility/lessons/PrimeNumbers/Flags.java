package com.moglu.codility.lessons.PrimeNumbers;

import java.util.ArrayList;
import java.util.List;

public class Flags {
    public static void main(String[] args) {
        int[] arr1 = {1, 5, 3, 4, 3, 4, 1, 2, 3, 4, 6, 2};
        System.out.println(solution(arr1));

    }

    public static int solution(int[] A) {
        if (A.length < 3) return 0;

        List<Integer> peaks = new ArrayList<>();
        for (int i = 1; i < A.length - 1; i++) {
            if (A[i] > A[i + 1] && A[i] > A[i - 1]) peaks.add(i);
        }

        if (peaks.size() == 1 || peaks.size() == 0) return peaks.size();
        int flags = (int) Math.ceil((Math.sqrt(A.length)));
        int lastFlag = peaks.get(0);

        while (flags != 0) {
            int x = flags;
            flags--;
            for (int i = 1; i < peaks.size(); i++) {
                if (peaks.get(i) - lastFlag >= x) {
                    flags -= 1;
                    lastFlag = peaks.get(i);
                }
                if (flags <= 0) break;
            }
            if (flags > 0) {
                flags = x - 1;
                lastFlag = peaks.get(0);
            } else {
                return x;
            }
        }
        return 0;

    }

    public static List<Integer> createPeaks(int[] A) {
        // write your code in Java SE 8
        List<Integer> peaks = new ArrayList<>();
        for (int i = 1; i < A.length - 1; i++) {
            if (A[i] > A[i + 1] && A[i] > A[i - 1]) peaks.add(i);
        }
        return peaks;
    }

    public static boolean checkXFlagCanBeSet(int x, int[] A, List<Integer> peaks) {
        int flags = x;
        for (int i = 0; i < peaks.size(); i++) {
            if (peaks.get(i + 1) - peaks.get(i) == x) {
                flags = -1;
            }
        }
        return flags == 0;
    }
}
