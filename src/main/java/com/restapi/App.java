package com.restapi;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
String comment = "EPISODE/MOVIE/SERIES/SEASON/EPISODE/MOVIE/SERIES/SEASON";
        Set<String> items = new HashSet<String>(Arrays.asList(comment.split("/")));
        System.out.println(items);



    }
}
