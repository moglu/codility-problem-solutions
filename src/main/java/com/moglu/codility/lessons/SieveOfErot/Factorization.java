package com.moglu.codility.lessons.SieveOfErot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Factorization {
    public static void main(String[] args) {
        int[] F = arrayF(20);
        System.out.println(Arrays.toString(F));
        System.out.println(Arrays.toString(factorization(15, F)));
        System.out.println(Arrays.toString(factorization(17, F)));
        System.out.println(Arrays.toString(factorization(18, F)));
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

    public static Integer[] factorization(int x, int[] F) {
        List<Integer> primeFactors = new ArrayList<>();
        while (F[x] > 0) {
            primeFactors.add(F[x]);
            x = x / F[x];
        }
        primeFactors.add(x);
        return primeFactors.stream().toArray(Integer[]::new);
    }
}
