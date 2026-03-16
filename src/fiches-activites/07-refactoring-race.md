# 🏁 Fiche Activité — Refactoring Race

> **Session :** Journée complète | **Horaire :** 14h45–15h30 | **Durée :** 45 min

---

## 🎯 Objectif pédagogique
- Pratiquer le refactoring de code en conditions ludiques
- Comprendre l'importance de la qualité logicielle dans un contexte Agile
- Sensibiliser à la dette technique

## 🏷️ Compétences : C29

## 👥 Format : Équipes de 4-5 personnes

---

## 📦 Matériel nécessaire
- 1 PC par équipe (avec IDE)
- Le code spaghetti préparé (voir ci-dessous)
- Grille de scoring imprimée (1 par équipe)
- Timer visible
- Enceinte pour musique de fond (playlist énergique !)

---

## 📋 Déroulé détaillé

### Présentation du challenge (5 min)
- Distribuer le code spaghetti (même code pour toutes les équipes)
- Expliquer la grille de scoring
- « Vous avez 20 minutes pour rendre ce code propre. Les tests existants doivent continuer à passer ! »

### La course ! (20 min)
- Timer affiché
- Musique énergique 🎵
- Les équipes refactorent en autonomie
- Le formateur circule et observe (ne donne PAS d'indices)

### Scoring & revue croisée (15 min)
- Les équipes échangent leur code
- Chaque équipe évalue le code d'une autre avec la grille :

| Critère | Points | Check |
|---------|--------|-------|
| ✅ Tous les tests passent toujours | +10 | ☐ |
| 📝 Variables et fonctions bien nommées | +5 | ☐ |
| 🧩 Aucune fonction > 20 lignes | +5 | ☐ |
| 🔁 Pas de code dupliqué | +5 | ☐ |
| 🧪 Nouveaux tests ajoutés | +3 / test | ☐ |
| 💡 Principes SOLID visibles | +5 bonus | ☐ |
| ❌ Un test existant cassé | -10 | ☐ |
| **TOTAL** | /35+ | |

- Annonce du classement ! 🏆

### Débrief (5 min)
- Qu'est-ce que la **dette technique** ?
- Pourquoi le refactoring est essentiel en Agile ?
- Quand refactorer ? (Réponse : à chaque sprint, dans le cycle Red-Green-**Refactor**)
- Le coût de ne PAS refactorer (schéma : dette technique = intérêts croissants)

---

## 💻 Code Spaghetti Fourni

### Version Python

```python
# spaghetti.py - Calculateur de panier d'achat
# CE CODE FONCTIONNE... mais il est horrible. À vous de le nettoyer !

def calc(l, t, c):
    r = 0
    d = 0
    for i in range(len(l)):
        p = l[i][1] * l[i][2]
        if l[i][2] >= 5:
            p = p * 0.9
        if c == "VIP":
            p = p * 0.85
        elif c == "STUDENT":
            p = p * 0.9
        r = r + p
    if t == "FR":
        if r > 100:
            d = 0
        else:
            d = 5.99
    elif t == "EU":
        if r > 200:
            d = 0
        else:
            d = 15.99
    elif t == "WORLD":
        d = 25.99
    r = r + d
    tx = 0
    if t == "FR":
        tx = r * 0.2
    elif t == "EU":
        tx = r * 0.2
    else:
        tx = 0
    r = r + tx
    if r < 0:
        r = 0
    return round(r, 2)


def show(l, t, c):
    print("=== RECEIPT ===")
    for i in range(len(l)):
        n = l[i][0]
        pr = l[i][1]
        q = l[i][2]
        print(n + " x" + str(q) + " = " + str(pr * q))
    print("TOTAL: " + str(calc(l, t, c)))
    print("===============")


# items = [(name, price, quantity), ...]
items = [("Laptop", 999.99, 1), ("Mouse", 29.99, 3), ("Keyboard", 79.99, 2), ("Cable", 9.99, 10)]
show(items, "FR", "VIP")
```

### Tests fournis (ne pas casser !)

```python
# test_spaghetti.py
import pytest
from spaghetti import calc

def test_simple_cart():
    items = [("Item", 10.0, 1)]
    result = calc(items, "FR", "NORMAL")
    assert result == 19.19  # 10 + 5.99 shipping + 20% tax

def test_vip_discount():
    items = [("Item", 100.0, 1)]
    result = calc(items, "FR", "VIP")
    assert result == 105.19  # 100*0.85=85 + 5.99 + 20% tax

def test_quantity_discount():
    items = [("Item", 10.0, 5)]
    result = calc(items, "FR", "NORMAL")
    assert result == 60.59  # 10*5*0.9=45 + 5.99 + 20% tax

def test_free_shipping_fr():
    items = [("Item", 200.0, 1)]
    result = calc(items, "FR", "NORMAL")
    assert result == 240.0  # 200 + 0 shipping + 20% tax

def test_eu_shipping():
    items = [("Item", 10.0, 1)]
    result = calc(items, "EU", "NORMAL")
    assert result == 31.19  # 10 + 15.99 + 20% tax

def test_world_no_tax():
    items = [("Item", 10.0, 1)]
    result = calc(items, "WORLD", "NORMAL")
    assert result == 35.99  # 10 + 25.99 + 0 tax

def test_student_discount():
    items = [("Item", 100.0, 1)]
    result = calc(items, "FR", "STUDENT")
    assert result == 114.79  # 100*0.9=90 + 5.99 + 20% tax

def test_empty_cart():
    items = []
    result = calc(items, "FR", "NORMAL")
    assert result == 7.19  # 0 + 5.99 + 20% tax
```

### Version JavaScript (alternative)

```javascript
// spaghetti.js
function calc(l, t, c) {
    let r = 0; let d = 0;
    for (let i = 0; i < l.length; i++) {
        let p = l[i][1] * l[i][2];
        if (l[i][2] >= 5) p = p * 0.9;
        if (c === "VIP") p = p * 0.85;
        else if (c === "STUDENT") p = p * 0.9;
        r = r + p;
    }
    if (t === "FR") { if (r > 100) d = 0; else d = 5.99; }
    else if (t === "EU") { if (r > 200) d = 0; else d = 15.99; }
    else if (t === "WORLD") { d = 25.99; }
    r = r + d;
    let tx = 0;
    if (t === "FR") tx = r * 0.2;
    else if (t === "EU") tx = r * 0.2;
    else tx = 0;
    r = r + tx;
    if (r < 0) r = 0;
    return Math.round(r * 100) / 100;
}
module.exports = { calc };
```

---

## 💡 Tips formateur
- **Ambiance** : musique de course (playlist « Epic Music Mix » ou similaire)
- **Annoncer le temps** : « Il reste 10 minutes ! », « 5 minutes ! », « DERNIÈRE MINUTE ! »
- **Si une équipe casse les tests** : c'est -10 points, pas la mort. Encourager à faire `git stash` ou Ctrl+Z
- **Valoriser** les approches différentes : certains renomment d'abord, d'autres extraient des fonctions d'abord
- **Discussion post-scoring** : montrer une solution « propre » de référence

## 🔄 Variantes
- **Mode individuel** : en binôme Ping-Pong (un refactore, l'autre valide)
- **Ajout de fonctionnalité** : après le refactoring, ajouter une feature (ex: code promo) → le code refactoré est plus facile à étendre
- **Code review formelle** : chaque équipe fait une vraie Pull Request et les autres approuvent/commentent

