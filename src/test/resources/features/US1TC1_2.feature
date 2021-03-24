Feature: Login to TryCloud account feature
  As a user, I should be able to login with correct credentials and see the homepage

  @US1TC1
  Scenario: Login into TryCloud
    Given User is on the login page
    When user enters correct login info
    And clicks login button
    Then user lands on homepage


#  Test case #1 - verify user login successfully
#  1.Story: As a user, I should be able to login.
#  Test case #1 - verify user login successfully
#  1.Navigate to login page http://qa.trycloud.net/index.php/login?clear=1
#  2.Enter valid username
#  3.Enter valid password
#  4.Click login button
#  5.Verify the URL is changed to homepage’s url(Put this test case in testBase class with an annotation so it runs for all the test case)


#Feature: Logging into TryCloud with incorrect credentials
 # As a user I should not be able to login with in correct credentials

  #Scenario: Login attempt with incorrect credentials
   # Given User is on the login page
    #When user enters incorrect info
    #And clicks login button
    #Then User should see message stating incorrect credentials was used, title should be the same

#  Test case #2 - verify user cannot login with invalid credentials
#  1.Navigate to login page http://qa.trycloud.net/index.php/login?clear=1
#  2.Enter valid username  invalid password
#  3.Click login button
#  4.Message “Wrong username or password.” should be displayed
#  5.Page title and url should be same