package org.kenard.resources;

import io.quarkus.test.common.http.TestHTTPEndpoint;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.containsString;

@QuarkusTest
@TestHTTPEndpoint(FrutasResource.class)
class FrutasResourceTest {

    @Test
    void list() {
        given()
                .when().get().then()
                .statusCode(200)
                .body(containsString("maçã"));
    }

//    @Test
//    void list() {
//        given()
//                .when().get("/frutas")
//                .then()
//                .statusCode(200)
//                .body(containsString("maçã"));
//    }

//    @Test
//    void novaFruta() {
//    }
}