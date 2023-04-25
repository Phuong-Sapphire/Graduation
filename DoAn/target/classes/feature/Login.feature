Feature: test myHaui application - Login function
  Background: open app successfully
    Given open MyHaUI application

  Scenario: TC_01 Verify Login Page
    When click to not allow the notification
    Then verify Login page displays: banner, username, password, forgotPassword, loginButton, AmissionButton


    Scenario: TC_02 Verify successfully logged in
      When click to not allow the notification
      And input username: "2019606731" and password: "Sapphire@310278"
      And click to login button
      And click to skip button
      Then verify homepage displays

      Scenario Outline: verify failed logged in
        When click to not allow the notification
        And input username: "<username>" and password: "<password>"
        And click to login button
        Then verify message display: "Sai tên đăng nhập hoặc mật khẩu"

        Examples:
        |username|password|
        |2019606731|      |
        |          |Sapphire@310278|
        |2019DH606731|Sapphire@310278|
        |2019606731🌷👩👨|Sapphire@310278|
        |2019606731      |Sapphire@310278🌷👩👨|



