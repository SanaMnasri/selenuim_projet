package com.e2eTest.automation.step_definitions;

import com.e2eTest.automation.page_objects.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition {
	public LoginPage  loginPage;

	public LoginStepDefinition() {
		loginPage = new LoginPage();
	}
	
	@Given("Je me connecte sur l application nopcommerce")
	public void jeMeConnecteSurLApplicationNopcommerce() {
		loginPage.goToUrl();
	}
 
	

	@When("Je saisis l email {string}")
	public void jeSaisisLEmail(String email) {
		loginPage.fillEmail(email);
	    
	}



	@When("Je saisis le mot de passe {string}")
	public void jeSaisisLeMotDePasse(String Password) {
		loginPage.fillPassword(Password);
	
	}
	@When("Je clique sur le bouton login")
	public void jeCliqueSurLeBoutonLogin() {
	    loginPage.clickOnBtnLogin();
	}
	@Then("Je me rederige vers la page d acceuil")
	public void jeMeRederigeVersLaPageDAcceuil() {
	    
	}




}
