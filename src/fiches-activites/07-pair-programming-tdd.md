# 👥 Fiche Activité — Pair Programming & TDD (Kata Ping-Pong)

> **Jour :** 2 | **Horaire :** 10h15–11h15 | **Durée :** 1h

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

### Kata « Roman Numerals » (40 min)

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

