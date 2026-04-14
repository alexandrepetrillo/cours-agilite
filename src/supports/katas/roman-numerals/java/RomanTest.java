// RomanTest.java — Kata Roman Numerals — Tests de démarrage
// Le premier test est écrit pour vous. Suivez la méthode Ping-Pong TDD !

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanTest {

    // 🏓 Test 1 — Le premier est cadeau !
    @Test
    void test_1_returns_I() {
        assertEquals("I", Roman.toRoman(1));
    }

    @Test
    void test_2_returns_II() {
        assertEquals("II", Roman.toRoman(2));
    }
    @Test
    void test_3_returns_III() {
        assertEquals("III", Roman.toRoman(3));
    }
    @Test
    void test_4_returns_IV() {
        assertEquals("IV", Roman.toRoman(4));
    }
    @Test
    void test_5_returns_V() {
        assertEquals("V", Roman.toRoman(5));
    }


    //   Roman.toRoman(4) -> "IV"
    //   Roman.toRoman(5) -> "V"
    //   Roman.toRoman(6) -> "VI"
    //   Roman.toRoman(9) -> "IX"
    //   Roman.toRoman(10) -> "X"
    //   Roman.toRoman(14) -> "XIV"
    //   Roman.toRoman(40) -> "XL"
    //   Roman.toRoman(50) -> "L"
    //   Roman.toRoman(90) -> "XC"
    //   Roman.toRoman(100) -> "C"
    //   Roman.toRoman(400) -> "CD"
    //   Roman.toRoman(500) -> "D"
    //   Roman.toRoman(900) -> "CM"
    //   Roman.toRoman(1000) -> "M"
    //   Roman.toRoman(2024) -> "MMXXIV"
    //   Roman.toRoman(3999) -> "MMMCMXCIX"
}

