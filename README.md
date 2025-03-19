<h3>Création du projet et structure de base</h3>
<img src="captures/structureprojet3.png">

<h3>1. Création de l'interface IDao avec une méthode getData</h3>
<img src="captures/interface-IDao.png">

<h3>2. Création d'une implémentation de l'interface IDao</h3>
<img src="captures/implementation-IDaoImpl.png">

<h3>3. Création de l'interface IMetier</h3>
<img src="captures/interface-IMetier.png">

<h3>4. Création d'une implémentation de l'interface IMetier utilisant le couplage faible</h3>
<img src="captures/implementation-MetierImpl.png">

<h3>5. Injection des dépendances</h3>
<h4>a. Par instanciation statique</h4>
<img src="captures/DI-statique.png">

<h4>b. Par instanciation dynamique</h4>
<ul>
<li> Création d'un fichier de configuration contenant les packages et une implémentation des interfaces IDao & IMetier</li>
<img src="captures/config.png">
<br/>
<li> Création de la seconde couche présentation implémentant l'instanciation dynamique</li>
<img src="captures/DI-dynamique.png">
<br/>
<li> Changement du ficheir de configuration pour prendre en compte la nouvelle version de l'interface IDao</li>
<img src="captures/configV2.png">
<br/>
<li> Test après changement de la version du fichier de configuration</li>
<img src="captures/TestConfigV2.png">
</ul>
