package com.moglu.codility.lessons.PrimeNumbers;

public class CountFactors {
    public static void main(String[] args) {
        System.out.println(solution(2147395600));
        System.out.println(solution(24));
    }

    public static int solution(int N) {
        if (N == 1) return 1;
        //for integer max value it will overflow, so it is declared as long
        long i = 1;
        long result = 0;

        while (i * i < N) {
            if (N % i == 0) {
                result += 2;
            }
            i += 1;
            if (i * i == N) {
                result += 1;
            }
        }
        return (int) result;
    }
}
