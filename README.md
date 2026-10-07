# TP : Inversion de Contrôle et Injection des Dépendances

**Réalisé par :** Oussama Boustane

## Objectif du TP
L'objectif de cette activité pratique est de comprendre et de mettre en œuvre les concepts de **Couplage Faible**, d'**Inversion de Contrôle (IoC)** et d'**Injection des Dépendances (DI)** en Java, en passant d'une méthode classique à l'utilisation du framework Spring.

---

## Partie 1 : Instanciation Statique et Dynamique

Dans cette première partie, nous avons mis en place l'architecture de base (couches DAO et Métier) en respectant le principe du couplage faible (utilisation d'interfaces).

*   **Instanciation statique :** Création des objets et injection de la dépendance via le mot-clé `new`. Bien que fonctionnelle, cette méthode crée un couplage fort au niveau de la couche présentation.
*   **Instanciation dynamique :** Utilisation de l'API `Reflection` de Java et d'un fichier `config.txt`. Cette méthode permet de changer l'implémentation (ex: passer d'une base de données à un capteur) sans modifier ni recompiler le code source, rendant l'application fermée à la modification et ouverte à l'extension.

*(Ajoute ici une capture d'écran de l'exécution de PresDynamique)*

---

## Partie 2 : Le Framework Spring

Pour éviter d'écrire le code complexe de l'instanciation dynamique, nous avons délégué la création et l'injection des objets à **Spring**.

*   **Version XML :** Configuration des beans et de l'injection via le fichier `applicationContext.xml`. Spring lit ce fichier au démarrage pour gérer les dépendances.
    *(Ajoute ici une capture d'écran de l'exécution de PresSpringXML)*

*   **Version Annotations :** Utilisation des annotations `@Component` et `@Autowired`. C'est la méthode la plus moderne : Spring scanne automatiquement les packages pour détecter et injecter les composants.
    *(Ajoute ici une capture d'écran de l'exécution de PresSpringAnnotations)*

---

## Conclusion
Ce TP a permis de démontrer comment l'Inversion de Contrôle délègue la gestion des objets au framework (Spring), permettant au développeur de se concentrer uniquement sur la logique métier tout en garantissant un code maintenable et évolutif.