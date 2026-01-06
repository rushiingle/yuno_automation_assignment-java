package utils;

import config.Config;
import io.restassured.RestAssured;
import io.restassured.response.Response;

import java.util.UUID;

import static io.restassured.RestAssured.given;

public class ApiClient {

    static {
        RestAssured.baseURI = Config.BASE_URL;
    }

    public static Response post(String endpoint, String body) {

        return given()
                .header("public-api-key", Config.PUBLIC_API_KEY)
                .header("private-secret-key", Config.PRIVATE_SECRET_KEY)
                .header("x-idempotency-key", UUID.randomUUID().toString())
                .contentType("application/json")
                .body(body)
                .post(endpoint);
    }
}
