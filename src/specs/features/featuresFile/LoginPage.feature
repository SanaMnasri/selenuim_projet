@authenfication
Feature: je souuhaite connecter a l application NOPCOMMERCE
  En tanque utulisateur je souhaite connecter

  Background: 
    Given Je me connecte sur l application nopcommerce
    When Je saisis l email "admin@yourstore.com"
    And Je saisis le mot de passe "admin"
    And Je clique sur le bouton login

  @login_cas_passant
  Scenario: Authentification sur l apllication nopcommerce cas passant
    Then Je me rederige vers la page d acceuil "Dashboard"

  @Disconnect
  Scenario: deconneection de  l apllication nopcommerce cas passant
    And Je clique sur le bouton logout
    Then Je me dérige vers la page d authentification "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F"
