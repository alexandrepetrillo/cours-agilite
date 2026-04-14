// fizzbuzz.test.js — Kata FizzBuzz — Premier test (RED 🔴)
// Lancer : npx jest fizzbuzz.test.js

const { fizzbuzz } = require("./fizzbuzz");

test("1 returns '1'", () => {
    expect(fizzbuzz(1)).toBe("1");
});

