package githubapi;


	import static io.restassured.RestAssured.given;
	import org.testng.Assert;
	import org.testng.Reporter;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.Test;
	import io.restassured.builder.RequestSpecBuilder;
	import io.restassured.http.ContentType;
	import io.restassured.response.Response;
	import io.restassured.specification.RequestSpecification;

	public class GitHubSSHKeyTest {

	    RequestSpecification requestSpec;

	    String sshKey = "ssh-ed25519 AAAAC3NzaC1lZDI1NTE5AAAAIMQXj9i4tVPObVc6JhJhzJJ2E33NmTlX6qrNaygJaI6d azuread\\\\sankeerthanamarupall@IBM-H2VMFD4";
	    int keyId;

	    @BeforeClass
	    public void setup() {
	        requestSpec = new RequestSpecBuilder()
	                .setContentType(ContentType.JSON)
	                .addHeader("Authorization","token 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")
	                .setBaseUri("https://api.github.com")
	                .build();
	    }

	    @Test(priority = 1)
	    public void addSSHKey() {

	        String requestBody ="{\n" +"\"title\":\"TestAPIKey\",\n" +"\"key\":\"" + sshKey + "\"\n" +"}";

	        Response response =
	                given()
	                        .spec(requestSpec)
	                        .body(requestBody)
	                .when()
	                        .post("/user/keys");

	        keyId = response.jsonPath().getInt("id");

	        Assert.assertEquals(response.getStatusCode(), 201);
	        Assert.assertTrue(keyId > 0);

	        Reporter.log("Generated Key ID: " + keyId, true);
	    }

	    @Test(priority = 2, dependsOnMethods = "addSSHKey")
	    public void getSSHKey() {

	        Response response =
	                given()
	                        .spec(requestSpec)
	                        .pathParam("keyId", keyId)
	                .when()
	                        .get("/user/keys/{keyId}");

	        Reporter.log(response.asPrettyString(), true);

	        Assert.assertEquals(response.getStatusCode(), 200);
	        Assert.assertEquals(response.jsonPath().getInt("id"), keyId);
	    }

	    @Test(priority = 3, dependsOnMethods = "getSSHKey")
	    public void deleteSSHKey() {

	        Response response =
	                given()
	                        .spec(requestSpec)
	                        .pathParam("keyId", keyId)
	                .when()
	                        .delete("/user/keys/{keyId}");

	        Reporter.log("Delete Status Code: "+ response.getStatusCode(), true);
	        Assert.assertEquals(response.getStatusCode(), 204);
	    }
	}

