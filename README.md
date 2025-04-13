<h3>Création du projet et structure de base</h3>
<img src="captures/structureprojet3.png">

<h3>Partie 1</h3>
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
<h4>c. En utilisant le Framework Spring</h4>
<h5> Version XML </h5>
<ul>
<li>Création du fichier config.XML</li>
<img src="captures/création-fichier-configXML.png">
<br/>
<li>Création de la nouvelle version de la couche présentation UISpringXML + Test</li>
<img src="captures/creation-UISpringXML.png">
<br/>
<li>Modification du fichier de configuration pour la prise en compte de la nouvelle version de la couche Dao</li>
<img src="captures/DaoImplV2-SpringXML.png">
<br/>
<li>Test de la UISpringXML avec la nouvelle implémentation de la couche Dao</li>
<img src="captures/Test-Nouvelle-Version-Capteurs.png">
</ul>

<h5> Version Annotations </h5>
<ul>
<li>Annotation de implémentation de la couche dao avec @Component</li>
<img src="captures/dao-annotation.png">
<br/>
<li>Annotation de implémentation de la couche métier avec @Component + @Autowired + @Qualifier</li>
<img src="captures/metier-annotation-@Autowired.png">
<br/>
<li>Création de la nouvelle version de la couche présentation UISpringAnnotation + Test (version base de données)</li>
<img src="captures/creation-UISpringAnnotation+Test1.png">
<br/>
<li>Injection des dépendances via le constructeur (couche métier) et l'annotation @Qualifier (Version capteur)</li>
<img src="captures/metier-annotation-via-constructeur.png">
<br/>
<li>Couche présentation UISpringAnnotation + Test Version capteur</li>
<img src="captures/UISpringAnnotation%20+%20Test%20Version%20Capteur.png">
</ul>
<br/>
<br/>

<h3>Partie 2 : Mini projet (Framework Injection de dépendance)</h3>
