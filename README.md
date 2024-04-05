# Projet JHotDraw(Partie 2)

# Génie logiciel

# Author: Omar KODE OUSMANE
# Groupe: 5

# Projet sélectionné : JHotDraw 

Voici le lien du compte rendu de la première partie du projet : [Première partie du projet](<Rapport Partie 1>)

## Suppression des propriétés dupliquées dans Labels.properties
J'ai remarqué que dans les fichiers Labels.properties des packages jhotdraw-app, jhotdraw-figures, jhotdraw-actions et jhotdraw-samples.jhotdraw-samples-misc, il y a des propriétés dupliquées. J'ai donc supprimé les propriétés dupliquées dans ces fichiers.

Voici les liens des commits correspondants à la suppression des propriétés dupliquées dans les fichiers Labels.properties des packages jhotdraw-app, jhotdraw-actions et jhotdraw-samples.jhotdraw-samples-misc :

- [Suppression des propriétés dupliquées dans Labels.properties du package jhotdraw-app](https://github.com/omar202002/jhotdraw/commit/13afdaea6174bdd47a1fd53f0a0f435b0b714acf)
- [Suppression des propriétés dupliquées dans Labels.properties du package jhotdraw-actions](https://github.com/omar202002/jhotdraw/commit/660af2dae1ba0bd62ade3d775963b2cdfaa0551f)
- [Suppression des propriétés dupliquées dans Labels.properties du package jhotdraw-samples.jhotdraw-samples-misc](https://github.com/omar202002/jhotdraw/commit/c5e3dc9b2252e07580a89a866383c78dec41d3a8)

## Suppression de code dupliqué entre les classes
Comme suggéré dans la partie 1 du projet, j'ai cherché du code dupliqué dans certaines classes du projet JHotDraw et j'ai pu en trouver. 
### Suppression de code dupliqué entre les classes AbstractAttributedFigure et AbstractAttributedCompositeFigure
J'ai remarqué que les classes AbstractAttributedFigure et AbstractAttributedCompositeFigure ont du code dupliqué. La classe AbstractAttributedCompositeFigure qui, hérite de la classe AbstractAttributedFigure a dans une partie sa méthode `drawFigure`, le même code que la méthode `draw` de la classe AbstractAttributedFigure dont elle hérite. J'ai donc supprimé ce code dupliqué en déplaçant la méthode `draw` de la classe AbstractAttributedFigure dans la classe AbstractAttributedCompositeFigure.

Voici le lien du commit correspondant à la suppression du code dupliqué entre les classes AbstractAttributedFigure et AbstractAttributedCompositeFigure : [Suppression de code dupliqué entre les classes AbstractAttributedFigure et AbstractAttributedCompositeFigure](https://github.com/omar202002/jhotdraw/commit/48ee54fcc9e3539ebd51178006a82014a14c1dfc)

### Suppression de code dupliqué entre les classes BezierFigure et SVGBezierFigure
J'ai remarqué que les classes BezierFigure et SVGBezierFigure ont du code dupliqué. La classe SVGBezierFigure qui, hérite de la classe BezierFigure a dans une partie sa méthode `handleMouseClick` le même code que la méthode `handleMouseClick` de la classe BezierFigure dont elle hérite. J'ai donc supprimé ce code dupliqué et j'ai créé une méthode `handleNodeCreation` dans la classe BezierFigure qui est appelée dans la méthode `handleMouseClick` de la classe BezierFigure et dans la méthode `handleMouseClick` de la classe SVGBezierFigure.

Voici le lien du commit correspondant à la suppression du code dupliqué entre les classes BezierFigure et SVGBezierFigure : [Suppression de code dupliqué entre les classes BezierFigure et SVGBezierFigure](https://github.com/omar202002/jhotdraw/commit/0867a23ebc60739bbac53b0f2f357901cefe77e7)

## Mise à jour de l'utilisation de System.getProperty("line.separator") vers System.lineSeparator() pour respecter les conventions modernes de la JVM de la classe LFWriter.java
Dans la classe LFWriter.java, j'ai remplacé l'utilisation de System.getProperty("line.separator") par System.lineSeparator() pour respecter les conventions modernes de la JVM.

Voici le lien du commit correspondant à la mise à jour de l'utilisation de System.getProperty("line.separator") vers System.lineSeparator() pour respecter les conventions modernes de la JVM de la classe LFWriter.java : [Mise à jour de l'utilisation de System.getProperty("line.separator") vers System.lineSeparator() pour respecter les conventions modernes de la JVM de la classe LFWriter.java](https://github.com/omar202002/jhotdraw/commit/ab3b32b7fba6b9fffef0db4076bfe05790c808d3)

## Ajout de l'annotation @Serial à serialVersionUID
Dans plusieurs classes du projet JHotDraw, on remarque la présence de la variable serialVersionUID, qui est utilisée pour garantir la compatibilité de la sérialisation des objets entre différentes versions de la classe. J'ai ajouté, dans certaines de ces classes l'annotation @Serial à cette variable pour indiquer que la classe respecte la spécification de sérialisation.

Voici le lien du commit correspondant à l'ajout de l'annotation @Serial à serialVersionUID dans certaines classes du projet JHotDraw : [Ajout de l'annotation @Serial à serialVersionUID dans certaines classes du projet JHotDraw](https://github.com/omar202002/jhotdraw/commit/1d0309b44b5adc5e1afe4fce28da54c50bcff785)

## Code commenté
Comme vu dans la partie 1 du projet, il y a certaines classes du projet JHotDraw qui contiennent du code commenté.
Voici les liens des commits correspondants à la suppression du code commenté dans certaines de ces classes :
- [Suppression du code commenté dans la classe AbstractAttributedFigure et AbstractDrawingView](https://github.com/omar202002/jhotdraw/commit/e2db1fff8f41da6e5dc851c5e43dc07e6a33130a)

## Changement et renommage de variables
Dans la classe AppletApplicaton, l'une de ses variables nommée `applet` avait pour type JApplet. Mais ce type faisant partie je la version 9 de Java, j'ai décidé de le changer en JFrame qui est une classe plus ancienne et qui est compatible avec les versions antérieures de Java. J'ai également renommé cette variable en `frame`.

Voici le lien du commit correspondant au changement de type et renommage de la variable `applet` en `frame` dans la classe AppletApplicaton : [Changement de type et renommage de la variable `applet` en `frame` dans la classe AppletApplicaton](https://github.com/omar202002/jhotdraw/commit/b7174cb133aefecebd238ac930515cc0b6877135)

## Reduction de la complexité cyclomatique d'une méthode

J'ai décidé de modifier la méthode `doIt` de la classe `LoadRecentFileAction` pour réduire sa complexité cyclomatique. Cette fonction codée sur 102 ligne a un e complexté cyclomatique de 10.

Dans ce code, j'ai décomposé la méthode doIt(View v) en plusieurs méthodes plus petites : checkFileExists, handleSuccessfulFileLoad, handleFailedFileLoad, et finished.
Voici le lien du commit correspondant à la réduction de la complexité cyclomatique de la méthode `doIt` de la classe `LoadRecentFileAction` : [Réduction de la complexité cyclomatique de la méthode `doIt` de la classe `LoadRecentFileAction`](https://github.com/omar202002/jhotdraw/commit/9fefc5abccf3dcb951ccf129c8d2fc9dccec146f)

## Suppression d'une classe statique inutile

J'ai supprimé la classe statique inutile `LocatorLayouterFirstFigure` qui se trouve dans le package `LocatorLayouter`, et j'ai déplacé son contenu dans la classe `LocatorLayouter`.

Voici le lien du commit correspondant à la suppression de la classe statique inutile `LocatorLayouterFirstFigure` : [Suppression de la classe statique inutile `LocatorLayouterFirstFigure`](https://github.com/omar202002/jhotdraw/commit/f34f9900d96de9bf33f8e3dbdd2b9ef21ce2cbdb)

## Réorganisation d'une classe:

J'ai reorganisé la classe `AbstractApplicationAction` en déplaçant les méthodes `get` et `set`.

Voici le lien du commit correspondant à la réorganisation de la classe `AbstractApplicationAction` : [Réorganisation de la classe `AbstractApplicationAction`](https://github.com/omar202002/jhotdraw/commit/6a497bb80deb1e22fe60ab9b6648594e64816b02)


# Conclusion

Ce projet m'a permis de mieux comprendre le fonctionnement d'un projet open source et de contribuer à son amélioration. J'ai pu appliquer les notions apprises en cours de génie logiciel et j'ai pu découvrir de nouvelles notions. J'ai également pu travailler en équipe et j'ai pu améliorer mes compétences en programmation Java.
Il y a quelques modifications que j'aurais aimé apporter au projet mais je n'ai pas pu le faire faute de temps. Je pense que ce projet m'a permis de mieux comprendre le fonctionnement d'un projet open source et de contribuer à son amélioration. J'ai pu appliquer les notions apprises en cours de génie logiciel et j'ai pu découvrir de nouvelles notions concernant le refactoring de code et la gestions des branches sur Git.