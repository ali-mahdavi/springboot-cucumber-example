Feature: the message can be retrieved
  Scenario: client makes call to POST /haytech
    Given the client calls /haytech
    When the client receives status code of 200
    Then the POST client receives server "post-hello"
  Scenario: client makes call to GET /hello
    Given the client calls /hello
    When the client receives status code of 200
    Then the GET client  receives server  "get-hello"