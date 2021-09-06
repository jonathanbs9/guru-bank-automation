Feature: Test Guru Bank login Functionality

    Feature Description
Scenario: Login on Guru Bank
    Given I navigate through Guru Bank Home Page
    When I enter valid credentials
    And I click on the login button
    Then I logged in successfully

Scenario: Create New Customer
    Given I navigate on the manager page
    When I click New Customer
    And I complete all the fields correctly
    And I click the submit button
    Then The customer is registered successfully

Scenario: Edit Customer
    Given I navigate to edit customer page
    When I enter a customer ID that I not create it 
    Then I am not authorized to edit that customer