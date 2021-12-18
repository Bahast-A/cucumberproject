Feature: Guru692TheMoon



  @Smoke
  Scenario: The User will go to the guru site and verify the Header
    Given The user navigates to "http://demo.guru99.com/payment-gateway/index.php"
    When The user verify the header contains "Mother Elephant With Babies Soft Toy"

    @Smoke1
    Scenario: The User will navigate to the order page and verify the toy price is $20
      Given The user wants to go to the guru site
      When The user wants to navigate to the order page
      Then The user wants verify that the toy price is $20
  @Smoke2
  Scenario:


