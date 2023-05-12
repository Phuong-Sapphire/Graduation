Feature:  test myHaui application - graduate function
  Background: open app successfully
    Given open MyHaUI application

    Scenario: TC_50 verify graduate displays
      When click to not allow the notification
      And input username: "2019606731" and password: "Sapphire@310278"
      And click to login button
      And click to skip button
      And click to graduate
      Then verify graduate displays