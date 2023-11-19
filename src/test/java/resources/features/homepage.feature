@smoke
Feature:Registration Feature
  In Order to perform successful registration
  As a User
  Student will enter first name, email address, password, web address and additional notes

  Scenario: A student can register successfully
    Given Student navigates to the homepage to registration page
    When Student click on Register button
    Then Student should navigate to Register page successfully

  Scenario: Student should register successfully with valid credentials
    Given Student navigates to the homepage to registration page
    When Student click on Register button
    And Student enter first name "Daisy"
    And Student enter email address "daisy.jones55@gmail.com"
    And Student enter web address "https://www.jones.com/index.html"
    And Student enter interests "I am interested in  Graduate Software Developer "
    And Student enter password "daisy@55"
    And Student enter Confirm password "daisy@55"
    And Student should click on Register button
    Then Verify the message "Your registration has been successful!"

  Scenario Outline: Student should navigates to the Dashboard page
    Given Student navigates to the homepage to registration page
    When Student get latest 5 jobs vacancies
    Then Student can see the job "<vacancies>"
    Examples:
      | Title                          |  Type                | Location           | Closing date            |
      | Graduate Software Developer    | Graduate job         | North West England | Continuous recruitment  |
      | Systems Engineer               | Graduate scheme      | Various            | Continuous recruitment  |
      | Physics Programmer             | Graduate job         | Edinburgh          | 29/10/2013              |
      | Cyber Security Practitioner    | Law training contract| Various            | Continuous recruitment  |
      | Research & Development Engineer| Graduate job         | Various            | 	5/11/2013            |



