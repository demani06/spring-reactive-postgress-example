Feature: A basic check on service health

  Scenario: Check endpoint availability
    When I send a GET request for Health Endpoint
    Then The endpoint responds with "OK"