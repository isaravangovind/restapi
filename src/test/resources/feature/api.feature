Feature:

  Scenario Outline:
    Given Send "GET" Request
    When Status Code is "200"
    Then Validate "promotionId" is any String value
    Examples: