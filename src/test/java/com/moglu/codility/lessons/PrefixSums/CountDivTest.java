package com.moglu.codility.lessons.PrefixSums;

import com.moglu.codility.lessons.PrefixSums.CountDiv;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class CountDivTest {
    @Test
    void ExampleTest1() { assertEquals(3, CountDiv.solution(6,11,2)); }
    @Test
    void ExampleTest2() {
        assertEquals(13, CountDiv.solution(6,92,7));
    }
    @Test
    void EndpointTest1() {
        assertEquals(1, CountDiv.solution(1,1,1));
    }

    @Test
    void EndpointTest2() {
        assertEquals(1, CountDiv.solution(0,1,2));
    }

    @Test
    void EndpointTest3() {
        assertEquals(1, CountDiv.solution(0,1,2));
    }
    @Test
    void EndpointTest4() {
        assertEquals(1, CountDiv.solution(0,0,2));
    }

    @Test
    void EndpointTest5() {
        assertEquals(1, CountDiv.solution(1,5,5));
    }

    @Test
    void EndpointTest6() {
        assertEquals(0, CountDiv.solution(1,5,6));
    }

    @Test
    void EndpointTest7() {
        assertEquals(6, CountDiv.solution(0,10,2));
    }

    @Test
    void EndpointTest8() {
        assertEquals(0, CountDiv.solution(10,10,7));
    }


    @Test
    void PerformanceTest1() {
       CountDiv.solution(0,2000000000,6);
    }
    @Test
    void PerformanceTest2() {

    }
}