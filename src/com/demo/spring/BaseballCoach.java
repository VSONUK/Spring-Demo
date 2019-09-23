package com.demo.spring;

import org.jetbrains.annotations.Contract;

public class BaseballCoach implements Coach {

    private FortuneServices fortuneServices;

    @Contract(pure = true)
    public BaseballCoach(FortuneServices fortuneServices) {
        this.fortuneServices = fortuneServices;
    }

    @Override
    public String getDailyWorkout(){
        return "spend 20 minutes on batting practice";
    }

    @Override
    public String getDailyFortune() {
        return fortuneServices.getFortune();
    }

    public void doMyStartupStuff(){
        System.out.println("inside doMyStartupStuff");
    }

    public void doMyCleanupStuff(){
        System.out.println("inside doMyCleanupStuff");
    }
}
