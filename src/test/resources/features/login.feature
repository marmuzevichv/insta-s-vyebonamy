
Feature: Insta login feature
  s a user, I should be able to login with correct credentials to different accounts. And dashboard should be displayed.
  Accounts are: from configurationProperties
  #this is how you comment in feature file

  Background: User is already in Login page
    Given User is on the login page



  Scenario: Login as currentUser
    Given User is on the login page
    When user enters username "username"
    And user enters password "password"
    Then user should see dashboard
    When user redirects to the fanpage
    Then user should click on the second post
    Then user should like the post
    Then user should like all the coomments bellow the post
