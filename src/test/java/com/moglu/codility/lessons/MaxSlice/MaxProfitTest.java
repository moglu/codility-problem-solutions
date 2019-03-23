package com.moglu.codility.lessons.MaxSlice;

import com.moglu.codility.lessons.MaxSlice.MaxProfit;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxProfitTest {
    @Test
    void oneElement() {
        int [] arr={23171};
        assertEquals(0,MaxProfit.solution(arr));
    }

    @Test
    void twoElement() {
        int [] arr={23171,25000};
        assertEquals(1829,MaxProfit.solution(arr));
    }

    @Test
    void threeElement() {
        int [] arr={3,26,31};
        assertEquals(28,MaxProfit.solution(arr));
    }

    @Test
    void noProfit() {
        int [] arr={3,3,3};
        assertEquals(0,MaxProfit.solution(arr));
    }
    @Test
    void loss1() {
        int [] arr={36,20,12,10,1};
        assertEquals(0,MaxProfit.solution(arr));
    }
    @Test
    void allZero() {
        int [] arr={0,0,0};
        assertEquals(0,MaxProfit.solution(arr));
    }
    @Test
    void exampletest1() {
        int [] arr={23171, 21011, 21123, 21366, 21013, 21367};
        assertEquals(356,MaxProfit.solution(arr));
    }

    @Test
    void exampleTest2() {
        int [] arr={8, 9, 3, 6, 1, 2};
        assertEquals(3,MaxProfit.solution(arr));
    }
    @Test
    void exampleTest3() {
        int [] arr={12,16,9,11,25,36,18};
        assertEquals(27,MaxProfit.solution(arr));
    }
    @Test
    void exampleTest4() {
        int [] arr={12,16,24,26,35,46,100,2000,3000,4000,100000,1,200000};
        assertEquals(199999,MaxProfit.solution(arr));
    }
}