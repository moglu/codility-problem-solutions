package com.moglu.codility.lessons.PrimeNumbers;

import com.moglu.codility.lessons.PrimeNumbers.Peaks;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class PeaksTest {
    @Test
    void test1() {
        int[] arr={1,2,3,4,3,4,1,2,3,4,6};
        assertEquals(1,Peaks.solution(arr));
    }
    @Test
    void test2() {
        int[] arr={1,2,3,4,3,4,1,2,3,4,6,2};
        assertEquals(3,Peaks.solution(arr));
    }
    @Test
    void test3() {
        int[] arr={3,6,15,9,19,16,29,10,19,2};
        assertEquals(2,Peaks.solution(arr));
    }
    @Test
    void test4() {
        int[] arr=new int[100000];

        Arrays.fill(arr,1000000000);
        assertEquals(0,Peaks.solution(arr));
    }
    @Test
    void test5() {
        int[] arr=new int[100000];

        Arrays.fill(arr,1000000000);
        assertEquals(0,Peaks.solution(arr));
    }
    @Test
    void test6() {
        int[] arr={5};

        assertEquals(0,Peaks.solution(arr));
    }
    @Test
    void test7() {
        int[] arr={5,4};

        assertEquals(0,Peaks.solution(arr));
    }
    @Test
    void test8() {
        int[] arr={3,4,3};

        assertEquals(1,Peaks.solution(arr));
    }
    @Test
    void test9() {
        int[] arr={1,1,1};

        assertEquals(0,Peaks.solution(arr));
    }
    @Test
    void test10() {
        int[] arr=new int[100000];

        Arrays.fill(arr,1000000000);
        arr[arr.length-2]=1000000001;
        assertEquals(1,Peaks.solution(arr));
    }
    @Test
    void test11() {
        int[] arr={0,0};


        assertEquals(0,Peaks.solution(arr));
    }
    @Test
    void test12() {
        int[] arr={3,6,15,21,29,12,13,15};
        assertEquals(1,Peaks.solution(arr));
    }
    @Test
    void test13() {
        int[] arr={3,6,4,21,29,12,13,15};
        assertEquals(2,Peaks.solution(arr));
    }
    @Test
    void noPeak1() {
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        assertEquals(0,Peaks.solution(arr));
    }
    @Test
    void onePeakAtTheEnd() {
        int[] arr={1,2,3,4,5,6,7,8,12,10};
        assertEquals(1,Peaks.solution(arr));
    }
    @Test
    void twoPeakAtTheEndAndStart() {
        int[] arr={1,5,3,4,5,6,7,8,12,10};
        assertEquals(2,Peaks.solution(arr));
    }

}