UI Web Automation Framework with Cucumber, Java, Gradle, and Selenium

Repository ini berisi framework automation testing untuk aplikasi web menggunakan:
- Java sebagai bahasa pemrograman
- Selenium WebDriver untuk otomatisasi UI
- Cucumber untuk menulis test case dalam format Gherkin (BDD)
- Gradle sebagai build tool
- Page Object Model (POM) sebagai design pattern

Framework ini dibuat untuk mendemonstrasikan praktik terbaik dalam pengujian otomatis web, dengan pemisahan yang jelas antara test case, step definition, dan page object.

src
 └── test
     ├── java
     │   ├── helper
     │   │   └── Utility.java          # Kelas helper (driver utils, waits)
     │   ├── pages
     │   │   ├── HomePage.java         # Page Object untuk halaman Home
     │   │   └── LoginPage.java        # Page Object untuk halaman Login
     │   ├── runner
     │   │   └── CucumberTestRunner.java # Runner untuk menjalankan test
     │   └── stepdef
     │       ├── Hooks.java            # Before/After scenario
     │       └── LoginStepDef.java     # Step Definition untuk login.feature
     └── resources
         └── features
             └── login.feature         # Gherkin feature file


Tech Stack:

- Java 11+
- Gradle 7+
- Selenium WebDriver
- Cucumber JVM
- JUnit


How to Run Tests:

Clone repository
git clone https://github.com/BryanAndika/Module21.git

Run test dengan Gradle
./gradlew clean test


Generate report:

Setelah menjalankan test, report dapat ditemukan di:
build/reports/cucumber-report.html


Sample Test Case (login.feature):

Feature: Login Functionality

  @ValidLogin
  Scenario: User login with valid credentials
    Given User is on login page
    When User input username with "standard_user"
    And User input password with "secret_sauce"
    And User click login button
    Then User will redirected to home page

  @InvalidLogin
  Scenario: User login with invalid credentials
    Given User is on login page
    When User input username with "wrong_user"
    And User input password with "wrong_pass"
    And User click login button
    Then User should see error message
