Feature:  test myHaui application - course function
  Background: open app successfully
    Given open MyHaUI application

    Scenario: TC_36 verify course displays
      When click to not allow the notification
      And input username: "2019606731" and password: "Sapphire@310278"
      And click to login button
      And click to skip button
      And click to course
      Then verify course displays

      Scenario: TC_37 verify education program displays
        When click to not allow the notification
        And input username: "2019606731" and password: "Sapphire@310278"
        And click to login button
        And click to skip button
        And click to course
        And click to education program
        Then verify education program displays

        Scenario: TC_38 verify education program details displays
          When click to not allow the notification
          And input username: "2019606731" and password: "Sapphire@310278"
          And click to login button
          And click to skip button
          And click to course
          And click to education program
          And click to education program details
          Then verify education program details displays