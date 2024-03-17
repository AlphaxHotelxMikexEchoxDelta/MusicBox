# MusicBox
**MusicBox** est une application Java complète qui permet la gestion d'éléments musicaux tels que des chansons et des livres audio, ainsi que la création et la gestion de playlists. Voici un aperçu des fonctionnalités principales et de la structure du projet :

### Fonctionnalités principales :

1. **Gestion des éléments musicaux** :
   - Les chansons et les livres audio sont gérés avec leurs attributs respectifs tels que le titre, l'artiste (ou l'auteur), la durée, l'identifiant unique et le contenu audio.
   - Les langues sont prises en charge pour les livres audio, avec une sélection parmi le français, l'anglais, l'italien, l'espagnol et l'allemand.

2. **Gestion des playlists** :
   - Les playlists peuvent être créées, renommées et supprimées.
   - Les playlists peuvent contenir à la fois des chansons et des livres audio.

3. **Commandes Console** :
   - L'application prend en charge plusieurs commandes à la console pour afficher les éléments musicaux et les playlists de différentes manières.
   - Les commandes incluent l'affichage des chansons par artiste, des livres audio par durée et des éléments dans une playlist par ordre alphabétique des titres.
   - Il est possible d'ajouter de nouvelles chansons et livres audio à une playlist existante.

4. **Écoute de musique** :
   - Les utilisateurs peuvent écouter des chansons ou des livres audio directement à partir de l'application.

### Structure du Projet :

1. **Classes et Interfaces** :
   - Le projet utilise au moins une classe abstraite pour gérer les éléments communs entre les chansons et les livres audio.
   - Au moins une interface est utilisée, par exemple, Comparator ou Comparable pour faciliter le tri des éléments.

2. **Utilisation d'IntelliJ et Maven** :
   - Le développement est effectué en utilisant l'IDE IntelliJ IDEA pour la gestion du code.
   - Maven est utilisé pour la gestion des dépendances et la construction du projet.

3. **Diagramme UML de Classe** :
   - Un diagramme UML de classe est fourni avec le projet, illustrant la structure des classes, leurs relations et leurs méthodes.
