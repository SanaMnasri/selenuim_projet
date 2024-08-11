package com.e2eTest.automation.step_definitions;

import org.junit.Assert;

import com.e2eTest.automation.page_objects.LoginPage;
import com.e2eTest.automation.utils.SeleniumUtils;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LoginStepDefinition {
	public LoginPage  loginPage;
	public SeleniumUtils  seleniumUtils;

	public LoginStepDefinition() {
		loginPage = new LoginPage();
		seleniumUtils = new SeleniumUtils();
	}
	
	@Given("Je me connecte sur l application nopcommerce")
	public void jeMeConnecteSurLApplicationNopcommerce() {
		loginPage.goToUrl();
	}
 
	

	@When("Je saisis l email {string}")
	public void jeSaisisLEmail(String email) {
		//loginPage.fillEmail(email);
		seleniumUtils.writeText(LoginPage.email, email);
	}



	@When("Je saisis le mot de passe {string}")
	public void jeSaisisLeMotDePasse(String Password) {
		loginPage.fillPassword(Password);
	
	}
	
	@When("Je clique sur le bouton login")
	public void jeCliqueSurLeBoutonLogin() {
	    loginPage.clickOnBtnLogin();
	}
	
	@Then("Je me rederige vers la page d acceuil {string}")
	public void jeMeRederigeVersLaPageDAcceuil(String title) {
		String dashboard_page= LoginPage.msg.getText();
		Assert.assertEquals(dashboard_page, title);
	   
	}
	
	@When("Je clique sur le bouton logout")
	public void jeCliqueSurLeBoutonLogout() {
	    loginPage.clickOnBtnLogout();
	}
	@Then("Je me dérige vers la page d authentification {string}")
	public void jeMeDérigeVersLaPageDAuthentification(String string) {
	     
	}









}
