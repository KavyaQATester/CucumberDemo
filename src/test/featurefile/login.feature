
Feature: verify loginfunction completely
  Scenario: verify loginfunction with valid data
# Given  openbrowser and enter url
#   When user enter valid email
 #     And   user enter valid password
  #   When user  click on login button
   #  Then  it should navigate dashboardpage
    
 #Scenario: verify loginfunction with invalid data
   #Given  openbrowser and enter url
    # When user enter invalid username 
   # And   user enter invalid password
     # When user  click on login button
     # Then  it should throw some error message
    
    #Scenario: verify loginfunction with invalid username and valid password
     #Given  openbrowser and enter url
     #When user enter invalid username 
     #And   user enter valid password
     #When user  click on login button
      #Then  it should throw some error message as invalid username
    #
    #Scenario: verify loginfunction with valid username and invalid password
      #Given  openbrowser and enter url
     #When user enter valid username 
     #And   user enter invalid password
    #When user  click on login button
   #Then  it should throw error message as invalid password
    #
    #Scenario: verify loginfunction with  without username and password
    #Given  openbrowser and enter url
    #When username and password kept empty
    #When user  click on login button
    #Then  it should  throw error message as data required
    
    
    Scenario Outline:  verify loginfunction with multiple testdata
    Given  openbrowser and enter url
    When  user enter"<username>"
    When  user entered "<password>"
    When  user click on login Btn
    Then  it should display the result
    Then  close the browser
    
    Examples:
|username | password|
|kumar |kumar1234|
| sai | sai1234|
| ram | ram1234|
| admin@yourstore.com|admin |



    
    
    