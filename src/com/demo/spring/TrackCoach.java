package com.demo.spring;

public class TrackCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Run a 5 km in a day";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}
