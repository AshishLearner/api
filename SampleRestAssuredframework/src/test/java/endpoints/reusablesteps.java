package endpoints;

import io.restassured.response.ValidatableResponse;

public class reusablesteps extends userendpoints {
   static ValidatableResponse res;

    public ValidatableResponse verifyinguserdelte() {
        return res = deleteUser().then().statusCode(204);
    }
    public ValidatableResponse verifylistuser(){
        return res = listuser(2).then().statusCode(200);
    }
    public ValidatableResponse verifysingleuser(){

        return res = singleuser(1).then().statusCode(200);
    }
    public ValidatableResponse verifyingSingleusernotfound(){
        return res = Singleusernotfound(23).then().statusCode(404);
    }
    public ValidatableResponse verifyinguserCreated(){
        return res = Createuser("name","job").then().statusCode(201);
    }
    public ValidatableResponse verifyupdateUser(){
        return res = updateUser("name","job").then().statusCode(200);
    }
}
