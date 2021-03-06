package sieve;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.List;

public class Sieve {

    public static List<Integer> findprimes(int bound) {
        List<Integer> primes = new ArrayList<>();
        if (bound < 0) {
            throw new IllegalArgumentException("Bound has to be nonnegative.");
        }
        if (bound < 3) {
            return primes;
        }
        boolean[] flags = new boolean[bound];
        for (int i = 2; i < bound; i++) {
            if (!flags[i]) {
                primes.add(i);
                for (int j = 2 * i; j < bound; j = j + i) {
                    flags[j] = true;
                }
            }
        }
        return primes;
    }

    public static List<Integer> findPrimes(int bound, List<Integer> output) {
        if (bound < 0) {
            throw new IllegalArgumentException("Bound has to be nonnegative.");
        }
        if (bound < 3) {
            return output;
        }
        boolean[] flags = new boolean[bound];
        for (int i = 2; i < bound; i++) {
            if (!flags[i]) {
                output.add(i);
                for (int j = 2 * i; j < bound; j = j + i) {
                    flags[j] = true;
                }
            }
        }
        return output;
    }
}

