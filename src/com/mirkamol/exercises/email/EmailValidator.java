package com.mirkamol.exercises.email;

public class EmailValidator {
    public boolean validateEmail(String email) {
        if (!(email == null || email.isEmpty() || email.length() < 11)) {
            if (email.endsWith("@gmail.com")) {
                return true;
            }
        }
        return false;
    }
}


