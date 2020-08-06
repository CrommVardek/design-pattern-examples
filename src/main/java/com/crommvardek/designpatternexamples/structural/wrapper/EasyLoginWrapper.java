package com.crommvardek.designpatternexamples.structural.wrapper;

public class EasyLoginWrapper {

    AnUnnecessarilyComplexWayToLogin logger;
    String user;

    public void EasyLogin(String user){
        logger = new AnUnnecessarilyComplexWayToLogin();
        this.user = user;
    }

    public void logIntoTheSystem(char[] password){
        logger.LogIntoTheSystem(user, password, getIdFrom(user), user+"@system.com", false);
    }

    private int getIdFrom(String user){
        return user.hashCode();
    }

}
