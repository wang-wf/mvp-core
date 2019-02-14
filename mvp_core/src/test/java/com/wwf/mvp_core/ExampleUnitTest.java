package com.wwf.mvp_core;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    private void getScreenLocation(int xTap, int yTap) {
        int xMax = 32767;
        int yMax = 32767;

        int width = 1080;
        int height = 1920;

        int x = xTap * width / xMax;
        int y = yTap * height / yMax;
        System.out.println("X:: " + x + "  Y:: " + y);
    }

    @Test
    public void testClick() {
//        getScreenLocation(0x2a4f, 0x2899);
//        getScreenLocation(0x44bd, 0x4c43);
//        getScreenLocation(0x1c16, 0x7a98);

        getScreenLocation(0x1c16, 0x7a98);
    }
}