#the feature can be more than one tag
@bvt @prod
Feature: Login to production

In order to perform login
I want to enter username and password

Background:
  Given user navigates to facebook website
  When user validates the homepage title

Scenario: In oroder to verify the valid login to facebook
  Then user entered "username" username
  And user entred "password" password
  Then user "status" successfully logged in

Scenario: In oroder to verify the valid login to facebook
  Then user entered "username" username
  And user entred "password" password
  Then user "status" successfully logged in
