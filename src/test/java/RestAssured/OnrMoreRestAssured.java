package RestAssured;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Header;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class OnrMoreRestAssured {
	@Test(enabled = false)
	public static void getstatuscode() {

		// String baseUri = "https://reqres.in/api/users?page=2";

		RequestSpecification request = RestAssured.given();
		// Setting Base URI
		request.baseUri("https://restful-booker.herokuapp.com");
		// Setting Base Path
		request.basePath("/booking");

		Response response = request.get();

		System.out.println(response.asString());
	}

	@Test
	public static void getstatuscodes() {

		String baseUri = "https://jsonplaceholder.typicode.com";

		// Header someHeader = new Header("some_name", "some_value");
		given().// auth().preemptive().basic("user", "password").
		// contentType("").
		// header(someHeader ).
		// queryParam("page", "2").
				when().get("/posts").then().statusCode(200).body("userId", equalTo(1)).body("id", equalTo(1))
				.body("title", equalTo("sunt aut facere repellat provident occaecati excepturi optio reprehenderit"))
				.body("body", equalTo(
						"quiaT et suscipit\nsuscipit recusandae consequuntur expedita et cum\nreprehenderit molestiae ut ut quas totam\nnostrum rerum est autem sunt rem eveniet architecto"));

	}

	@Test
	public static void Tet() {

		String baseURL = "https://restful-booker.herokuapp.com";
		String pathparameter = "/booking";

		given().when().get(baseURL).then().statusCode(200).log().all();
		// body("bookingid", equalTo("3364"));

		// [{"bookingid":3364}

	}

	@Test
	public void testGetPost() {
		RestAssured.baseURI = "https://jsonplaceholder.typicode.com";

		String s = given().when().get("/posts/1").then().statusCode(200).body("userId", equalTo(1)).toString();

		System.out.println(s);
		// body("id", equalTo(1)).
		// body("title", equalTo("sunt aut facere repellat provident occaecati excepturi
		// optio reprehenderit")).
		// body("body", equalTo("quia et suscipit\nsuscipit recusandae consequuntur
		// expedita et cum\nreprehenderit molestiae ut ut quas totam\nnostrum rerum est
		// autem sunt rem eveniet architecto"));
	}

	
    @Test
    public void getThenPostRequest() {
        // Define the base URL and path parameters for GET request
        String baseUrl = "https://your-api-endpoint.com";
        String getPath = "/get-endpoint";
        String postPath = "/post-endpoint";

        // Set base URI
        RestAssured.baseURI = baseUrl;

        // Perform GET request and capture the response
        Response getResponse = given()
                .contentType(ContentType.JSON)
                .header("Authorization", "Bearer Your_Auth_Token") // If needed
                .queryParam("param1", "value1") // Query parameters if needed
                .queryParam("param2", "value2")
                .when()
                .get(getPath)
                .then()
                .statusCode(200)
                .extract()
                .response();

        // Extract data from the response
        String extractedData = getResponse.path("some_key");

        // Perform POST request using extracted data from GET response
        given()
            .contentType(ContentType.JSON)
            .header("Authorization", "Bearer Your_Auth_Token") // If needed
            .body("{ \"data\": \"" + extractedData + "\" }") // Use extracted data in the POST request body
        .when()
            .post(postPath)
        .then()
            .statusCode(200) // Check status code for the POST request
            .body("some_other_key", equalTo("expected_value")); // Validate response body if needed
    }
}

