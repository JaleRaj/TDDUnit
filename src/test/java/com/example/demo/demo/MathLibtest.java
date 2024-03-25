package com.example.demo.demo;

import static
org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class MathLibtest {
    @Test
    public void testEvent1(){

        assertTrue(MathLib.isEven(2));
    }

}
