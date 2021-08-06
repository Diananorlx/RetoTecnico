@Stories
Feature: Register on the website
  As a user, I want to register as a new user on the Utest website

  @scenario1
  Scenario Outline: New user who is not registered
    Given than a user called Diana who enters the test page and click the register button
    When she Diligence the form
      | <first_name> | <last_name> | <email_address> | <month> | <day> | <year> |
    Then it is registered on the web

    Examples:
      | first_name | last_name | email_address   | month  | day   | year|
      | Diana      | Guevara   | diana@gmail.com | August | 16    | 1993|
