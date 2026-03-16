# 🍽️ Fiche Activité — Le Restaurant Kanban

> **Session :** Journée complète | **Horaire :** 11h30–12h15 | **Durée :** 45 min

---

## 🎯 Objectif pédagogique
- Comprendre les principes fondamentaux de Kanban par l'analogie du restaurant
- Expérimenter l'impact des limites WIP sur le flux de travail
- Mesurer le Lead Time et comprendre son importance
- Concevoir un tableau Kanban avec swimlanes et priorités

## 🏷️ Compétences : C29, C30, C31

## 👥 Format : Toute la classe participe, divisée en rôles

---

## 📦 Matériel nécessaire
- 30-40 cartes bristol (petites, format carte postale)
- Grand tableau au mur (ou feuille A0)
- Post-its
- Marqueurs
- Chronomètre
- Feuille de suivi des métriques

---

## 📋 Déroulé détaillé

### Phase 1 — La métaphore (15 min, cours interactif)

**Analogie Restaurant → Projet IT :**

| Restaurant | Kanban / Projet IT |
|-----------|-------------------|
| Les commandes clients | Les tickets / tâches |
| La cuisine | Le workflow de développement |
| Commande reçue → Prépa → Cuisson → Dressage → Service | Backlog → Analyse → Dev → Test → Done |
| Le nombre de feux de cuisson | La **limite WIP** |
| Temps entre commande et service | Le **Lead Time** |
| Le serveur débordé | Le **goulot d'étranglement** |
| Trop de commandes en même temps | **Pas de limite WIP** → chaos ! |

**Principes Kanban à présenter :**
1. **Visualiser** le flux de travail
2. **Limiter** le travail en cours (WIP)
3. **Gérer** le flux
4. **Rendre explicites** les règles
5. **Améliorer** de manière collaborative

### Phase 2 — Simulation physique (20 min)

#### Setup
Installer un tableau Kanban « Restaurant » au mur :

```
| Commande reçue | En préparation | Cuisson | Dressage | Servi ✅ |
|----------------|---------------|---------|----------|---------|
|                |               |         |          |         |
```

#### Les cartes commandes
Préparer des cartes avec différentes complexités :
- 🍔 Burger simple (petite tâche) — ⏱️ 15 sec de « cuisson »
- 🍕 Pizza (tâche moyenne) — ⏱️ 30 sec de « cuisson »
- 🥘 Plat gastronomique (grosse tâche) — ⏱️ 45 sec de « cuisson »

#### Attribution des rôles
- **2-3 Serveurs** : prennent les commandes et les placent dans « Commande reçue »
- **2-3 Cuisiniers** : déplacent les cartes dans le workflow
- **1 Maître d'hôtel** : observe et note les métriques
- **Le reste** : les clients qui passent commande

#### Round 1 — Sans limite WIP (8 min)
- Les clients donnent leurs commandes en continu (un toutes les 10 secondes)
- Les cuisiniers traitent comme ils peuvent
- **PAS de limite WIP** : tout s'empile !
- Le Maître d'hôtel note :
  - Le temps de traitement de chaque commande (Lead Time)
  - Le nombre de commandes en cours simultanément
  - Les blocages

**⏸️ Pause observation (2 min)** : qu'observe-t-on ?
- File d'attente qui explose ?
- Cuisiniers stressés ?
- Erreurs ?

#### Round 2 — Avec limite WIP (8 min)
- **Limite WIP = 2 par colonne** (sauf Commande reçue et Servi)
- Si une colonne est pleine → le poste précédent ATTEND (flux tiré !)
- Mêmes métriques

**⏸️ Comparaison** : afficher les 2 résultats côte à côte

### Phase 3 — Débrief + Construction Express (15 min)

| Métrique | Round 1 (sans WIP) | Round 2 (avec WIP) |
|----------|--------------------|--------------------|
| Lead Time moyen | ___ secondes | ___ secondes |
| Commandes servies | ___ | ___ |
| Commandes « en cours » max | ___ | ___ |
| Erreurs / blocages | ___ | ___ |

**Questions :**
- Quel round était le moins stressant ?
- Quel round a servi les clients plus rapidement ?
- Que se passe-t-il quand on travaille sur trop de choses en même temps ?

**Concepts à formaliser :**
- **Lead Time** : temps total du début à la fin
- **Cycle Time** : temps passé en « traitement actif »
- **Throughput** : nombre d'items terminés par unité de temps
- **Cumulative Flow Diagram** : montre visuellement les encours

**Construction Express (5 min) :**
- Chaque équipe enrichit rapidement son tableau en ajoutant des **swimlanes** et des **priorités** (gommettes couleur)
- Quand utiliser Kanban vs Scrum ? Discussion rapide

---

## 💡 Tips formateur
- **Fun** : jouer le rôle du client difficile (« Où est ma pizza ?! Ça fait 10 minutes ! »)
- Les cuisiniers doivent physiquement déplacer les cartes — ça crée du mouvement
- Prendre des photos du tableau à la fin de chaque round
- Si le groupe est grand, faire 2 « restaurants » en parallèle

## 🔄 Variantes
- **Kanban Pizza Game** (version plus élaborée avec des pizzas en papier à découper)
- **Version digitale** : utiliser Trello en live avec les cartes
- **Ajout de perturbation** : « Le four est en panne ! » → seul le micro-ondes marche (capacité réduite)

