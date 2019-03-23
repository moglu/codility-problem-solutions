package com.moglu.codility.lessons.Leader;

public class Dominator {

    public static void main(String[] args) {
        int[] arr1 = {3, 4, 3, 2, 3, -1, 3, 3};
        int[] arr2 = {-1, -3, -4, 3, -1, -1, -1};
        int[] arr3 = {5};
        System.out.println(solution(arr1));
        System.out.println(solution(arr2));
        System.out.println(solution(arr3));
    }

    // maybe refactored
    public static int solution(int[] A) {

        int size = 0;
        int value = 0;
        for (int i = 0; i < A.length; i++) {
            if (size == 0) {
                value = A[i];
                size += 1;
            } else {
                if (value != A[i]) {
                    size -= 1;
                } else {
                    size += 1;
                }
            }
        }
        if (size < 0) return -1;
        int count = 0;
        int lastFoundIndex = 0;
        for (int i = 0; i < A.length; i++) {
            if (value == A[i]) {
                count += 1;
                lastFoundIndex = i;
            }
        }
        if (count > (A.length / 2)) return lastFoundIndex;
        return -1;
    }
}
