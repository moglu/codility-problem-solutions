package com.moglu.codility.lessons.PrefixSums;

public class CountDiv {
    public static void main(String[] args) {
//        System.out.println(solution(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE));
        System.out.println(solution(0, 1500, Integer.MAX_VALUE));
        System.out.println(solution(25, 1500, 35));
        System.out.println(solution(0, 1, 11));
        System.out.println(solution2(0, 1, 11));
    }

    static int solution(int A, int B, int K) {
        //for loops are completely useless
        int count = 0;
        if (A == 0) count++;
        if (K > B) return count;

        int lastOccur = 0;
        for (int i = B; i >= A; i--) {
            if (i % K == 0) {
                lastOccur = i;
                break;
            }
        }
        int firstOccur = 0;
        if (A > K) {
            for (int j = A - 1; j >= 0; j--) {
                if (j % K == 0) {
                    firstOccur = j;
                    break;
                }
            }
        }
        if (firstOccur > lastOccur) return 0;
        count = count + (lastOccur - firstOccur) / K;
        return count;
    }

    static int solution2(int A, int B, int K) {
        return (B / K) - (A / K) + (A % K == 0 ? 1 : 0);
    }
}
