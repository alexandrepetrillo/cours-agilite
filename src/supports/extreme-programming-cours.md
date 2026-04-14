# 💻 Extreme Programming (XP) — Contenu de Cours Complet

> **Utilisé :** Jour 2 — 13h15 à 13h55 (40 min)
> **Format :** Cours interactif (20 min) + Live Coding TDD FizzBuzz (20 min)
> **Pré-requis :** Avoir vu Scrum, Kanban, User Stories le matin
> **Transition vers :** Atelier Pair Programming & TDD en binômes (13h55)

---

## 📑 Sommaire

1. [Origine et contexte de l'XP](#1--origine-et-contexte-de-lxp)
2. [Les 5 valeurs de l'XP](#2--les-5-valeurs-de-lxp)
3. [Les pratiques clés](#3--les-pratiques-clés)
4. [Pair Programming en détail](#4--pair-programming-en-détail)
5. [TDD en détail](#5--tdd-en-détail)
6. [Intégration Continue](#6--intégration-continue)
7. [Refactoring](#7--refactoring)
8. [Planning Game](#8--planning-game)
9. [XP + Scrum + Kanban : comment ça s'articule](#9--xp--scrum--kanban--comment-ça-sarticule)
10. [Live Coding : FizzBuzz en TDD](#10--live-coding--fizzbuzz-en-tdd)

---

---

## 1. 📌 Origine et contexte de l'XP

### L'histoire (2 min max — raconter, pas lire)

> 💬 **À dire :** « On est en 1996. Kent Beck, un développeur américain, arrive sur le projet Chrysler C3 — un système de paie. Le projet est en échec total. Au lieu de rajouter de la documentation et du processus, il fait l'inverse : il pousse toutes les bonnes pratiques de développement à l'extrême. D'où le nom : Extreme Programming. »

**Les faits clés :**
- **1996** : Kent Beck prend la tête du projet Chrysler C3 (système de paie)
- **1999** : Il publie *Extreme Programming Explained* — le livre fondateur
- L'idée : si les revues de code sont bonnes → on code **tout le temps à deux** (Pair Programming)
- Si les tests sont bons → on écrit les tests **avant** le code (TDD)
- Si l'intégration fréquente est bonne → on intègre **plusieurs fois par jour** (CI)

> 💡 **XP est un framework Agile axé sur les pratiques d'ingénierie.** Là où Scrum organise le *management* du projet (rôles, événements), XP se concentre sur *comment on écrit du bon code*.

### Positionnement par rapport à Scrum et Kanban

| | **Scrum** | **Kanban** | **XP** |
|---|---|---|---|
| **Focus** | Organisation du projet | Flux de travail | Qualité du code |
| **Réponse à** | Comment on planifie ? | Comment on visualise et fluidifie ? | Comment on code bien ? |
| **Rôles** | PO, SM, Dev Team | Pas de rôles prescrits | Coach, Programmeurs, Client |
| **Itérations** | Sprints fixes | Flux continu | Itérations courtes (1-2 sem) |
| **Combinable ?** | ✅ Souvent combiné avec XP | ✅ Combinable avec tout | ✅ Se greffe sur Scrum |

> 🎯 **Point clé :** En entreprise, on ne choisit pas « Scrum OU XP ». On fait souvent **Scrum + pratiques XP**. Scrum dit *quand* et *quoi*, XP dit *comment*.

---

## 2. 💎 Les 5 valeurs de l'XP

> 💬 **À dire :** « XP repose sur 5 valeurs. Ce ne sont pas juste des mots sur un poster — chaque pratique XP est directement reliée à une ou plusieurs de ces valeurs. »

### 💬 Communication

**Le principe :** Tout le monde parle à tout le monde. Pas de silos, pas de "je t'envoie un mail".

**En pratique :**
- Le Pair Programming force la communication permanente
- Le client est **dans l'équipe** (pas un mail au bout du couloir)
- Les problèmes se règlent en face-à-face, pas par ticket Jira

> 🎓 **Exemple :** « Quand vous codez à deux (Pair Programming), vous êtes obligés d'expliquer votre raisonnement à voix haute. Ça élimine les malentendus et ça produit un meilleur design. »

### 🎯 Simplicité

**Le principe :** Faire **la chose la plus simple qui fonctionne** (the simplest thing that could possibly work).

**En pratique :**
- Ne pas coder de fonctionnalités « au cas où » → **YAGNI** (You Ain't Gonna Need It)
- Le code le plus facile à maintenir est celui qui n'existe pas
- Si c'est compliqué, c'est probablement mal designé

> 🎓 **Exemple :** « En TDD, quand un test échoue, on écrit le code le plus stupide possible pour le faire passer. Pas d'optimisation prématurée. Si le test dit `1 → "I"`, on écrit `return "I"`. Point. On complexifiera quand un test l'exigera. »

### 🔄 Feedback

**Le principe :** Les boucles de feedback sont **les plus courtes possibles**.

**En pratique :**
- Les tests unitaires → feedback en **secondes** (mon code marche-t-il ?)
- L'intégration continue → feedback en **minutes** (mon code casse-t-il autre chose ?)
- Les itérations courtes → feedback en **1-2 semaines** (est-ce le bon produit ?)
- Le client dans l'équipe → feedback **immédiat** (est-ce ce que tu voulais ?)

> 🎓 **Lien avec le vécu :** « Ce matin, dans le Ball Point Game, vous vous êtes améliorés sprint après sprint grâce au feedback. En XP, c'est pareil — mais le feedback vient des tests, du client et du code lui-même. »

### 💪 Courage

**Le principe :** Oser faire ce qui est difficile mais nécessaire.

**En pratique :**
- **Refactorer** du code qui marche (mais qui est moche) — ça fait peur mais c'est essentiel
- **Jeter** du code quand il faut recommencer autrement
- **Dire non** à une feature demandée si elle n'a pas de valeur
- **Dire la vérité** au client : « On ne tiendra pas la deadline avec ce scope »

> 🎓 **Exemple :** « Cet après-midi, dans la Refactoring Race, vous allez devoir toucher du code qui fonctionne pour le rendre propre. Ça demande du courage — et si vous cassez quelque chose, les tests vous le diront immédiatement. C'est le filet de sécurité. »

### 🤝 Respect

**Le principe :** Chaque membre de l'équipe a de la valeur et mérite d'être entendu.

**En pratique :**
- En Pair Programming, le navigateur ne critique pas — il **guide**
- Le junior apporte des idées fraîches, le senior apporte l'expérience
- On respecte le code des autres (pas de « c'est nul ce que t'as fait »)
- On respecte le client (ses contraintes sont réelles)

> 🎓 **À dire :** « Tout à l'heure en Pair Programming, votre binôme fera peut-être quelque chose différemment de vous. Ce n'est pas faux — c'est différent. C'est dans cette différence qu'on apprend. »

---

## 3. 🧰 Les pratiques clés — Vue d'ensemble

> 💬 **À dire :** « XP définit une douzaine de pratiques. On va se concentrer sur les 5 plus importantes — celles que vous allez pratiquer cet après-midi. »

| Pratique | En une phrase | On le fait quand ? |
|----------|--------------|-------------------|
| 👥 **Pair Programming** | Coder à deux sur un seul écran | Atelier suivant (13h55) |
| 🧪 **TDD** | Écrire le test AVANT le code | Live coding + atelier |
| 🔄 **Intégration Continue** | Fusionner et tester le code plusieurs fois par jour | Concept expliqué |
| 🧹 **Refactoring** | Améliorer le code sans changer ce qu'il fait | Refactoring Race (14h45) |
| 📋 **Planning Game** | Estimer en équipe, négocier le scope | Déjà fait ce matin (Planning Poker) |

**Autres pratiques XP (mentionner rapidement) :**
- **Whole Team** : le client fait partie de l'équipe
- **Sustainable Pace** : pas de crunch, on tient le rythme sur la durée (40h/semaine)
- **Coding Standards** : conventions de code partagées
- **Collective Code Ownership** : tout le monde peut toucher à tout le code
- **Small Releases** : livrer souvent, en petits incréments

---

## 4. 👥 Pair Programming en détail

### Le concept

Deux développeurs, **un seul écran**, deux rôles :

| Rôle | Ce qu'il fait | Analogie |
|------|--------------|----------|
| 🚗 **Pilote** (Driver) | Tape au clavier, écrit le code | Le conducteur |
| 🗺️ **Navigateur** (Navigator) | Réfléchit à la stratégie, repère les erreurs, suggère | Le copilote avec la carte |

**On change de rôle toutes les 5-10 minutes** (ou à chaque cycle TDD en mode Ping-Pong).

### Pourquoi ça marche

> 💬 **À dire :** « La réaction naturelle c'est de penser que c'est du gaspillage — 2 devs pour 1 écran, ça divise la productivité par 2, non ? En fait, non. »

| Idée reçue | Réalité |
|-----------|---------|
| « On perd 50% de productivité » | Les études montrent qu'on perd ~15% de *vitesse* mais on gagne 15-60% de *qualité* (moins de bugs) |
| « C'est que pour les juniors » | Les seniors apprennent autant — questions naïves du junior → remise en question des habitudes |
| « C'est fatigant » | Oui, c'est intense ! C'est pour ça qu'on ne le fait pas 8h/jour. 2-4h de pair/jour c'est le sweet spot |
| « Ça marche pas à distance » | Ça marche très bien avec VS Code Live Share, Tuple, ou même un partage d'écran |

### Les bénéfices concrets

1. **Partage de connaissances** : plus de « lui seul sait comment ça marche »
2. **Moins de bugs** : 2 paires d'yeux en temps réel > 1 code review après coup
3. **Meilleur design** : le navigateur pense à l'architecture pendant que le pilote implémente
4. **Onboarding rapide** : nouveau dans l'équipe ? Pair avec un ancien pendant 1 semaine
5. **Focus** : quand ton binôme est là, tu ne regardes pas Twitter

### Les modes de Pair Programming

| Mode | Comment ça marche | Idéal pour |
|------|------------------|-----------|
| 🏓 **Ping-Pong TDD** | A écrit test (RED), B code (GREEN), B écrit test, A code… | Apprendre le TDD, rythme soutenu |
| 👨‍✈️ **Driver-Navigator** | Pilote code, navigateur guide. Changement toutes les 10 min | Exploration, code complexe |
| 🤝 **Strong Style** | « Pour qu'une idée passe du cerveau au clavier, elle doit passer par une autre personne » → le navigateur dicte, le pilote tape | Partage de connaissance maximal |

> 🎯 **Cet après-midi, on utilise le mode Ping-Pong TDD** — c'est le plus structuré et le plus adapté pour découvrir à la fois le Pair Programming et le TDD.

---

## 5. 🧪 TDD en détail

### Le cycle Red-Green-Refactor

> 💬 **À dire :** « Le TDD, c'est écrire le test AVANT le code. Ça paraît contre-intuitif — comment tester quelque chose qui n'existe pas encore ? C'est justement le point : le test *définit* le comportement attendu. »

```
  ┌──────────────────────────────────────────────────────┐
  │                                                      │
  │   🔴 RED                                             │
  │   Écrire un test qui ÉCHOUE                          │
  │   → Le test décrit CE QUE le code doit faire         │
  │   → Le test NE PASSE PAS (c'est normal !)            │
  │                                                      │
  │           │                                          │
  │           ▼                                          │
  │                                                      │
  │   🟢 GREEN                                           │
  │   Écrire le code MINIMUM pour faire passer le test   │
  │   → Pas d'optimisation                               │
  │   → Pas de code « au cas où »                        │
  │   → Le plus simple, le plus stupide, le plus rapide  │
  │                                                      │
  │           │                                          │
  │           ▼                                          │
  │                                                      │
  │   🔵 REFACTOR                                        │
  │   Améliorer le code SANS casser les tests            │
  │   → Renommer, extraire des fonctions, simplifier     │
  │   → Les tests sont votre filet de sécurité           │
  │                                                      │
  │           │                                          │
  │           └──────────── Recommencer ────────────→ 🔴 │
  │                                                      │
  └──────────────────────────────────────────────────────┘
```

### Les 3 règles du TDD (Uncle Bob)

Robert C. Martin (Uncle Bob) a formalisé 3 règles strictes :

1. **Tu ne peux pas écrire de code de production** tant qu'il n'y a pas un test qui échoue
2. **Tu ne peux pas écrire plus de test** que ce qui est nécessaire pour échouer (et ne pas compiler compte comme échouer)
3. **Tu ne peux pas écrire plus de code de production** que ce qui est nécessaire pour faire passer le test

> 💬 **À dire :** « Ça semble ultra-rigide. En pratique, ça crée un rythme très agréable : test, code, test, code — des cycles de 1-2 minutes. C'est comme un jeu. »

### Pourquoi écrire les tests AVANT ?

| Test après le code (classique) | Test avant le code (TDD) |
|-------------------------------|-------------------------|
| On écrit le code, puis on se dit « bon, faudrait tester… » | Le test est le PREMIER citoyen — il guide le design |
| On teste ce qu'on a codé (biais de confirmation) | On teste ce qu'on VEUT que le code fasse |
| On oublie les cas limites | Les cas limites émergent naturellement test après test |
| 20% de couverture en moyenne | 80-100% de couverture mécaniquement |
| Le code est souvent difficilement testable | Le code est testable PAR DESIGN (puisque le test existe en premier) |

### Les bénéfices du TDD

1. **Filet de sécurité** : si je casse quelque chose, je le sais en secondes
2. **Documentation vivante** : les tests décrivent le comportement attendu
3. **Meilleur design** : code testable = code découplé = bon design
4. **Confiance** : je peux refactorer sans peur
5. **Rythme** : les micro-cycles donnent une sensation de progression constante

> 🎓 **Lien avec la suite :** « Dans la Refactoring Race tout à l'heure, les tests existants seront votre filet de sécurité. Sans eux, refactorer serait du suicide. C'est pour ça que les tests sont si importants. »

---

## 6. 🔄 Intégration Continue

> 💬 **À dire :** « On ne va pas pratiquer la CI aujourd'hui, mais c'est une pratique XP fondamentale que vous utiliserez (ou utilisez déjà) en alternance. »

### Le concept

**Intégrer** = fusionner son code avec le code de l'équipe
**Continue** = le faire **plusieurs fois par jour** (pas une fois par mois !)

### Le problème sans CI

```
Développeur A travaille 3 semaines sur sa branche
Développeur B travaille 3 semaines sur sa branche
        ↓
Jour de la fusion : 💥 MERGE HELL
        ↓
2 jours pour résoudre les conflits
Bug introduits, rien ne marche
```

### Le principe avec CI

```
Développeur A commit 3 fois par jour
Développeur B commit 3 fois par jour
        ↓
Un serveur CI (Jenkins, GitHub Actions, GitLab CI)
lance automatiquement les tests à chaque commit
        ↓
Si un test échoue → ⚠️ ALERTE immédiate
On corrige en 5 min (le changement est petit)
```

### Le pipeline CI typique

```
  Commit → Build → Tests unitaires → Tests d'intégration → [Déploiement auto]
                         ✅/❌             ✅/❌                  ✅/❌
```

**Règle d'or :** si le build est cassé, **toute l'équipe s'arrête** pour le réparer. Un build cassé = la priorité #1.

> 🎓 **Question à poser :** « Qui utilise déjà un outil de CI dans son alternance ? Jenkins ? GitHub Actions ? GitLab CI ? » → Faire répondre, ça crée du lien avec leur vécu.

---

## 7. 🧹 Refactoring

> 💬 **À dire :** « Le refactoring, c'est ce que vous allez faire dans la Refactoring Race. Mais d'abord, comprenons bien ce que c'est — et surtout ce que ce n'est PAS. »

### Définition

> **Refactoring** = modifier la structure interne du code **sans changer son comportement observable**.

| Ce que c'est ✅ | Ce que ce n'est PAS ❌ |
|-----------------|----------------------|
| Renommer une variable `x` en `totalPrice` | Ajouter une nouvelle fonctionnalité |
| Extraire une fonction de 50 lignes en 3 petites fonctions | Corriger un bug |
| Supprimer du code dupliqué | Réécrire tout from scratch |
| Simplifier une condition complexe | Changer le comportement du code |

**Le test :** après un refactoring, **tous les tests doivent toujours passer**. Si un test échoue, ce n'est pas un refactoring — c'est une modification.

### Les « Code Smells » courants

> 💬 **À dire :** « Un code smell, c'est un signe que quelque chose pue dans le code. Ça ne veut pas dire que c'est un bug — le code marche. Mais ça sent mauvais. »

| Code Smell | Signe | Solution |
|-----------|-------|---------|
| 🏔️ **Fonction trop longue** | > 20 lignes | Extraire en sous-fonctions |
| 📝 **Noms cryptiques** | `x`, `d`, `calc`, `tmp` | Renommer avec intention : `totalPrice`, `shippingCost` |
| 🔁 **Code dupliqué** | Copier-coller | Extraire dans une fonction commune |
| 🎪 **Trop de paramètres** | `f(a, b, c, d, e, f, g)` | Regrouper dans un objet / classe |
| 🏗️ **Conditions imbriquées** | `if if if else if` | Guard clauses, early return, polymorphisme |
| 🧱 **Classe/fichier trop gros** | > 200-300 lignes | Découper en responsabilités |

> 🎓 **Teaser :** « Tout à l'heure vous allez recevoir un code qui a TOUS ces smells. Votre mission : le nettoyer en 20 minutes. »

### La dette technique

**Analogie financière :**
- Code sale = **dette** contractée
- Chaque fois qu'on touche ce code = **intérêts** à payer (temps perdu, bugs)
- Plus on attend pour rembourser = plus la dette **s'accumule**
- Refactorer = **rembourser** la dette

```
            Effort pour ajouter une feature
                    │
            Élevé   │                    ╱ Sans refactoring
                    │                 ╱    (dette qui s'accumule)
                    │              ╱
                    │           ╱
                    │        ╱
                    │     ╱───────────── Avec refactoring régulier
            Faible  │  ╱                 (dette maîtrisée)
                    │╱
                    └──────────────────────→ Temps
```

> 💬 **À dire :** « En XP, on ne "planifie" pas le refactoring. C'est intégré dans le cycle TDD : Red-Green-**Refactor**. On refactore à chaque cycle, en continu. C'est comme se brosser les dents — on ne planifie pas une semaine de brossage, on le fait tous les jours. »

---

## 8. 📋 Planning Game

> 💬 **À dire :** « Vous avez déjà pratiqué le Planning Game ce matin — c'est le Planning Poker ! C'est une pratique qui vient de l'XP. »

### Le concept

Le **Planning Game** est la pratique XP pour l'estimation et la planification. C'est un jeu de **négociation** entre le client (qui définit le scope et les priorités) et l'équipe (qui estime l'effort).

| Le client décide | L'équipe décide |
|------------------|----------------|
| Quelles features | Combien de temps |
| Les priorités | Les risques techniques |
| La date de release | Combien on peut mettre dans un sprint |
| Les critères d'acceptation | L'architecture et le design |

**Règle fondamentale :** le client ne peut PAS dire à l'équipe combien de temps ça prend. L'équipe ne peut PAS dire au client ce qui a de la valeur.

> 🎓 **Lien avec le vécu :** « Ce matin, pendant le Planning Poker, c'est exactement ça que vous avez fait : les équipes estiment, le PO priorise. C'est la pratique XP du Planning Game, adoptée par Scrum. »

---

## 9. 🔗 XP + Scrum + Kanban : comment ça s'articule

> 💬 **À dire :** « En résumé, les 3 frameworks ne sont pas en compétition. Ils se complètent. »

```
  ┌─────────────────────────────────────────────────────┐
  │                                                     │
  │   SCRUM                                             │
  │   L'organisation du projet                          │
  │   (Sprints, rôles, événements)                      │
  │                                                     │
  │   ┌───────────────────────────────────────────┐     │
  │   │                                           │     │
  │   │   XP                                      │     │
  │   │   Les pratiques d'ingénierie              │     │
  │   │   (TDD, Pair Programming, CI, Refactoring)│     │
  │   │                                           │     │
  │   └───────────────────────────────────────────┘     │
  │                                                     │
  └─────────────────────────────────────────────────────┘
  
  ┌─────────────────────────────────────────────────────┐
  │   KANBAN                                            │
  │   La visualisation et la gestion du flux            │
  │   (Tableau, WIP, métriques)                         │
  │   → Peut se superposer à Scrum et/ou XP             │
  └─────────────────────────────────────────────────────┘
```

**Exemple concret d'une équipe qui combine les 3 :**
- Elle fait des **Sprints de 2 semaines** (Scrum)
- Elle code en **Pair Programming** et en **TDD** (XP)
- Elle a un **tableau Kanban** avec des limites WIP pour visualiser le flux dans le sprint (Kanban)
- Elle fait une **rétro** à chaque fin de sprint (Scrum) pour améliorer ses **pratiques techniques** (XP)

---

## 10. 🔴🟢🔵 Live Coding : FizzBuzz en TDD

> **Durée :** 20 min
> **Le formateur code en direct** devant les étudiants, en expliquant chaque étape.
> Les étudiants peuvent suggérer les tests à écrire.

### Les règles de FizzBuzz

Écrire une fonction `fizzbuzz(n)` qui :
- Retourne `"Fizz"` si `n` est divisible par 3
- Retourne `"Buzz"` si `n` est divisible par 5
- Retourne `"FizzBuzz"` si `n` est divisible par 3 ET par 5
- Retourne le nombre en string sinon

### Étape par étape (guide formateur)

> 💡 **Important :** ne PAS montrer toutes les étapes d'avance. Demander aux étudiants : « Quel est le test le plus simple qu'on pourrait écrire ? »

---

#### Cycle 1 — Le cas le plus simple

**🔴 RED — Écrire le test :**
```python
# test_fizzbuzz.py
from fizzbuzz import fizzbuzz

def test_1_returns_1():
    assert fizzbuzz(1) == "1"
```

**Lancer le test → ❌ ÉCHEC** (le fichier `fizzbuzz.py` n'existe même pas)

> 💬 « Le test échoue. C'est la phase RED. C'est normal et c'est BIEN. Maintenant, quel est le code le plus simple pour faire passer ce test ? »

**🟢 GREEN — Code minimum :**
```python
# fizzbuzz.py
def fizzbuzz(n):
    return "1"
```

**Lancer le test → ✅ PASSE**

> 💬 « Oui, `return "1"` c'est ridicule. Mais ça fait passer le test ! C'est ça la discipline du TDD : le code le plus simple. On complexifiera quand un test nous y forcera. »

**🔵 REFACTOR** → Rien à refactorer pour l'instant.

---

#### Cycle 2 — Forcer la généralisation

**🔴 RED :**
```python
def test_2_returns_2():
    assert fizzbuzz(2) == "2"
```

**→ ❌ ÉCHEC** (retourne "1" au lieu de "2")

**🟢 GREEN :**
```python
def fizzbuzz(n):
    return str(n)
```

> 💬 « Maintenant on est FORCÉ de généraliser. Le test pour 2 nous oblige à ne plus hard-coder "1". C'est le pouvoir du TDD : les tests guident le design. »

---

#### Cycle 3 — Fizz

> 💬 « OK, quel est le prochain cas intéressant ? » → Les étudiants devraient proposer le cas "divisible par 3".

**🔴 RED :**
```python
def test_3_returns_fizz():
    assert fizzbuzz(3) == "Fizz"
```

**→ ❌ ÉCHEC** (retourne "3")

**🟢 GREEN :**
```python
def fizzbuzz(n):
    if n % 3 == 0:
        return "Fizz"
    return str(n)
```

**→ ✅ PASSE**

---

#### Cycle 4 — Buzz

**🔴 RED :**
```python
def test_5_returns_buzz():
    assert fizzbuzz(5) == "Buzz"
```

**🟢 GREEN :**
```python
def fizzbuzz(n):
    if n % 3 == 0:
        return "Fizz"
    if n % 5 == 0:
        return "Buzz"
    return str(n)
```

---

#### Cycle 5 — FizzBuzz (le piège !)

> 💬 « Attention, quel nombre est divisible par 3 ET par 5 ? » → 15

**🔴 RED :**
```python
def test_15_returns_fizzbuzz():
    assert fizzbuzz(15) == "FizzBuzz"
```

**→ ❌ ÉCHEC** (retourne "Fizz" car 15 % 3 == 0 est testé en premier)

> 💬 « Le test nous montre un BUG qu'on n'aurait peut-être pas vu ! L'ordre des conditions compte. »

**🟢 GREEN :**
```python
def fizzbuzz(n):
    if n % 3 == 0 and n % 5 == 0:
        return "FizzBuzz"
    if n % 3 == 0:
        return "Fizz"
    if n % 5 == 0:
        return "Buzz"
    return str(n)
```

---

#### Cycle 6 — Refactor !

> 💬 « Tous les tests passent. Maintenant, est-ce qu'on peut améliorer le code ? Il y a de la duplication : `n % 3 == 0` apparaît 2 fois. »

**🔵 REFACTOR :**
```python
def fizzbuzz(n):
    result = ""
    if n % 3 == 0:
        result += "Fizz"
    if n % 5 == 0:
        result += "Buzz"
    return result if result else str(n)
```

**Relancer TOUS les tests → ✅ TOUT PASSE**

> 💬 « On a refactoré et les tests nous confirment qu'on n'a rien cassé. C'est le filet de sécurité du TDD. »

---

#### Tests supplémentaires (si le temps le permet)

```python
def test_6_returns_fizz():
    assert fizzbuzz(6) == "Fizz"

def test_10_returns_buzz():
    assert fizzbuzz(10) == "Buzz"

def test_30_returns_fizzbuzz():
    assert fizzbuzz(30) == "FizzBuzz"

def test_7_returns_7():
    assert fizzbuzz(7) == "7"
```

> 💬 « Ces tests passent déjà tous sans modifier le code — ça nous **confirme** que notre implémentation est correcte pour les cas qu'on n'avait pas encore testés. »

---

### Code final

```python
# fizzbuzz.py
def fizzbuzz(n):
    result = ""
    if n % 3 == 0:
        result += "Fizz"
    if n % 5 == 0:
        result += "Buzz"
    return result if result else str(n)
```

```python
# test_fizzbuzz.py
from fizzbuzz import fizzbuzz

def test_1_returns_1():
    assert fizzbuzz(1) == "1"

def test_2_returns_2():
    assert fizzbuzz(2) == "2"

def test_3_returns_fizz():
    assert fizzbuzz(3) == "Fizz"

def test_5_returns_buzz():
    assert fizzbuzz(5) == "Buzz"

def test_15_returns_fizzbuzz():
    assert fizzbuzz(15) == "FizzBuzz"

def test_6_returns_fizz():
    assert fizzbuzz(6) == "Fizz"

def test_10_returns_buzz():
    assert fizzbuzz(10) == "Buzz"

def test_30_returns_fizzbuzz():
    assert fizzbuzz(30) == "FizzBuzz"

def test_7_returns_7():
    assert fizzbuzz(7) == "7"
```

---

## 🎯 Transition vers l'atelier

> 💬 **À dire à la fin du live coding :**
>
> « Vous venez de voir le cycle Red-Green-Refactor en action. Maintenant c'est votre tour ! Vous allez coder en binômes avec la technique Ping-Pong TDD. Le kata sera un peu plus corsé — convertir des nombres en chiffres romains. Même principe : un écrit le test, l'autre code. On change à chaque cycle. Prêts ? »

---

## 📚 Références pour aller plus loin

- Beck, K. (2004). *Extreme Programming Explained: Embrace Change* (2nd ed.). Addison-Wesley.
- Martin, R.C. (2008). *Clean Code: A Handbook of Agile Software Craftsmanship*. Prentice Hall.
- Beck, K. (2002). *Test-Driven Development: By Example*. Addison-Wesley.
- Fowler, M. (2018). *Refactoring: Improving the Design of Existing Code* (2nd ed.). Addison-Wesley.

