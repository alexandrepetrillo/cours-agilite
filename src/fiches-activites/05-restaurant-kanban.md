# 🍽️ Fiche Activité — Le Restaurant Kanban

> **Session :** Journée complète | **Horaire :** 11h30–12h15 | **Durée :** 45 min

---

## 🎯 Objectif pédagogique
- Comprendre les principes fondamentaux de Kanban par l'analogie du restaurant
- Expérimenter l'impact des limites WIP sur le flux de travail
- Mesurer le Lead Time et comprendre son importance
- Concevoir un tableau Kanban avec swimlanes et priorités

## 🏷️ Compétences : C29, C30, C31

## 👥 Format : 11 étudiants, toute la classe participe, divisée en rôles

---

## 📦 Matériel nécessaire
- 20-25 cartes bristol (petites, format carte postale) — ce sont les **tickets de commande** (5 clients × 4 tickets + quelques extras)
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
│     → 3 ingrédients à dessiner              │
│                                             │
│  🍕 Pizza ...................... 2 étoiles  │
│     → 5 ingrédients à dessiner              │
│                                             │
│  🥘 Plat gastronomique ........ 3 étoiles   │
│     → 8 ingrédients à dessiner              │
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

#### Attribution des rôles (11 étudiants)

> ⚠️ **Principe de calibrage :** pour que les tickets bouchonnent, la Prépa (2 personnes) doit produire **~2× plus vite** que la Cuisson (1 seule personne). C'est ce déséquilibre volontaire qui crée le goulot d'étranglement visible.

| Rôle | Nb | Pourquoi ce nombre |
|------|:--:|-------------------|
| 👥 **Clients** | 5 | 5 clients × 4 tickets = **20 commandes** au total → suffisant pour noyer le système |
| 🏃 **Serveur** | 1 | Un seul → en Round 1 il est débordé (fait partie du chaos) |
| ✏️ **Cuisiniers Prépa** | 2 | Travaillent en parallèle → débit élevé (~1 ticket toutes les 15s) |
| ⏱️ **Cuisinier Cuisson** | **1** | **⚠️ UN SEUL = LE GOULOT.** Ne peut traiter qu'1 ticket à la fois (~1 ticket toutes les 35s) |
| 🍽️ **Dresseur** | 1 | Vérification rapide (~10s) → ne bloque jamais |
| 📊 **Maître d'hôtel** | 1 | Tableau Kanban + snapshots CFD + métriques |
| 🎭 **Formateur** | (hors effectif) | Joue le client râleur + crie « SNAPSHOT ! » |
| | **= 11** | |

> 💡 **Pourquoi 4 tickets par client et pas 3 ?** Avec 20 tickets au total et 1 seul cuisinier cuisson (~35s en moyenne par ticket), il faudrait ~700s = **11,6 min** pour tout traiter. En 8 minutes de round, la cuisson ne peut traiter que ~13-14 tickets → **il restera toujours 6-7 tickets non servis** à la fin du Round 1. Le bouchon est **garanti**.

#### Ce que chaque poste fait concrètement

**✏️ Poste Préparation — « Dessiner les ingrédients »**

Le cuisinier prépa prend le ticket et dessine au dos les ingrédients du plat. Chaque ingrédient = un **petit dessin simple** (~7 secondes par dessin).

| Plat | Nb dessins | Ingrédients à dessiner | ⏱️ Temps estimé (1 personne) |
|------|:----------:|----------------------|:----------------------------:|
| 🍔 Burger | **3** | 1 demi-cercle (pain du haut) + 1 carré (steak) + 1 demi-cercle (pain du bas) | **~20s** |
| 🍕 Pizza | **5** | 1 grand cercle (pâte) + 1 vague dedans (sauce) + 3 petits ronds (tomate, fromage, champignon) | **~35s** |
| 🥘 Gastronomique | **8** | 1 rectangle (assiette) + 1 cercle (viande) + 1 triangle (légume) + 1 losange (légume 2) + 1 vague (sauce) + 1 étoile (décoration) + 1 trait (couvert) + 1 spirale (garniture) | **~55s** |

> 💡 Le but n'est pas de faire du beau dessin ! Des formes simples suffisent. L'important c'est que ça prenne du **temps réel** et crée du **flux**.
>
> 📐 **Débit Prépa à 2 personnes :** comme les 2 cuisiniers travaillent en parallèle, le poste sort ~1 ticket toutes les **12-18 secondes** en moyenne. C'est **2× plus rapide** que la Cuisson → les tickets s'accumulent devant la Cuisson.

**⏱️ Poste Cuisson — « Attendre le temps de cuisson »**

Le cuisinier cuisson retourne le ticket face cachée et **attend** le temps requis. Il NE PEUT PAS commencer un autre ticket pendant ce temps (il « surveille la cuisson »).

| Plat | Temps de cuisson |
|------|:----------------:|
| 🍔 Burger | **20 secondes** |
| 🍕 Pizza | **40 secondes** |
| 🥘 Gastronomique | **60 secondes** |

> ⚠️ **C'est ICI que ça bouchonne !** Avec 1 seule personne qui ne peut faire qu'1 ticket à la fois :
> - Débit cuisson : ~1 ticket toutes les **35 secondes** en moyenne
> - Débit prépa : ~1 ticket toutes les **15 secondes**
> - **Ratio 2,3:1** → pour chaque ticket que la cuisson termine, la prépa en a produit 2 de plus !
> - Résultat : les tickets **s'empilent physiquement** sur la table devant le poste Cuisson

**🍽️ Poste Dressage — « Contrôle qualité »**

Le dresseur vérifie que le ticket est complet (~10-15 secondes par ticket → **jamais un goulot**) :
- ✅ Le bon nombre d'ingrédients est dessiné ? (3 pour burger, 5 pour pizza, 8 pour gastro)
- ✅ La case Prépa ET Cuisson sont signées ?
- Si tout est OK → gommette verte + signe « Dressage OK »
- Si erreur → **le ticket repart au poste Prépa** (rework !) avec un post-it rouge « À corriger »

---

#### 🔢 Simulation prévisionnelle (preuve que ça bouchonne)

Voici ce qui devrait se passer en Round 1 avec les paramètres ci-dessus (5 clients, 4 tickets chacun, mix réaliste de plats) :

```
Temps   | Tickets dans   | Tickets en  | Tickets en    | Tickets     | Tickets  | Observation
        | le système     | attente     | cours de      | en attente  | servis   |
        | (total entré)  | avant Prépa | cuisson       | avant Cuiss.|          |
--------|----------------|-------------|---------------|-------------|----------|------------------
T+1min  |    6-8         |    0-1      |      1        |    2-3      |    0-1   | Ça commence à s'empiler
T+2min  |   10-12        |    0        |      1        |    4-6      |    2-3   | 🔴 BOUCHON VISIBLE
T+3min  |   14-16        |    0        |      1        |    5-7      |    4-5   | 🔴🔴 Pile énorme devant cuisson
T+4min  |   17-20        |    0        |      1        |    5-8      |    6-7   | Les clients râlent !
T+5min  |     20         |    0        |      1        |    4-6      |    8-9   | Cuisson ne rattrape pas
T+8min  |     20         |    0        |      1        |    2-4      |   13-14  | ⏸️ STOP ! ~6 tickets jamais servis
```

**Pourquoi ça marche :** à T+3min, il y a ~6 tickets physiquement empilés sur la table du cuisinier Cuisson. C'est **très visuel** et impossible à rater. Le formateur peut pointer la pile et demander : « Ça vous rappelle quelque chose dans vos projets ? »

#### Round 1 — Sans limite WIP (8 min)

**Mise en place :**
1. Les clients ont chacun **4 tickets** à passer (= 4 commandes successives = **20 tickets au total**)
2. Ils donnent leur 1er ticket au serveur dès le top départ, puis les suivants quand ils veulent
3. Le serveur dépose les tickets au poste « Commande reçue » dès réception
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
- Le Lead Time par ticket est souvent **beaucoup meilleur** (moins d'attente dans les files)
- Moins d'erreurs au contrôle qualité (moins de pression)
- Le nombre de plats servis est **à peu près le même** → c'est contre-intuitif !

> ⚠️ **Point crucial pour le formateur :** les étudiants vont souvent dire « mais on a servi moins de plats ! ». C'est **normal** et c'est le bon moment pour expliquer : le goulot (Cuisson = 1 personne) est la vraie contrainte — elle ne change pas entre les 2 rounds. Ce qui change, c'est **tout le reste** : Lead Time, stress, qualité, prévisibilité. En Round 1, on *commençait* beaucoup de choses mais on ne les *finissait* pas plus vite.

### Phase 3 — Débrief + Construction Express (15 min)

#### Tableau comparatif des métriques

| Métrique | Round 1 (sans WIP) | Round 2 (avec WIP) | Ce qu'on attend |
|----------|--------------------|--------------------|-----------------|
| Commandes servies | ___ | ___ | **≈ pareil** (le goulot est le même) |
| Lead Time moyen | ___ secondes | ___ secondes | **R2 bien meilleur** (moins d'attente en file) |
| Lead Time du 1er ticket servi | ___ secondes | ___ secondes | **≈ pareil** (le 1er passe vite dans les 2 cas) |
| Lead Time du dernier ticket servi | ___ secondes | ___ secondes | **R1 bien pire** (il a attendu longtemps dans la pile) |
| Commandes « en cours » max | ___ | ___ | **R1 : 8-10+** vs **R2 : 4-6** |
| Erreurs / rework | ___ | ___ | **R2 moins d'erreurs** (moins de pression) |
| Board Kanban fiable ? | ___ | ___ | **R1 : non** (Maître d'hôtel noyé) vs **R2 : oui** |

> 🎯 **Le résultat attendu N'EST PAS « plus de plats servis ».** C'est :
> 1. **Lead Time individuel beaucoup plus court** → chaque client est servi plus vite
> 2. **Prévisibilité** → on sait quand un plat sera prêt
> 3. **Moins de stress et d'erreurs** → meilleure qualité
> 4. **Visibilité réelle** → le board reflète la vérité
> 5. **Même throughput** → on ne perd rien en productivité !
>
> 💬 **La phrase à retenir :** *« Stop starting, start finishing. »* — On ne livre pas plus en commençant tout en même temps, on crée juste du chaos et de l'attente.

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

**Questions de débrief (faire réfléchir les étudiants) :**
- Quel round était le moins stressant pour les cuisiniers ? Pour les clients ?
- A-t-on servi **plus** de plats en Round 2 ? (réponse : non, à peu près pareil → surprenant !)
- Alors **qu'est-ce qu'on a gagné** avec les limites WIP ?
- Que se passe-t-il quand on travaille sur trop de choses en même temps ?
- En projet IT : est-ce qu'un développeur qui commence 5 tâches va plus vite qu'un qui en fait 2 à la fois ?
- Le board Kanban était-il fiable en Round 1 ? Pourquoi ? Et en Round 2 ?

#### 🤔 Anticiper l'objection : « Mais on fait juste attendre le client avant ! »

> Un étudiant va probablement dire : *« Le Lead Time est meilleur en Round 2, mais c'est triché ! On a juste fait attendre le client AVANT de prendre sa commande au lieu de le faire attendre APRÈS. Le temps total est pareil ! »*

C'est une **très bonne objection**. Et la réponse est la clé de Kanban :

**Oui, le temps total d'attente est similaire.** Ce qui change, c'est **où** et **comment** on attend :

| | Round 1 : attente APRÈS commande | Round 2 : attente AVANT commande |
|---|---|---|
| **Le client sait-il qu'il attend ?** | ❌ Non. Il a commandé, il croit que c'est en cours. Il s'énerve. | ✅ Oui. Le serveur lui dit « je prends votre commande dès qu'une place se libère ». Il comprend. |
| **Le travail "en cours" est-il réel ?** | ❌ Non. 8 tickets sont « en cours » mais 6 dorment dans une pile. C'est du **faux travail en cours**. | ✅ Oui. Les 4-6 tickets en cours sont **réellement** en train d'être traités. |
| **Peut-on prédire le délai ?** | ❌ Impossible. « Votre plat sera prêt dans… euh… je ne sais pas. » | ✅ Oui. « Il y a 2 commandes devant vous, ~2 min d'attente. » |
| **Le client peut-il changer d'avis ?** | ❌ Trop tard, sa commande est dans la pile. Il a « payé » mais n'a rien. | ✅ Oui ! Tant que le serveur n'a pas pris sa commande, il peut changer de plat ou annuler sans gaspillage. |
| **Analogie IT** | Un ticket Jira "In Progress" depuis 3 semaines, bloqué en attente de review | Un ticket dans le Backlog priorisé, qui sera pris dès qu'un dev est disponible |

**Le message clé à faire passer :**

> *« En Round 1, vous aviez 8 tickets "en cours" mais seulement 3 étaient réellement travaillés. Les 5 autres dormaient dans une file. C'est comme avoir 8 tickets "In Progress" dans Jira alors que 5 sont bloqués en attente de review. C'est du **travail fantôme** qui donne une fausse impression d'activité. »*
>
> *« En Round 2, quand un ticket est "en cours", il est **vraiment** en cours. Et le client qui attend en salle sait qu'il attend — il n'a pas l'illusion que son plat est en préparation alors qu'il est dans une pile. »*

**En une phrase :** Kanban ne supprime pas l'attente — il la **rend visible et honnête** au lieu de la **cacher dans de faux encours**.

> 💡 **Analogie finale à faire :** « Imaginez une autoroute. Si vous mettez 1000 voitures d'un coup, ça bouchonne et personne n'arrive. Si vous régullez l'entrée (les feux d'accès), chaque voiture arrive **plus vite** même si le nombre total de voitures par heure est le même. Les limites WIP sont les feux d'accès de votre autoroute de développement. »

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

