
Feature: verify productpage

Scenario: verify search product with valid data
    Given  openbrowser and enter url
     When user enter valid email 
      And   user enter valid password
     When user  click on login button
     Then  it should navigate dashboardpage
       When   user click on cataloglink
    And  user click on categorieslink
    Then it should navigate category name page
    When  user enter valid category name
    When  user click on search Btn
    Then  it should display category page details
  