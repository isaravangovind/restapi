package com.restapi.utils;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

public class utils {


    public void responseSpecBuilder(){

        RequestSpecification reqSpec = new RequestSpecBuilder()
                .setBaseUri(baseURI).addQueryParam("apikey", apiKey)
                .build();

//                .setBaseUri(baseURI).addQueryParam("apikey", apiKey)
//                .build();
    }
}
