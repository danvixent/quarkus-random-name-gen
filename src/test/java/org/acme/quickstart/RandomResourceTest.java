package org.acme.quickstart;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

@QuarkusTest
public class RandomResourceTest {

    @Test
    public void testRandomNameEndpoint() {
        given()
                .when().get("/random")
                .then()
                .statusCode(200);
    }

}