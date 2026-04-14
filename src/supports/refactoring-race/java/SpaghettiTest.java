// SpaghettiTest.java — Tests pour le Refactoring Race
// ⚠️ CES TESTS DOIVENT CONTINUER À PASSER APRÈS LE REFACTORING !

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SpaghettiTest {

  @Test
  void simpleCart() {
    // Un article simple, livraison FR, client normal
    List<String[]> items = List.<String[]>of(new String[]{"Item", "10.0", "1"});
    assertEquals(19.19, Spaghetti.calc(items, "FR", "NORMAL")); // 10 + 5.99 shipping + 20% tax
  }

  @Test
  void vipDiscount() {
    // Un article avec réduction VIP
    List<String[]> items = List.<String[]>of(new String[]{"Item", "100.0", "1"});
    assertEquals(109.19, Spaghetti.calc(items, "FR", "VIP")); // 100*0.85=85 + 5.99 shipping + 20% tax on (85+5.99)
  }

  @Test
  void quantityDiscount() {
    // 5+ articles du même type = 10% de réduction
    List<String[]> items = List.<String[]>of(new String[]{"Item", "10.0", "5"});
    assertEquals(61.19, Spaghetti.calc(items, "FR", "NORMAL")); // 10*5*0.9=45 + 5.99 shipping + 20% tax on (45+5.99)
  }

  @Test
  void freeShippingFr() {
    // Livraison gratuite en France si > 100€
    List<String[]> items = List.<String[]>of(new String[]{"Item", "200.0", "1"});
    assertEquals(240.0, Spaghetti.calc(items, "FR", "NORMAL")); // 200 + 0 shipping + 20% tax
  }

  @Test
  void euShipping() {
    // Livraison EU avec frais
    List<String[]> items = List.<String[]>of(new String[]{"Item", "10.0", "1"});
    assertEquals(31.19, Spaghetti.calc(items, "EU", "NORMAL")); // 10 + 15.99 + 20% tax
  }

  @Test
  void worldNoTax() {
    // Livraison mondiale sans TVA
    List<String[]> items = List.<String[]>of(new String[]{"Item", "10.0", "1"});
    assertEquals(35.99, Spaghetti.calc(items, "WORLD", "NORMAL")); // 10 + 25.99 + 0 tax
  }

  @Test
  void studentDiscount() {
    // Réduction étudiant
    List<String[]> items = List.<String[]>of(new String[]{"Item", "100.0", "1"});
    assertEquals(115.19, Spaghetti.calc(items, "FR", "STUDENT")); // 100*0.9=90 + 5.99 shipping + 20% tax on (90+5.99)
  }

  @Test
  void emptyCart() {
    // Panier vide
    List<String[]> items = Collections.emptyList();
    assertEquals(7.19, Spaghetti.calc(items, "FR", "NORMAL")); // 0 + 5.99 + 20% tax
  }
}

