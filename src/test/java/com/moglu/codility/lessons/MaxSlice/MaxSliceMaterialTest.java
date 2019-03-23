package com.moglu.codility.lessons.MaxSlice;

import com.moglu.codility.lessons.MaxSlice.MaxSliceMaterial;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxSliceMaterialTest {
    @Test
    void oneElement() {
        int [] arr={1};
        assertEquals(1,MaxSliceMaterial.solution(arr));
    }
    @Test
    void twoElement() {
        int [] arr={-3,-9};
        assertEquals(-3,MaxSliceMaterial.solution(arr));
    }
    @Test
    void threeElement() {
        int [] arr={-10,-6,-3};
        assertEquals(-3,MaxSliceMaterial.solution(arr));
    }


}