

import io.restassured.http.ContentType;
import org.testng.Assert;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import java.net.URL;
import java.util.List;

import static io.restassured.RestAssured.given;


public class CalcTest extends BaseTest{


        @Test
        public void sampleTest() {
                driver.findElementById("com.google.android.calculator:id/digit_9").click();
                System.out.println("clicked");
                driver.findElementById("com.google.android.calculator:id/op_add").click();
                System.out.println("clicked");
                driver.findElementById("com.google.android.calculator:id/digit_3").click();
                System.out.println("clicked");
                driver.findElementById("com.google.android.calculator:id/eq").click();
                System.out.println("clicked");
                Assert.assertEquals(driver.findElementById("com.google.android.calculator:id/result_final").getText(), "12");
                System.out.println("Passed!");
        }

      /*  @Test
        public void checkApi(){
                DataApi user = (DataApi) given()
                        .when()
                        .contentType(ContentType.JSON)
                        .get(Constants.ApiUrl)
                        .then().log().all()
                        .extract().body().jsonPath().getJsonObject("data" , DataApi.class);
        }*/


        /*@Test
        public void Api(){
               Response response = given()
                        .baseUri("https://reqres.in/")
                         .when()
                        .log().all()
                        .get("/api/users/2")
                         .then()
                       .assertThat().statusCode(200)
                       .body("data.id", Matchers.equalTo(2));
        }*/

        @Test
        public void Api(){
                Response response = RestAssured.get("https://reqres.in/api/users");
                String perPage = response.jsonPath().getString("per_page");
                System.out.println("perPage: " + perPage);

                String totalPages = response.jsonPath().getString("total_pages");
                System.out.println("totalPages: " + totalPages);

                driver.findElementByAccessibilityId(perPage).click();
                driver.findElementById("com.google.android.calculator:id/op_add").click();
                System.out.println("clicked");
                driver.findElementByAccessibilityId(totalPages).click();
                driver.findElementById("com.google.android.calculator:id/eq").click();
                System.out.println("clicked");
                Assert.assertEquals(driver.findElementById("com.google.android.calculator:id/result_final").getText(), "8");
        }

       /* @Test
        public void sampleTest2() {
                driver.findElementByAccessibilityId("6").click();
                driver.findElementByAccessibilityId("plus").click();
                driver.findElementByAccessibilityId("2").click();
                driver.findElementByAccessibilityId("equals").click();
                Assert.assertEquals(driver.findElementById("com.google.android.calculator:id/result_final").getText(), "8");
        }*/

        @Test
        public void mappingListOfUsers(){
                List<DataApi> users = given()
                        .when()
                        .contentType(ContentType.JSON)
                        .get("https://reqres.in/api/users?page=2")
                        .then().log().all()
                        .extract().body().jsonPath().getList("data", DataApi.class);

        }

}
