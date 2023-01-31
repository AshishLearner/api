package endpoints;

import io.cucumber.cienvironment.internal.com.eclipsesource.json.Json;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;


public class userendpoints {

    static Response res;


    public static Response listuser(Integer page) {
        RestAssured.baseURI = "https://reqres.in";
        RequestSpecification req = RestAssured.given();
        return req.contentType("application/json").given()
                .queryParam("page", 2).when().get("/api/users");

    }

    public static Response singleuser(Integer id) {
        RestAssured.baseURI = "https://reqres.in";
        RequestSpecification req = RestAssured.given();
        return req.contentType("application/json").pathParam("id", id)
                .when().get("/api/users/{id}");
    }

    public static Response Singleusernotfound(Integer id) {
        RestAssured.baseURI = "https://reqres.in";
        return given().contentType("application/json").pathParam("id", id)
                .when().get("/api/user/{id}");
    }

    public static Response Createuser(String name, String job) {
        RestAssured.baseURI = "https://reqres.in";
        RequestSpecification req = RestAssured.given();
        return res = req.body("{\"name\":\"" + name + "\",\"job\":\"" + job + "\"}").given().
                contentType("application/json").when().post("/api/users");


    }

    public static Response updateUser(String str, String str1) {
        RestAssured.baseURI = "https://reqres.in";
        RequestSpecification req = RestAssured.given();
        return req.body("{\"name\":\"" + str + "\",\"job\":\"" + str1 + "\"}").
                contentType("application/json").when().put("/api/users/2");
    }

    public static Response deleteUser() {
        RestAssured.baseURI = "https://reqres.in";
        RequestSpecification req = RestAssured.given();
        return res = req.
                contentType("application/json").when().delete("/api/users/2");

    }

    public static Response deleteUser(Integer id) {
        RestAssured.baseURI = "https://reqres.in";
        RequestSpecification req = RestAssured.given();
        return res = req.header("name", "rajiv").
                contentType("application/json").when().delete("/api/users/{id}");



    }
}
