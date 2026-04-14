// Lancer : avec JUnit 5

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

  @Test
  void test_1_returns_1() {
    assertEquals("1", FizzBuzz.fizzbuzz(1));
  }

  @Test
  void test_2_returns_2() {
    assertEquals("2", FizzBuzz.fizzbuzz(2));
  }

  @Test
  void test_3_returns_Fizz() {
    assertEquals("Fizz", FizzBuzz.fizzbuzz(3));
  }

  @Test
  void test_6_returns_Fizz() {
    assertEquals("Fizz", FizzBuzz.fizzbuzz(6));
  }

  @Test
  void test_5_returns_Buzz() {
    assertEquals("Buzz", FizzBuzz.fizzbuzz(5));
  }

  @Test
  void test_10_returns_Buzz() {
    assertEquals("Buzz", FizzBuzz.fizzbuzz(10));
  }

  @Test
  void test_15_returns_FizzBuzz() {
    assertEquals("FizzBuzz", FizzBuzz.fizzbuzz(15));
  }

  @Test
  void test_30_returns_FizzBuzz() {
    assertEquals("FizzBuzz", FizzBuzz.fizzbuzz(30));
  }
}

