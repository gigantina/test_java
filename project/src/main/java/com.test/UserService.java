package com.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class UserService {
    long[] numbers;

    public UserService() throws IOException {
        BufferedReader sc = new BufferedReader(new FileReader("input.txt"));
        String[] numbersString = sc.readLine().split(" ");
        numbers = Arrays.stream(numbersString)
                .mapToLong(Long::parseLong)
                .toArray();
    }

    public long _min() {
        long res = 9223372036854775807L;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < res) {
                res = numbers[i];
            }
        }
        return res;
    }

    public long _max() {
        long res = -9223372036854775807L;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > res) {
                res = numbers[i];
            }
        }
        return res;
    }

    public long _sum() {
        long res = 0;
        for (int i = 0; i < numbers.length; i++) {
            res += numbers[i];
        }
        return res;
    }

    public long _mult() {
        long res = 1;
        for (int i = 0; i < numbers.length; i++) {
            res *= numbers[i];
        }
        return res;
    }

    public long _mode() {
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
        return mode;
    }

}
