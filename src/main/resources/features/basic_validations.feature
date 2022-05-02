Feature: As as end user,
  I should see new adding are displaying on dashboard,
  So that I can deliver with confidence.

@regression
Scenario: Verify user is able to see login
  Given I am on home page as a logged in user
   When I create risk with "sample" data
  Then I should see details are reflecting in dashboard
