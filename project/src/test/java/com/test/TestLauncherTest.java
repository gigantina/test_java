package com.test;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestLauncherTest {

    @Test
    public void test_summ() throws IOException {
        long t0 = System.nanoTime();
        UserService userservice = new UserService();
        assertEquals(150, userservice._sum());
        long t1 = System.nanoTime();
        System.out.println(t1 - t0);
        System.out.println((t1 - t0) / 1000000 + "ms");
    }

    @Test
    public void test_mult() throws IOException {
        long t0 = System.nanoTime();
        UserService userservice = new UserService();
        assertEquals(5140800, userservice._mult());
        long t1 = System.nanoTime();
        System.out.println((t1 - t0) / 1000000 + "ms");
    }

    @Test
    public void test_min() throws IOException {
        long t0 = System.nanoTime();
        UserService userservice = new UserService();
        assertEquals(2, userservice._min());
        long t1 = System.nanoTime();
        System.out.println((t1 - t0) / 1000000 + "ms");
    }

    @Test
    public void test_max() throws IOException {
        long t0 = System.nanoTime();
        UserService userservice = new UserService();
        assertEquals(56, userservice._max());
        long t1 = System.nanoTime();
        System.out.println((t1 - t0) / 1000000 + "ms");
    }

    @Test
    public void test_mode() throws IOException {
        long t0 = System.nanoTime();
        UserService userservice = new UserService();
        assertEquals(2, userservice._mode());
        long t1 = System.nanoTime();
        System.out.println((t1 - t0) / 1000000 + "ms");
    }

}
