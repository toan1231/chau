Feature: Get User List from Gorest API


@chau
  Scenario:
    Given User gets Employee List from Gorest API
    Then  Validate if status code is 200



  Scenario: Get unique user name from Gorest API
    Given User gets Employee List from Gorest API
    Then User retrieve and print unique Gorest user names



  Scenario: Get only Male users
    Given User gets Employee List from Gorest API
    Then Find the first names whose gender is male