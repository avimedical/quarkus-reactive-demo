package org.example.quarkus_reactive_demo.api;

import io.quarkus.test.junit.QuarkusTest;
import org.example.quarkus_reactive_demo.entity.MyEntity;
import org.example.quarkus_reactive_demo.repository.MyRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;

import static io.restassured.RestAssured.given;

@QuarkusTest
class MyControllerTest {

    @Inject
    MyRepository myRepository;

    @BeforeEach
    void setup() {
        final var myEntity = new MyEntity();
        myEntity.setName("aname");
        myEntity.setDescription("adescription");
        myRepository.persist(myEntity);
    }

    @Test
    void testEndpoint() {
        given().when().get("/api").then().statusCode(200).extract();
    }

}