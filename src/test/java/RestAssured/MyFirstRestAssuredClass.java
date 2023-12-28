package RestAssured;

import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class MyFirstRestAssuredClass {

	public static void main(String[] args) {

		getSpecificValueOfResponseBody();

	}

	static String baseURI = "http://demo.guru99.com/V4/sinkministatement.php" + "?" + "CUSTOMER_ID=68195&"
			+ "PASSWORD=1234!&" + "Account_No=1";

	/*
	 * 
	 * Now notice that the URL used is long and less readable, if you look closely,
	 * you will notice that 3 query parameters are being used which are
	 * 
	 * Customer_ID Password Account_No
	 * 
	 * Rest Assured, helps us pass every part(query, path, header param) separately,
	 * making the code more readable and easy to maintain. Also, we can parameterize
	 * the data from an external file as required.
	 * 
	 * For using query param, we go back to our definition of the syntax and see
	 * that all of them are passed as a part of given.
	 */
	@Test
	public void getResponseBody() {

		given(). // No headers required, no query or path param.
				when(). // No specific condition setup
				get(baseURI).then().log().all(); // // Log all details of the request and response

	}

	@Test
	public static void getResponseBody_withQureyParam() {
		String baseURI = "http://demo.guru99.com/V4/sinkministatement.php";
		given().queryParam("CUSTOMER_ID", "68195").queryParam("PASSWORD", "1234!").queryParam("Account_No", "1").when()// No
																														// specific
																														// condition
																														// setup
				.get(baseURI).then().log().body(); // // Log all details of the request and response

	}

	@Test
	public static void getStatuscode_withQureyParam() {

		String baseURI = "http://demo.guru99.com/V4/sinkministatement.php";
		int statuscode = given().queryParam("CUSTOMER_ID", "1234").queryParam("PASSWORD", "1234!")
				.queryParam("Account_No", "1").when().get(baseURI).getStatusCode();
		System.out.println("The response status is" + statuscode);

		given().when().get(baseURI).then().assertThat().statusCode(200);
	}

// Other methods for different requests can be added here
	@Test
	public static void getResponseHeaders() {
		try {
			System.out.println("The headers in the response " + "\n" + get(baseURI).then().extract().headers());
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	@Test
	public static void getResponseTime() {
		System.out.println(
				"The time taken to fetch the response " + get(baseURI).timeIn(TimeUnit.MILLISECONDS) + " milliseconds");
	}

	@Test
	public static void getResponseContentType() {
		System.out.println("The content type of response " + get(baseURI).then().extract().contentType());
	}

	@Test

	public static void getSpecificPartOfResponseBody1() {
		// Perform a GET request and extract the list of amounts
		String baseURI = "http://demo.guru99.com/V4/sinkministatement.php?CUSTOMER_ID=68195&PASSWORD=1234!&Account_No=1"; // Replace
																															// with
																															// your
		// String baseURI = "http://demo.guru99.com/V4/sinkministatement.php";
		int statuscode = given().queryParam("CUSTOMER_ID", "1234").queryParam("PASSWORD", "1234!")
				.queryParam("Account_No", "1").when().get(baseURI).getStatusCode();
		System.out.println("The response status is " + statuscode);

		given().when().get(baseURI).then().assertThat().statusCode(200); // base
		// URI
		List<Integer> amounts;

		amounts = given().when().get(baseURI).then().extract().path("result.statements.AMOUNT");

		// Calculate the sum of all amounts
		int sumOfAll = 0;
		for (int amount : amounts) {
			System.out.println("The amount value fetched is " + amount);
			sumOfAll = sumOfAll + (amount); // Update the sum using each amount
		}

		// Print the total amount
		System.out.println("The total amount is " + sumOfAll);
	}

	@Test
	public static void getSpecificValueOfResponseBody() {

		String baseURI = "http://demo.guru99.com/V4/sinkministatement.php";
		Response response = RestAssured.get(baseURI);
		// Extract the response body as a string
		String responseBody = response.getBody().asString();
		// Print or use the response body string
		System.out.println("Response Body: " + responseBody);

		/*
		 * given(). queryParam("CUSTOMER_ID", "68195"). queryParam("PASSWORD", "1234!").
		 * queryParam("Account_No", "1"). when() .get(baseURI).then().log(). ;
		 */
		JsonPath jsonPath = new JsonPath(responseBody);
		String user_id = jsonPath.getString("AMOUNT");

		System.out.println("The total amount is " + responseBody);

	}

	@Test
	public static void Rest() {
		// Send a GET request to JSONPlaceholder's /posts endpoint
		Response response = RestAssured.get("https://jsonplaceholder.typicode.com/posts");

		// Get the response body as a string
		String responseBody = response.getBody().asString();

		// Print the response body
		System.out.println("Response Body:");
		System.out.println(responseBody);

	}
	

}
