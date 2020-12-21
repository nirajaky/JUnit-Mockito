package com.nirajaky;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import static org.junit.Assert.assertEquals;

public class TestCalculator {
    Calculator c = new Calculator();

    // To run something before our test cases, For After the test cases we use @After
    @Before
    public void setup(){
        c.k = 0;
    }
    @Test
    public void testAdd(){
        //assertEquals(6, c.add(2,3));
//        java.lang.AssertionError:
//        Expected :6
//        Actual   :5
        assertEquals(5, c.add(2,3));
    }
}
