package com.moglu.codility.lessons.PrimeNumbers;

public class MinPerimeterRectangle {
    public static void main(String[] args) {

        System.out.println(solution(36));
    }

    public static int solution(int N) {
        // write your code in Java SE 8
        int A = 1;
        int B = 1;


        int maxEdge = 1;
        for (int i = 1; i <= (int) Math.sqrt(N); i++) {
            if (N % i == 0) maxEdge = i;
        }
        if (maxEdge * maxEdge == N) return (maxEdge + maxEdge) * 2;
        A = maxEdge;
        B = N / maxEdge;

        return (A + B) * 2;

    }
}
