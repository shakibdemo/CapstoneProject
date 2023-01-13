Feature: Retail Account Page

  Background: 
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'panthers.lion@tek.com' and password 'Test@0707'
    And User click on login button
    And User should be logged in into Account

  Scenario: Verify User can update Profile Information
    When User click on Account option
    And User update Name 'panthers' and Phone '2013207788'
    And User click on Update button
    Then User profile information should be updated

  Scenario: Verify User can Update password
    When User click on Account option
    And User enter below information
      | previousPassword | newPassword | confirmPassword |
      | Test@123         | Test@0707   | Test@0707       |
    And User click on Change Password button
    Then a message should be displayed 'Password Updated Successfully'

  Scenario: Verify User can add a payment method
    When User click on Account option
    And User click on Add a payment method link
    And User fill Debit or credit card information
      | cardNumber       | nameOnCard | expirationMonth | expirationYear | securityCode |
      | 2222444433338866 | Kevin      |              11 |           2024 |          233 |
    And User click on Add your card button
    Then a message should be displayed 'Payment Method added sucessfully'

  Scenario: Verify User can edit Debit or Credit card
    When User click on Account option
    And User select cardnumber with ending '8866'
    And User click on Edit option of card section
    And user edit information with below data
      | cardNumber       | nameOnCard | expirationMonth | expirationYear | securityCode |
      | 3322444433332222 | Mark       |              11 |           2025 |          499 |
    And user click on Update Your Card button
    Then a message should be displayed 'Payment Method Updated Successfully'

  Scenario: Verify User can remove Debit or Credit card
    When User click on Account option
    And User select cardnumber with ending '8080'
    And User click on remove option of card section
    Then payment details should be removed

  Scenario: Verify User can add an Address
    When User click on Account option
    And User click on Add address option
    And user fill new address form with below information
      | country      | fullName      | phoneNumber | streetAddress | apt      | city      | state      | zipCode      |
      | countryValue | fullNameValue | PhoneValue  | stAddress     | aptValue | cityValue | stateValue | zipCodeValue |
    And User click Add Your Address button
    Then a message should be displayed 'Address Added Successfully'

  Scenario: Verify User can edit an Address added on account
    When User click on Account option
    And User click on edit address option
    And user fill new address form with below information
      | country      | fullName      | phoneNumber | streetAddress | apt      | city      | state      | zipCode      |
      | countryValue | fullNameValue | PhoneValue  | stAddress     | aptValue | cityValue | stateValue | zipCodeValue |
    And User click update Your Address button
    Then a message should be displayed 'Address Updated Successfully'

  Scenario: Verify User can remove Address from Account
    When User click on Account option
    And User click on remove option of Address section
    Then Address details should be removed
