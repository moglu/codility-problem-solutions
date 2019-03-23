package com.moglu.codility.lessons.CountingElements;

import com.moglu.codility.lessons.CountingElements.MissingInteger;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MissingIntegerTest {
    @Test
    void generalTestToBeDivided() {

        int [] arr2 = {1, 1, 0, -1, -2};
        int [] arr3 = {-1, 2, 3};
        int [] arr4 = { 2, 3, -7, 6, 8, 1, -10, 15 };

        int [] arr7 = {-5,-10,-2,1,1};

    }

    @Test
    void allPositive() {
        int [] arr = {1, 3, 6, 4, 1, 2};
        assertEquals(5, MissingInteger.solution(arr));
    }

    @Test
    void allNegative() {
        int [] arr = {-5, -10, -2, -1};
        assertEquals(1, MissingInteger.solution(arr));
    }

    @Test
    void justOnePositive() {
        int [] arr = {-5, -10, -2 , 5};
        assertEquals(1, MissingInteger.solution(arr));
    }
    @Test
    void justOnePositiveAndGt1() {
        int [] arr = {-5, -10, -2 , 1};
        assertEquals(2, MissingInteger.solution(arr));
    }

    @Test
    void completeConsecutive() {
        int [] arr = {1, 2, 3, 4, 5, 6};
        assertEquals(7, MissingInteger.solution(arr));
    }

    @Test
    void justOneElement() {
        int [] arr = {1};
        assertEquals(2, MissingInteger.solution(arr));
    }

    @Test
    void allZero() {
        int [] arr = {0};
        assertEquals(1, MissingInteger.solution(arr));
    }
}