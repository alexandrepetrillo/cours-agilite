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
- 30-40 cartes bristol (petites, format carte postale) — ce sont les **tickets de commande**
- Grand tableau au mur (ou feuille A0) — le **tableau Kanban**
- Post-its de 5 couleurs
- Marqueurs (plusieurs par poste)
- 2-3 chronomètres (téléphones)
- Gommettes ou tampons (pour la validation)
- Feuille de suivi des métriques (pour le Maître d'hôtel)
- **1 menu imprimé** (voir ci-dessous) affiché pour les clients
- **Fiches de poste** imprimées (1 par station, voir ci-dessous)

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

#### Le menu du restaurant (à afficher)

```
┌─────────────────────────────────────────────┐
│         🍽️  MENU — Chez l'Agiliste          │
│                                             │
│  🍔 Burger simple ............... 1 étoile  │
│     → 2 ingrédients à dessiner              │
│                                             │
│  🍕 Pizza ...................... 2 étoiles   │
│     → 4 ingrédients à dessiner              │
│                                             │
│  🥘 Plat gastronomique ........ 3 étoiles   │
│     → 6 ingrédients à dessiner              │
│                                             │
└─────────────────────────────────────────────┘
```

#### Disposition physique de la salle

Installer **5 postes** séparés dans la salle, en ligne ou en U. Chaque poste est une table ou un bout de table avec le matériel nécessaire. Le tableau Kanban au mur suit l'avancement.

```
                        🧑‍🍳 CUISINE (postes physiques)
                        
 👥 Clients    📝 Prise de     ✏️ Préparation   ⏱️ Cuisson      🍽️ Dressage     ✅ Service
 (assis à      commande        (TABLE 1)        (TABLE 2)       (TABLE 3)       → retour
  leur place)  (debout)                                                          au client


                   ══════ TABLEAU KANBAN AU MUR ══════
                   Les cartes se déplacent au mur EN MÊME TEMPS
                   que le ticket physique avance entre les postes
```

#### Les tickets de commande

Chaque carte bristol est un ticket pré-imprimé ou préparé à la main :

```
┌───────────────────────────────────────┐
│ 🎫 TICKET #___     ⏱️ Heure début: __ │
│                                       │
│ Plat : □ 🍔 Burger  □ 🍕 Pizza       │
│        □ 🥘 Gastronomique             │
│                                       │
│ □ Prépa OK    (signature: ___)        │
│ □ Cuisson OK  (signature: ___)        │
│ □ Dressage OK (signature: ___)        │
│                                       │
│ ⏱️ Heure fin: ___  Lead Time: ___ sec │
└───────────────────────────────────────┘
```

#### Attribution des rôles

| Rôle | Nb personnes | Ce qu'ils font physiquement |
|------|-------------|---------------------------|
| 👥 **Clients** | 5-8 | Assis à leur « table ». Choisissent un plat du menu, remplissent un ticket et le donnent au Serveur. Attendent leur plat. |
| 🏃 **Serveur(s)** | 1-2 | Font la navette. Récupèrent les tickets des clients, **notent l'heure de début** sur le ticket, le déposent au poste « Commande reçue » ET déplacent un post-it correspondant sur le tableau Kanban au mur. À la fin, ramènent le plat fini au client. |
| ✏️ **Cuisiniers Prépa** | 2-3 | Au poste Préparation. **Dessinent les ingrédients** au dos du ticket (voir détail ci-dessous). Signent la case « Prépa OK ». Passent le ticket au poste suivant. |
| ⏱️ **Cuisiniers Cuisson** | 1-2 | Au poste Cuisson. **Lancent le chrono** et retournent le ticket face cachée pendant la durée requise (voir ci-dessous). Quand le temps est écoulé, signent « Cuisson OK ». Passent le ticket. |
| 🍽️ **Dresseurs** | 1-2 | Au poste Dressage. **Vérifient** que le nombre d'ingrédients dessinés correspond au plat commandé (contrôle qualité). Si c'est bon → signent « Dressage OK » + gommette verte. Si erreur → ticket renvoyé en Prépa ! |
| 📊 **Maître d'hôtel** | 1 | **Observe et mesure**. Déplace les post-its sur le tableau Kanban quand les tickets changent de poste. Note l'heure de fin sur chaque ticket servi. Compte les métriques. |

#### Ce que chaque poste fait concrètement

**✏️ Poste Préparation — « Dessiner les ingrédients »**

Le cuisinier prépa prend le ticket et dessine au dos les ingrédients du plat. Chaque ingrédient = un **petit dessin simple** (5-10 secondes par dessin).

| Plat | Ingrédients à dessiner |
|------|----------------------|
| 🍔 Burger (2 dessins) | 1 rond (pain) + 1 carré (steak) |
| 🍕 Pizza (4 dessins) | 1 cercle (pâte) + 3 ronds dedans (tomate, fromage, champignon) |
| 🥘 Gastronomique (6 dessins) | 1 rectangle (assiette) + 1 cercle (viande) + 1 triangle (légume) + 1 vague (sauce) + 1 étoile (décoration) + 1 trait (couvert) |

> 💡 Le but n'est pas de faire du beau dessin ! Des formes simples suffisent. L'important c'est que ça prenne du **temps réel** et crée du **flux**.

**⏱️ Poste Cuisson — « Attendre le temps de cuisson »**

Le cuisinier cuisson retourne le ticket face cachée et **attend** le temps requis. Il NE PEUT PAS commencer un autre ticket pendant ce temps (il « surveille la cuisson »).

| Plat | Temps de cuisson |
|------|-----------------|
| 🍔 Burger | **15 secondes** |
| 🍕 Pizza | **30 secondes** |
| 🥘 Gastronomique | **45 secondes** |

> ⚠️ C'est ici que le **goulot d'étranglement** apparaît naturellement ! Le poste cuisson est lent → les tickets s'accumulent devant → c'est exactement le phénomène qu'on veut observer.

**🍽️ Poste Dressage — « Contrôle qualité »**

Le dresseur vérifie que le ticket est complet :
- ✅ Le bon nombre d'ingrédients est dessiné ? (2 pour burger, 4 pour pizza, 6 pour gastro)
- ✅ La case Prépa ET Cuisson sont signées ?
- Si tout est OK → gommette verte + signe « Dressage OK »
- Si erreur → **le ticket repart au poste Prépa** (rework !) avec un post-it rouge « À corriger »

#### Round 1 — Sans limite WIP (8 min)

**Mise en place :**
1. Les clients ont chacun **3 tickets** à passer (= 3 commandes successives)
2. Ils donnent leur 1er ticket au serveur dès le top départ, puis le 2ème quand ils veulent, etc.
3. Les serveurs déposent les tickets au poste « Commande reçue » dès réception

**Règles Round 1 :**
- ⚠️ **PAS de limite WIP** : chaque poste peut avoir autant de tickets en attente qu'il veut
- Les clients passent commande à leur rythme (un nouveau ticket toutes les 15-20 secondes)
- Les cuisiniers traitent dans l'ordre qu'ils veulent

**Le formateur joue le client insatisfait 🎭 :**
> « Ça fait 2 minutes que j'attends mon burger ! C'est inadmissible ! »
> « J'ai commandé avant lui et il a été servi en premier ?! »

**Le Maître d'hôtel observe et note :**
- Combien de tickets s'empilent devant chaque poste ?
- Quel poste est le plus saturé ?
- Y a-t-il des erreurs au contrôle qualité (rework) ?
- Lead Time de chaque ticket (heure fin − heure début)

**⏸️ STOP ! Gel sur place (2 min)**

Tout le monde s'arrête. On regarde le tableau Kanban au mur :
- Où sont les tickets ? (probablement entassés devant Cuisson)
- Combien de tickets « en cours » au total ?
- Combien de tickets « Servis » ?
- Le formateur fait compter à voix haute et note au tableau

#### Round 2 — Avec limite WIP (8 min)

**Nouvelle règle :** on ajoute des **limites WIP** au tableau Kanban :

```
| Commande reçue | En préparation | Cuisson    | Dressage   | Servi ✅ |
| (pas de limite)| WIP max: 2     | WIP max: 2 | WIP max: 2 | (pas de limite) |
```

**Concrètement, ça veut dire :**
- Le poste Préparation ne peut avoir que **2 tickets en cours maximum** sur sa table
- Si le poste Prépa a déjà 2 tickets → le serveur **NE PEUT PAS** déposer un nouveau ticket → il ATTEND (et le client attend aussi !)
- Si le poste Cuisson a 2 tickets → le poste Prépa **NE PEUT PAS** passer son ticket fini → il ATTEND (même s'il a fini son travail !)
- C'est le **flux tiré** : on ne pousse pas, on attend qu'une place se libère en aval

**Relancer les mêmes commandes** avec les mêmes clients. Le Maître d'hôtel note les mêmes métriques.

**Ce qu'on observe en général :**
- Moins de chaos, moins de stress
- Les cuisiniers sont parfois « inactifs » (ils attendent qu'une place se libère) → et c'est NORMAL en Kanban
- Le Lead Time par ticket est souvent **meilleur** (moins d'attente dans les files)
- Moins d'erreurs au contrôle qualité (moins de pression)

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

