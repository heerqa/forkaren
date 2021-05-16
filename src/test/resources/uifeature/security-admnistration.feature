Feature: test security administration features

  As a User I would like to be able to Add, Delete and Edit Entities within Security Administration so that information can
  be added or updated for my Bank.

  Background:
    Given : user ia login with username "username" and password "password"
    Then : user is on Security Administraion page

  Scenario: verify that user with role <need to ask role type> is able tpo add Entity
   When : User enter General information with following data
     | name   | entity type              | description         | External Entity ID | Subscribed application| Assigned Authentication types | Active |
     | Aslak  | Financial Institution  | some brief description |       null        | Receivable            | Standard password             | true   |
   When : user enters Password Configuration Information
      |Maximum characters | Dayes before re-use allowed| Maximum uppercase allowed|
      |10                 |12                           |5                        |

   When : user click on  ADD button
   Then :  verify the  enity is added and data is correct

  Scenario: verify that user with role is able tpo EDIT Entity
    When : user click on edit button
    When : user enter new values to any field
    And : click on Save button
    Then : The enity with new values must be saved

  Scenario: verify that user with role is able tpo DELETE Entity
    When : user click on delete button
    Then : The enity should be deleted

