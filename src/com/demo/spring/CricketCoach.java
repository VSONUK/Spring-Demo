package com.demo.spring;

public class CricketCoach implements Coach {

    private FortuneServices fortuneServices;
    private String emailAdress;
    private String team;

    public CricketCoach() {
        System.out.println("CricketCoach: inside no Arg- Constructor");
    }

    public void setFortuneServices(FortuneServices fortuneServices) {
        System.out.println("CricketCoach: inside Setter method");
        this.fortuneServices = fortuneServices;
    }

    public String getEmailAdress() {
        return emailAdress;
    }

    public void setEmailAdress(String emailAdress) {
        System.out.println("CricketCoach: inside Setter method setEmail");
        this.emailAdress = emailAdress;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        System.out.println("CricketCoach: inside Setter method set team");
        this.team = team;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowler 15 over per day";
    }

    @Override
    public String getDailyFortune() {
        return fortuneServices.getFortune();
    }
}
