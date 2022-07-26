
Feature: the version can be retrieved
  Scenario: client makes call to GET /version
    Given the client calls /version
    When the client receives status code of 200
    Then the client receives server version "1.0"