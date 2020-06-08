```
TP Banque
```
Dans notre mini application bancaire tous les montants utilisés seront des décimaux.

Nous allons devoir gérer des comptes bancaires.

Un compte est composé :

```
- D’un Solde (calculé, mais non modifiable) ;
- D’un Propriétaire (nom du propriétaire du compte) ;
- D’une liste d’opérations interne permettant de garder l’historique du compte, non accessible
par les autres objets ;
- D’une méthode permettant de Crediter() le compte, prenant une somme en paramètre ;
- D’une méthode permettant de Crediter() le compte, prenant une somme et un compte en
paramètres, créditant le compte et débitant le compte passé en paramètres ;
- D’une méthode permettant de Debiter() le compte, prenant une somme en paramètre ;
- D’une méthode permettant de Débiter() le compte, prenant une somme et un compte
bancaire en paramètres, débitant le compte et créditant le compte passé en paramètres ;
- D’une méthode qui permet d’afficher le résumé d’un compte.
```
Un compte courant est une sorte de compte et est composé :

```
- De tout ce qui compose un compte ;
- D’un découvert autorisé, non modifiable, défini à l’ouverture du compte ;
- Le résumé d’un compte courant affiche le solde, le propriétaire, le découvert autorisé ainsi
que les opérations sur le compte.
```
Un compte épargne entreprise est une sorte de compte et est composé :

```
- De tout ce qui compose un compte ;
- D’un taux d’abondement, défini à l’ouverture du compte en fonction de l’ancienneté du
salarié. Un taux est un double compris entre 0 et 1. (5% = 0.05) ;
```
Une opération bancaire est composée :

```
- D’un montant ;
- D’un type de mouvement, crédit ou débit.
```
Créer une telle application avec les informations suivantes :

```
- Le compte courant de Nicolas a un découvert autorisé de 2000€
- Le compte épargne entreprise de Nicolas a un taux de 2%
- Le compte courant de Jérémie a un découvert autorisé de 500€
- Nicolas touche son salaire de 100€, pas cher payé!
- Il fait le plein de sa voiture : 50€
- Il met de côté sur son compte épargne entreprise la coquette somme de 20€
- Puis il reçoit un cadeau de la banque de 100€ car il a ouvert son compte pendant la période
promotionnelle
- Il remet ses 20€ sur son compte bancaire car finalement, il ne se sent pas méga en sécurité
- Jérémie achète un nouveau PC : 500€
- Puis il rembourse ses dettes à Nicolas : 200€
```
**L’application doit indiquer les soldes de chacun de ces comptes.**


