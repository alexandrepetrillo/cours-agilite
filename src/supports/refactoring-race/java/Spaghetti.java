// Spaghetti.java - Calculateur de panier d'achat
// CE CODE FONCTIONNE... mais il est horrible. À vous de le nettoyer !

import java.util.Arrays;
import java.util.List;

public class Spaghetti {

    // items: chaque item est un String[] {name, price, quantity}
    public static double calc(List<String[]> l, String t, String c) {
        double r = 0;
        double d = 0;
        for (int i = 0; i < l.size(); i++) {
            double p = Double.parseDouble(l.get(i)[1]) * Integer.parseInt(l.get(i)[2]);
            if (Integer.parseInt(l.get(i)[2]) >= 5) {
                p = p * 0.9;
            }
            if (c.equals("VIP")) {
                p = p * 0.85;
            } else if (c.equals("STUDENT")) {
                p = p * 0.9;
            }
            r = r + p;
        }
        if (t.equals("FR")) {
            if (r > 100) {
                d = 0;
            } else {
                d = 5.99;
            }
        } else if (t.equals("EU")) {
            if (r > 200) {
                d = 0;
            } else {
                d = 15.99;
            }
        } else if (t.equals("WORLD")) {
            d = 25.99;
        }
        r = r + d;
        double tx = 0;
        if (t.equals("FR")) {
            tx = r * 0.2;
        } else if (t.equals("EU")) {
            tx = r * 0.2;
        } else {
            tx = 0;
        }
        r = r + tx;
        if (r < 0) {
            r = 0;
        }
        return Math.round(r * 100.0) / 100.0;
    }

    public static void show(List<String[]> l, String t, String c) {
        System.out.println("=== RECEIPT ===");
        for (int i = 0; i < l.size(); i++) {
            String n = l.get(i)[0];
            double pr = Double.parseDouble(l.get(i)[1]);
            int q = Integer.parseInt(l.get(i)[2]);
            System.out.println(n + " x" + q + " = " + (pr * q));
        }
        System.out.println("TOTAL: " + calc(l, t, c));
        System.out.println("===============");
    }

    public static void main(String[] args) {
        List<String[]> items = List.of(
            new String[]{"Laptop", "999.99", "1"},
            new String[]{"Mouse", "29.99", "3"},
            new String[]{"Keyboard", "79.99", "2"},
            new String[]{"Cable", "9.99", "10"}
        );
        show(items, "FR", "VIP");
    }
}

