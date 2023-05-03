Feature: test myHaui application - schedule function
  Background: open app successfully
    Given open MyHaUI application

    Scenario: TC_30 verify schedule displays
      When click to not allow the notification
      And input username: "2019606731" and password: "Sapphire@310278"
      And click to login button
      And click to skip button
      And click to schedule
      Then verify schedule displays

      Scenario: TC_31 verify schedule displays correctly with the time interval entered by the user
        When click to not allow the notification
        And input username: "2019606731" and password: "Sapphire@310278"
        And click to login button
        And click to skip button
        And click to schedule
        Then verify the timeline displays correctly