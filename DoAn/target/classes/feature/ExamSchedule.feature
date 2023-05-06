Feature:  test myHaui application - exam schedule function
  Background: open app successfully
    Given open MyHaUI application

    Scenario: TC_32 verify exam schedule displays
      When click to not allow the notification
      And input username: "2019606731" and password: "Sapphire@310278"
      And click to login button
      And click to skip button
      And click to exam schedule
      Then verify exam schedule displays
    Scenario: TC_33 verify exam plan displays
      When click to not allow the notification
      And input username: "2019606731" and password: "Sapphire@310278"
      And click to login button
      And click to skip button
      And click to exam schedule
      And click to exam plan
      Then verify exam plan displays

      Scenario: TC_34 verify exam plan detail displays
        When click to not allow the notification
        And input username: "2019606731" and password: "Sapphire@310278"
        And click to login button
        And click to skip button
        And click to exam schedule
        And click to exam plan
        And click to a subject to show detail schedule
        Then verify exam schedule of this subject displays

        Scenario: TC_35 verify view exam schedule displays
          When click to not allow the notification
          And input username: "2019606731" and password: "Sapphire@310278"
          And click to login button
          And click to skip button
          And click to exam schedule
          And click to view exam schedule
          Then verify view exam schedule displays