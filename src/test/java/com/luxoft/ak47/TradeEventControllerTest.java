package com.luxoft.ak47;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.jupiter.api.Assertions.*;

class TradeEventControllerTest {

    @Test
    void schouldReturnTradesWithVersion0() {

        when().get("/tradeEvent").then()
                .statusCode(200)
                .body("tradeEvent.version", equalTo("0"));

    }

    @Test
    void schouldGet404Nonexistingpage() {


        when().get("/nonExisting").then().statusCode(404);
    }
}