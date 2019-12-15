$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Feature.feature");
formatter.feature({
  "line": 2,
  "name": "Automation Practice Website",
  "description": "",
  "id": "automation-practice-website",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@tag"
    }
  ]
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "Initialize browser and lunch the URL with valid credential",
  "keyword": "Given "
});
formatter.match({
  "location": "OrderTShirtStepDefination.initaite_the_browser_and_lunch_the_URL_with_valid_credential()"
});
formatter.result({
  "duration": 31094200300,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "Order T-Shirt (and Verify in Order History)",
  "description": "",
  "id": "automation-practice-website;order-t-shirt-(and-verify-in-order-history)",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 7,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "Navigate to T-shirts tab",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "Place the order",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "Validate the order history",
  "keyword": "Then "
});
formatter.match({
  "location": "OrderTShirtStepDefination.Navigate_to_T_shirts_tab()"
});
formatter.result({
  "duration": 6894941500,
  "status": "passed"
});
formatter.match({
  "location": "OrderTShirtStepDefination.place_the_order()"
});
formatter.result({
  "duration": 16395746300,
  "status": "passed"
});
formatter.match({
  "location": "OrderTShirtStepDefination.validate_the_order_history()"
});
formatter.result({
  "duration": 3754492000,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "Initialize browser and lunch the URL with valid credential",
  "keyword": "Given "
});
formatter.match({
  "location": "OrderTShirtStepDefination.initaite_the_browser_and_lunch_the_URL_with_valid_credential()"
});
formatter.result({
  "duration": 25044651100,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "Update Personal Information (First Name) in My Account",
  "description": "",
  "id": "automation-practice-website;update-personal-information-(first-name)-in-my-account",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 14,
      "name": "@tag2"
    }
  ]
});
formatter.step({
  "line": 16,
  "name": "User is already on My Account page",
  "keyword": "Given "
});
formatter.step({
  "line": 17,
  "name": "Update the Personal Information",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "Validating user updates",
  "keyword": "Then "
});
formatter.match({
  "location": "OrderTShirtStepDefination.user_is_already_on_My_Account_page()"
});
formatter.result({
  "duration": 6276800,
  "status": "passed"
});
formatter.match({
  "location": "OrderTShirtStepDefination.update_the_Personal_Information()"
});
formatter.result({
  "duration": 3811751200,
  "status": "passed"
});
formatter.match({
  "location": "OrderTShirtStepDefination.Validating_user_updates()"
});
formatter.result({
  "duration": 3687972800,
  "status": "passed"
});
});