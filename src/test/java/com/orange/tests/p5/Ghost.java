package com.orange.tests.p5;

public class Ghost {

    String appearance;
    Dog dog;
    Cat cat;
    Shadow shadow;

    public Ghost(Shadow shadowObj) {
        this.shadow = shadowObj;
    }

    public void ability() {
        System.out.println("It is: " + appearance);
    }

}
