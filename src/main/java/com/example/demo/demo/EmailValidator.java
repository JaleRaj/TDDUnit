package com.example.demo.demo;
import java.util.regex.Pattern;

public class EmailValidator {

    // Ein einfacher Anfang: Diese Version des regulären Ausdrucks überprüft nicht das Vorhandensein eines "@"
    private static final Pattern EMAIL_PATTERN = Pattern.compile(
            "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*" + 
            "(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$"
    );

    public static boolean isValidEmail(String email) {
        if (email == null) {
            return false;
        }
        return EMAIL_PATTERN.matcher(email).matches();
    }
}