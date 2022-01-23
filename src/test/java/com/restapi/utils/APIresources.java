package com.restapi.utils;

public enum APIresources {

    GETPROMOTION("popcorn-api-rs-7.9.17/v1/promotions");

    private String resources;

    APIresources(String resources) {
        this.resources = resources;
    }

    public String getResources() {
        return resources;
    }
}
