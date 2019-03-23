package com.moglu.codility.lessons.SieveOfErot;

import java.util.Arrays;

public class Sieve {
    public static void main(String[] args) {
        boolean[] sieve = sieve(17);
        for (int i = 0; i < sieve.length; i++) {
            if (sieve[i]) System.out.print(i + " ");
        }

    }

    public static boolean[] sieve(int n) {
        boolean[] sieve = new boolean[n + 1];
        Arrays.fill(sieve, true);
        sieve[0] = false;
        sieve[1] = false;

        int i = 2;
        int k = 1;
        while (i * i <= n) {
            if (sieve[i]) {
                k = i * i;
            }
            while (k <= n) {
                sieve[k] = false;
                k += i;
            }
            i += 1;
        }
        return sieve;
    }
}
