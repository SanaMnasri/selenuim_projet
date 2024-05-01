@authenfication
Feature: je souuhaite connecter a l application SWAGLABSS
  En tanque utulisateur je souhaite connecter

  @login_cas_passant 
  Scenario: Authentification sur l apllication swaglabs cas passant
    Given Je me connecte sur l application SWAGLABSS
    When Je saisis le user name "standard_user"
    And Je saisis le mot de passe "secret_sauce"
    And Je clique sur le bouton login
    Then Je me rederige vers la page d acceuil "Products"
