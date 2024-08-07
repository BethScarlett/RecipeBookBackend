package com.example.RecipeBookBackend.Utils;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordUtils {

    public static boolean checkPassword (String passToCheck, String storedPass) {
        System.out.println("Password to be checked is: " +passToCheck);
        System.out.println("Stored password is: " + storedPass);
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(13);
        return encoder.matches(passToCheck, storedPass);
    }

    public static String hashPassword (String passToHash) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(13);
        return encoder.encode(passToHash);
    }
}
