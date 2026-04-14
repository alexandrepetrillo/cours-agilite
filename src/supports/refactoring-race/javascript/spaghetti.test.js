// spaghetti.test.js — Tests pour le Refactoring Race
// ⚠️ CES TESTS DOIVENT CONTINUER À PASSER APRÈS LE REFACTORING !

const { calc } = require("./spaghetti");

test("Un article simple, livraison FR, client normal", () => {
    const items = [["Item", 10.0, 1]];
    expect(calc(items, "FR", "NORMAL")).toBe(19.19); // 10 + 5.99 shipping + 20% tax
});

test("Un article avec réduction VIP", () => {
    const items = [["Item", 100.0, 1]];
    expect(calc(items, "FR", "VIP")).toBe(109.19); // 100*0.85=85 + 5.99 shipping + 20% tax on (85+5.99)
});

test("5+ articles du même type = 10% de réduction", () => {
    const items = [["Item", 10.0, 5]];
    expect(calc(items, "FR", "NORMAL")).toBe(61.19); // 10*5*0.9=45 + 5.99 shipping + 20% tax on (45+5.99)
});

test("Livraison gratuite en France si > 100€", () => {
    const items = [["Item", 200.0, 1]];
    expect(calc(items, "FR", "NORMAL")).toBe(240.0); // 200 + 0 shipping + 20% tax
});

test("Livraison EU avec frais", () => {
    const items = [["Item", 10.0, 1]];
    expect(calc(items, "EU", "NORMAL")).toBe(31.19); // 10 + 15.99 + 20% tax
});

test("Livraison mondiale sans TVA", () => {
    const items = [["Item", 10.0, 1]];
    expect(calc(items, "WORLD", "NORMAL")).toBe(35.99); // 10 + 25.99 + 0 tax
});

test("Réduction étudiant", () => {
    const items = [["Item", 100.0, 1]];
    expect(calc(items, "FR", "STUDENT")).toBe(115.19); // 100*0.9=90 + 5.99 shipping + 20% tax on (90+5.99)
});

test("Panier vide", () => {
    const items = [];
    expect(calc(items, "FR", "NORMAL")).toBe(7.19); // 0 + 5.99 + 20% tax
});

