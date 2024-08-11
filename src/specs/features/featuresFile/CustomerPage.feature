@ajout_client
Feature: je souhaite l ajout d un nouveau client

  Background: 
    Given Je me connecte sur l application nopcommerce
    When Je saisis l email "admin@yourstore.com"
    And Je saisis le mot de passe "admin"
    And Je clique sur le bouton login

  @remplir_formulaire
  Scenario: remplir le formulaire de la clientele de NOPCOMMERCE
    When Je clique sur le bouton Customers
    And Je clique sur le bouton Sous Menu Customers
    And Je clique sur le bouton Add new
    And Je saisis l email de formulaire Customers "mnasrisana89@gmmail.com"
    And Je saisis le Password de formulaire Customers "admin"
    And Je saisis le FirstName "MNASRI"
    And Je saisis le LastName "SANA"
    And Je clique sur le bouton Female
    And Je saisis la date de naissance de customers "08/11/1989"
    And Je choisis le nom de l entreprise "STEG"
    And J active Is tax exempt
    And Je choisis le Newsletter "Test" "Test store 2"
    And Je choisis le Customers Roles "Registered" "Registered"
    And Je choisis le Manage of vendor "Vendor 1"
    And Je saisie un commentaire "Customer form has been filled"
    When Je clique sur le bouton Save
    Then Je verifie le message succes "The new customer has been added successfully."
