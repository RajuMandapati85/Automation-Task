## Notes about the Test Framework

This Test Framework is built with Following tech stack:
* Java
* Selenium 3+
* Cucumber
* Maven

### How to run the tests

* Clone the repository locally
* Create a Junit Runner with following VM options (Framework supports running tests using latest firefox and chrome browsers)
* Runner Class to be selected is : com.elsiver.RunCuckesTest
    `-Dbrowser=chrome -Dcucumber.options="--tags @shopping-cart"`

#### Driver Executables:
GeckoDriver and ChromeDriver executable are placed inside `/src/test/resources/drivers` folder
