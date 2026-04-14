# ✅ Correction Type — Atelier « 🍕 Pizza Campus »

> **Réf. activité :** `fiches-activites/03-atelier-us-priorisation.md`
> **⚠️ Document formateur — Ne pas distribuer aux étudiants**
> **Usage :** Servir de base de comparaison pendant la revue croisée ou en débrief collectif

---

## 📋 Rappel du brief

> L'association étudiante veut une **app mobile de commande de pizzas** pour le campus.
> Les étudiants pourront commander depuis leur téléphone, payer en ligne, et récupérer leur pizza à un point de retrait.
> V1 dans 2 mois. Budget serré. Équipe : 3 développeurs.

---

## 👤 Personas identifiés

| Persona | Description |
|---------|-------------|
| 🎓 **Étudiant** | Utilisateur principal, commande depuis son téléphone |
| 🍕 **Pizzaiolo** | Prépare les commandes, a besoin de voir ce qu'il doit faire |
| 👩‍💼 **Gestionnaire** (asso étudiante) | Gère les stocks, les prix, les stats de vente |

> 💡 *On n'attend pas que toutes les équipes trouvent les 3 personas. Trouver au moins « étudiant » et « pizzaiolo » est un bon signe.*

---

---

## 📝 Les 10 User Stories — Correction type

---

### US #1 — Consulter le menu

| | |
|---|---|
| **En tant que** | étudiant |
| **Je veux** | consulter le menu avec les pizzas disponibles, leurs ingrédients et leurs prix |
| **Afin de** | choisir la pizza que je veux commander |

| Priorité | Estimation | Justification estimation |
|----------|-----------|------------------------|

**Critères d'acceptation :**
- ✅ La liste des pizzas s'affiche avec : nom, photo, liste des ingrédients, prix
- ✅ Les pizzas indisponibles (en rupture de stock) sont grisées avec la mention « Indisponible »
- ✅ Le menu se charge en moins de 3 secondes

**Vérification INVEST :**
| I | N | V | E | S | T |
|---|---|---|---|---|---|
| ✅ Indépendante | ✅ Canal d'affichage à discuter | ✅ Base de l'app | ✅ Liste + API | ✅ 1 sprint | ✅ Testable (liste, données, temps) |

---

### US #2 — Ajouter une pizza au panier

| | |
|---|---|
| **En tant que** | étudiant |
| **Je veux** | ajouter une ou plusieurs pizzas à mon panier en choisissant la quantité |
| **Afin de** | préparer ma commande avant de payer |

| Priorité | Estimation | Justification estimation |
|----------|-----------|------------------------|

**Critères d'acceptation :**
- ✅ Je peux ajouter une pizza au panier depuis le menu
- ✅ Je peux modifier la quantité (+ / −) pour chaque pizza
- ✅ Le total du panier se met à jour en temps réel
- ✅ Le panier est conservé si je quitte l'app et reviens (persistance locale)

**Vérification INVEST :**
| I | N | V | E | S | T |
|---|---|---|---|---|---|
| ✅ | ✅ Persistance à discuter | ✅ Étape clé du parcours | ✅ | ✅ | ✅ Scénarios clairs |

---

### US #3 — Payer ma commande en ligne

| | |
|---|---|
| **En tant que** | étudiant |
| **Je veux** | payer ma commande par carte bancaire directement dans l'app |
| **Afin de** | finaliser ma commande sans avoir besoin d'espèces |

| Priorité | Estimation | Justification estimation |
|----------|-----------|------------------------|

**Critères d'acceptation :**
- ✅ Je peux saisir mes informations de carte bancaire (ou utiliser Apple Pay / Google Pay)
- ✅ Un écran de confirmation récapitule le montant total avant le paiement
- ✅ En cas de paiement réussi, je reçois un écran de confirmation avec un numéro de commande
- ✅ En cas d'échec du paiement, un message d'erreur clair s'affiche et je peux réessayer
- ✅ Les données de carte ne sont jamais stockées sur nos serveurs

> 💬 *Lors du Planning Poker, cette story provoque souvent un débat 8 vs 13. C'est une excellente occasion d'expliquer que l'intégration paiement est toujours sous-estimée (sécurité, erreurs réseau, cas limites). Si un étudiant met 13 ou plus, on peut aussi discuter du découpage.*

---

### US #4 — Suivre l'état de ma commande

| | |
|---|---|
| **En tant que** | étudiant |
| **Je veux** | voir l'état d'avancement de ma commande en temps réel (en préparation → prête → récupérée) |
| **Afin de** | savoir quand aller chercher ma pizza au point de retrait |

| Priorité | Estimation | Justification estimation |
|----------|-----------|------------------------|

**Critères d'acceptation :**
- ✅ La commande affiche un statut parmi : « En attente », « En préparation », « Prête ! », « Récupérée »
- ✅ Le statut se met à jour automatiquement sans recharger la page
- ✅ Quand le statut passe à « Prête ! », une notification push est envoyée

**Vérification INVEST :**
| I | N | V | E | S | T |
|---|---|---|---|---|---|
| ⚠️ Dépend de US#3 (commande passée) | ✅ Push vs polling à discuter | ✅ Forte valeur | ✅ | ✅ | ✅ |

> 💡 *La dépendance avec la US #3 est un bon point de discussion INVEST. On pourrait arguer que le suivi est testable avec une commande mockée, donc indépendant au niveau du développement.*

---

### US #5 — Recevoir et gérer les commandes (pizzaiolo)

| | |
|---|---|
| **En tant que** | pizzaiolo |
| **Je veux** | voir la liste des commandes à préparer dans l'ordre d'arrivée |
| **Afin de** | préparer les pizzas efficacement sans oublier de commande |

| Priorité | Estimation | Justification estimation |
|----------|-----------|------------------------|

**Critères d'acceptation :**
- ✅ Les nouvelles commandes apparaissent automatiquement en haut de la liste
- ✅ Chaque commande affiche : numéro, détail des pizzas, heure de commande
- ✅ Le pizzaiolo peut marquer une commande comme « En préparation » puis « Prête »
- ✅ Les commandes terminées disparaissent de la liste active (archivées)

---

### US #6 — Créer un compte étudiant

| | |
|---|---|
| **En tant que** | étudiant |
| **Je veux** | créer un compte avec mon email universitaire et un mot de passe |
| **Afin de** | retrouver mon historique de commandes et ne pas ressaisir mes infos à chaque fois |

| Priorité | Estimation | Justification estimation |
|----------|-----------|------------------------|

**Critères d'acceptation :**
- ✅ Je peux m'inscrire avec un email en @monuniversite.fr et un mot de passe (min 8 caractères)
- ✅ Un email de vérification est envoyé pour confirmer le compte
- ✅ Si l'email est déjà utilisé, un message d'erreur le signale
- ✅ Après inscription, je suis automatiquement connecté

---

### US #7 — Consulter mon historique de commandes

| | |
|---|---|
| **En tant que** | étudiant |
| **Je veux** | consulter l'historique de mes commandes passées |
| **Afin de** | retrouver ce que j'ai commandé et re-commander facilement |

| Priorité | Estimation | Justification estimation |
|----------|-----------|------------------------|

**Critères d'acceptation :**
- ✅ La liste affiche les commandes passées avec : date, détail des pizzas, montant, statut
- ✅ Les commandes sont triées par date (plus récente en premier)
- ✅ Je peux cliquer sur une commande passée pour « re-commander la même chose »

---

### US #8 — Gérer le menu (gestionnaire)

| | |
|---|---|
| **En tant que** | gestionnaire de l'association |
| **Je veux** | ajouter, modifier ou supprimer des pizzas du menu |
| **Afin de** | adapter l'offre en fonction des stocks et des saisons |

| Priorité | Estimation | Justification estimation |
|----------|-----------|------------------------|

**Critères d'acceptation :**
- ✅ Je peux ajouter une nouvelle pizza avec : nom, description, ingrédients, prix, photo
- ✅ Je peux modifier les informations d'une pizza existante
- ✅ Je peux rendre une pizza « indisponible » (elle apparaît grisée dans le menu étudiant)
- ✅ Je peux supprimer une pizza qui n'a jamais été commandée

---

### US #9 — Voir les statistiques de vente (gestionnaire)

| | |
|---|---|
| **En tant que** | gestionnaire de l'association |
| **Je veux** | voir un tableau de bord avec le nombre de commandes et le chiffre d'affaires du jour / de la semaine |
| **Afin de** | suivre la rentabilité de l'activité et gérer les stocks |

| Priorité | Estimation | Justification estimation |
|----------|-----------|------------------------|

**Critères d'acceptation :**
- ✅ Un tableau de bord affiche : nombre de commandes du jour, CA du jour, CA de la semaine
- ✅ Un graphique montre l'évolution des ventes sur les 7 derniers jours
- ✅ Je peux filtrer par période (jour / semaine / mois)
- ✅ La pizza la plus vendue est mise en avant

---

### US #10 — Recevoir une notification quand ma pizza est prête

| | |
|---|---|
| **En tant que** | étudiant |
| **Je veux** | recevoir une notification push sur mon téléphone quand ma pizza est prête |
| **Afin de** | ne pas attendre sur place et être prévenu au bon moment |

| Priorité | Estimation | Justification estimation |
|----------|-----------|------------------------|

**Critères d'acceptation :**
- ✅ Au premier lancement, l'app demande la permission d'envoyer des notifications
- ✅ Quand le pizzaiolo marque une commande « Prête », une notification push est envoyée à l'étudiant
- ✅ Le message de la notification contient le numéro de commande et le point de retrait
- ✅ Si les notifications sont désactivées, le statut est quand même visible dans l'app

---

---

## 📊 Récapitulatif du Product Backlog

### Vue priorisée

| # | User Story | Persona | MoSCoW | Points |
|---|-----------|---------|--------|--------|
| 1 | Consulter le menu | 🎓 Étudiant |  Must | **3** |
| 2 | Ajouter au panier | 🎓 Étudiant |  Must | **5** |
| 3 | Payer en ligne | 🎓 Étudiant |  Must | **13** |
| 4 | Suivre l'état de ma commande | 🎓 Étudiant |  Must | **5** |
| 5 | Recevoir et gérer les commandes | 🍕 Pizzaiolo |  Must | **5** |
| 6 | Créer un compte étudiant | 🎓 Étudiant |  Must | **5** |
| 7 | Consulter mon historique | 🎓 Étudiant |  Should | **3** |
| 8 | Gérer le menu | 👩‍💼 Gestionnaire |  Should | **5** |
| 9 | Statistiques de vente | 👩‍💼 Gestionnaire | 🟢 Could | **8** |
| 10 | Notification push pizza prête | 🎓 Étudiant | 🟢 Could | **5** |

### Totaux

| Catégorie | Nb stories | Total points |
|-----------|-----------|-------------|
|   | 6 | **36 pts** |
|   | 2 | **8 pts** |
| 🟢  | 2 | **13 pts** |
| **TOTAL** | **10** | **57 pts** |

---

## 🧮 Estimation du planning (bonus formateur)

> Ce calcul peut être fait en débrief pour illustrer la notion de **vélocité** et faire le lien avec le **Ball Point Game** qui suit.

Hypothèse : l'équipe de 3 devs peut livrer environ **15-20 points par sprint** de 2 semaines.

| Sprint | Stories | Points | Cumul |
|--------|---------|--------|-------|
| **Sprint 1** | US#1 (Menu) + US#6 (Compte) + US#2 (Panier) | 3 + 5 + 5 = **13** | 13 |
| **Sprint 2** | US#3 (Paiement) + US#5 (Commandes pizzaiolo) | 13 + 5 = **18** | 31 |
| **Sprint 3** | US#4 (Suivi commande) + US#7 (Historique) + US#8 (Gérer menu) | 5 + 3 + 5 = **13** | 44 |
| **Sprint 4** | US#9 (Stats) + US#10 (Notifications) | 8 + 5 = **13** | 57 |

> **Conclusion :** 4 sprints de 2 semaines = 8 semaines = pile 2 mois 🎯
> Les 6 Must (36 pts) tiennent dans les 2 premiers sprints → la v1 est possible en 1 mois !
> C'est le genre de discussion qu'un PO et une équipe ont en vrai lors d'un Sprint Planning.

---

## 💬 Points de discussion pour le débrief

### Ce qu'on s'attend à voir chez les étudiants
- ✅ Au moins 3 personas différents identifiés
- ✅ Le format « En tant que / Je veux / Afin de » respecté
- ✅ Un bon mix de Must / Should / Could (pas tout en Must !)
- ✅ Des estimations cohérentes entre elles (si « consulter le menu » vaut 3, « payer en ligne » ne vaut pas 2)

### Erreurs fréquentes à relever
| Erreur | Correction |
|--------|-----------|
| « En tant qu'utilisateur… » (trop générique) | Quel utilisateur ? Étudiant ? Pizzaiolo ? Gestionnaire ? |
| US sans « afin de » | Quelle valeur apporte cette fonctionnalité ? |
| US trop grosse : « Je veux commander une pizza » | Découper : menu → panier → paiement → confirmation |
| US technique : « Je veux une base de données PostgreSQL » | Reformuler du point de vue utilisateur |
| Tout en  Must | « Si tout est prioritaire, rien ne l'est. Le Must = sans ça l'app ne sert à rien » |
| Estimation identique partout (tout à 5) | « Afficher une liste et intégrer un paiement, c'est vraiment le même effort ? » |
| Oublier le persona pizzaiolo | « Qui prépare les pizzas ? Il n'a pas besoin de l'app ? » |

### Questions à poser aux équipes
1. « Quelle est la story la plus risquée ? » → en général le paiement (US#3) → notion de **spike**
2. « Si le client vous dit "je n'ai que 1 mois au lieu de 2", que gardez-vous ? » → exercice de priorisation réelle
3. « Est-ce que vos estimations sont cohérentes entre elles ? » → la valeur relative compte plus que la valeur absolue
4. « Y a-t-il des dépendances entre vos stories ? » → attention au critère I de INVEST

---

## 📋 Definition of Done suggérée pour Pizza Campus

> Peut être affichée au tableau pendant l'atelier pour rappeler la notion vue juste avant.

```
📋 DoD — Pizza Campus v1

✅ L'US respecte le format « En tant que / Je veux / Afin de »
✅ Les critères d'acceptation sont définis (min 3)
✅ L'estimation est faite en Planning Poker
✅ L'US est classée MoSCoW
✅ L'US est validée INVEST par l'équipe
```

