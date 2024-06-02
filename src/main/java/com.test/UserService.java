package com.test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class UserService {
    long[] numbers;

    public UserService() throws IOException {
        numbers = Arrays.stream(readFile())
                .mapToLong(Long::parseLong)
                .toArray();
    }

    public String[] readFile() throws IOException {
        BufferedReader sc = new BufferedReader(new FileReader("input.txt"));
        String[] numbersString = sc.readLine().split(" ");
        return numbersString;
    }

    public long[] _min() {
        long t0 = System.nanoTime();
        long min = Long.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        long t1 = System.nanoTime();
        return new long[]{min, t1 - t0};
    }

    public long[] _max() {
        long t0 = System.nanoTime();
        long res = Long.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > res) {
                res = numbers[i];
            }
        }
        long t1 = System.nanoTime();
        return new long[]{res, t1 - t0};
    }

    public long[] _sum() throws ArithmeticException {
        long t0 = System.nanoTime();
        long sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = Math.addExact(sum, numbers[i]);
        }
        long t1 = System.nanoTime();
        return new long[]{sum, t1 - t0};
    }

    public long[] _mult() {
        long t0 = System.nanoTime();
        long mult = 1;
        for (int i = 0; i < numbers.length; i++) {
            mult = Math.multiplyExact(mult, numbers[i]);
        }
        long t1 = System.nanoTime();
        return new long[]{mult, t1 - t0};
    }

    public long[] _mode() {
        long t0 = System.nanoTime();
        Map<Long, Integer> frequencyMap = new HashMap<>();
        int maxFrequency = 0;
        long mode = Long.MAX_VALUE;

        for (long num : numbers) {
            int count = frequencyMap.getOrDefault(num, 0) + 1;
            frequencyMap.put(num, count);
            if (count > maxFrequency) {
                maxFrequency = count;
                mode = num;
            } else if (count == maxFrequency) {
                if (num < mode) {
                    mode = num;
                }
            }
        }
        long t1 = System.nanoTime();
        return new long[]{mode, t1 - t0};
    }

}
