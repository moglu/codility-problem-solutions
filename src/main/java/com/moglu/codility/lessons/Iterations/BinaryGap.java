package com.moglu.codility.lessons.Iterations;

public class BinaryGap {

    public static void main(String[] args) {
        System.out.println(solution(1041));
        System.out.println(solution(15));
        System.out.println(solution(32));
        System.out.println(solution(581));
        System.out.println(solution(255));

    }

    public static int solution(int N) {
        //TODO N=2 <2
        int maxGap = 0;
        int localGap = 0;
        boolean found = false;
        while (N != 1) {
            int remainder = N % 2;
            N = N / 2;
            if (remainder == 0 && found) {
                localGap = localGap + 1;
            } else if (remainder == 1) {
                localGap = 0;
                found = true;
            }
            if (localGap > maxGap) {
                maxGap = localGap;
            }
        }
        return maxGap;
    }
    /*
    Solution 1 useless double loop
    public static int solution(int N){
        //TODO N=2 <2
        int maxGap = 0;
        while(N!=1){
            int remainder = N%2;
            N=N/2;
            int localGap=0;
            if(remainder==1){
                while(N%2==0) {
                    localGap=localGap+1;
                    N=N/2;
                }
            }
            if(localGap>maxGap){
                maxGap=localGap;
            }
        }
        return maxGap;
    }*/
}
