package com.project;

import com.project.attempt.LeetCodeAttempt;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class LeetCodeAttemptTest {

    @Test
    public void closestPrimeNumbersInRangeTest() {

        assertArrayEquals(new int[]{ 11 , 13 }, LeetCodeAttempt.closestPrimeNumbersInRange(10, 19));

        assertArrayEquals(new int[]{ -1 , -1 }, LeetCodeAttempt.closestPrimeNumbersInRange(4, 6));

    }

}
