package com.test;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestLauncherTest {

    @Test
    public void test_summ() throws IOException {
        UserService userservice = new UserService();
        long[] sumResult = userservice._sum();
        long sum = sumResult[0];
        long time = sumResult[1];

        assertAll("Проверка суммы",
                () -> assertEquals(150, sum, "Тест не пройден. Ожидалось: 150, но было: " + sum)
        );

        System.out.println("Тест на сумму завершился за: " + time + "ns");
    }

    @Test
    public void test_mult() throws IOException {
        UserService userservice = new UserService();
        long[] multResult = userservice._mult();
        long mult = multResult[0];
        long time = multResult[1];

        assertAll("Проверка умножения",
                () -> assertEquals(5140800, mult, "Тест не пройден. Ожидалось: 5140800, но было: " + mult)
        );

        System.out.println("Тест на умножение завершился за: " + time + "ns");
    }

    @Test
    public void test_min() throws IOException {
        UserService userservice = new UserService();
        long[] minResult = userservice._min();
        long min = minResult[0];
        long time = minResult[1];

        assertAll("Проверка минимума",
                () -> assertEquals(2, min, "Тест не пройден. Ожидалось: 2, но было: " + min)
        );

        System.out.println("Тест на минимум завершился за: " + time + "ns");
    }

    @Test
    public void test_max() throws IOException {
        UserService userservice = new UserService();
        long[] maxResult = userservice._max();
        long max = maxResult[0];
        long time = maxResult[1];

        assertAll("Проверка максимума",
                () -> assertEquals(56, max, "Тест не пройден. Ожидалось: 56, но было: " + max)
        );

        System.out.println("Тест на максимум завершился за: " + time + "ns");
    }

    @Test
    public void test_mode() throws IOException {
        UserService userservice = new UserService();
        long[] modeResult = userservice._mode();
        long mode = modeResult[0];
        long time = modeResult[1];

        assertAll("Проверка моды",
                () -> assertEquals(2, mode, "Тест не пройден. Ожидалось: 2, но было: " + mode)
        );

        System.out.println("Тест на моду завершился за: " + time + "ns");
    }
}
