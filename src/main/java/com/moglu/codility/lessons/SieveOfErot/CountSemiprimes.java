package com.moglu.codility.lessons.SieveOfErot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountSemiprimes {

    public static void main(String[] args) {
        int[] P = {1, 4, 16};
        int[] Q = {26, 10, 20};
        System.out.println(Arrays.toString(solution(26, P, Q)));
    }

    public static int[] solution(int N, int[] P, int[] Q) {
        // write your code in Java SE 8
        int[] F = arrayF(N);

        //find all semiprimes
        boolean[] semiprimes = new boolean[F.length];
        for (int i = 2; i < F.length; i++) {
            if (F[i] != 0) {
                int divisor = i / F[i];
                if (F[divisor] == 0) {
                    //semi prime
                    semiprimes[i] = true;
                }
            }
        }
        // prefixSums
        int[] prefixSums = new int[F.length];
        for (int i = 1; i < prefixSums.length; i++) {
            if (semiprimes[i]) {
                //+1
                prefixSums[i] = prefixSums[i - 1] + 1;
            } else {
                prefixSums[i] = prefixSums[i - 1];
            }
        }
        // System.out.println(Arrays.toString(prefixSums));
        //range calculations
        List<Integer> rangePrimes = new ArrayList<>();
        for (int i = 0; i < Q.length; i++) {
            int primeCount = prefixSums[Q[i]] - prefixSums[P[i] - 1];
            rangePrimes.add(primeCount);
        }
        int[] rangePrimesArr = new int[rangePrimes.size()];
        for (int i = 0; i < rangePrimes.size(); i++) {
            rangePrimesArr[i] = rangePrimes.get(i);
        }
        return rangePrimesArr;
    }

    public static int[] arrayF(int n) {
        int[] F = new int[n + 1];
        F[0] = 0;
        F[1] = 0;

        int i = 2;
        while (i * i <= n) {
            if (F[i] == 0) {
                int k = i * i;
                while (k <= n) {
                    if (F[k] == 0) F[k] = i;
                    k += i;
                }
            }
            i += 1;
        }
        return F;
    }

}
