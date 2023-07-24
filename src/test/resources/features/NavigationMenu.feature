
Feature: Navigation Menu Test

  #First Scenario:
  #Login as Mike
  #Verify that 'Dashboard' text is visible, assert it
  #Go to developers menu
  #Verify that 'Developers' text is visible

  @mike
  Scenario:Navigation to Developers Menu
    Given Login as Mike
    When The user is on the login page
    Then Validate that Dashboard text is visible
    When Go to developers menu
    Then Validate that Developers text is visible

    #Second Scenario:
  #   Login as Sebastian
  #   Verify that 'Dashboard' text is visible, assert it
  #   Go to Forms/Input menu
  #   Verify that 'General Form Elements - Input' text is visible

  @sebastian
  Scenario: Navigation to Form-Input Menu
    Given The user is on the login page
    When Login as Sebastian
    Then Validate that Dashboard text is visible
    When Go to Forms-Input menu
    Then Validate that General Form Elements - Input text is visible


     #Third Scenario:
    #   Login as John
    #   Verify that 'Dashboard' text is visible, assert it
    #   Go to My Profile menu
    #   Verify that 'User Profile' text is visible
    #

  @Jhon
  Scenario:Navigation to My Profile Menu
    Given The user is on the login page
    When Login as John
    Then Validate that Dashboard text is visible
    When Go to My Profile menu
    Then Validate that User Profile text is visible