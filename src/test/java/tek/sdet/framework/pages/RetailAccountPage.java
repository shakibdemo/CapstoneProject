package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailAccountPage extends BaseSetup {

	public RetailAccountPage() {
		PageFactory.initElements(getDriver(), this);
	}

	@FindBy(id = "nameInput")
	public WebElement nameField;

	@FindBy(id = "personalPhoneInput")
	public WebElement phoneInputField;

	@FindBy(id = "emailInput")
	public WebElement emailInputField;

	@FindBy(xpath = "//button[text()='Update']")
	public WebElement UpdateBtn;

	@FindBy(xpath = "//div[text()='Personal Information Updated Successfully']")
	public WebElement personalInformationUpdateMessage;

	@FindBy(id = "previousPasswordInput")
	public WebElement previousPasswordInput;

	@FindBy(id = "newPasswordInput")
	public WebElement newPasswordInput;

	@FindBy(id = "confirmPasswordInput")
	public WebElement confirmPasswordInput;

	@FindBy(xpath = "//button[text()='Change Password']")
	public WebElement changePasswordbutton;

	@FindBy(xpath = "//div[text()='Password Updated Successfully']")
	public WebElement passwordUpdatedSuccessfullyMessage;

	@FindBy(xpath = "//p[text()='Add a payment method']")
	public WebElement addPaymentMethodLink;

	@FindBy(id = "cardNumberInput")
	public WebElement cardNumberInput;

	@FindBy(id = "nameOnCardInput")
	public WebElement NameOnCardInput;

	@FindBy(id = "expirationMonthInput")
	public WebElement expirationMonthInput;

	@FindBy(id = "expirationYearInput")
	public WebElement expirationYearInput;

	@FindBy(id = "securityCodeInput")
	public WebElement securityCodeInput;

	@FindBy(id = "paymentSubmitBtn")
	public WebElement addYourCardButton;

	@FindBy(xpath = "//div[text()='Payment Method added sucessfully']")
	public WebElement paymentMethodAddedSuccessfullyMessage;

	@FindBy(xpath = "//p[@class='account__payment__sub-text']")
	public WebElement cardEndingNumber;

	@FindBy(xpath = "//button[text()='Edit']")
	public WebElement cardEditButton;

	@FindBy(xpath = "//button[text()='Update Your Card']")
	public WebElement updateCardbutton;

	@FindBy(xpath = "//div[text()='Payment Method updated Successfully']")
	public WebElement paymentMethodUpdatedSuccessfullyMessage;

	@FindBy(xpath = "//button[text()='remove']")
	public WebElement removeCard;

	@FindBy(xpath = "//p[@class='account__payment__sub-text']")
	public WebElement cardPresent;

	@FindBy(xpath = "//p[text()='Add Address']")
	public WebElement addAddressButton;

	@FindBy(id = "countryDropdown")
	public WebElement countryDropDown;

	@FindBy(id = "fullNameInput")
	public WebElement addressfullName;

	@FindBy(id = "phoneNumberInput")
	public WebElement addressPhoneNumber;

	@FindBy(id = "streetInput")
	public WebElement addressStreetinput;

	@FindBy(id = "apartmentInput")
	public WebElement aptInput;

	@FindBy(id = "cityInput")
	public WebElement cityInput;

	@FindBy(xpath = "//select[@name='state']")
	public WebElement stateInput;

	@FindBy(id = "zipCodeInput")
	public WebElement zipCodeInput;

	@FindBy(xpath = "//button[text()='Add Your Address']")
	public WebElement addYourAddressInput;

	@FindBy(xpath = "//div[text()='Address Added Successfully']")
	public WebElement addAddressSuccessfullMessage;

	@FindBy(xpath = "//button[text()='Edit']")
	public WebElement EditAddressbutton;

	@FindBy(xpath = "//button[text()='Update Your Address']")
	public WebElement updateAddressButton;

	@FindBy(xpath = "//div[text()='Address Updated Successfully']")
	public WebElement addressUpdatedSuccessfullyMessage;

	@FindBy(xpath = "//button[text()='Remove']")
	public WebElement removeAddressbuttonOption;

}
