package com.example.demo.demo;

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
    
}
