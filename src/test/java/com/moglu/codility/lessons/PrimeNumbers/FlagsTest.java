package com.moglu.codility.lessons.PrimeNumbers;

import com.moglu.codility.lessons.PrimeNumbers.Flags;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class FlagsTest {
    @Test
    void test1() {
        int[]arr={1,5,3,4,3,4,1,2,3,4,6,2};
        assertEquals(3,Flags.solution(arr));
    }
    @Test
    void test2() {
        int[]arr={9,11,3,2,4,7,9,12,15,26,10};
        assertEquals(2,Flags.solution(arr));
    }
    @Test
    void test3() {
        int[]arr={9,11,3,2,8,7,9,17,15,26,10};
        assertEquals(3,Flags.solution(arr));
    }
    @Test
    void test4() {
        int[]arr={0, 0, 0, 0, 0, 1, 0, 1, 0, 1};
        assertEquals(2,Flags.solution(arr));
    }
    @Test
    void oneElement() {
        int[]arr={1};
        assertEquals(0,Flags.solution(arr));
    }
    @Test
    void threeElement() {
        int[]arr={1,4,3};
        assertEquals(1,Flags.solution(arr));
    }
    @Test
    void allPickNeighbours() {
        int[]arr=new int[400000];
        Arrays.fill(arr,12);
        assertEquals(0,Flags.solution(arr));
    }

}