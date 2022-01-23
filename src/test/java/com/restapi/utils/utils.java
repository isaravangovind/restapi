package com.restapi.utils;

import com.rest.pojo.GetPromotions;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import static io.restassured.RestAssured.given;

public class utils {

    RequestSpecification reqSpec;
    public FileInputStream fis;
    Properties prop;

    public RequestSpecification reqSpecBuild() throws IOException {
        reqSpec = new RequestSpecBuilder()
                .setBaseUri(getProperties("baseURI")).addQueryParam("apikey", getProperties("apikey"))
                .build();
        return reqSpec;
    }

    public String getProperties(String key) throws IOException {
        fis = new FileInputStream(System.getProperty("user.dir") + "//config.properties");
        prop = new Properties();
        prop.load(fis);
        return (String) prop.get(key);
    }

    public GetPromotions getResponse(String method) throws IOException {
        APIresources resource = APIresources.valueOf(method);
        System.out.println(resource.getResources());
        return given().spec(reqSpecBuild())
                .when()
                .get(resource.getResources())
                .as(GetPromotions.class);



    }
}
