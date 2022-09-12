Feature: Login page feature


Scenario: Login with correct credentials
Given user should open browser
Given user is on login page url "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
When user enters username "Admin "
And user enters password " admin123"
And user clicks on Login button
Then user gets the title of the page
And page title should be "OrangeHRM"