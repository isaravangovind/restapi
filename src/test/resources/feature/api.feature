Feature: API Validation

  Scenario Outline: Validate PromoTypes
    Given Send "<Request Type>" Request with "<ApiKey>"
    When Status Code is "<Status Code>"
    Then Validate PromoType is Should have be "<PromoType>"
    Examples:

      | Request Type | ApiKey                        | Status Code | PromoType                   |
      | GET          | webB2BGDMSTGExy0sVDlZMzNDdUyZ | 200         | EPISODE/MOVIE/SERIES/SEASON |