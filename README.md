# 📖 README — Cours Méthodologies Agile

> **Module :** BC04 — Gérer les projets numériques et collaborer à l'amélioration continue des SI
> **Durée :** 1,5 jours (12 heures) — ½ journée + 1 journée complète | **Public :** Bac+3 Informatique — Alternants

---

## 📁 Structure du projet

```
src/
├── plan-de-cours.md              # 📅 Plan détaillé heure par heure (½ journée + journée complète)
├── materiel.md                    # 🧰 Liste complète du matériel à préparer
├── evaluation.md                  # 📊 Grille d'évaluation par compétence (C29-C32)
│
├── fiches-activites/              # 🎮 Fiches détaillées de chaque activité/jeu
│   ├── 01-brainstorming-agilite.md    # 🧠 Brainstorming « C'est quoi l'Agilité ? »
│   ├── 02-jeu-kapla.md               # 🏗️ Jeu Kapla : Cycle en V puis Agile
│   ├── 03-atelier-us-priorisation.md  # 🔧 Atelier US + Priorisation + Chiffrage
│   ├── 04-ball-point-game.md          # 🏐 Ball Point Game
│   ├── 05-restaurant-kanban.md        # 🍽️ Restaurant Kanban
│   ├── 06-pair-programming-tdd.md     # 👥 Pair Programming & TDD
│   ├── 07-refactoring-race.md         # 🏁 Refactoring Race
│   ├── 08-jeopardy-agile.md           # 🏆 Jeopardy Agile (Quiz Final)
│   └── 09-marshmallow-challenge.md    # 🍬 Marshmallow Challenge (optionnel)
│
└── supports/                      # 📑 Supports pédagogiques
    ├── structure-slides.md            # 📊 Structure des 5 slide decks
    ├── manifeste-agile-quiz.md        # 📖 16 questions quiz + explications (4 valeurs + 12 principes)
    ├── scrum-quiz.md                  # 🏉 15 questions quiz + explications (rôles, événements, artefacts)
    ├── templates/
    │   ├── user-story-card.md         # 📇 Template carte User Story
    │   ├── planning-poker-cards.md    # 🃏 Cartes Planning Poker à imprimer
    │   └── refactoring-score.md       # 🏁 Grille de scoring Refactoring Race
    ├── refactoring-race/
    │   ├── spaghetti.py               # 💻 Code spaghetti Python (à refactorer)
    │   └── test_spaghetti.py          # 🧪 Tests (ne pas casser !)
    └── katas/
        └── roman-numerals/
            ├── roman.py               # 💻 Starter code kata
            └── test_roman.py          # 🧪 Premier test + progression
```

---

## 🚀 Comment utiliser ce plan

### 1. Avant la formation
- [ ] Lire `plan-de-cours.md` entièrement
- [ ] Vérifier la liste dans `materiel.md` et tout préparer (notamment les Kapla !)
- [ ] Créer les quiz Kahoot/Mentimeter à partir du Manifeste Agile
- [ ] Créer les slides à partir de `supports/structure-slides.md`
- [ ] Imprimer les templates depuis `supports/templates/`
- [ ] Imprimer les photos secrètes Kapla : château fort + base lunaire (voir fiche `02-jeu-kapla.md`)
- [ ] Installer Python + pytest sur les PCs des étudiants
- [ ] Copier les fichiers `supports/refactoring-race/` et `supports/katas/` sur les PCs

### 2. Pendant la formation
- Suivre le plan heure par heure
- Consulter la fiche activité détaillée pour chaque jeu/atelier
- Remplir la grille `evaluation.md` au fil des observations

### 3. Après la formation
- Compléter les grilles d'évaluation
- Récolter les photos des activités (Kapla, tableaux Kanban, etc.)
- Envoyer les ressources complémentaires aux étudiants

---

## 📊 Couverture du référentiel

| Compétence | Couverte par |
|-----------|-------------|
| **C29** | 11 activités |
| **C30** | 7 activités |
| **C31** | 4 activités |
| **C32** | 6 activités |

| Exercice du référentiel | Couvert par |
|------------------------|------------|
| Exercice 1 (Valeurs Agile) | Brainstorming + Manifeste Agile Quiz |
| Exercice 2 (Scrum) | Jeu Kapla + Cours Scrum + Atelier US |
| Exercice 3 (Kanban) | Restaurant Kanban (simulation + construction express) |
| Exercice 4 (XP) | Pair Programming TDD + Refactoring Race |
| Exercice 5 (Adaptation) | Cours Scrum + Jeu Kapla |

---

## 📚 Bibliographie

- Peliks, G. (2015). *La méthode Agile dans la gestion de projet*. Dunod.
- Aubry, C. (2018). *Scrum : le guide pratique*. D-BookeR.
- Kniberg, H. (2014). *Kanban et Scrum, tirer le meilleur des deux*. Norsys.
- Beck, K. (2004). *Extreme Programming Explained*. Addison-Wesley.
- Sutherland, J. (2014). *Scrum: The Art of Doing Twice the Work in Half the Time*. Crown.
