# QA-Ecommerce | QA Automation Project

## About the Project

QA-Ecommerce is a test automation portfolio project built with Java. It demonstrates web UI automation, BDD testing, and API testing using industry-relevant tools and practices.

## Tech Stack

* **Language:** Java
* **Build Tool:** Maven
* **Web Automation:** Selenium WebDriver
* **Test Framework:** JUnit 5
* **BDD:** Cucumber and Gherkin
* **API Automation:** REST Assured
* **API Testing:** Postman

## Project Structure

```text
QA-Ecommerce/
├── src/
│   └── test/
│       ├── java/
│       │   ├── api/
│       │   ├── pages/
│       │   ├── runners/
│       │   ├── steps/
│       │   ├── suite/
│       │   └── tests/
│       └── resources/
│           └── features/
├── .gitignore
├── pom.xml
└── README.md
```

## Automated Test Coverage

### Web UI Testing

* Successful login
* Login with invalid credentials
* Browser automation with Selenium WebDriver
* Page Object Model (POM)

### BDD Testing

* Gherkin scenarios
* Cucumber step definitions
* Scenario Outline for invalid credentials
* Cucumber runner integration

### API Testing

* **GET:** retrieve and validate API responses
* **POST:** send data and validate response fields
* **PUT:** update a resource and validate returned data
* **DELETE:** validate the HTTP response status

### Regression Suite

JUnit Platform Suite provides a single entry point to run the automated test suite.

## Test Environments

* **Web:** https://the-internet.herokuapp.com/login
* **API:** https://jsonplaceholder.typicode.com/

These public services are used for practice and demonstration purposes.

## How to Run

### Requirements

* Java JDK compatible with the Maven configuration
* Maven
* IntelliJ IDEA or another Java IDE
* Google Chrome

### Execution

1. Clone or download the repository.
2. Open the project in IntelliJ IDEA.
3. Reload the Maven project.
4. Run `suite.RegressionTest`.

Individual test classes can also be executed separately.

## Project Goals

* Practice functional test automation.
* Apply the Page Object Model.
* Implement BDD scenarios with Cucumber and Gherkin.
* Automate API tests with REST Assured.
* Organize test execution with JUnit 5 and Maven.
* Build a portfolio for QA Automation opportunities.

## Author

QA Automation portfolio project developed for learning and professional development.
