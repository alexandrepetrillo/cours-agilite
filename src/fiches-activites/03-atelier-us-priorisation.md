# 🔧 Fiche Activité — Atelier Rédaction US + Priorisation + Chiffrage

> **Session :** Journée complète | **Horaire :** 09h45–10h30 | **Durée :** 45 min

---

## 🎯 Objectif pédagogique
- Identifier les personas d'un projet
- Pratiquer la rédaction de User Stories au format standard avec critères d'acceptation
- Prioriser un backlog avec la méthode MoSCoW
- Estimer des stories en points avec le Planning Poker
- Définir une Definition of Done d'équipe
- Vivre le processus complet de création d'un Product Backlog

## 🏷️ Compétences : C29, C30, C31

## 👥 Format : Équipes de 4-5 personnes

---

## 📦 Matériel nécessaire
- Post-its (format standard + 1 couleur différente pour les personas)
- Marqueurs épais
- Gommettes de couleur (🔴 rouge, 🟡 jaune, 🟢 vert) pour MoSCoW
- Templates User Story imprimés recto-verso (voir `/supports/templates/user-story-card.md`)
- Cartes Planning Poker (1 jeu par équipe, voir `/supports/templates/planning-poker-cards.md`)
- Brief projet imprimé (1 par équipe)
- Grande feuille ou tableau par équipe (pour afficher personas + backlog + DoD)

---

## 📋 Déroulé détaillé

### Présentation du contexte (5 min)

Distribuer le même brief à toutes les équipes :

> **🍕 Projet « Pizza Campus »**
> Votre client est l'association étudiante. Ils veulent une **app mobile de commande de pizzas** pour le campus. Les étudiants pourront commander depuis leur téléphone, payer en ligne, et récupérer leur pizza à un point de retrait. Le client veut une v1 dans 2 mois. Budget serré. L'équipe : 3 développeurs.

### Phase 1a — Identification des personas (3 min)

**Consignes :**
- « Avant d'écrire la moindre User Story, demandez-vous : **qui** va utiliser cette app ? »
- Chaque équipe liste sur un post-it à part ses **personas** (types d'utilisateurs) avec un court descriptif
- Rappel : un persona = un rôle utilisateur avec des besoins spécifiques (vu dans le cours précédent)

**Le formateur attend au moins 2 personas distincts** avant de lancer la phase suivante. Si une équipe ne trouve que « l'utilisateur », relancer : « Qui prépare les pizzas ? Qui gère les stocks et les prix ? »

### Phase 1b — Rédaction des User Stories (12 min)

**Consignes :**
- Rédiger **8-10 User Stories** au format :
  > « **En tant que** [persona], **je veux** [fonctionnalité] **afin de** [bénéfice] »
- Écrire chaque US sur un post-it ou un template imprimé (recto)
- Utiliser les personas identifiés en phase 1a — chaque persona doit avoir **au moins 1 US**
- Pour chaque US, écrire au verso **2-3 critères d'acceptation** (format libre ou Given/When/Then)

**Exemples pour débloquer (à donner seulement si les équipes bloquent) :**
- « En tant qu'étudiant, je veux consulter le menu afin de choisir ma pizza »
- « En tant que pizzaiolo, je veux voir les commandes en cours afin de préparer les pizzas dans l'ordre »
- « En tant que gestionnaire, je veux voir les ventes du jour afin de gérer le stock »

**Le formateur circule et vérifie :**
- Les personas identifiés sont-ils utilisés dans les US ?
- Le format « En tant que / Je veux / Afin de » est-il respecté ?
- Les critères d'acceptation sont-ils définis (au moins 2 par US) ?
- Les stories sont-elles **INVEST** ? (rappel du cours précédent)
- Y a-t-il des stories trop grosses à découper ?

### Phase 2 — Priorisation MoSCoW (5 min)

Chaque équipe classe ses US en 4 catégories :

| Catégorie | Signification | Gommette |
|-----------|--------------|----------|
| **Must** | Indispensable pour la v1 | 🔴 Rouge |
| **Should** | Important mais pas bloquant | 🟡 Jaune |
| **Could** | Souhaitable si on a le temps | 🟢 Vert |
| **Won't** | Pas dans cette version | ⚪ Aucune |

- Coller les gommettes de couleur sur les post-its
- Disposer les US en colonnes sur la grande feuille

### Phase 3 — Estimation Planning Poker (15 min)

**Rappel des règles** (2 min) :
1. Le « PO » (un membre de l'équipe) lit une User Story
2. Discussion rapide (1 min max)
3. Chaque membre choisit une carte **face cachée**
4. Tout le monde retourne en même temps : **3, 2, 1, montrez !**
5. Si les estimations divergent : les extrêmes expliquent leur choix
6. On revote si nécessaire
7. On note l'estimation sur le post-it

**Estimation** (13 min) :
- Estimer les **5-6 stories « Must »** en priorité
- Valeurs : 1, 2, 3, 5, 8, 13 (suite de Fibonacci)
- Si une story dépasse 13 → elle est trop grosse, il faut la découper !

### Phase 4 — Definition of Done de l'équipe (3 min)

- Chaque équipe rédige sa **DoD** pour le projet Pizza Campus : 4-5 critères que **toute** US doit respecter pour être considérée « terminée »
- Rappel : la DoD est **globale** (commune à toutes les US), contrairement aux critères d'acceptation (spécifiques à chaque US)
- Afficher la DoD à côté du backlog sur la grande feuille

### Phase 5 — Revue croisée express (5 min)

- Les équipes échangent leurs backlogs (personas + US + priorisation + estimations + DoD)
- Chaque équipe inspecte le backlog d'une autre :
  - Les **personas** sont-ils pertinents ? En manque-t-il un ?
  - Les US sont-elles au bon format ? Ont-elles des **critères d'acceptation** ?
  - Les US sont-elles **INVEST** ?
  - La priorisation est-elle cohérente ?
  - Les estimations semblent-elles réalistes et **cohérentes entre elles** ?
  - La **DoD** est-elle claire et suffisante ?
- 1 feedback positif + 1 suggestion par équipe

---

## 💡 Tips formateur
- **Planning Poker** : la première US prend toujours du temps (c'est normal), ça s'accélère ensuite
- **Désaccords** : si un membre met 2 et un autre met 13, c'est une excellente situation d'apprentissage ! Faire verbaliser les hypothèses différentes
- **Ne pas corriger** les stories « imparfaites » — la revue croisée s'en chargera
- **Timer strict** : le Planning Poker peut durer très longtemps si on ne timebox pas. Max 2 min par story !
- Garder les backlogs affichés au mur pour référence pendant le reste de la journée

## ✅ Correction type
Voir `/supports/correction-atelier-us-pizza-campus.md` (10 US corrigées avec priorisation MoSCoW, estimation Planning Poker, critères d'acceptation, vérification INVEST et points de débrief).

## 🔄 Variantes
- **Brief différent par équipe** : chaque équipe a un projet différent (app covoiturage, e-sport, etc.) → plus de diversité en revue croisée
- **Contrainte budget** : 1 point = 5000€, budget total 50K€ → combien de stories peut-on financer ? (lien C31)
- **Story Mapping** : au lieu de MoSCoW, organiser les US en Story Map (activités en colonnes, détails en lignes)

