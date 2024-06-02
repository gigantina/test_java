package com.test;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestLauncherTest {

    @Test
    public void test_summ() throws IOException {
        UserService userservice = new UserService();
        long[] sumResult = userservice._sum();
        long sum = sumResult[0];
        long time = sumResult[1];
        assertEquals(150, sum);
        System.out.println("Тест на сумму завершился за: " + time + "ns");

    }

    @Test
    public void test_mult() throws IOException {
        UserService userservice = new UserService();
        long[] multResult = userservice._mult();
        long mult = multResult[0];
        long time = multResult[1];
        assertEquals(5140800, mult);
        System.out.println("Тест на умножение завершился за: " + time + "ns");
    }

    @Test
    public void test_min() throws IOException {
        UserService userservice = new UserService();
        long[] minResult = userservice._min();
        long min = minResult[0];
        long time = minResult[1];
        assertEquals(2, min);
        System.out.println("Тест на минимум завершился за: " + time + "ns");
    }

    @Test
    public void test_max() throws IOException {
        UserService userservice = new UserService();
        long[] maxResult = userservice._max();
        long max = maxResult[0];
        long time = maxResult[1];
        assertEquals(56, max);
        System.out.println("Тест на максимум завершился за: " + time + "ns");
    }

    @Test
    public void test_mode() throws IOException {
        UserService userservice = new UserService();
        long[] modeResult = userservice._mode();
        long mode = modeResult[0];
        long time = modeResult[1];
        assertEquals(2, mode);
        System.out.println("Тест на моду завершился за: " + time + "ns");
    }

}
