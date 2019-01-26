Feature: As a user I want to be able to contact Shop

  Scenario: Check error pop-up when user send empty form
    Given User is on Automationpractice page
    When User press ContactUS link
    And User press send button
    Then User see pop-up "Invalid email address.";

  Scenario: Check error pop-up when user doesn't enter email in form
     Given User is on Automationpractice page
     When User press ContactUS link
     And User enters "test" in field Message
     And User press send button
     Then User see pop-up "Invalid email address.";

  Scenario: Check error pop-up when user enters invalid email in form
      Given User is on Automationpractice page
      When User press ContactUS link
      And User enters "kaha62wp.pl" in field E-mail address
      And User enters "test" in field Message
      And User press send button
      Then User see pop-up "Invalid email address.";

  Scenario: Check error popup when user dosn't select subject from the list
       Given User is on Automationpractice page
       When User press ContactUS link
       And User enters "kaha62@wp.pl" in field E-mail address
       And User enters "test" in field Message
       And User press send button
       Then User see pop-up "Please select a subject from the list provided.";

  Scenario: Check sending the form when user doesn't enter field "Order reference"
        Given User is on Automationpractice page
        When User press ContactUS link
        And User selects "Webmaster"
        And User enters "kaha62@wp.pl" in field E-mail address
        And User enters "test" in field Message
        And User press send button
        Then User see pop-up "Your message has been successfully sent to our team.";
