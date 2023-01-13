Feature: Retail Home Page

  Background: 

  Scenario: Verify Retail Page logo
    Then User verify retail page logo is present

  Scenario: Verify User can Search in Electronics Department
    When User change the category to 'Electronics'
    And User search for an item 'PlayStation'
    And User click on Search icon
    Then Item should be present

  Scenario: Verify User can click on All section
    Then User Verifies 'Shop By department' is present

  Scenario: Verify Cart icon is present
    Then User verifies cart icon is present

  Scenario: Verify Shop by Department sidebar
    When User click on All section
    Then below options are present in Shop by Department sidebar
      | Electronics | Computers | Smart Home | Sports | Automative |

  Scenario Outline: Verify department sidebar options
    When User click on All section
    And User is on <department>
    Then below options are present in department
      | <optionOne> | <optionTwo> |

    Examples: 
      | department    |                                |                          |
      | 'Electronics' | TV & Video                     | Video Games              |
      | 'Computers'   | Accessories                    | Networking               |
      | 'Smart Home'  | Smart Home Lightning           | Plugs and Outlets        |
      | 'Sports'      | Athletic Clothing              | Exercise & Fitness       |
      | 'Automotive'  | Automative Parts & Accessories | MotorCycle & Powersports |

  Scenario: Verify User can add an item to cart
    Given User is on retail website
    When User click on Sign in option
    And user enter email 'panthers.lion@tek.com' and password 'Test@0707'
    And User click on Login button
    Then User should be logged in into account
    When User change the category to 'Smart Home'
    And User search for an item 'kasa outdoor smart plug'
    And User click on Search icon
    And User click on item
    And User select quantity '2'
    And User click add to Cart button
    Then the cart icon quantity should change to '2'

  Scenario: Verify User can place an order without Shipping address and payment Method on file
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'panthers.lion@tek.com' and password 'Test@0707'
    And User click on login button
    Then User should be logged in into Account
    When User change the category to 'Smart Home'
    And User search for an item 'kasa outdoor smart plug'
    And User click on Search icon
    And User click on item
    And User select quantity '2'
    And User click add to Cart button
    Then the cart icon quantity should change to '2'
    And User click on Cart option
    And User click on Proceed to Checkout button
    And User click Add a new address link for shipping address
    And user fill new address form with below information
      | country      | fullName      | phoneNumber | streetAddress | apt      | city      | state      | zipCode      |
      | countryValue | fullNameValue | PhoneValue  | stAddress     | aptValue | cityValue | stateValue | zipCodeValue |
    And User click Add Your Address button
    And User click Add a credit card or Debit Card for Payment method
    * User fill Debit or credit card information
      | cardNumber       | nameOnCard | expirationMonth | expirationYear | securityCode |
      | 9876543213214333 | Panthers   |              12 |           2024 |          123 |
    * User click on Add your card button
    And User click on Place Your Order
    Then a message should be displayed 'Order Placed, Thanks'

  Scenario: Verify User can place an order with Shipping address and payment Method on file
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'panthers.lion@tek.com' and password 'Test@0707'
    And User click on login button
    Then User should be logged in into Account
    When User change the category to 'Electronics'
    And User search for an item 'Apex Legends'
    And User click on Search icon
    And User click on item
    And User select quantity '5'
    And User click add to Cart button
    Then the cart icon quantity should change to '5'
    And User click on Cart option
    And User click on Proceed to Checkout button
    And User click on Place Your Order
    Then a message should be displayed 'Order Placed, Thanks'
