package com.project;

import com.project.solution.LeetCodeSolution;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class LeetCodeSolutionTest {

    @Test
    public void closestPrimesTest() {

        assertArrayEquals(new int[]{ 11 , 13 }, LeetCodeSolution.closestPrimes(10, 19));

        assertArrayEquals(new int[]{ -1 , -1 }, LeetCodeSolution.closestPrimes(4, 6));

    }

}
