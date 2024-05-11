@authenfication
Feature: je souuhaite connecter a l application NOPCOMMERCE
  En tanque utulisateur je souhaite connecter

  @login_cas_passant 
  Scenario: Authentification sur l apllication nopcommerce cas passant
    Given Je me connecte sur l application nopcommerce
    When Je saisis l email "admin@yourstore.com"
    And Je saisis le mot de passe "admin"
    And Je clique sur le bouton login
    Then Je me rederige vers la page d acceuil 
