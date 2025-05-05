package com.example.server.controller;

import lombok.Getter;

@Getter
public class AgeRange {
    private final int minAge;
    private final int maxAge;

    public AgeRange(int minAge, int maxAge) {
        this.minAge = minAge;
        this.maxAge = maxAge;
    }

}
