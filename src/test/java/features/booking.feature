Feature: Book a room

  @book
  Scenario: Option to book a room is available on the page
    Given I am on the home page
    When I browse through the page
    Then I have the option to book a room

  @Room
  Scenario Outline: User can book the room
    Given I am on the home page
    When I browse through the page
    Then I have the option to book a room
    When user click on book a room
    And user select date
    And User enter valid details: <Firstname> ,<Lastname>,<Email>,<phone>
    And User Click on Book button
    Then User should be able to see message <status>

    Examples: 
      | Firstname | Lastname | Email              | phone        | status             |
      | John      | Doe      | John.Doe@gmail.com | +32987654321 | Booking Successful |
      | Jean      | Doe      | Jean.Doe@gmail.com | +3298756432  | Booking Successful |

  @Room
  Scenario Outline: User cannot book the room
    Given I am on the home page
    When I browse through the page
    Then I have the option to book a room
    When user click on book a room
    And user select date
    And User enter invalid details: <Firstname> ,<Lastname>,<Email>,<phone>
    And User Click on Book button
    Then User should be able to see message <status>

    Examples: 
      | Firstname | Lastname | Email              | phone        | status                              |
      |           | Doe      | John.Doe@gmail.com | +32987654321 | First name should not be null       |
      | Jean      |          | Jean.Doe@gmail.com | +3298756432  | Last name should not be null        |
      | Jill      | Doe      | Jill.doe           | +3298756432  | must be a well-formed email address |
