Feature: Sign In Feature

			
	#this is comment
  Background: 
    Given User is on retail website
    When User click on Sign in option

  Scenario: Verify user can sign in into Retail Application
    And User enter email 'tigerisalive@yahoo.com' and password 'Tiger@456'
    And User click on login button
    Then User should be logged in into Account

  @signInTest
  Scenario Outline: Verify user can login with different email and pass
    And User enter email <email> and password <password>
    And User click on login button
    Then user should be logged in into Account

    Examples: 
      | email                    | password    |
      | 'tiger1isalive@yahoo.com' | 'Tiger@456' |
      | 'ihateteacher2@tek.com'   | 'Teka@12345' |
      | 'panthers11@tekschool.us' | 'Teek@12345' |
      | 'panthers22@tekschool.us' | 'Tek@123456' |

  @signUpTest
  Scenario: Verify use can create an account into Retail website
    And User click on Create New Account button
    And User fill the signUp information with below data
      | name   | email                  | password  | confirmPassword |
      | shak | breakfast@tek.us| Monitor@456 | Monitor@456                |
    And User click on SignUp button
    Then User should be logged into account page
