Feature: Kiểm tra API người dùng

  Scenario: Lấy danh sách user
    Given url 'https://reqres.in/api/users?page=2'
    When method GET
    Then status 200
    And match response.page == 2
