package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class PalindromeTest {

    private Palindrome target = new Palindrome();

    @Test
    void isPalindrome() {
        boolean lepel = target.isPalindrome("lepel");
        assertTrue(lepel);

        boolean bram = target.isPalindrome("bram");
        assertTrue(bram);
    }
}
