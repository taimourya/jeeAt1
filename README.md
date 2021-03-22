# Explication du projet (Realiser par Taimourya yahya)
le projet contient 3 couche

##### Couche Dao
c'est la couche responsable de l'accees aux donnees elle contient une interface
IDao et une class DaoImp qui l'implemente

##### Couche Metier
c'est la couche responsable des besoins d'un metier elle contient une
interface IMetier et une class MetierImp qui l'implemente,
la class MetierImp doit avoir accees aux donnees pour fonctionner
donc elle est en relation avec Idao (composition faible) 

##### Couche Presentation
c'est la couche responsable de la presentation et l'affichage pour nous
ca sera en mode console

## Inversion de control (injection de dependance)
### commit 1 (injection manuelle)
instanciation de DaoImp et MetierImp et l'injection du dao pour le metier
avec un setDao

###### Avantage
facile a utiliser
###### inconvénient
on est obliger de modifier le code plus tard si on a une nouvelle implementation
de IDao ou IMetier ce qui n'est pas pratique


### commit 2 commit (injection avec fichier txt)
creation d'un fichier dependance.txt qui contient le nom des classes qu'on souhaite
injecter dynamique. au niveau du code on doit lire le fichier txt ligne par ligne
et instancier dynamique les classes avec Class.forname et class.newInstance 
apres on injecte avec un setDao

###### Avantage
le seul endroid au y'aura des modification sera le fichier txt (dependance.txt)
###### inconvénient
si on a plusieurs classe a injecter et a instancier dynamique y'aura une Redondance 
de code donc on v'as faire des copier coller

### commit 3 commit (injection avec spring beans)
import des dependances (spring-core, spring-context et spring-beans) dans le fichier
de configuration de maven (pom.xml) et ensuite la creation du fichier xml (confBean.xml)
et creation des beans à l'interieur

###### Avantage
le seul endroid au y'aura des modification sera le fichier xml (confBean.xml)
plus de redandance de code puisque c'est spring qui va s'occuper de coder a notre place
###### inconvénient
pas d'inconvenion

### commit 4 commit (injection avec spring annotation)
utilisation des annotation component pour dire a spring que la classe concerner doit etre ajouter
aux beans et l'annotation autowired pour dire a spring que l'attribue doit etre injecter automatiquement

###### Avantage
la methode la plus facile a utiliser
###### Inconvenion
pas d'inconvenion

