🏦 Web Service SOAP – Client / Serveur (Java – JAX-WS)

Ce dépôt contient une implémentation simple d’un Web Service SOAP en Java en utilisant JAX-WS.
Le projet est divisé en deux projets Eclipse distincts :

BanqueSOAPServer : Serveur SOAP

BanqueSOAPClient : Client SOAP

📌 Objectif du projet

Comprendre :

le fonctionnement d’un Web Service SOAP

la génération automatique du WSDL

l’échange de messages XML (SOAP)

la consommation du service par un client Java

🧱 Architecture du projet
ClientSOAP  --->  SOAP (XML/WSDL)  --->  ServerSOAP


Le serveur expose des méthodes via HTTP

Le client consomme ces méthodes à partir du WSDL

Le client n’accède jamais directement au code du serveur

📁 Structure des projets
📂 BanqueSOAPServer
src/
 └── com.banque.soap
     ├── BanqueService.java
     ├── Compte.java
     └── ServerJWS.java

📂 BanqueSOAPClient
src/
 └── com.banque.soap.client
     └── ClientSOAP.java

⚙️ Technologies utilisées

Java SE 8

JAX-WS (SOAP)

Eclipse IDE

HTTP (Serveur standalone)

▶️ Comment exécuter le projet (IMPORTANT)
✅ Étape 1 : Lancer le serveur SOAP

Ouvrir le projet BanqueSOAPServer dans Eclipse

Ouvrir la classe ServerJWS.java

Clic droit → Run As → Java Application

Vérifier dans la console :

Serveur SOAP démarré sur : http://localhost:9001/BanqueService


Ouvrir le navigateur et vérifier le WSDL :

👉 http://localhost:9001/BanqueService?wsdl

✅ Le fichier XML (WSDL) doit s’afficher

✅ Étape 2 : Lancer le client SOAP

Ouvrir le projet BanqueSOAPClient

Ouvrir la classe ClientSOAP.java

Clic droit → Run As → Java Application

Résultat attendu dans la console :

TEST CONVERSION
Conversion de 100 : 1000.0

TEST GET COMPTE
Code : 1
Solde : 5000.0

TEST GET COMPTES
Compte 1 | Solde : 1000.0
Compte 2 | Solde : 2000.0

🔄 Fonctionnement SOAP (Résumé)

Le serveur expose des méthodes avec @WebService

JAX-WS génère automatiquement le WSDL

Le client lit le WSDL

Le client crée un proxy Java

Les appels Java sont transformés en messages XML SOAP

Le serveur retourne une réponse XML SOAP

<img width="1092" height="638" alt="image" src="https://github.com/user-attachments/assets/7f359a3b-70ee-46dd-a020-ffeb03196e9e" />


Les captures suivantes sont fournies dans le dossier /screenshots :

WSDL affiché dans le navigateur

Exécution du serveur dans Eclipse

Résultat du client dans la console

(Ajoutez ici vos images GitHub)

Exemple :

/screenshots
 ├── wsdl.png
 ├── server_console.png
 └── client_console.png

⚠️ Remarques importantes

Tomcat n’est pas requis

Le serveur SOAP est un serveur HTTP standalone

Le port utilisé est 9001 pour éviter les conflits

Le serveur doit être lancé avant le client

👨‍🎓 Auteur

Nom : Ahmed Yahya

Filière : SI-M2

Module : Web Services / SOA

Année universitaire : 2025–2026

✅ Conclusion

Ce projet démontre clairement le principe des Web Services SOAP :

séparation Client / Serveur

communication via XML

indépendance des plateformes

architecture distribuée


