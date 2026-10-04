package com.example.demo.controller;

import java.security.SecureRandom;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/password")
public class PasswordController {

    private static final String LOWERCASE = "abcdefghijklmnopqrstuvwxyz";
    private static final String UPPERCASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    java.lang.String NUMBERS = "0123456789";
    private static final String SYMBOLS = "!@#$%^&*()_+-=[]{}|;:,.<>?";

    @GetMapping("/generate")
    public ResponseEntity<Map<String, String>> generatePassword(
            @RequestParam(defaultValue = "12") int length,
            @RequestParam(defaultValue = "true") boolean includeUpper,
            @RequestParam(defaultValue = "true") boolean includeNumbers,
            @RequestParam(defaultValue = "true") boolean includeSymbols) {

        if (length < 4 || length > 128) {
            return ResponseEntity.badRequest().body(Map.of("error", "O tamanho da senha deve ser entre 4 e 128 caracteres."));
        }

        StringBuilder charPool = new StringBuilder(LOWERCASE);
        if (includeUpper) charPool.append(UPPERCASE);
        if (includeNumbers) charPool.append(NUMBERS);
        if (includeSymbols) charPool.append(SYMBOLS);

        SecureRandom random = new SecureRandom();
        StringBuilder password = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(charPool.length());
            password.append(charPool.charAt(index));
        }

        Map<String, String> response = new HashMap<>();
        response.put("password", password.toString());
        return ResponseEntity.ok(response);
    }
}