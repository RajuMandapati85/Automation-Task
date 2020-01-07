@search
Feature: search journals, books, series, protocols and reference works on Springer Nature
    As an user when I login to Springer Nature website
    And Search for a journal / book
    Then I should see the relevant results

  Scenario: Quick search
    Given an user on Springer Nature home page
    When user enter text "science" on search bar
    And User should see at least 1 result
    And User clicks on first result
    Then User should see relevant results for "science"

  Scenario: Advanced search
    Given an user on Springer Nature home page
    And User Clicks on Advanced search button
    And User enters title as "science" on title contains field
    And User enters author as "Ray Linforth" on author / editor field
    And User clicks on Search button on Advanced search form
    And User should see at least 1 result
    And User clicks on first result
    Then User should see relevant results for "science"

