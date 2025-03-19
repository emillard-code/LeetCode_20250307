package com.project.attempt;

import java.util.Arrays;
import java.util.LinkedList;

public class LeetCodeAttempt {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(closestPrimeNumbersInRange(10, 19)));

        System.out.println(Arrays.toString(closestPrimeNumbersInRange(4, 6)));

    }

    // This method returns the closest prime numbers between int left and int right.
    public static int[] closestPrimeNumbersInRange(int left, int right) {

        // We first want to get a list of all (inclusive) prime numbers between int left and int right.
        LinkedList<Integer> primeNumbers = new LinkedList<>();

        for (int i = left; i <= right; i++) {

            // We call a helper method on each number between int left and int right,
            // to see if that number is a prime number or not.
            if (isPrimeNumber(i)) { primeNumbers.add(i); }

        }

        // We will use int[] ans to store our answer. The default values are -1
        // if there are not enough prime numbers to fulfill the challenge specifications.
        int[] ans = { -1, -1 };

        // If we don't have at least two prime numbers, return int[] ans as it is.
        if (primeNumbers.size() < 2) { return ans; }

        // If we have at least two prime numbers, we start by filling int[] ans
        // with the first two prime numbers in the list, and we record the difference
        // in value between them using int smallestDifference.
        int smallestDifference = primeNumbers.get(1) - primeNumbers.get(0);
        ans[0] = primeNumbers.get(0);
        ans[1] = primeNumbers.get(1);

        // Then, we loop through the list of prime numbers to see if there are any other
        // pair of prime numbers with a smaller difference in value between them.
        for (int i = 1; i < primeNumbers.size(); i++) {

            // In each iteration of the loop, we take the current and previous numbers.
            int a = primeNumbers.get(i-1);
            int b = primeNumbers.get(i);

            // Then we compare the difference between them, and see if it is less than
            // the current int smallestDifference. If yes, we replace int smallestDifference
            // with this value and replace the values in int[] ans with the two prime numbers.
            if (b - a < smallestDifference) {

                smallestDifference = b - a;
                ans[0] = a;
                ans[1] = b;

            }

        }

        // At the very end, we return whatever final state of int[] ans that we have.
        return ans;

    }

    // A helper method that checks whether int n is a prime number or not.
    private static boolean isPrimeNumber(int n) {

        // We loop through all values between 2 and n - 1.
        for (int i = 2; i < n; i++) {

            // If at any point, we have a division that doesn't leave any remainders,
            // then we know int n is not a prime number and we return false.
            if (n % i == 0) { return false; }

        }

        // If at no point did we find any number that can cleanly divide int n,
        // then we know that int n is a prime number and return true.
        return true;

    }

}
