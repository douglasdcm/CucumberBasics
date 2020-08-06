@sanity
Feature: Login

In order to perform login
I want to enter username and password

Scenario Outline: In oroder to verify the valid login to facebook
  Given user navigates to facebook website
  When user validates the homepage title
  Then user entered "<username>" username
  And user entred "<password>" password
  And user select the age category
  | Age			| Location	|
  | above 18	| India		|
  | below 18	| USA		|
  Then user "<status>" successfully logged in
Examples:
  | username | password | status |
  | valid    | valid    | shouldbe |
  | invalid  | invalid  | shouldnot |
  | testuser | testpass | teststatus |
