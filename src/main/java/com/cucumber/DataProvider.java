package com.cucumber;

import org.testng.annotations.*;

public class DataProvider {

	public class MyTest {

		@Test(dataProvider = "testData")
		public void testMethod(int a, int b) {
			// Your test logic here using a and b as inputs
			int result = a + b;
			System.out.println("Result: " + result);
		}
	}

	@DataProvider(name = "testdata")

//	@DataProvider(name = "testData")
	public Object[][] testData() {
		return new Object[][] { { 5, 3 }, // Test data set 1
				{ 10, 2 }, // Test data set 2
				{ 7, 7 } // Test data set 3
		};
	}
}
