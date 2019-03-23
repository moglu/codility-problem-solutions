package com.moglu.codility.lessons.Leader;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class LeaderMaterial {
    public static void main(String[] args) {
//        int [] arr1={4,8,6,8,6,6,6};
        int[] arr1 = {1, 2, 3, 4, 5};
//        System.out.println(fastLeader(arr1));
        System.out.println(goldenLeader(arr1));
    }

    // O(nlogn) solution
    public static int fastLeader(int[] A) {
        Arrays.sort(A);

        int leader = -1;
        int N = A.length;
        int candidate = A[N / 2];
        int count = 0;

        for (int i = 0; i < N; i++) {
            if (A[i] == candidate) count += 1;
        }
        if (count > (N / 2)) leader = candidate;

        return leader;
    }

    //O(n) solution
    //we look for current and last values like using a ghost stack
    public static int goldenLeader(int[] A) {

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
        for (int i = 0; i < A.length; i++) {
            if (value == A[i]) count += 1;
        }
        if (count > (A.length / 2)) return value;
        return -1;
    }

    //O(n) solution
    public static int goldenLeader1(int[] A) {
        Deque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < A.length; i++) {
            if (stack.size() != 0 && A[i] != stack.peek()) {
                stack.pop();
            } else {
                stack.push(A[i]);
            }

        }
        if (stack.size() == 0) return -1;

        int candidate = stack.peek();
        int count = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == candidate) count += 1;
        }
        if (count > (A.length / 2)) return candidate;
        return -1;
    }
}
