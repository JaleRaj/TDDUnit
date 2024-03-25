package com.example.demo.demo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzConverterTest {

    @Test
    public void testNumberNotDivisibleByThreeOrSeven() {
        FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();
        assertEquals("1", fizzBuzz.convert(1));
    }
    @Test
    public void testNumberNotDivisibleByThreeOrSeven2() {
        FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();
        assertEquals("2", fizzBuzz.convert(2));
    }
    
    // Weitere Testmethoden hier hinzufügen
}
