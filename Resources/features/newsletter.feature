Feature: As a user I want to sign up for the newsletter

  Scenario: Test of subscribing to the newsletter
    Given User is on Automationpractice page
    When Enter e-mail "ka52@wp.pl"
    And Click on the submit button
    Then I see pop-up "Newsletter : You have successfully subscribed to this newsletter."


  Scenario: Test of resubscribing to the newsletter using the same e-mail
    Given User is on Automationpractice page
    When Enter e-mail "ka62@wp.pl"
    And Click on the submit button
    Then I see pop-up "This email address is already registered"


  Scenario: Test of subscribing to the newsletter using invalid e-mail
     Given User is on Automationpractice page
     When Enter e-mail "ka62wp.pl"
     And Click on the submit button
     Then I see pop-up "Newsletter : Invalid email address."