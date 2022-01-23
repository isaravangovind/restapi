Feature: API Key Failure Validation

  Scenario Outline: Scenario is to Validate Wrong APIKEY
    Given Send "<Request Type>" Request and Retrieve Response
    Then Validate response with
    Examples:

      | Request Type | Status Code | Message         | code |
      | GETPROMOTION | 403         | invalid api key | 8001 |
