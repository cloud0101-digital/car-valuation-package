package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CarValuationTest extends BaseTest {

    @Test(description = "Reads the input file and validates the output")
    public void test() throws IOException, InterruptedException {
        List<String> expectedOutputList = new ArrayList<String>();

        // Read Car Output file and enroll records in the List
        BufferedReader reader = new BufferedReader(new FileReader("src/test/resources/car_output_v2.txt"));
        String line = reader.readLine();
        while (line != null) {
            expectedOutputList.add(line);
            line = reader.readLine();
        }
        reader.close();

        //Read Car Input file and pick up records one by one
        BufferedReader reader1 = new BufferedReader(new FileReader("src/test/resources/car_input_v2.txt"));
        String licensePlateNumber;
        int i = 0;
        String expectedOutput, actualOutput;
        while ((licensePlateNumber = reader1.readLine()) != null) {
            driver.get("https://www.cazoo.co.uk/value-my-car/");

            //Input license plate number fetched from file
            driver.findElementById("txtRegNumber").sendKeys(licensePlateNumber);

            //Click on the 'Start valuation' button
            driver.findElementById("btnValuation").click();

            //Extract Car Details text and compare the output with expected output
            expectedOutput = expectedOutputList.get(i);
            actualOutput = driver.findElementById("valuationResult").getText();

            Assert.assertEquals(expectedOutput, actualOutput);
            i++;
        }
        reader1.close();

    }

}