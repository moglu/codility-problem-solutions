package com.moglu.codility.lessons.Leader;

public class EquiLeader {
    public static void main(String[] args) {
        int[] arr1 = {4, 3, 4, 4, 4, 2};
        int[] arr2 = {4, 4, 4, 4, 4};
        int[] arr3 = {4, 3, 4, 4, 6, 9};
        int[] arr4 = {4};
        System.out.println(solution(arr4));
    }

    public static int solution(int[] A) {

        //find at least one leader
        int size = 0;
        int leader = 0;
        for (int i = 0; i < A.length; i++) {
            if (size == 0) {
                leader = A[i];
                size += 1;
            } else {
                if (leader != A[i]) {
                    size -= 1;
                } else {
                    size += 1;
                }
            }
        }
        if (size < 0) return 0;

        int count = 0;
        for (int i = 0; i < A.length; i++) {
            if (leader == A[i]) count += 1;
        }

        if (!(count > (A.length / 2))) return 0;


        int numOfEqL = 0;
        int leftLeaderCount = 0;
        int rightLeaderCount = count;

        for (int i = 0; i < A.length; i++) {
            if (A[i] == leader) {
                leftLeaderCount++;
                rightLeaderCount--;
            }
            if ((leftLeaderCount > (i + 1) / 2) && (rightLeaderCount > (A.length - i - 1) / 2)) numOfEqL++;
        }
        return numOfEqL;
    }

}
