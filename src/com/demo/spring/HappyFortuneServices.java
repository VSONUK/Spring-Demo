package com.demo.spring;

public class HappyFortuneServices implements FortuneServices {
    @Override
    public String getFortune() {
        return "today is my lucky day for life";
    }
}