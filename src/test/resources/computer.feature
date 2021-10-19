Feature: Can someone borrow a computer?
  Patrons want to know if they can borrow a computer.

  Scenario: Someone tries to borrow a computer
    Given they cannot take a computer
    When they try to take a computer
    Then they are told it cannot be borrowed
