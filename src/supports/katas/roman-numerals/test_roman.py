# Kata Roman Numerals — Tests de démarrage
# Le premier test est écrit pour vous. Suivez la méthode Ping-Pong TDD !

import pytest
from roman import to_roman


# 🏓 Test 1 — Le premier est cadeau !
def test_1_returns_I():
    assert to_roman(1) == "I"


# 🏓 À vous de continuer en Ping-Pong TDD !
# Progression suggérée :
#   to_roman(2) -> "II"
#   to_roman(3) -> "III"
#   to_roman(4) -> "IV"
#   to_roman(5) -> "V"
#   to_roman(6) -> "VI"
#   to_roman(9) -> "IX"
#   to_roman(10) -> "X"
#   to_roman(14) -> "XIV"
#   to_roman(40) -> "XL"
#   to_roman(50) -> "L"
#   to_roman(90) -> "XC"
#   to_roman(100) -> "C"
#   to_roman(400) -> "CD"
#   to_roman(500) -> "D"
#   to_roman(900) -> "CM"
#   to_roman(1000) -> "M"
#   to_roman(2024) -> "MMXXIV"
#   to_roman(3999) -> "MMMCMXCIX"

