# Application de Calcul des Impôts Locaux

## Description
Cette application mobile permet de calculer les impôts locaux en fonction de la surface de l'habitation, du nombre de pièces et de la présence d'une piscine. L'utilisateur peut saisir ces informations via une interface simple et obtenir un calcul automatique des impôts.

### Formules de calcul :
- **Impôt de base** = `surface * 2`
- **Impôt supplémentaire** = `(nombre de pièces * 50) + 100` (si piscine cochée)

## Fonctionnalités
- Saisie des informations suivantes :
  - **Nom**
  - **Adresse**
  - **Surface** (en m²)
  - **Nombre de pièces**
  - **Présence d'une piscine** (case à cocher)
- Calcul automatique des impôts :
  - **Impôt de base**
  - **Impôt supplémentaire**
  - **Impôt total**
- Affichage des résultats après avoir cliqué sur le bouton **Calcul**.

## Interface utilisateur
L'interface inclut les éléments suivants :
- Des **champs de texte** pour la saisie du nom, de l'adresse, de la surface, et du nombre de pièces.
- Une **case à cocher** pour indiquer la présence d'une piscine.
- Un bouton **Calcul** pour déclencher le calcul des impôts.
- Un **affichage des résultats** sous forme d'impôts de base, impôts supplémentaires et impôt total.


## Technologies utilisées
- **Langage** : Java (Android SDK)
- **Interface utilisateur** : XML (pour la mise en page Android)
- **Plateforme** : Android

## Instructions d'installation
1. Clonez ce dépôt GitHub.
2. Ouvrez le projet dans Android Studio.
3. Exécutez l'application sur un émulateur Android ou un appareil physique.

## Utilisation
1. Saisissez les informations dans les champs appropriés.
2. Cochez la case "Piscine" si applicable.
3. Appuyez sur le bouton **Calcul** pour obtenir le montant des impôts locaux.
4. Le montant de base, l'impôt supplémentaire et l'impôt total s'afficheront en bas de l'écran.
