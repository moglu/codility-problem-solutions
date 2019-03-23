package com.moglu.codility.lessons.TimeComplexity;

public class FrogJmp {
    public static void main(String[] args) {

    }

    //https://app.codility.com/demo/results/trainingDM79JP-3BS/
    // Time Complexity O(1)
    public static int solution(int X, int Y, int D) {
        if (X == Y) return 0;

        int requiredDist = Y - X;

        int dividend = requiredDist / D;
        int remainder = requiredDist % D;

        if (remainder > 0) {
            return dividend + 1;
        } else {
            return dividend;
        }
    }
}
