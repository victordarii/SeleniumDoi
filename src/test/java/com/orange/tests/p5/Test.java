package com.orange.tests.p5;

public class Test {
    public static void main(String[] args) {
        Shadow shadowObj = new Shadow();

        Ghost ghost = new Ghost(shadowObj);
        ghost.appearance = "invisible";
        String naturalAbility = ghost.shadow.naturalAbility;
        System.out.println("naturalAbility = " + naturalAbility);


    }
}
