package api_automation.TestingField;
import static io.restassured.RestAssured.given;

import api_automation.requestBuilder.GoreRequestBuilder;

//import api_automation.utils.Log;
import api_automation.utils.Log;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jcraft.jsch.Logger;
import io.restassured.http.ContentType;

import api_automation.utils.TestBase;

import io.restassured.response.Response;


import org.testng.annotations.Test;

public class GoreTesting {

    @Test
    public void user_create_requestData() throws JsonProcessingException, InterruptedException {

        Log.info("This is the beginning of post request");
        Response response= given()
                .contentType(ContentType.JSON)
                .body(" {\n" +
                        "            \"id\": 1,\n" +
                        "            \"employee_name\": \"Tigerhh Nixon\",\n" +
                        "            \"employee_salary\": 320800,\n" +
                        "            \"employee_age\": 61,\n" +
                        "            \"profile_image\": \"\"\n" +
                        "        }")
                .when()
                .post("https://dummy.restapiexample.com/api/v1/create");
       int statusCode= response.getStatusCode();

        for (int i=0;i<7;i++){
            System.out.println("chau"+response.prettyPrint());
            Thread.sleep(3000);
        }
/// //////////////////////////

    }
}

