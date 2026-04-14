# test_fizzbuzz.py — Kata FizzBuzz — Premier test (RED 🔴)
# Lancer : pytest test_fizzbuzz.py -v

from fizzbuzz import fizzbuzz


def test_1_returns_1():
    assert fizzbuzz(1) == "1"

