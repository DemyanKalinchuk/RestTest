import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.requestSpecification;
import static org.hamcrest.Matchers.equalTo;
//import static org.hamcrest.core.IsEqual.equalTo;

public class RestTest {


    @Test
    public void receiveData(){

        given()
                .baseUri("https://swapi.dev/api/starships/9/")
                .basePath("")
                .contentType(ContentType.JSON)
                .when().get()
                .then()
                .statusCode(200)
                .body("name", equalTo("Death Star"));


    }
}
