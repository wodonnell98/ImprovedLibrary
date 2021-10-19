Feature: Can someone borrow a computer?
  Patrons want to know if they can borrow a computer.

  Scenario:  Someone tries to borrow a book
    Given that a book is not a computer
    When they ask to borrow one
    Then they are told "It can be borrowed"

  Scenario: Someone tries to borrow a computer
    Given they cannot borrow a computer
    When they ask to borrow one
    Then they are told "It cannot be borrowed"



