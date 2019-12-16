@FeatureStore
Feature: Automation Practice Website

 Background: 
 Given Initialize browser and lunch the URL with valid credential
  
@Scenario1
Scenario: Order T-Shirt and Verify in Order History
  
 Given Navigate to T-shirts tab
 And Place the order
 Then Validate the order history

 @Scenario2
 Scenario: Update Personal Information in My Account
 
 Given Validate whether User navigated to My Account page after login
 When Update the Personal Information
 Then Validating user updates
 
 
