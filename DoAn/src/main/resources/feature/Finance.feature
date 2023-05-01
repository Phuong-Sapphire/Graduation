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


            Scenario: TC_17 Verify payment to be the mode function if not enough money in the account to pay
              When click to not allow the notification
              And input username: "2019606731" and password: "Sapphire@310278"
              And click to login button
              And click to skip button
              And click to finance
              And click to debt payment
              And click payments to be mode
              And click to select payment details
              And click to make payment
              And click to accept payment
              Then verify the error message "Giao dịch không thành công. Bạn vui lòng kiểm tra lại số dư trong tài khoản."

              Scenario: TC_18 Verify into money is displayed correctly
                When click to not allow the notification
                And input username: "2019606731" and password: "Sapphire@310278"
                And click to login button
                And click to skip button
                And click to finance
                And click to debt payment
                And click payments to be mode
                Then verify the into money displays is correctly

              Scenario: TC_19 verify transaction history page displays
                When click to not allow the notification
                And input username: "2019606731" and password: "Sapphire@310278"
                And click to login button
                And click to skip button
                And click to finance
                And click to transaction history
                Then verify transaction history displays

                Scenario: TC_21 verify print e-invoice page displays
                  When click to not allow the notification
                  And input username: "2019606731" and password: "Sapphire@310278"
                  And click to login button
                  And click to skip button
                  And click to finance
                  And click to print e-invoice
                  Then verify this page displays

