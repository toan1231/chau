package api_automation.TestingField;
import static io.restassured.RestAssured.given;

import api_automation.requestBuilder.GoreRequestBuilder;

//import api_automation.utils.Log;
import api_automation.utils.Log;
import com.fasterxml.jackson.core.JsonProcessingException;
import io.restassured.http.ContentType;

import api_automation.utils.TestBase;

import io.restassured.response.Response;


import org.testng.annotations.Test;

public class GoreTesting {

    @Test
    public void user_create_requestData() throws JsonProcessingException, InterruptedException {

        Log.info("This is the beginning of post request");
        Response response= given()
                .auth()
                .preemptive().basic("admin","11cd01ee14b6b61e12f198be0fb108b7ca")
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
               // .post("http://localhost:8080/job/test4/build?token=toan1231");
        //.get("http://localhost:8080/job/testing2/build?token=chauthai123456789");
       int statusCode= response.getStatusCode();
        System.out.println("11"+statusCode);
        System.out.println(response.prettyPrint());



        for (int i=0;i<7;i++){
            System.out.println("chauthai"+response.prettyPrint());
            Thread.sleep(3000);
        }


    }
}

