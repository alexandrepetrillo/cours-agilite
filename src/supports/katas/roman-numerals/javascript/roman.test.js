// roman.test.js — Kata Roman Numerals — Tests de démarrage
// Le premier test est écrit pour vous. Suivez la méthode Ping-Pong TDD !

const { toRoman } = require("./roman");

// 🏓 Test 1 — Le premier est cadeau !
test("1 returns I", () => {
    expect(toRoman(1)).toBe("I");
});

// 🏓 À vous de continuer en Ping-Pong TDD !
// Progression suggérée :
//   toRoman(2) -> "II"
//   toRoman(3) -> "III"
//   toRoman(4) -> "IV"
//   toRoman(5) -> "V"
//   toRoman(6) -> "VI"
//   toRoman(9) -> "IX"
//   toRoman(10) -> "X"
//   toRoman(14) -> "XIV"
//   toRoman(40) -> "XL"
//   toRoman(50) -> "L"
//   toRoman(90) -> "XC"
//   toRoman(100) -> "C"
//   toRoman(400) -> "CD"
//   toRoman(500) -> "D"
//   toRoman(900) -> "CM"
//   toRoman(1000) -> "M"
//   toRoman(2024) -> "MMXXIV"
//   toRoman(3999) -> "MMMCMXCIX"

