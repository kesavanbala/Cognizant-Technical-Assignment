@tag
Feature: Automation Practice Website

 Background: 
 Given Initialize browser and lunch the URL with valid credential
  
@tag1
Scenario: Order T-Shirt and Verify in Order History
  
 Given Navigate to T-shirts tab
 And Place the order
 Then Validate the order history

 @tag2
 Scenario: Update Personal Information in My Account
 Given User is already on My Account page
 When Update the Personal Information
 Then Validating user updates
 
 
