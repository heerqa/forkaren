@All @LandingPageTest

Feature: REST API test



  Scenario: Application status end-point
    Given the application is running
    And I check the application status
    Then the API should return "Serenity REST Starter project up and running"







