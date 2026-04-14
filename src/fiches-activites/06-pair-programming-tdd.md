# 👥 Fiche Activité — Pair Programming & TDD (Kata Ping-Pong)

> **Session :** Journée complète | **Horaire :** 13h55–14h45 | **Durée :** 50 min

---

## 🎯 Objectif pédagogique
- Pratiquer le Pair Programming avec la technique Ping-Pong
- Comprendre et appliquer le cycle TDD : Red → Green → Refactor
- Expérimenter la communication et la collaboration en binôme

## 🏷️ Compétences : C29, C30

## 👥 Format : Binômes (2 personnes par PC)

---

## 📦 Matériel nécessaire
- 1 PC pour 2 étudiants
- IDE installé (VS Code, IntelliJ, PyCharm)
- Framework de test installé :
  - **Python** : pytest
  - **JavaScript** : Jest
  - **Java** : JUnit
- Jeu de cartes classique (pour former les binômes aléatoirement)

---

## 📋 Déroulé détaillé

### Formation des binômes (5 min)
- Distribuer des cartes à jouer (ex: 2 de cœur, 2 de pique, etc.)
- Les personnes avec le même numéro forment un binôme
- Ça crée des binômes mixtes (pas les copains habituels !)

### Explication de la technique Ping-Pong TDD (5 min)

```
🏓 Joueur A : Écrit un test qui ÉCHOUE (RED 🔴)
        ↓
🏓 Joueur B : Écrit le code MINIMUM pour le faire passer (GREEN 🟢)
        ↓
🏓 Joueur B : Écrit le prochain test qui ÉCHOUE (RED 🔴)
        ↓
🏓 Joueur A : Écrit le code MINIMUM pour le faire passer (GREEN 🟢)
        ↓
    Ensemble : REFACTOR si nécessaire (REFACTOR 🔵)
        ↓
    ... et on recommence !
```

**Règles d'or :**
- On ne peut écrire du code de production QUE pour faire passer un test qui échoue
- On écrit le code le PLUS SIMPLE possible
- On refactore quand les tests sont verts

### Kata « Roman Numerals » (35 min)

**L'objectif** : écrire une fonction `to_roman(number)` qui convertit un entier en chiffre romain.

**Progression suggérée :**
1. `to_roman(1)` → `"I"`
2. `to_roman(2)` → `"II"`
3. `to_roman(3)` → `"III"`
4. `to_roman(4)` → `"IV"`
5. `to_roman(5)` → `"V"`
6. `to_roman(9)` → `"IX"`
7. `to_roman(10)` → `"X"`
8. `to_roman(14)` → `"XIV"`
9. `to_roman(40)` → `"XL"`
10. `to_roman(50)` → `"L"`
11. `to_roman(90)` → `"XC"`
12. `to_roman(100)` → `"C"`
13. `to_roman(2024)` → `"MMXXIV"`

**Starter code Python :**
```python
# test_roman.py
import pytest
from roman import to_roman

def test_1_returns_I():
    assert to_roman(1) == "I"

# roman.py
def to_roman(number):
    pass  # À implémenter !
```

**Starter code JavaScript :**
```javascript
// roman.test.js
const { toRoman } = require('./roman');

test('1 returns I', () => {
    expect(toRoman(1)).toBe('I');
});

// roman.js
function toRoman(number) {
    // À implémenter !
}
module.exports = { toRoman };
```

### Revue de code croisée (10 min)

---

## 🆘 Hints progressifs — Guide de déblocage formateur

> **Principe :** ne donne JAMAIS la solution directement. Donne le hint du niveau le plus bas d'abord. Si ça ne suffit pas, passe au niveau suivant. L'objectif est qu'ils trouvent eux-mêmes.

### 🟢 Palier 1 : `to_roman(1)` → `"I"` (tout le monde passe)

Normalement aucun blocage ici. Si quand même :
> 💬 *« Quel est le code le plus simple qui retourne "I" ? »* → `return "I"`

---

### 🟢 Palier 2 : `to_roman(2)` → `"II"` et `to_roman(3)` → `"III"` (le pattern additif)

**Blocage typique :** ils font des `if/elif` pour chaque nombre.

| Niveau | Hint à donner |
|:------:|---------------|
| 1 | *« Votre code pour 1, 2 et 3… vous voyez un pattern ? C'est toujours des I répétés. »* |
| 2 | *« Pensez à une boucle ou à une répétition de string. En Python, `"I" * 3` donne quoi ? »* |
| 3 | *« Et si vous aviez un compteur qui enlève 1 à chaque tour et ajoute "I" au résultat ? »* |

**Ce qu'on attend à ce stade (pas forcément beau, c'est normal) :**
```python
def to_roman(number):
    result = ""
    while number >= 1:
        result += "I"
        number -= 1
    return result
```

> ⚠️ **Si un binôme fait `if number == 1: return "I"` / `elif number == 2: return "II"` etc.** → c'est OK pour l'instant ! Le test suivant (4 → "IV") va les forcer à changer d'approche. C'est le TDD qui fait son travail.

---

### 🟡 Palier 3 : `to_roman(4)` → `"IV"` (le premier cas soustractif — LE blocage principal)

**Blocage typique :** « IV c'est pas juste des I répétés, comment on fait ? »

| Niveau | Hint à donner |
|:------:|---------------|
| 1 | *« 4 est un cas spécial. Pour l'instant, vous pouvez juste ajouter un if pour 4. C'est pas élégant mais ça fait passer le test. On refactorera après. »* |
| 2 | *« Pensez à votre boucle while. Et si au lieu de juste enlever 1 et ajouter "I", vous pouviez aussi enlever 4 et ajouter "IV" ? »* |
| 3 | *« Imaginez une liste de correspondances : `[(4, "IV"), (1, "I")]`. Votre boucle essaie d'abord 4, sinon elle tombe sur 1. »* |

**Le déclic :** l'idée d'un **tableau de correspondance** parcouru du plus grand au plus petit.

```python
def to_roman(number):
    result = ""
    if number >= 4:
        result += "IV"
        number -= 4
    while number >= 1:
        result += "I"
        number -= 1
    return result
```

---

### 🟡 Palier 4 : `to_roman(5)` → `"V"` et `to_roman(9)` → `"IX"` (généraliser le pattern)

**Blocage typique :** le code devient un enchaînement de `if/elif` ingérable.

| Niveau | Hint à donner |
|:------:|---------------|
| 1 | *« Regardez votre code. Vous avez un if pour 4, un if pour 5, un if pour 9… il y a un pattern, non ? »* |
| 2 | *« Et si vous mettiez toutes vos correspondances dans une liste ordonnée ? Du plus grand au plus petit ? »* |
| 3 | *« Essayez avec une liste de tuples : `[(9, "IX"), (5, "V"), (4, "IV"), (1, "I")]`. Parcourez-la avec un while pour chaque valeur. »* |

**Le refactoring attendu (🔵 REFACTOR) :**
```python
def to_roman(number):
    values = [(9, "IX"), (5, "V"), (4, "IV"), (1, "I")]
    result = ""
    for value, numeral in values:
        while number >= value:
            result += numeral
            number -= value
    return result
```

> 🎯 **C'est LE moment de refactoring du kata.** Si un binôme arrive ici, félicitez-les : *« Bravo, vous venez de découvrir l'algorithme. Maintenant ajouter 10, 40, 50, 90… c'est juste ajouter des lignes dans votre tableau ! »*

---

### 🟢 Palier 5 : `to_roman(10)` → `"X"` et au-delà (c'est gagné !)

Une fois le tableau en place, ajouter les valeurs restantes est trivial. Plus de blocage attendu.

| Niveau | Hint à donner |
|:------:|---------------|
| 1 | *« Vous avez le bon pattern. Maintenant, quelles valeurs manquent dans votre tableau ? »* |
| 2 | *« Les chiffres romains utilisent : 1000=M, 900=CM, 500=D, 400=CD, 100=C, 90=XC, 50=L, 40=XL, 10=X, 9=IX, 5=V, 4=IV, 1=I »* |

**Le tableau complet :**
```python
values = [
    (1000, "M"), (900, "CM"), (500, "D"), (400, "CD"),
    (100, "C"), (90, "XC"), (50, "L"), (40, "XL"),
    (10, "X"), (9, "IX"), (5, "V"), (4, "IV"), (1, "I")
]
```

---

### 🔴 Blocages transversaux (pas liés à un palier)

| Problème | Ce qu'ils disent | Hint |
|----------|-----------------|------|
| **Paralysie du test** | « On ne sait pas quel test écrire » | *« Quel est le prochain nombre que votre code ne gère PAS encore ? Testez celui-là. »* |
| **Code trop compliqué** | Ils font des trucs avec `divmod`, des regex… | *« C'est plus simple que ça. Pensez soustraction : tant que le nombre est assez grand, on enlève et on ajoute le symbole. »* |
| **Oubli du refactoring** | 15 `if/elif` et ça marche | *« Stop ! Tous vos tests sont verts ? Parfait. Maintenant regardez votre code : il y a de la duplication partout. C'est le moment REFACTOR. »* |
| **Ils ne changent pas de rôle** | Un seul tape depuis 10 min | *« 🏓 SWITCH ! C'est l'autre qui prend le clavier ! »* (utiliser le timer) |
| **Ils regardent la solution en ligne** | Téléphone sous la table… | *« L'objectif n'est pas de résoudre le kata, c'est de pratiquer le TDD. Si vous copiez la solution, vous n'apprenez rien. »* |
| **Ils vont trop vite** | Ils écrivent le code ET le test en même temps | *« Attention ! RED d'abord. Écrivez le test, lancez-le, voyez-le échouer. PUIS codez. C'est la discipline. »* |

---

### ⏱️ Où devrait être un binôme à T+X minutes ?

| Temps | Palier attendu | Si en avance | Si en retard |
|:-----:|---------------|-------------|-------------|
| T+10min | `to_roman(3)` → `"III"` | Laissez-les avancer | Normal, le setup prend du temps |
| T+15min | `to_roman(4)` → `"IV"` | 👍 | Donnez le hint niveau 1 du palier 3 |
| T+20min | `to_roman(9)` → `"IX"` | Suggérez le refactoring avec le tableau | Donnez le hint niveau 2-3 du palier 4 |
| T+25min | Le tableau est en place, `to_roman(10)` marche | Proposez d'aller jusqu'à 3999 | Donnez directement le hint du tableau |
| T+30min | Valeurs 10-100 ajoutées | Kata String Calculator en bonus | C'est OK ! Arrêtez-les pour la revue croisée |
| T+35min | → Revue de code croisée | | |

---

### Revue de code croisée (10 min)
1. Les binômes échangent leurs écrans (ou leur code via Git)
2. Chaque binôme fait une **mini code review** :
   - Le code est-il lisible ?
   - Les noms de variables/fonctions sont-ils clairs ?
   - Les tests couvrent-ils les cas limites ?
   - Y a-t-il du code dupliqué ?
3. Feedback constructif (1 point positif + 1 suggestion d'amélioration)

---

## 💡 Tips formateur
- **Circuler** entre les binômes pour observer et débloquer si nécessaire
- **Ne pas donner la solution** — guider par des questions (« Quel serait le test le plus simple à écrire maintenant ? »)
- **Timer sonore** toutes les 3 min pour rappeler de changer de rôle (pilote ↔ navigateur)
- **Pas grave si on ne finit pas** le kata — l'important c'est le processus, pas le résultat
- **Encourager** les discussions entre binômes : « Comment vous feriez ce test ? »

## 🎯 Kata alternatif pour les plus rapides
**String Calculator** : une fonction `add(string)` qui :
- `add("")` → 0
- `add("1")` → 1
- `add("1,2")` → 3
- `add("1\n2,3")` → 6
- `add("//;\n1;2")` → 3 (délimiteur custom)

## 🔄 Variantes
- **Mob Programming** : au lieu de binômes, 1 écran pour 5 personnes avec rotation toutes les 3 min
- **Contrainte « Evil Coder »** : le Joueur B doit écrire le code le PLUS tordu possible qui fait passer le test → force Joueur A à écrire des tests plus précis
- **Version à distance** : utiliser VS Code Live Share ou CodeTogether

