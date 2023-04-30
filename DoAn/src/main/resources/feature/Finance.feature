Feature:  test myHaui application - finance function
  Background: open app successfully
    Given open MyHaUI application

    Scenario: TC_11 verify finance page displays
      When click to not allow the notification
      And input username: "2019606731" and password: "Sapphire@310278"
      And click to login button
      And click to skip button
      And click to finance
      Then verify finance page displays

      Scenario: TC_14 verify debt payment displays
        When click to not allow the notification
        And input username: "2019606731" and password: "Sapphire@310278"
        And click to login button
        And click to skip button
        And click to finance
        And click to debt payment
        Then verify debt payment displays


        Scenario: TC_15 verify actual debt displays in the debt payment screen
          When click to not allow the notification
          And input username: "2019606731" and password: "Sapphire@310278"
          And click to login button
          And click to skip button
          And click to finance
          And click to debt payment
          Then verify actual debt and total debt is the same

          Scenario: TC_16 verify actual amount to be paid displays in the debt payment screen
            When click to not allow the notification
            And input username: "2019606731" and password: "Sapphire@310278"
            And click to login button
            And click to skip button
            And click to finance
            And click to debt payment
            Then verify actual amount to be paid and amount to be paid is the same