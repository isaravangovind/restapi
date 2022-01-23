Feature: Promo Type Validation

  Scenario Outline: Scenario is to Validate PromoTypes
    Given Send "<Request Type>" Request and Retrieve Response
    Then Validate PromoType is Should have be "<PromoType>"
    Examples:

      | Request Type | PromoType                   |
      | GETPROMOTION | EPISODE/MOVIE/SERIES/SEASON |
