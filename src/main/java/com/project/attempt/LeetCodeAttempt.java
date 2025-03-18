package com.project.attempt;

import java.util.Arrays;
import java.util.LinkedList;

public class LeetCodeAttempt {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(closestPrimeNumbersInRange(10, 19)));

        System.out.println(Arrays.toString(closestPrimeNumbersInRange(4, 6)));

    }

    public static int[] closestPrimeNumbersInRange(int left, int right) {

        LinkedList<Integer> primeNumbers = new LinkedList<>();

        for (int i = left; i <= right; i++) {

            if (isPrimeNumber(i)) { primeNumbers.add(i); }

        }

        int[] ans = { -1, -1 };

        if (primeNumbers.size() < 2) { return ans; }

        int smallestDifference = primeNumbers.get(1) - primeNumbers.get(0);
        ans[0] = primeNumbers.get(0);
        ans[1] = primeNumbers.get(1);

        for (int i = 1; i < primeNumbers.size(); i++) {

            int a = primeNumbers.get(i-1);
            int b = primeNumbers.get(i);

            if (b - a < smallestDifference) {

                smallestDifference = b - a;
                ans[0] = a;
                ans[1] = b;

            }

        }

        return ans;

    }

    private static boolean isPrimeNumber(int n) {

        for (int i = 2; i < n; i++) {

            if (n % i == 0) { return false; }

        }

        return true;

    }

}
