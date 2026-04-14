# 🧪 Kata FizzBuzz — Live Coding TDD

> **Objectif :** Le formateur code en direct devant les étudiants pour démontrer le cycle Red-Green-Refactor.
> **Durée :** ~20 min
> **Langage :** Choisir Python, JavaScript ou Java selon le groupe.

---

## 📋 Les règles de FizzBuzz

Écrire une fonction `fizzbuzz(n)` qui retourne :

| Entrée | Sortie | Règle |
|:------:|:------:|-------|
| 1 | `"1"` | Nombre normal → retourne le nombre en string |
| 2 | `"2"` | idem |
| 3 | `"Fizz"` | Divisible par **3** → `"Fizz"` |
| 5 | `"Buzz"` | Divisible par **5** → `"Buzz"` |
| 6 | `"Fizz"` | Divisible par 3 |
| 10 | `"Buzz"` | Divisible par 5 |
| 15 | `"FizzBuzz"` | Divisible par **3 ET 5** → `"FizzBuzz"` |
| 30 | `"FizzBuzz"` | idem |

---

## 🎯 Consignes pour le live coding

1. **Demander aux étudiants** quel test écrire à chaque étape
2. **Montrer le cycle** : écrire le test → le lancer → il échoue (🔴) → écrire le code minimum → il passe (🟢) → refactorer si nécessaire (🔵)
3. **Aller lentement** — expliquer chaque décision
4. **Faire exprès d'écrire du code stupide** au début (`return "1"`) pour montrer que le TDD force la généralisation

---

## 🔴 Étape 0 — Le point de départ

Ouvrir l'IDE, créer les 2 fichiers, lancer le premier test → **il échoue**. C'est le point de départ du live coding.

> 💬 *« On a un test, il échoue. On est en RED. Maintenant, quel est le code le plus simple pour le faire passer ? »*

Le guide complet étape par étape se trouve dans `supports/extreme-programming-cours.md`, section 10.

