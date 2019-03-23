package com.moglu.codility.lessons.PrimeNumbers;

public class PrimeMaterial {
    public static void main(String[] args) {
        float a = 1.9f;
        System.out.println(Math.ceil(a));
    }

    public static int reversingCoins(int n) {
        for (int i = 2; i < n; i++) {

        }
        return 0;
    }

    public static int divisors(int n) {
        int i = 1;
        int result = 0;

        while (i * i < n) {
            if (n % i == 0) {
                result += 2;
            }
            i += 1;
            if (i * i == n) {
                result += 1;
            }
        }
        return result;
    }
}
