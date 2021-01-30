package APIMethodsAutomation;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Assert;

public class APIGetMethod {
	
	public void getRequest()
	{
		Response response=RestAssured.get("https://reqres.in/api/users?page=2");
		int statusCode=response.getStatusCode();
		String result=response.getBody().asPrettyString();
		System.out.println(result);
		Assert.assertEquals(statusCode, 200);
		
		System.out.println(statusCode);
		System.out.println(response.getBody().toString());
	}
	
	 
	
}
