Feature: Free CRM feature

  #Scenario: Free CRM login test
  #
  #Given User is already on loginpage
  #When title of login page in Free CRM
  #Then user enter "skv.sdet@gmail.com" and user enter "Namakkal@123"
  #And user clicks on login button
  #And user is on homepage
  #When user navigate to contact page
  #Then user trying adding new contact
  #Then enter first name and lastname
  #Then save the user details
  #Scenario Outline: Free CRM login test
  #Given User is already on loginpage
  #When title of login page in Free CRM
  #Then user enter "<username>" and user enter "<password>"
  #And user clicks on login button
  #And user is on homepage
  #When user navigate to contact page
  #Then user trying adding new contact
  #Examples:
  #| username           | password     |
  #| skv.sdet@gmail.com | Namakkal@123 |
  #| naveenk            | test@123     |
  
  
  Scenario Outline: Free CRM login test
    Given User is already on loginpage
    When title of login page in Free CRM
    Then user enter "<username>" and user enter "<password>"
    And user clicks on login button
    And user is on homepage
    When user navigate to contact page
    Then user trying adding new contact
    Then user enters "<firstname>" and "<lastname>" and "<position>"
    Then close the browser

    Examples: 
      | username           | password     | firstname | lastname | position |
      | skv.sdet@gmail.com | Namakkal@123 | kalai     | subbu    | Manager  |
