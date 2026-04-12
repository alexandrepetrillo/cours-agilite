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

#### Le double système : Ticket physique + Post-it Kanban

Le jeu repose sur **deux objets distincts par commande** qui avancent en parallèle :

| Objet | C'est quoi | Où il vit | Qui le manipule |
|-------|-----------|-----------|-----------------|
| 🎫 **Ticket de commande** (carte bristol) | Le « plat » physique qui traverse la cuisine | Se déplace **de table en table** entre les postes | Les cuisiniers à chaque poste |
| 📌 **Post-it Kanban** (post-it coloré) | La représentation visuelle de la commande sur le tableau | Collé sur le **tableau Kanban au mur** | Le Serveur (ou le Maître d'hôtel) |

**Pourquoi les deux ?**
- Le **ticket physique** = c'est le travail réel (comme du code en cours de développement)
- Le **post-it au mur** = c'est la visualisation du flux (comme un board Jira/Trello)
- L'un ne va pas sans l'autre : on ne déplace jamais un post-it sans que le ticket ait réellement changé de poste, et inversement

#### Cycle de vie d'une commande (les 2 objets en parallèle)

```
  ÉTAPE                  🎫 TICKET PHYSIQUE              📌 POST-IT KANBAN
  ─────                  ──────────────────              ─────────────────
  
  1. Le CLIENT remplit    Le client coche le plat         (rien encore)
     un ticket bristol    sur le ticket et le donne
                          au Serveur
  
  2. Le SERVEUR reçoit    Le serveur note l'heure         Le serveur CRÉE un post-it :
     la commande          de début sur le ticket          → écrit "#5 🍕" dessus
                          et le dépose au 1er poste       → le colle dans la colonne
                          (table Préparation)             "Commande reçue" au mur
  
  3. Un CUISINIER PRÉPA   Le cuisinier prend le ticket    Le serveur (ou le Maître
     commence à           de la pile sur sa table et      d'hôtel) DÉPLACE le post-it
     travailler           dessine les ingrédients au dos  vers la colonne "En prépa"
  
  4. Prépa terminée →     Le cuisinier signe "Prépa OK"   Le post-it est DÉPLACÉ
     passage en Cuisson   et POSE le ticket sur la        vers la colonne "Cuisson"
                          table du poste Cuisson
  
  5. Cuisson terminée →   Le cuisinier signe "Cuisson OK" Le post-it est DÉPLACÉ
     passage en Dressage  et PASSE le ticket au           vers la colonne "Dressage"
                          poste Dressage
  
  6. Dressage OK →        Le dresseur vérifie, signe      Le post-it est DÉPLACÉ
     Service              et donne le ticket au Serveur   vers la colonne "Servi ✅"
  
  7. Le SERVEUR ramène    Le serveur note l'heure de fin  Le post-it reste dans
     le plat au client    et rend le ticket au client     "Servi ✅"
```

 > 💡 **Qui déplace les post-its ?** En pratique, c'est le **Serveur** ou le **Maître d'hôtel** qui fait les allers-retours entre les postes et le mur. Si vous avez un grand groupe, le Maître d'hôtel se concentre sur le tableau et les métriques, tandis que le Serveur lui signale quand un ticket change de poste. Dans un petit groupe, une seule personne peut faire les deux.

#### 📢 Le système d'annonces vocales (CRUCIAL pour le jeu)

**Problème :** le Maître d'hôtel est posté près du tableau Kanban au mur. Comment sait-il qu'un ticket vient de changer de poste dans la cuisine ?

**Règle obligatoire — chaque cuisinier ANNONCE à voix haute :**

Quand un cuisinier **prend** un ticket pour travailler dessus ou **passe** un ticket au poste suivant, il **crie** le numéro et la destination :

| Moment | Le cuisinier crie | Le Maître d'hôtel fait |
|--------|-------------------|----------------------|
| Prépa prend un ticket | 🗣️ « **Ticket #5 en prépa !** » | Déplace le post-it #5 vers « En prépa » |
| Prépa termine et passe au poste suivant | 🗣️ « **Ticket #5 passe en cuisson !** » | Déplace le post-it #5 vers « Cuisson » |
| Cuisson terminée | 🗣️ « **Ticket #5 passe en dressage !** » | Déplace le post-it #5 vers « Dressage » |
| Dressage OK, prêt à servir | 🗣️ « **Ticket #5 servi !** » | Déplace le post-it #5 vers « Servi ✅ » |

> 🎭 **Ce qui va se passer en Round 1 :**
> - Les annonces vont se chevaucher, le Maître d'hôtel va être **noyé** (« Attends, c'est lequel ? Le #3 ou le #8 ? »)
> - Il va prendre du retard, le tableau Kanban ne reflétera plus la réalité → **c'est exactement le problème qu'on veut montrer** : sans visibilité, on perd le contrôle !
> - Le formateur peut souligner ce point au débrief : « Votre tableau Kanban était-il fiable ? Non ? Alors comment piloter un projet si votre board Jira n'est pas à jour ? »
>
> 🎯 **Ce qui va se passer en Round 2 (avec WIP) :**
> - Beaucoup moins de tickets en circulation simultanément → le Maître d'hôtel **arrive à suivre**
> - Le tableau reflète la réalité → on peut **vraiment** piloter le flux
> - C'est la démonstration vivante que limiter le WIP améliore aussi la **visibilité**

**Position du Maître d'hôtel :** il se tient **debout à côté du tableau Kanban**, face à la cuisine, pour entendre les annonces et déplacer les post-its en temps réel. Il a un marqueur en main pour noter les heures si besoin.

#### Disposition physique de la salle

Installer **5 postes** séparés dans la salle, en ligne ou en U. Chaque poste est une table ou un bout de table avec le matériel nécessaire. Le tableau Kanban au mur suit l'avancement.

```
                        🧑‍🍳 CUISINE (postes physiques)
                        
 👥 Clients    📝 Prise de     ✏️ Préparation   ⏱️ Cuisson      🍽️ Dressage     ✅ Service
 (assis à      commande        (TABLE 1)        (TABLE 2)       (TABLE 3)       → retour
  leur place)  (debout)                                                          au client

  Le ticket bristol se déplace physiquement →→→→→→→→→→→→→→→→→→→→→→→→→→→ de table en table

                   ══════ TABLEAU KANBAN AU MUR ══════
                   ┌──────────┬──────────┬──────────┬──────────┬──────────┐
                   │ Commande │ En prépa  │ Cuisson  │ Dressage │ Servi ✅ │
                   │  reçue   │          │          │          │          │
                   │  📌📌📌  │  📌📌    │  📌      │          │  📌📌   │
                   └──────────┴──────────┴──────────┴──────────┴──────────┘
                   Les post-its se déplacent au mur EN MÊME TEMPS
                   que le ticket physique avance entre les postes
```

#### Préparation du tableau Kanban avant le jeu

Avant de démarrer, dessiner au marqueur sur le tableau/feuille A0 :
1. **5 colonnes** : `Commande reçue` | `En prépa` | `Cuisson` | `Dressage` | `Servi ✅`
2. Laisser de la place pour coller les post-its dans chaque colonne
3. **Pour le Round 2**, prévoir un espace pour écrire les limites WIP au-dessus de chaque colonne

#### Les post-its Kanban (à préparer à l'avance)

Préparer **une pile de post-its vierges** à côté du tableau. Le Serveur y écrit rapidement le numéro du ticket et l'emoji du plat quand il reçoit une commande :

```
┌─────────────┐
│ #5  🍕      │    ← Le serveur écrit ça en 2 secondes
│             │       quand il reçoit le ticket du client
└─────────────┘
```

> 🎨 **Astuce couleur** : utiliser des post-its de couleurs différentes par type de plat (jaune = burger, orange = pizza, rose = gastronomique) pour repérer visuellement la complexité sur le tableau.

#### Les tickets de commande (cartes bristol)

Chaque carte bristol est un ticket pré-imprimé ou préparé à la main. C'est l'objet physique qui **circule entre les postes** :

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

> ⚠️ **Important** : le numéro du ticket (#1, #2, #3…) doit correspondre au numéro sur le post-it Kanban ! C'est ce qui permet de faire le lien entre le « travail réel » et la « visualisation ».

#### Attribution des rôles

| Rôle | Nb personnes | Ce qu'ils font physiquement |
|------|-------------|---------------------------|
| 👥 **Clients** | 5-8 | Assis à leur « table ». Choisissent un plat du menu, remplissent un ticket et le donnent au Serveur. Attendent leur plat. |
| 🏃 **Serveur(s)** | 1-2 | Font la navette entre les clients et la cuisine. Récupèrent les tickets des clients, **notent l'heure de début** sur le ticket bristol et le déposent au 1er poste (table Prépa). **En même temps**, prennent un post-it vierge, y écrivent le n° du ticket + le plat (ex: `#3 🍕`), et le collent dans la colonne « Commande reçue » au tableau Kanban au mur. Surveillent l'avancement et **déplacent les post-its** sur le tableau quand les tickets changent de poste. À la fin, ramènent le ticket fini au client et notent l'heure de fin. |
| ✏️ **Cuisiniers Prépa** | 2-3 | Au poste Préparation. **Dessinent les ingrédients** au dos du ticket (voir détail ci-dessous). Signent la case « Prépa OK ». Passent le ticket au poste suivant. |
| ⏱️ **Cuisiniers Cuisson** | 1-2 | Au poste Cuisson. **Lancent le chrono** et retournent le ticket face cachée pendant la durée requise (voir ci-dessous). Quand le temps est écoulé, signent « Cuisson OK ». Passent le ticket. |
| 🍽️ **Dresseurs** | 1-2 | Au poste Dressage. **Vérifient** que le nombre d'ingrédients dessinés correspond au plat commandé (contrôle qualité). Si c'est bon → signent « Dressage OK » + gommette verte. Si erreur → ticket renvoyé en Prépa ! |
| 📊 **Maître d'hôtel** | 1 | **Observe et mesure**. Déplace les post-its sur le tableau Kanban quand les tickets changent de poste. **Toutes les minutes**, fait un snapshot en comptant les post-its par colonne (voir grille CFD ci-dessous). Note l'heure de fin sur chaque ticket servi. Compte les métriques. |

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
4. Le Maître d'hôtel **lance un chrono** et prépare sa grille de relevé CFD (voir ci-dessous)

#### 📊 Grille de relevé pour le Cumulative Flow Diagram

Le Maître d'hôtel a une **feuille pré-imprimée** avec cette grille. **Toutes les minutes**, quand le chrono sonne (ou quand le formateur crie « SNAPSHOT ! »), il compte rapidement le nombre de post-its dans chaque colonne du tableau et le note :

```
ROUND __ (sans / avec WIP)

Temps    | Cmd reçue | En prépa | Cuisson | Dressage | Servi ✅ | TOTAL
---------|-----------|----------|---------|----------|---------|------
  T+1min |     __    |    __    |   __    |    __    |   __    |  __
  T+2min |     __    |    __    |   __    |    __    |   __    |  __
  T+3min |     __    |    __    |   __    |    __    |   __    |  __
  T+4min |     __    |    __    |   __    |    __    |   __    |  __
  T+5min |     __    |    __    |   __    |    __    |   __    |  __
  T+6min |     __    |    __    |   __    |    __    |   __    |  __
  T+7min |     __    |    __    |   __    |    __    |   __    |  __
  T+8min |     __    |    __    |   __    |    __    |   __    |  __
```

> ⏱️ **Astuce pratique :** le formateur programme une alarme toutes les minutes sur son téléphone et crie « SNAPSHOT ! ». Tout le monde se fige 5 secondes, le Maître d'hôtel compte les post-its par colonne, note, et le jeu reprend. Ça prend 10 secondes max et ça ne casse pas le rythme.

> 💡 **Le TOTAL en dernière colonne** est important : il monte à chaque nouvelle commande reçue et reste constant une fois que toutes les commandes sont dans le système. Ça représente le **scope total** du projet.

**Règles Round 1 :**
- ⚠️ **PAS de limite WIP** : chaque poste peut avoir autant de tickets en attente qu'il veut
- Le serveur **peut prendre plusieurs tickets d'un coup** auprès des clients et les déposer tous en cuisine → ça crée volontairement un embouteillage !
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
- Le serveur **ne peut prendre un nouveau ticket d'un client que s'il y a de la place** au 1er poste → fini les brassées de commandes ! Il fait un **aller-retour par ticket**
- Si le poste Cuisson a 2 tickets → le poste Prépa **NE PEUT PAS** passer son ticket fini → il ATTEND (même s'il a fini son travail !)
- C'est le **flux tiré** : on ne pousse pas, on attend qu'une place se libère en aval

**Relancer les mêmes commandes** avec les mêmes clients. Le Maître d'hôtel note les mêmes métriques.

**Ce qu'on observe en général :**
- Moins de chaos, moins de stress
- Les cuisiniers sont parfois « inactifs » (ils attendent qu'une place se libère) → et c'est NORMAL en Kanban
- Le Lead Time par ticket est souvent **meilleur** (moins d'attente dans les files)
- Moins d'erreurs au contrôle qualité (moins de pression)

### Phase 3 — Débrief + Construction Express (15 min)

#### Tableau comparatif des métriques

| Métrique | Round 1 (sans WIP) | Round 2 (avec WIP) |
|----------|--------------------|--------------------|
| Lead Time moyen | ___ secondes | ___ secondes |
| Commandes servies | ___ | ___ |
| Commandes « en cours » max | ___ | ___ |
| Erreurs / blocages | ___ | ___ |

#### 📈 Construction du Cumulative Flow Diagram (5 min)

**Après les 2 rounds**, le formateur dessine les 2 CFD au tableau (ou fait venir le Maître d'hôtel pour qu'il les dessine). C'est un **graphique à aires empilées** :

**Comment le dessiner :**
1. Axe horizontal = le temps (T+1min, T+2min, …, T+8min)
2. Axe vertical = nombre de tickets
3. Empiler les aires **de bas en haut** dans cet ordre : `Servi ✅` (en bas) → `Dressage` → `Cuisson` → `En prépa` → `Cmd reçue` (en haut)
4. Chaque aire = les valeurs relevées par le Maître d'hôtel à chaque snapshot

```
  CFD Round 1 (sans WIP)                    CFD Round 2 (avec WIP)
  
  tickets                                   tickets
  15│ ░░░░░░░░░░░░░░░░░ Cmd reçue          15│
    │ ░░░░░▓▓▓▓▓▓▓▓▓▓▓▓ En prépa             │
  10│ ░░░░░▓▓▓▓████████ Cuisson            10│ ░░▓▓████████████
    │ ░░░░░▓▓▓▓████▒▒▒▒ Dressage              │ ░░▓▓████▒▒▒▒▒▒▒▒
   5│ ░░░░░▓▓▓▓████▒▒▒▒ Servi ✅            5│ ░░▓▓████▒▒▒▒▒▒▒▒████
    │ ░░░░░▓▓▓▓████▒▒▒▒████                  │ ░░▓▓████▒▒▒▒████████
   0└───────────────────────→ temps         0└───────────────────────→ temps
    T+1  T+3  T+5  T+7                      T+1  T+3  T+5  T+7

    → Bandes LARGES = beaucoup de WIP        → Bandes FINES = peu de WIP
    → L'aire "Servi" grandit LENTEMENT       → L'aire "Servi" grandit RÉGULIÈREMENT
    → Gros ventre au milieu = goulot         → Flux régulier, pas de goulot
```

**Ce que le CFD montre visuellement :**

| Ce qu'on lit sur le CFD | Ce que ça veut dire | Round 1 vs Round 2 |
|-------------------------|--------------------|--------------------|
| **Épaisseur d'une bande** à un instant T | Nombre de tickets **dans cet état** à ce moment | Round 1 : bande « Cuisson » très épaisse (goulot). Round 2 : bandes fines et régulières |
| **Distance verticale** entre « Cmd reçue » et « Servi » | Le **WIP total** (travail en cours) | Round 1 : grande distance = beaucoup de WIP. Round 2 : petite distance = WIP maîtrisé |
| **Distance horizontale** entre « Cmd reçue » et « Servi » | Le **Lead Time** approximatif | Round 1 : large = attente longue. Round 2 : étroit = livraison rapide |
| **Pente de l'aire « Servi »** | Le **Throughput** (débit de livraison) | Round 1 : pente faible au début. Round 2 : pente régulière dès le début |

> 🎓 **Point pédagogique clé :** le CFD permet de voir **en un coup d'œil** si le flux est sain ou malade. En vrai projet, on le génère automatiquement depuis Jira/Azure DevOps. Ici, on l'a construit à la main pour comprendre ce qu'il raconte.

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

