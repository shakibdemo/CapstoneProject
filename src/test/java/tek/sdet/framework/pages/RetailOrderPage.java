package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailOrderPage extends BaseSetup{
	
	public RetailOrderPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	@FindBy(xpath="//img[@class='order__item-img']")
	public WebElement firstOrderItem;
	
	@FindBy(id="cancelBtn")
	public WebElement CancelButton;
	
	@FindBy(id="reasonInput")
	public WebElement CancelationReason;
	
	@FindBy(xpath= "//button[@class='order__cancel-submit']")
	public WebElement CancelOrderbutton;
	
	@FindBy(xpath= "//p[text()='Your Order Has Been Cancelled']")
	public WebElement YourOrderHasBeenCancelledMessage;
	
	@FindBy(id="returnBtn")
	public WebElement returnButton;
	
	@FindBy(id="dropOffInput")
	public WebElement dropOffdropDown;
	
	@FindBy(xpath="//p[text()='Return was successfull']")
	public WebElement ReturnwasSuccessfullMessage;
	
	@FindBy(id="reviewBtn")
	public WebElement reviewbutton;
	
	@FindBy(id="headlineInput")
	public WebElement reviewHeadlineInput;
	
	@FindBy(id="descriptionInput")
	public WebElement reviewDescriptionInput;
	
	@FindBy(id="reviewSubmitBtn")
	public WebElement reviewsubmittButton;
	
	@FindBy(xpath="//div[text()='Your review was added successfully']")
	public WebElement ReviewWasAddedSuccessfullymessage;

}
