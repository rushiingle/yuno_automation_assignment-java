Feature: Purchase Payment

  Background:
    Given workflow is DIRECT

  @sanity @regression
  Scenario: Purchase with minimal fields
    Given a valid purchase request
    When I send purchase request
    Then response status code should be 200

  @negative @regression
  Scenario: Purchase with invalid card
    Given a purchase request with invalid card
    When I send purchase request
    Then response status code should be 400
