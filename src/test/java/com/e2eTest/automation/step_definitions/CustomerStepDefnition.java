package com.e2eTest.automation.step_definitions;

import com.e2eTest.automation.page_objects.CustomerPage;

import com.e2eTest.automation.utils.ConfigFileReader;
import com.e2eTest.automation.utils.DateUtil;
import com.e2eTest.automation.utils.SelectFromListUtils;
import com.e2eTest.automation.utils.SeleniumUtils;
import com.e2eTest.automation.utils.Validations;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class CustomerStepDefnition {
	public CustomerPage customerpage;
	public SeleniumUtils seleniumUtils;
	public ConfigFileReader configFileReader;
	public Validations validation;
	public SelectFromListUtils selectFromListUtils;
	public DateUtil dateUtil;
	public CustomerStepDefnition() {
		customerpage = new CustomerPage();
		seleniumUtils = new SeleniumUtils();
		validation = new Validations();
		configFileReader = new ConfigFileReader();
		selectFromListUtils = new SelectFromListUtils();
		dateUtil = new DateUtil();

	

	}

	@When("Je clique sur le bouton Customers")
	public void jeCliqueSurLeBoutonCustomers() {
		seleniumUtils.click(customerpage.getCustomerWrappedElement(customerpage.getCustomerIcon()));
	}
	@When("Je clique sur le bouton Sous Menu Customers")
	public void jeCliqueSurLeBoutonSousMenuCustomors() {
		seleniumUtils.clickOnElementUsingJs(customerpage.getCustomerWrappedElement(customerpage.getCustomerBtn()));
	}
	@When("Je clique sur le bouton Add new")
	public void jeCliqueSurLeBoutonAddNew() {
		seleniumUtils.click(customerpage.getCustomerWrappedElement(customerpage.getAddNewBtn()));
	}

	
	

	@When("Je saisis le Password de formulaire Customers {string}")
	public void jeSaisisLePasswordDeFormulaireCustomers(String pwd) {
		seleniumUtils.writeText(customerpage.getCustomerWrappedElement(customerpage.getPassword()), pwd);
	}
	@When("Je saisis le FirstName {string}")
	public void jeSaisisLeFirstName(String first) {
		seleniumUtils.writeText(customerpage.getCustomerWrappedElement(customerpage.getFirstName()), first);
	}
	@When("Je saisis le LastName {string}")
	public void jeSaisisLeLasttName(String last) {
		seleniumUtils.writeText(customerpage.getCustomerWrappedElement(customerpage.getLastName()), last);
	}
	@When("Je clique sur le bouton Female")
	public void jeCliqueSurLeBoutonFemale() {
		seleniumUtils.click(customerpage.getCustomerWrappedElement(customerpage.getGenderFemale()));
	}

	
	@When("Je saisis la date de naissance de customers")
	public void jeSaisisLaDateDeNaissanceDeCustomers() {
		seleniumUtils.writeText(customerpage.getCustomerWrappedElement(customerpage.getDateOfBirth()), DateUtil.getDateInJava());
	}

	@When("Je choisis le nom de l entreprise {string}")
	public void jeChoisisLeNomDeLEntreprise(String compName) {
		seleniumUtils.writeText(customerpage.getCustomerWrappedElement(customerpage.getCompany()), compName);
	}
	@When("J active Is tax exempt")
	public void jActiveIsTaxExempt() {
		seleniumUtils.click(customerpage.getCustomerWrappedElement(customerpage.getIsTaxExempt()));
	}
	@When("Je choisis le Newsletter {string} {string}")
	public void jeChoisisLeNewsletter(String writeText, String textToSelect) throws InterruptedException  {
		seleniumUtils.autoSuggest(customerpage.getCustomerWrappedElement(customerpage.getNewsLetter()),writeText , textToSelect);
		
	}
	@When("Je choisis le Customers Roles {string} {string}")
	public void jeChoisisLeCustomersRoles(String txt, String select) throws InterruptedException {
		seleniumUtils.autoSuggest(customerpage.getCustomerWrappedElement(customerpage.getCustomerRoles()), txt, select);
	}
	@When("Je choisis le Manage of vendor {string}")
	public void jeChoisisLeManageOfVendor(String vendor) {
		selectFromListUtils.selectDropDownListByVisibleText(customerpage.getCustomerWrappedElement(customerpage.getManagerOfVender()), vendor);
	}
	@When("Je saisie un commentaire {string}")
	public void jeSaisieUnCommentaire(String comm) {
		seleniumUtils.writeText(customerpage.getCustomerWrappedElement(customerpage.getAdminComment()), comm);
	}
	@When("Je clique sur le bouton Save")
	public void jeCliqueSurLeBoutonSave() {
		seleniumUtils.click(customerpage.getCustomerWrappedElement(customerpage.getSaveBtn()));	}
	@Then("Je verifie le message succes {string}")
	public void jeVerifieLeMessageSucces(String title) {
		validation.assertTrue(customerpage.getCustomerWrappedElement(customerpage.getnewCustomer()), title);
	}


	@When("Je saisis l email de formulaire Customers {string}")
	public void jeSaisisLEmailDeFormulaireCustomers(String string) {
		seleniumUtils.writeText(customerpage.getCustomerWrappedElement(customerpage.getEmail()), seleniumUtils.getSaltString()+"@gmail.com");
	
	}
	@When("Je saisis la date de naissance de customers {string}")
	public void jeSaisisLaDateDeNaissanceDeCustomers(String string) {
		
		seleniumUtils.writeText(customerpage.getCustomerWrappedElement(customerpage.getDateOfBirth()), DateUtil.getDateInJava());
	}

	
	
	



}