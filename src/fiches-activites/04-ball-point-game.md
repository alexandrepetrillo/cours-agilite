# 🏐 Fiche Activité — Ball Point Game

> **Session :** Journée complète | **Horaire :** 10h45–11h30 | **Durée :** 45 min

---

## 🎯 Objectif pédagogique
- Comprendre les concepts de vélocité, estimation et amélioration continue
- Visualiser un burnup chart à partir de données réelles
- Pratiquer le cycle estimation → exécution → mesure → adaptation

## 🏷️ Compétences : C31, C32

## 👥 Format : Toute la classe ensemble (1 grande équipe)

---

## 📦 Matériel nécessaire
- 20-30 balles en mousse (ou balles de tennis)
- 1 chronomètre visible
- Tableau blanc + marqueurs (pour le tableau de score)
- 1 seau ou boîte pour les balles

---

## 📋 Règles du jeu

### Les règles (à afficher)
1. ✅ Chaque balle doit passer par **toutes les mains** de l'équipe
2. ✅ La balle doit revenir à la **personne de départ**
3. ✅ Chaque personne doit avoir un **temps d'air** (la balle doit quitter la main)
4. ❌ On ne peut **PAS** passer à son voisin direct (gauche ou droite)
5. ✅ Plusieurs balles peuvent circuler en même temps
6. ✅ Balle complétée (revenue au départ) = **+1 point**
7. ❌ Balle tombée au sol = **-1 point**

### Déroulé

**Préparation** : tout le monde debout en cercle. Le formateur est l'observateur.

| Phase | Durée | Activité |
|-------|-------|----------|
| **Estimation 1** | 1 min | « Combien de balles pensez-vous pouvoir compléter en 2 minutes ? » → noter au tableau |
| **Sprint 1** | 2 min | GO ! Le formateur injecte les balles une par une au début |
| **Comptage 1** | 1 min | Compter les points → noter au tableau |
| **Retro 1** | 2 min | « Comment s'améliorer ? Qu'est-ce qui a bloqué ? » |
| **Estimation 2** | 30 sec | Nouvelle estimation |
| **Sprint 2** | 2 min | GO ! |
| **Comptage 2** | 1 min | Noter |
| **Retro 2** | 2 min | « Encore mieux ! » |
| **Estimation 3** | 30 sec | Nouvelle estimation |
| **Sprint 3** | 2 min | GO ! |
| **Comptage 3** | 1 min | Noter |
| **Retro 3** | 1 min | Courte |
| **Sprint 4** | 2 min | GO ! |
| **Comptage 4** | 1 min | Noter |
| **Sprint 5** | 2 min | Sprint final ! |
| **Comptage 5** | 1 min | Noter |

### Tableau de score (à dessiner au tableau blanc)

```
| Sprint | Estimation | Résultat | Écart |
|--------|-----------|----------|-------|
|   1    |           |          |       |
|   2    |           |          |       |
|   3    |           |          |       |
|   4    |           |          |       |
|   5    |           |          |       |
```

### Débrief (10 min)

1. **Tracer la courbe de vélocité** au tableau :
   - Axe X = sprints, Axe Y = points
   - Tracer estimation (pointillés) et résultat réel (trait plein)

2. **Questions clés :**
   - La vélocité a-t-elle augmenté ? Pourquoi ?
   - Les estimations se sont-elles améliorées ? (L'écart estimation/réel se réduit-il ?)
   - Qu'avez-vous changé entre les sprints ?
   - Est-ce que quelqu'un a pris un rôle de leader naturellement ?

3. **Concepts à formaliser :**
   - **Vélocité** = nombre de points réalisés par sprint → on la trace sprint après sprint, c'est la courbe qu'on vient de dessiner
   - **Estimation** = prédire la capacité de l'équipe → elle s'améliore quand on a un historique de vélocité
   - **Burnup chart (release)** = courbe cumulative du travail fait **d'un sprint à l'autre** → tracer au tableau le cumul des points (Sprint 1 : 8, Sprint 2 : 8+14=22, Sprint 3 : 22+18=40…). Montre si on converge vers l'objectif total du projet
   - **Burndown chart (sprint)** = en vrai projet, c'est la courbe du travail **restant** au sein d'un sprint, **jour par jour**. Nos sprints de 2 min sont trop courts pour l'illustrer ici, mais c'est l'outil qu'une équipe utilise au quotidien pour savoir si elle est dans les temps
   - **Amélioration continue** = la retro entre chaque sprint permet de s'améliorer → la vélocité monte
   - **Empirisme** = on mesure pour mieux prédire (les estimations se rapprochent du réel)

4. **Schéma à dessiner au tableau :**

```
Vélocité (par sprint)          Burnup (cumulé)
pts                            pts
 |    ___                       |              ___/
 |   |   | ___                  |          ___/
 |   |   ||   |___              |      ___/
 |   |   ||   ||   |            |  ___/
 |___|___|___|___|___|          |_/________________
   S1  S2  S3  S4  S5            S1  S2  S3  S4  S5
```

---

## 💡 Tips formateur
- **Énergie** : ce jeu est très dynamique et bruyant — c'est normal !
- **Balles** : commencer avec 5-6 balles au Sprint 1, puis augmenter si l'équipe s'améliore
- **Ne pas aider** : laisser l'équipe trouver ses propres solutions
- **Observation** : noter les stratégies émergentes (formation en étoile, lancer à 2 mains, etc.)
- **Humour** : quand les balles tombent partout au Sprint 1, en rire ensemble

## 🔄 Variantes
- **Burndown intra-sprint** : lors du Sprint 4 ou 5, un observateur compte les balles complétées toutes les **30 secondes** (4 mesures pour un sprint de 2 min). On trace ensuite un mini-burndown/burnup *au sein du sprint* pour montrer la différence avec la courbe sprint-par-sprint. Ça rend le concept de burndown concret : « en vrai, votre équipe ferait ça jour par jour pendant un sprint de 2 semaines »
- **Compétitif** : diviser en 2 équipes qui font le jeu en parallèle
- **Contrainte ajoutée** : au Sprint 4, retirer une personne du cercle (« Elle est en congé ! ») → gestion de la capacité et impact sur la vélocité
- **Changer les règles** : au Sprint 3, le client change la règle (« Maintenant les balles rouges valent double ! ») → gestion du changement

