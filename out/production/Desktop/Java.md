# Java (POO)

### 0. Intro

Créer en 1991, 2 dev de chez Sun (James Gosling et Patrick Naughton)

Sa conception répons aux besoins :
- plateformes simples et performantes
- Langage destiné au dev d'app sécurisées sur des systèmes hétérogènes
- langage conso un minimum de ressources

Réponse efficace à ses besoin
- Langage interprété / OO, optimiser le temps de développement
- JRE = moteur exec
- mecanisme de gestion des erreurs
- FRED : multi thread (processus légés)

### 1. plateforme

> Env logiciel

- Machine Virt Java (JVM)
- API Java (trois catégories Accès data/ gesiton interface user / APis de base)
- Outils de déploiement d'applicaitons
- Outilsd'aide dev

#### caractéristiques

Java est un langageest un lang et une plateforme de développement

- Objet
- Distribué
- performantes
- dynamique
- indept des archi

a. Syntaxe similaire à celles des langages C /C++

- **3 types primitifs**
- tableau / chaine char == objets
- gestion de memoire par garbage collector
- Pas de fichier d'entêtes
- mécanimsme de simulation d'héritage
- référence sur des objets sur des cases ou tableau (!== pointeur)

b. OO

- o objet conçu sur le modèle d'autres langages
- fourni sur un ensemble de classes qui permet de créer toutes sortes d'objets

- type verbeux / type strict

c. interprété

prog java pas exécuté, interprété par une machine virtuelle ou JVM

e. Robuste

f sécurisés

- Jre d'occupe de la sécurité : Processus de ClassLoader. Vérifif non execution de pointeur, 
produit du `bytecode` indépendant de toutes arch

- ByteCode intermédiaire contenu dans les objets

h; Multitâche

- PLusieurs traitemenbt simultanéments, plusieurs threads (proc léger) ==> accroitre la rapidité

### 2. Cycle dev

##### Jdk =
- Api standard pour compiler,
- Chaque classe doit être contenu dans un fichjier `.java`, Une seule de ces classe peut êtredéclarée publuque.

# 1. Bases du langage

#### A. variables

- Commence par une letter
- lettre /chiffre /char souligné
- max 1023 chars
- distinctions entre min et msjsdiag
- mots clé

#### B. Type de var
Deux cat de type :
- Type value (contient les infos)
- Type ref (addresse mémoire où se trouvent les infos)

> &rarr; programme dans le mémoire

8 type primitifs (signé) :
```
char, Byte 
```
Chacun de ces type possède une classe appelée wrapper

`new Integer(25)`

#### C. val par default

- Type num à 0
- char : unicode \0000

#### D. valeurs littérales
>Les valeur num peuvent être use avec 

### 3. les énumérations

public enum Jours
{
    DIMANCHE,
    LUNDI,
    MARDI,
    MERCREDI
}

La première valeur de l'enum a pour index 0,
les constantes suivantes sont initialiser avec un increment de 1.

### 