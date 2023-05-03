Feature:  test myHaui application - learning function
  Background: open app successfully
    Given open MyHaUI application

    Scenario: TC_21 verify learning result displays
      When click to not allow the notification
      And input username: "2019606731" and password: "Sapphire@310278"
      And click to login button
      And click to skip button
      And click to learning results
      Then verify learning results displays


      Scenario: TC_23 verify component point displays
        When click to not allow the notification
        And input username: "2019606731" and password: "Sapphire@310278"
        And click to login button
        And click to skip button
        And click to learning results
        And click to component point
        Then verify component point displays

        Scenario: TC_24 verify exam scores displays
          When click to not allow the notification
          And input username: "2019606731" and password: "Sapphire@310278"
          And click to login button
          And click to skip button
          And click to learning results
          And click to exam scores
          Then verify exam scores displays

          Scenario: TC_25 verify exam scores chart displays
            When click to not allow the notification
            And input username: "2019606731" and password: "Sapphire@310278"
            And click to login button
            And click to skip button
            And click to learning results
            And click to exam scores
            And click to turn on the chart
            Then verify the chart displays

            Scenario: TC_26 verify review the exam displays
              When click to not allow the notification
              And input username: "2019606731" and password: "Sapphire@310278"
              And click to login button
              And click to skip button
              And click to learning results
              And click to review the exam
              Then verify review the exam displays

              Scenario: TC_27 verify semester average displays
                When click to not allow the notification
                And input username: "2019606731" and password: "Sapphire@310278"
                And click to login button
                And click to skip button
                And click to learning results
                And click to semester average
                Then verify semester average displays

                Scenario: TC_28 verify semester average chart displays
                  When click to not allow the notification
                  And input username: "2019606731" and password: "Sapphire@310278"
                  And click to login button
                  And click to skip button
                  And click to learning results
                  And click to semester average
                  And click to chart
                  Then verify semester average chart displays

                  Scenario: TC_29 verify cumulative overall average displays
                    When click to not allow the notification
                    And input username: "2019606731" and password: "Sapphire@310278"
                    And click to login button
                    And click to skip button
                    And click to learning results
                    And click to cumulative overall average
                    Then verify cumulative overall average displays
