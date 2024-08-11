package com.e2eTest.automation.page_objects;



	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.WrapsElement;
	import com.e2eTest.automation.utils.Setup;
	public class CustomerPage {

		/* Retrieve Element of customer form*/

		// final static customersBtn = "//a[@href='/Admin/Customer/List']//p[contains(text(),'Customers')]";

		private WebDriver driver = Setup.getDriver();
		private By customerIcon = By.xpath("//a[@href='#']//p[contains(text(),'Customers')]");
		private By customerBtn = By.xpath("//a[@href='/Admin/Customer/List']//p[contains(text(),'Customers')]");
		private By addNewBtn = By.xpath("//a[normalize-space()='Add new']");
		private By email = By.id("Email");
		private By password = By.id("Password");
		private By firstName = By.id("FirstName");
		private By lastName = By.id("LastName");
		private By genderMale = By.id("Gender_Male");
		private By genderFemale = By.id("Gender_Female");
		private By dateOfBirth = By.id("DateOfBirth");
		private By companyName = By.id("Company");
		private By isTaxExempt = By.id("IsTaxExempt");
		private By newsLetter = By.xpath("//div[@class='input-group-append']//input[@role='listbox']");
		private By customerRoles = By.xpath("//*[@id=\"customer-info\"]/div[2]/div[10]/div[2]/div/div[1]/div/div/input");
		private By managerOfVender = By.id("VendorId");
		private By adminComment = By.id("AdminComment");
		private By saveBtn = By.xpath("//button[@name='save']");
		private By newCustomer = By.xpath("/html/body/div[3]/div[1]/div[1]");
		/*this code will locate a web element on the web page
		 *  using the emailLocator mechanism and return it
		 *   as a WebElement object.
		 *    */
	public WebElement getCustomerIcon() {
		return driver.findElement(customerIcon);
	}
	public WebElement getCustomerBtn() {
		return driver.findElement(customerBtn);
	}
	public WebElement getAddNewBtn() {
		return driver.findElement(addNewBtn);
	}
	public WebElement getEmail() {
		return driver.findElement(email);
	}
	public WebElement getPassword() {
		return driver.findElement(password);
		
	}
	public WebElement getFirstName() {
		return driver.findElement(firstName);
	}
	public WebElement getLastName() {
		return driver.findElement(lastName);
	}
	public WebElement getGenderMale() {
		return driver.findElement(genderMale);
	}
	public WebElement getGenderFemale() {
		return driver.findElement(genderFemale);
	}
	public WebElement getDateOfBirth() {
		return driver.findElement(dateOfBirth);
	}
	public WebElement getCompany() {
		return driver.findElement(companyName);
	}
	public WebElement getIsTaxExempt() {
		return driver.findElement(isTaxExempt);
	}
	public WebElement getNewsLetter() {
		return driver.findElement(newsLetter);
	}
	
	public WebElement getCustomerRoles() {
		return driver.findElement(customerRoles);
	}
	public WebElement getManagerOfVender() {
		return driver.findElement(managerOfVender);
	}
	public WebElement getAdminComment() {
		return driver.findElement(adminComment);
	}
	public WebElement getSaveBtn() {
		return driver.findElement(saveBtn);
	}
	public WebElement getnewCustomer() {
		return driver.findElement(newCustomer);
	}
	
	/*this code is creating a WrapsElement object that wraps the emailElement 
	 * object obtained by calling the getEmailElement() method,
	 * and then returning the underlying WebElement object wrapped
	 * by this WrapsElement object.
	 */
	
	public WebElement getCustomerWrappedElement(WebElement webelement ) {
		//WebElement customerIconElement = getCustomerIcon();
		WrapsElement wrappedCustomerWebelement = new WrapsElement() {
			public WebElement getWrappedElement() {
				return webelement;
			}
			
			};
		return wrappedCustomerWebelement.getWrappedElement();
			}
	
	//	@FindBy(how = How.XPATH, using = "//a[@href='#']//p[contains(text(),'Customers')]")
	//	public static WebElement customers;
	//
	//	
	//	@FindBy(how = How.XPATH, using = "//a[@href='/Admin/Customer/List']//p[contains(text(),'Customers')]")
	//	public static WebElement customersField;
	//	
	//	
	//	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div[1]/form[1]/div/div/a")
	//	public static WebElement btnAdd;
	//	
	//	
	//	@FindBy(how = How.ID, using = "Email")
	//	public static WebElement emailCustomer;
	//	
	//	
	//	@FindBy(how = How.ID, using = "Password")
//	public static WebElement pwdCustomer;
	//	
	//	
	//	@FindBy(how = How.ID, using = "FirstName")
	//	public static WebElement firstName;
	//	
	//	
	//	@FindBy(how = How.ID, using = "LastName")
	//	public static WebElement lastName;
	//	
	//	
	//	@FindBy(how = How.ID, using = "Gender_Female")
	//	public static WebElement gender;
	//	
	//	
	//	@FindBy(how = How.ID, using = "DateOfBirth")
	//	public static WebElement birthday;
	//	
	//	
	//	@FindBy(how = How.ID, using = "Company")
//	public static WebElement companyName;
	//	
	//	
	//	@FindBy(how = How.ID, using = "IsTaxExempt")
	//	public static WebElement isTaxExempt;
	//	
	//	
	//	@FindBy(how = How.XPATH, using = "//div[@class='input-group-append']//div[@role='listbox']")
	//	public static WebElement newsletter;
	//	
	//	
	//	@FindBy(how = How.XPATH, using = "//*[@id=\"customer-info\"]/div[2]/div[10]/div[2]/div/div[1]/div/div")
	//	public static WebElement customerRole;
	//	
	//	
	//	@FindBy(how = How.ID, using = "VendorIdt")
	//	public static WebElement vendor;
	//	
	//	
	//	@FindBy(how = How.ID, using = "Active")
//	public static WebElement active;
	//	
	//	
	//	@FindBy(how = How.ID, using = "AdminComment")
	//	public static WebElement comment;
	//	
	//	
	//	@FindBy(how = How.XPATH, using = "//button[@name='save']")
	//	public static WebElement btnSave;
	//	
	//	
	//	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div[1]/div[1]")
	//	public static WebElement message;
	//	
	//	public CustomersPage() {
	//		PageFactory.initElements(Setup.getDriver(), this);
	//	}
		
	
	
	}

