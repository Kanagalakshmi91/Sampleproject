#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)sszs
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

Feature: Create new Login for Adactin Hotel

  Scenario: Create new login
    Given Launch the Adactin Webpage
    When Click Newregistration page link
    And Input username fiels with "Kanaga98"
    And Input password fiels with "Sathya9876"
    And Input repassword fiels with "Sathya9876"
    And Input fullname fiels with "Kanagalakshmisathya"
    And Input emailaddress fiels with "skanagalakshmi1991@gmail.com"
    And Click agree button
    And Click Register button
    Then Check user login created