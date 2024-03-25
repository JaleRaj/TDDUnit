package com.example.demo.demo;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class EmailValidatorTest {

    @Test
    public void testEmailValidationWithCorrectFormat() {
        // Angenommen, dies ist eine E-Mail mit korrektem Format.
        String validEmail = "test@example.com";
        assertTrue(EmailValidator.isValidEmail(validEmail),
                   "Die E-Mail-Adresse sollte als gültig anerkannt werden.");
    }


    @Test
    public void testEmailValidationWithMissingAtSymbol() {
        // Eine E-Mail-Adresse ohne "@"-Zeichen sollte als ungültig erkannt werden.
        String emailWithoutAt = "testexample.com";
        assertFalse(EmailValidator.isValidEmail(emailWithoutAt),
                    "Die E-Mail-Adresse ohne '@' sollte als ungültig erkannt werden.");
    }

    @Test
    public void testEmailValidationWithMultipleAtSymbols() {
        // Eine E-Mail-Adresse mit mehreren "@"-Zeichen sollte als ungültig erkannt werden.
        String invalidEmail = "test@@example.com";
        assertFalse(EmailValidator.isValidEmail(invalidEmail),
                    "Die E-Mail-Adresse mit mehreren '@' sollte als ungültig erkannt werden.");
    }
    
}
