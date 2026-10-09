# QA-Ecommerce | QA Automation Framework

## About the Project

QA-Ecommerce is a Java-based QA Automation portfolio project focused on web UI automation, API testing, and Behavior-Driven Development (BDD).

The project demonstrates automated functional testing, reusable test components, and structured test execution using tools commonly used in software quality assurance.

## Tech Stack

* **Language:** Java
* **Build Tool:** Apache Maven
* **Web Automation:** Selenium WebDriver
* **Test Framework:** JUnit 5
* **BDD:** Cucumber and Gherkin
* **API Automation:** REST Assured
* **API Exploration and Manual Testing:** Postman
* **Version Control:** Git and GitHub

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

* Successful login scenario
* Login with invalid credentials
* Browser interaction and validation using Selenium WebDriver
* Page Object Model (POM) implementation

### BDD Testing

* Gherkin feature files
* Cucumber step definitions
* Scenario Outline for data-driven login scenarios
* Cucumber runner integration

### API Testing

Automated API tests covering common HTTP methods:

* **GET:** Retrieve and validate API responses
* **POST:** Create a resource and validate the response
* **PUT:** Update a resource and validate the response
* **DELETE:** Send a delete request and validate the HTTP status

### Regression Suite

JUnit Platform Suite provides a centralized entry point for executing the API and web UI test packages.

## Test Environments

* **Web Application:** [The Internet - Login](https://the-internet.herokuapp.com/login)
* **Practice API:** [JSONPlaceholder](https://jsonplaceholder.typicode.com/)

These public services are used for learning and demonstration purposes. They are not production systems.

## Getting Started

### Prerequisites

* Java JDK compatible with the project configuration
* Maven, or a configured Maven wrapper if available
* IntelliJ IDEA or another Java IDE
* Google Chrome for browser-based tests

### Setup

1. Clone or download this repository.
2. Open the project in IntelliJ IDEA.
3. Reload the Maven project and resolve dependencies.
4. Ensure the required browser is installed.

### Running the Tests

Run the regression suite from IntelliJ IDEA by opening `suite.RegressionTest` and executing the test class.

You can also run tests through Maven from the project root:

```bash
mvn test
```

Note: Maven test execution depends on the project's configured test plugins and suite discovery settings.

## Project Goals

* Practice functional test automation.
* Apply the Page Object Model.
* Implement BDD scenarios using Cucumber and Gherkin.
* Automate REST API tests with REST Assured.
* Organize test execution using JUnit 5 and Maven.
* Apply version control practices with Git and GitHub.
* Build a portfolio for QA Automation opportunities.

## Author

QA Automation portfolio project developed for learning and professional development.

