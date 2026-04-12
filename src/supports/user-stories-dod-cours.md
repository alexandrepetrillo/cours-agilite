# 📝 User Stories & Definition of Done — Contenu de Cours Complet

> **Utilisé :** Jour 2 — 09h15 à 09h45 (30 min)
> **Format :** Cours interactif avec exemples, quiz rapides et contre-exemples
> **Pré-requis :** Avoir vu Scrum (rôles, événements, artefacts) la veille
> **Transition vers :** Atelier rédaction US + priorisation + chiffrage (09h45)

---

## 📑 Sommaire

1. [Qu'est-ce qu'une User Story ?](#1--quest-ce-quune-user-story-)
2. [Le format standard](#2--le-format-standard)
3. [Les personas](#3--les-personas)
4. [Bonne US vs Mauvaise US](#4--bonne-us-vs-mauvaise-us)
5. [Les critères INVEST](#5--les-critères-invest)
6. [Les critères d'acceptation](#6--les-critères-dacceptation)
7. [La Definition of Done (DoD)](#7--la-definition-of-done-dod)
8. [DoD vs Critères d'acceptation](#8--dod-vs-critères-dacceptation)
9. [Récapitulatif](#9--récapitulatif)

---

---

## 1. 📌 Qu'est-ce qu'une User Story ?

### Le concept

Une **User Story** (histoire utilisateur) est une description **courte**, **simple** et **centrée sur l'utilisateur** d'une fonctionnalité souhaitée.

> 💡 Ce n'est **pas** une spécification technique. Ce n'est **pas** un cahier des charges. C'est une **promesse de conversation**.

### Origine

Les User Stories viennent de l'**Extreme Programming** (XP), inventées par **Kent Beck** dans les années 90. Elles ont été adoptées massivement par Scrum et sont aujourd'hui utilisées dans presque tous les frameworks Agile.

### Les 3 C de Ron Jeffries

Ron Jeffries a formalisé 3 aspects essentiels d'une User Story :

| C | Signification | Description |
|---|--------------|-------------|
| **Card** 🃏 | La carte | L'US tient sur une carte (post-it, fiche bristol). Si elle ne tient pas, elle est trop grosse. |
| **Conversation** 💬 | La discussion | L'US n'est qu'un point de départ. Le vrai contenu émerge de la **conversation** entre le PO, l'équipe et le client. |
| **Confirmation** ✅ | La validation | Les **critères d'acceptation** permettent de confirmer que l'US est terminée correctement. |

> 🎯 **Point clé :** Une User Story n'est PAS un document exhaustif. C'est un **support de conversation**. La carte papier est volontairement petite pour forcer la concision et encourager le dialogue.

**Lien avec le jeu Kapla :** « Dans le Round 1, le CDC était long et détaillé — mais il n'a pas suffi. Dans le Round 2, les échanges courts et fréquents avec le client ont mieux fonctionné. Les US fonctionnent sur ce même principe : peu d'écrit, beaucoup de conversation. »

---

---

## 2. ✍️ Le format standard

### La formule magique

```
En tant que [QUI],
je veux [QUOI],
afin de [POURQUOI].
```

| Élément | Question | Ce qu'on cherche |
|---------|----------|-----------------|
| **En tant que** | QUI a ce besoin ? | Le persona / rôle utilisateur |
| **Je veux** | QUOI veut-il faire ? | L'action ou la fonctionnalité |
| **Afin de** | POURQUOI le veut-il ? | Le bénéfice, la valeur métier |

### Pourquoi ce format ?

- Le **QUI** force à penser à l'utilisateur réel, pas à la technique
- Le **QUOI** reste au niveau du besoin, pas de la solution
- Le **POURQUOI** justifie la valeur — si on ne peut pas remplir le « afin de », la story n'a peut-être pas de raison d'être

### Exemples concrets

#### ✅ Bon exemple 1 :
> **En tant qu'** étudiant,
> **je veux** rechercher un livre par titre ou auteur,
> **afin de** trouver rapidement le livre dont j'ai besoin pour mon cours.

✔️ On sait qui (étudiant), quoi (rechercher), pourquoi (trouver vite pour son cours).

#### ✅ Bon exemple 2 :
> **En tant que** responsable RH,
> **je veux** exporter la liste des congés en CSV,
> **afin de** l'intégrer dans notre outil de paie mensuel.

✔️ Le « afin de » donne le vrai contexte métier — l'équipe comprend **pourquoi** le CSV est nécessaire.

#### ✅ Bon exemple 3 :
> **En tant que** client du e-commerce,
> **je veux** recevoir un email de confirmation après ma commande,
> **afin de** vérifier que ma commande a bien été prise en compte.

✔️ Clair, précis, testable.

---

### ❌ Les pièges courants

#### ❌ Mauvais exemple 1 — Trop technique :
> ~~En tant que développeur, je veux créer une table SQL "users" avec les champs id, name, email, afin de stocker les données.~~

**Pourquoi c'est mauvais :**
- Le « persona » est un développeur, pas un utilisateur final
- C'est une **tâche technique**, pas un besoin utilisateur
- Le « afin de » n'apporte pas de valeur métier

**Comment l'améliorer :**
> **En tant qu'** utilisateur, **je veux** créer un compte avec mon nom et email, **afin de** sauvegarder mes préférences et retrouver mon historique.

#### ❌ Mauvais exemple 2 — Pas de « afin de » :
> ~~En tant qu'admin, je veux un bouton "Supprimer".~~

**Pourquoi c'est mauvais :**
- Pas de valeur métier (pourquoi supprimer ? Supprimer quoi ?)
- L'équipe devra deviner l'intention → risque de mauvaise implémentation

**Comment l'améliorer :**
> **En tant qu'** administrateur, **je veux** supprimer un compte utilisateur inactif depuis plus d'un an, **afin de** respecter la politique RGPD de l'entreprise.

#### ❌ Mauvais exemple 3 — Trop grosse (une « Epic ») :
> ~~En tant qu'utilisateur, je veux un système de gestion de commandes complet, afin de passer des commandes en ligne.~~

**Pourquoi c'est mauvais :**
- C'est un **projet entier**, pas une User Story
- Impossible à estimer, impossible à réaliser en un sprint
- On appelle ça une **Epic** → il faut la **découper** en plusieurs US

**Comment la découper :**
- US1 : « En tant que client, je veux ajouter un article à mon panier… »
- US2 : « En tant que client, je veux saisir mon adresse de livraison… »
- US3 : « En tant que client, je veux payer par carte bancaire… »
- US4 : « En tant que client, je veux recevoir un email de confirmation… »

---

### 🏗️ La hiérarchie des éléments du backlog

```
🏔️ THÈME          (ex: "E-commerce")
  └── 📦 EPIC      (ex: "Gestion des commandes")
       └── 📝 USER STORY  (ex: "Ajouter au panier")
            └── ✅ TÂCHE    (ex: "Créer l'API POST /cart/items")
```

| Niveau | Taille | Horizon | Exemple |
|--------|--------|---------|---------|
| **Thème** | Très large | Stratégique | « Espace client » |
| **Epic** | Plusieurs sprints | Release | « Gestion du profil utilisateur » |
| **User Story** | 1 sprint max | Sprint | « Modifier mon adresse email » |
| **Tâche** | Quelques heures | Quotidien | « Ajouter la validation d'email » |

> 💡 **Règle d'or :** Si une User Story ne peut pas être terminée en **un seul sprint**, c'est une Epic — il faut la découper.

---

---

## 3. 👤 Les personas

### Qu'est-ce qu'un persona ?

Un **persona** est un utilisateur fictif mais réaliste qui représente un segment d'utilisateurs de votre produit.

### Pourquoi des personas ?

- Forcer l'équipe à penser **du point de vue de l'utilisateur**
- Différencier les besoins (un admin n'a pas les mêmes besoins qu'un visiteur)
- Humaniser les User Stories (« Marie, 25 ans, étudiante » > « l'utilisateur »)

### Exemple de personas pour une app de campus

| Persona | Description | Besoins principaux |
|---------|------------|-------------------|
| 🎓 **Léa, étudiante** | 22 ans, Bac+3 info, utilise son smartphone en permanence | Accès rapide, notifications, interface simple |
| 👨‍🏫 **Marc, enseignant** | 45 ans, enseignant depuis 15 ans, pas très à l'aise avec la tech | Interface claire, export PDF, pas trop de clics |
| 👩‍💼 **Sophie, admin** | 35 ans, gère 500 étudiants, besoin de tableaux de bord | Statistiques, exports, gestion en masse |
| 👤 **Visiteur anonyme** | Ne possède pas de compte, arrive par Google | Page d'accueil claire, inscription facile |

> 🎯 **Astuce :** Créer les personas **avant** de rédiger les User Stories permet de ne pas oublier de types d'utilisateurs.

---

---

## 4. ✅❌ Bonne US vs Mauvaise US

### Quiz express — « Est-ce une bonne User Story ? »

**US 1 :** « En tant qu'utilisateur, je veux que le système soit rapide. »

> ❌ **Mauvaise.** Trop vague, pas testable. « Rapide » ne veut rien dire. Mieux : « En tant qu'utilisateur, je veux que la page de recherche se charge en moins de 2 secondes, afin de ne pas perdre patience. »

---

**US 2 :** « En tant que client, je veux filtrer les produits par prix croissant, afin de trouver les offres les moins chères. »

> ✅ **Bonne.** Persona clair, action précise, valeur explicite. L'équipe sait quoi construire et peut écrire des tests.

---

**US 3 :** « Implémenter le module de paiement Stripe avec webhook. »

> ❌ **Mauvaise.** C'est une **tâche technique**, pas une User Story. Pas de persona, pas de valeur. Mieux : « En tant que client, je veux payer ma commande par carte bancaire, afin de finaliser mon achat en toute sécurité. » (et « implémenter Stripe + webhook » sera une tâche de cette US.)

---

**US 4 :** « En tant qu'administrateur, je veux désactiver un compte utilisateur qui enfreint les conditions d'utilisation, afin de protéger la communauté. »

> ✅ **Bonne.** Contexte clair, persona spécifique (admin, pas n'importe qui), justification métier forte.

---

**US 5 :** « En tant qu'utilisateur, je veux un beau design. »

> ❌ **Mauvaise.** Subjectif et non testable. « Beau » selon qui ? Mieux : découper en US spécifiques (« je veux voir une image produit en haute résolution », « je veux un mode sombre »).

---

---

## 5. 💎 Les critères INVEST

### La check-list qualité d'une User Story

Le modèle **INVEST** (créé par **Bill Wake**) est un moyen mnémotechnique pour vérifier la qualité d'une User Story :

---

### **I** — Independent (Indépendante) 🔓

> L'US peut être développée, testée et livrée **indépendamment** des autres.

**Pourquoi :** Si deux US sont dépendantes, on ne peut pas les prioriser librement. On veut pouvoir réordonner le backlog sans casser les dépendances.

**Bon exemple :** « En tant que client, je veux m'inscrire par email » et « En tant que client, je veux m'inscrire via Google » → indépendantes, on peut livrer l'une sans l'autre.

**Contre-exemple :** « En tant que client, je veux modifier mon profil » qui nécessite que « créer un profil » soit faite avant → dépendance forte. Solution : regrouper ou s'assurer que l'US de base est traitée en premier.

---

### **N** — Negotiable (Négociable) 🤝

> L'US n'est pas un contrat gravé dans le marbre. Les détails se précisent par la **conversation**.

**Pourquoi :** L'US est un support de conversation, pas un cahier des charges. L'équipe et le PO discutent des détails lors du refinement ou du Sprint Planning.

**Bon exemple :** « En tant que client, je veux être notifié quand ma commande est expédiée » → le canal (email ? SMS ? push ?) sera discuté avec l'équipe.

**Contre-exemple :** « Envoyer un email au format HTML responsive avec le template #47, en utilisant SendGrid API v3, avec un retry de 3 tentatives et un délai de 30s » → trop prescriptif, plus de place pour la conversation.

---

### **V** — Valuable (Valeur) 💰

> L'US apporte une **valeur** à l'utilisateur ou au métier.

**Pourquoi :** Chaque US doit avoir une raison d'exister. Si le « afin de » est vide ou artificiel, la story n'a pas de valeur.

**Bon exemple :** « En tant que client, je veux sauvegarder mon panier, afin de reprendre mes achats plus tard » → valeur claire pour l'utilisateur.

**Contre-exemple :** « En tant que développeur, je veux refactorer le module d'authentification » → ça a de la valeur technique, mais pas de valeur directe pour l'utilisateur. Solution : reformuler du point de vue utilisateur ou accepter que certains éléments techniques (spikes, tech tasks) ne sont pas des US au sens strict.

---

### **E** — Estimable (Estimable) 📏

> L'équipe peut **estimer** l'effort nécessaire pour réaliser l'US.

**Pourquoi :** Si l'équipe ne peut pas estimer, c'est que la story est trop vague, trop grosse, ou que l'équipe manque de connaissances → il faut clarifier ou faire un **spike** (investigation).

**Bon exemple :** « En tant que client, je veux trier les résultats par date » → l'équipe sait faire un tri, elle peut estimer.

**Contre-exemple :** « En tant qu'admin, je veux que le système détecte les fraudes automatiquement » → trop vague, trop complexe, aucune idée du temps nécessaire. Solution : découper (spike pour étudier les algorithmes de détection, puis US pour chaque règle de détection).

---

### **S** — Small (Petite) 📐

> L'US est assez **petite** pour être réalisée en **un seul sprint**.

**Pourquoi :** Une US trop grosse ne sera jamais terminée dans un sprint → pas d'incrément, pas de feedback, pas de valeur livrée.

**Règle empirique :**
- ✅ L'équipe peut en livrer **plusieurs** par sprint → bonne taille
- ⚠️ L'US occupe tout le sprint → limite, à surveiller
- ❌ L'US ne rentre pas dans un sprint → trop grosse, c'est une **Epic**, il faut découper

**Techniques de découpage :**
| Technique | Exemple |
|-----------|---------|
| Par **workflow** | Séparer « ajouter au panier » de « passer la commande » |
| Par **persona** | Séparer « inscription étudiant » de « inscription enseignant » |
| Par **données** | Séparer « import CSV » de « import Excel » |
| Par **plateforme** | Séparer « version web » de « version mobile » |
| Par **opération CRUD** | Séparer « créer un article » de « modifier un article » |
| Par **règle métier** | Séparer « appliquer TVA 20% » de « appliquer TVA réduite 5.5% » |

---

### **T** — Testable (Testable) 🧪

> On peut **vérifier** que l'US est correctement réalisée grâce à des **critères d'acceptation** clairs.

**Pourquoi :** Si on ne peut pas tester une US, on ne peut pas dire si elle est « terminée ». Sans critère testable, le PO et l'équipe ne seront jamais d'accord sur ce qui est « fini ».

**Bon exemple :** « En tant que client, je veux me connecter avec mon email et mot de passe » → on peut tester : login OK, mauvais mot de passe → erreur, email inexistant → erreur, etc.

**Contre-exemple :** « En tant qu'utilisateur, je veux une expérience utilisateur agréable » → impossible à tester objectivement. C'est un souhait, pas une US.

---

### 📋 Résumé INVEST

| Critère | Question à se poser | 🚨 Signal d'alerte |
|---------|--------------------|--------------------|
| **I**ndependent | Peut-on la réaliser sans dépendre d'une autre US ? | « Il faut d'abord faire l'US #12 » |
| **N**egotiable | Les détails sont-ils ouverts à la discussion ? | US de 3 pages avec tous les détails techniques |
| **V**aluable | Apporte-t-elle de la valeur à un utilisateur ? | « Afin de… » vide ou artificiel |
| **E**stimable | L'équipe peut-elle estimer l'effort ? | « Aucune idée de combien de temps ça prendra » |
| **S**mall | Tient-elle dans un sprint ? | L'équipe dit « c'est énorme » |
| **T**estable | Peut-on vérifier qu'elle est correcte ? | « On verra bien si c'est OK » |

---

---

## 6. ✅ Les critères d'acceptation

### Qu'est-ce que c'est ?

Les **critères d'acceptation** (Acceptance Criteria) sont les conditions spécifiques qu'une User Story doit remplir pour être considérée comme **correctement réalisée**.

> 💡 Ils sont propres à **chaque User Story** (contrairement à la DoD qui est globale — on y revient juste après).

### Format : Given / When / Then (Gherkin)

Le format le plus populaire est le **Gherkin**, utilisé aussi dans le BDD (Behavior-Driven Development) :

```
ÉTANT DONNÉ [contexte / état initial],
QUAND [action de l'utilisateur],
ALORS [résultat attendu].
```

### Exemple complet

**User Story :**
> En tant que client, je veux me connecter à mon compte, afin d'accéder à mon historique de commandes.

**Critères d'acceptation :**

```
✅ ÉTANT DONNÉ un client avec un compte existant,
   QUAND il saisit un email et mot de passe corrects,
   ALORS il est redirigé vers sa page d'accueil personnalisée.

✅ ÉTANT DONNÉ un client avec un compte existant,
   QUAND il saisit un mot de passe incorrect,
   ALORS un message d'erreur « Identifiants incorrects » s'affiche
   ET il peut réessayer.

✅ ÉTANT DONNÉ un visiteur sans compte,
   QUAND il tente de se connecter,
   ALORS un message « Aucun compte trouvé » s'affiche
   ET un lien vers l'inscription est proposé.

✅ ÉTANT DONNÉ un client qui a échoué 5 fois de suite,
   QUAND il tente une 6ème connexion,
   ALORS son compte est temporairement bloqué pendant 15 minutes
   ET un email de notification lui est envoyé.
```

### Pourquoi les critères d'acceptation sont importants

| Sans critères d'acceptation | Avec critères d'acceptation |
|---|---|
| Le PO et l'équipe n'ont pas la même vision de « terminé » | Tout le monde est aligné sur le résultat attendu |
| Les tests sont écrits au hasard | Les tests couvrent les vrais scénarios métier |
| La Sprint Review est un moment de surprise (bonne ou mauvaise) | La Review est une **confirmation** de ce qui était prévu |
| Débats sans fin sur « est-ce que c'est fait ? » | Vérification objective : tous les critères sont remplis ✅ ou non ❌ |

### Bonnes pratiques

- **3 à 8 critères** par US (trop peu = pas assez précis ; trop = US trop grosse)
- Rédigés **avec le PO** (pas par l'équipe seule, ni par le PO seul)
- Écrits **avant** le Sprint Planning (pendant le refinement)
- Chaque critère doit être **vérifiable** objectivement (pas de « le système est rapide »)

---

---

## 7. 📋 La Definition of Done (DoD)

### Le problème : quand « terminé » ne veut rien dire

> 🧑‍💻 Dev : « C'est terminé ! »
> 👑 PO : « Super ! Je peux montrer au client ? »
> 🧑‍💻 Dev : « Euh… il faut encore écrire les tests… et la doc… et le déployer… »
> 👑 PO : « Donc ce n'est PAS terminé. 😒 »

Sans Definition of Done, chaque personne a sa propre définition de « terminé » :
- Pour un dev junior : « ça compile »
- Pour un dev senior : « ça compile et les tests passent »
- Pour le PO : « c'est en production et le client peut l'utiliser »
- Pour le client : « c'est en production et ça marche correctement »

### La solution : une check-list partagée

La **Definition of Done** (DoD) est une **check-list commune** qui définit les critères que **tout** élément du backlog doit remplir pour être considéré comme « terminé ».

> 🎯 **Différence clé :** La DoD s'applique à **TOUTES** les User Stories de manière uniforme. Les critères d'acceptation sont spécifiques à chaque US.

### Exemple de DoD d'une équipe réelle

```
📋 DEFINITION OF DONE — Équipe Alpha

Un élément du backlog est "Done" quand TOUS les critères suivants sont remplis :

✅ Le code est écrit et respecte les conventions de l'équipe
✅ Les tests unitaires sont écrits et passent (couverture > 80%)
✅ Les tests d'intégration passent
✅ Le code a été revu par au moins 1 autre développeur (code review)
✅ La documentation technique est mise à jour (README, API docs)
✅ Le code est fusionné dans la branche principale (main/develop)
✅ L'application est déployée en environnement de staging
✅ Les tests de non-régression passent en staging
✅ Le PO a validé la fonctionnalité en staging
✅ Pas de dette technique connue non documentée
```

### La DoD évolue

La DoD n'est pas figée pour toujours. Elle peut (et doit) évoluer :

| Quand | Action |
|-------|--------|
| L'équipe est junior | DoD simple : code + tests unitaires + code review |
| L'équipe mûrit | On ajoute : tests d'intégration + déploiement staging |
| L'équipe est mature | On ajoute : déploiement prod, monitoring, A/B testing |
| Un bug en prod révèle un manque | On ajoute le critère qui aurait empêché le bug |

> 💡 La DoD est souvent **durcie** lors des rétrospectives : « On a eu un bug parce qu'on n'avait pas testé sur mobile → on ajoute "testé sur mobile" à la DoD. »

### Qui définit la DoD ?

- L'**équipe de développement** est responsable de la DoD
- Le **PO** contribue pour les critères de validation métier
- Le **SM** s'assure que la DoD est respectée et visible
- Si l'organisation a des standards (ex : normes de sécurité), ils doivent être intégrés à la DoD

### Que se passe-t-il si un élément ne respecte pas la DoD ?

- Il n'est **PAS inclus dans l'incrément**
- Il n'est **PAS présenté** en Sprint Review
- Il retourne dans le **Product Backlog** pour un prochain sprint
- Il n'est **PAS** compté dans la **vélocité** de l'équipe

> ⚠️ C'est non négociable. Un élément « presque Done » est **Not Done**. Il n'y a pas de zone grise.

---

---

## 8. 🔄 DoD vs Critères d'acceptation

C'est une confusion très fréquente. Voici la différence :

| | Definition of Done (DoD) | Critères d'acceptation |
|---|---|---|
| **Portée** | **Globale** — s'applique à TOUTES les US | **Spécifique** — propre à CHAQUE US |
| **Qui définit** | L'équipe (une fois, puis ajusté en rétro) | Le PO + l'équipe (pour chaque US) |
| **Quand** | Définie en début de projet, évolue | Définie pendant le refinement |
| **Exemples** | « Tests unitaires passent, code reviewé, déployé en staging » | « Quand le client clique sur "Commander", un email de confirmation est envoyé » |
| **Analogie** | Les **règles du restaurant** (hygiène, service, vaisselle propre) | La **recette du plat** commandé par le client |

### Schéma visuel

```
┌─────────────────────────────────────────────────────────────┐
│                    USER STORY #42                            │
│                                                             │
│  📝 "En tant que client, je veux payer par CB..."           │
│                                                             │
│  ┌─────────────────────────────────────────────────────┐    │
│  │ ✅ CRITÈRES D'ACCEPTATION (spécifiques à cette US)  │    │
│  │                                                     │    │
│  │  • Visa et Mastercard sont acceptés                 │    │
│  │  • Message de confirmation affiché après paiement   │    │
│  │  • Erreur claire si la carte est refusée            │    │
│  │  • Montant affiché avant confirmation               │    │
│  └─────────────────────────────────────────────────────┘    │
│                          +                                  │
│  ┌─────────────────────────────────────────────────────┐    │
│  │ 📋 DEFINITION OF DONE (commune à toutes les US)     │    │
│  │                                                     │    │
│  │  • Code écrit + conventions respectées              │    │
│  │  • Tests unitaires écrits et passent                │    │
│  │  • Code review effectuée                            │    │
│  │  • Déployé en staging                               │    │
│  │  • Validé par le PO                                 │    │
│  └─────────────────────────────────────────────────────┘    │
│                          =                                  │
│            🎉 L'US #42 est VRAIMENT "Done"                  │
└─────────────────────────────────────────────────────────────┘
```

> 🎯 **Pour qu'une US soit Done :** les critères d'acceptation **ET** la DoD doivent être remplis.

---

---

## 9. 📋 Récapitulatif

### User Stories — L'essentiel

| Concept | Résumé |
|---------|--------|
| **Format** | En tant que [QUI], je veux [QUOI], afin de [POURQUOI] |
| **3 C** | Card (courte), Conversation (discussion), Confirmation (testable) |
| **INVEST** | Independent, Negotiable, Valuable, Estimable, Small, Testable |
| **Hiérarchie** | Thème > Epic > User Story > Tâche |
| **Critères d'acceptation** | Conditions spécifiques de validation (Given/When/Then) |
| **Definition of Done** | Check-list commune à toutes les US |

### Les erreurs les plus courantes

| ❌ Erreur | ✅ Correction |
|-----------|-------------|
| Écrire des tâches techniques comme des US | Toujours partir du point de vue de l'utilisateur |
| Oublier le « afin de » | Pas de valeur = pas d'US |
| US trop grosse (Epic déguisée) | Découper jusqu'à ce qu'elle tienne en 1 sprint |
| Pas de critères d'acceptation | Les définir AVANT le Sprint Planning |
| Pas de DoD ou DoD floue | Définir en équipe, afficher au mur, respecter sans exception |
| Confondre DoD et critères d'acceptation | DoD = globale / Critères = par US |

### Mémo visuel pour l'atelier

```
📝 USER STORY = QUI + QUOI + POURQUOI
💎 INVEST     = check-list qualité de l'US
✅ CRITÈRES   = conditions spécifiques de cette US
📋 DOD        = check-list commune à toutes les US
🎉 DONE       = critères d'acceptation ✅ + DoD ✅
```

---

## 🔗 Transition vers l'atelier

> « Maintenant que vous connaissez le format, les critères INVEST, les critères d'acceptation et la DoD, on va passer à la pratique ! Vous allez rédiger de vraies User Stories pour une app fictive 🍕 Pizza Campus, les prioriser avec la méthode MoSCoW, et les estimer en Planning Poker. »

---

## 📚 Pour aller plus loin

- **Mike Cohn** (2004). *User Stories Applied: For Agile Software Development*. Addison-Wesley. — LA référence sur les User Stories.
- **Bill Wake** (2003). Article original sur INVEST : [xp123.com/articles/invest-in-good-stories-and-smart-tasks](https://xp123.com/articles/invest-in-good-stories-and-smart-tasks/)
- **Ron Jeffries** (2001). Article sur les 3 C : [ronjeffries.com/xprog/articles/expcardconversationconfirmation](https://ronjeffries.com/xprog/articles/expcardconversationconfirmation/)

