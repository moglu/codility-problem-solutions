package com.moglu.codility.lessons.SieveOfErot;

import com.moglu.codility.lessons.SieveOfErot.CountSemiprimes;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class CountSemiprimesTest {
    @Test
    void test1() {
        int[]P={1,4,16};
        int[]Q={26,10,20};
        int[]result={10,4,0};
        assertArrayEquals(result,CountSemiprimes.solution(26,P,Q));
    }
    @Test
    void test2() {
        int[]P={1};
        int[]Q={10};
        int[]result={4};
        assertArrayEquals(result,CountSemiprimes.solution(10,P,Q));
    }
    @Test
    void test3() {
        int[]P={26};
        int[]Q={26};
        int[]result={1};
        assertArrayEquals(result,CountSemiprimes.solution(26,P,Q));
    }
    @Test
    void test4() {
        int[]P={5,11};
        int[]Q={9,19};
        int[]result={2,2};
        assertArrayEquals(result,CountSemiprimes.solution(20,P,Q));
    }
    @Test
    void test5() {
        int[]P={2};
        int[]Q={2};
        int[]result={0};
        assertArrayEquals(result,CountSemiprimes.solution(2,P,Q));
    }
    @Test
    void test6() {
        int[]P={97,98};
        int[]Q={97,98};
        int[]result={0,0};
        assertArrayEquals(result,CountSemiprimes.solution(100,P,Q));
    }
    @Test
    void test7() {
        int[]P=new int[30000];
        Arrays.fill(P,49999);
        int[]Q=new int[30000];
        Arrays.fill(Q,50000);
        int[]result=new int[30000];
        Arrays.fill(result,0);
        assertArrayEquals(result,CountSemiprimes.solution(50000,P,Q));
    }
    @Test
    void test8() {
        int[]P={9,9};
        int[]Q={9,9};
        int[]result={1,1};
        assertArrayEquals(result,CountSemiprimes.solution(9,P,Q));
    }
}