package com.example;

import java.time.Instant;

import com.google.gson.Gson;

public final class Main {

    public static void main(final String ... args) {
        System.out.println("A GSON formatted time is " + new Gson().toJson(Instant.now()));
    }

}
