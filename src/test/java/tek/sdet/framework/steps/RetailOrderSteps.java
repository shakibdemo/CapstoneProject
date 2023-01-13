package tek.sdet.framework.steps;

import org.junit.Assert;

import io.cucumber.java.en.Then;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class RetailOrderSteps extends CommonUtility{
	
	POMFactory factory = new POMFactory();
	
	@Then("User click on Orders section")
	public void userClickOnOrdersSection() {
		click(factory.homePage().OrderLink);
		logger.info("user clicked order section");

	}
	@Then("User click on first order in list")
	public void userClickOnFirstOrderInList() {
		
		click(factory.orderPage().firstOrderItem);
		logger.info("user clicked on first order in list");

	}
	@Then("User click on Cancel The Order button")
	public void userClickOnCancelTheOrderButton() {
	    
		click(factory.orderPage().CancelButton);
		logger.info("user clicked on cancel The Order button");

	}
	@Then("User select the cancelation Reason {string}")
	public void userSelectTheCancelationReason(String reason) {
		selectByVisibleText(factory.orderPage().CancelationReason, reason);
		logger.info("user selected the cancellatiuon reason " + reason);
		

	}
	@Then("User click on Cancel Order button")
	public void userClickOnCancelOrderButton() {
		
		click(factory.orderPage().CancelOrderbutton);
		logger.info("user clicked on cancel order button");

	}
	@Then("a cancelation message should be displayed {string}")
	public void aCancelationMessageShouldBeDisplayed(String expectedMessage) {
		
		if(expectedMessage.contains("Your Order Has Been Cancelled")) {
		Assert.assertEquals(expectedMessage, factory.orderPage().YourOrderHasBeenCancelledMessage.getText());
		logger.info("a cancellation message displayed " +expectedMessage);
		}else if (expectedMessage.contains("Return was successfull")) {
		Assert.assertEquals(expectedMessage, factory.orderPage().ReturnwasSuccessfullMessage.getText());
		logger.info("a cancellation message displayed " +expectedMessage);
		}

	}
	
	@Then("User click on Return Items button")
	public void userClickOnReturnItemsButton() {
		click(factory.orderPage().returnButton);
		logger.info("user clicked on return Item button");
	   
	}
	@Then("User select the Return Reason {string}")
	public void userSelectTheReturnReason(String reason) {
		selectByVisibleText(factory.orderPage().CancelationReason, reason);
		logger.info("user selected the cancellatiuon reason " + reason);
	  
	}
	@Then("User select the drop off service {string}")
	public void userSelectTheDropOffService(String dropOfflocation) {
		selectByVisibleText(factory.orderPage().dropOffdropDown,dropOfflocation);
		logger.info("user selected the dropoff service " + dropOfflocation);
	
	}
	@Then("User click on Return Order button")
	public void userClickOnReturnOrderButton() {
		click(factory.orderPage().CancelOrderbutton);
		logger.info("user clicked on Return order button");
	
	}
	
	@Then("User click on Review button")
	public void userClickOnReviewButton() {
		click(factory.orderPage().reviewbutton);
		logger.info("User click on Review button");
	    
	}
	@Then("User write Review headline {string} and {string}")
	public void userWriteReviewHeadlineAnd(String headline, String body) {
		sendText(factory.orderPage().reviewHeadlineInput, headline);
		sendText(factory.orderPage().reviewDescriptionInput, body);
		logger.info("User wrote a review on the product");
	   
	}
	@Then("User click Add your Review button")
	public void userClickAddYourReviewButton() {
		click(factory.orderPage().reviewsubmittButton);
		logger.info("User clicked add your review button");
	   
	}
	@Then("a review message should be displayed {string}")
	public void aReviewMessageShouldBeDisplayed(String expected) {
		waitTillPresence(factory.orderPage().ReviewWasAddedSuccessfullymessage);
		Assert.assertEquals(factory.orderPage().ReviewWasAddedSuccessfullymessage.getText(), expected);
		logger.info("a review message displayed");
		
	    
	}

	

}
