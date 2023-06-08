# Car Valuation Project

This project is a Java-based test automation suite that uses Selenium WebDriver, TestNG, and POM design pattern to test the car valuation functionality of https://www.cazoo.co.uk/value-my-car/. 

## Test Scenario

The test automation is designed to perform the following tasks:
1. Reads given input file: car_input_v1.txt 
2. Extracts vehicle registration numbers based on pattern(s). 
3. Each number extracted from the input file is fed to https://www.cazoo.co.uk/value-my-car/ (Perform vehicle details search car valuation page) 
4. Compare the output returned by https://www.cazoo.co.uk/value-my-car/ with the given car_output_v1.txt 
5. Highlight/fail the test for any mismatches. 

## Getting Started

### Prerequisites
1. Java Development Kit 8 or above should be installed on your machine.
2. Eclipse IDE
3. Maven should be installed in your system
4. Selenium WebDriver jar files
5. TestNG jar files

### Installing

1. Clone the Car Valuation Project repository from https://github.com/<your-github-username>/CarValuationProject.git.
2. Go to src/test/resources folder and put the `car_input_v1.txt`, `car_output_v1.txt`, `car_input_v2.txt`, and `car_output_v2.txt` files.
3. Make sure all the required dependencies are added in the `pom.xml` file.
4. Open the project in Eclipse and run the `CarValuationTest.java` as a TestNG test.

## Built With

* [Java SE Development Kit 8](https://www.oracle.com/java/technologies/javase/javase-jdk8-downloads.html) - The programming language used
* [Selenium WebDriver](https://www.selenium.dev/documentation/en/webdriver/) - The browser automation tool used
* [TestNG](https://testng.org/doc/) - The testing framework used
* [Maven](https://maven.apache.org/) - The build automation tool used
* [Git](https://git-scm.com/) - The version control system used

## Author

* **Mo Khan** - [GitHub](https://github.com/cloud0101-digital)

## Acknowledgments

* None