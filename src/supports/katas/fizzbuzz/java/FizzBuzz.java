// Étape 0 : la méthode existe mais ne fait rien.

public class FizzBuzz {

  public static String fizzbuzz(int n) {
    boolean modulo3 = n % 3 == 0;
    boolean modulo5 = n % 5 == 0;
    if (modulo3 && modulo5)
      return "FizzBuzz";
    if (modulo3)
      return "Fizz";
    if (modulo5)
      return "Buzz";
    return "" + n;
  }
}

