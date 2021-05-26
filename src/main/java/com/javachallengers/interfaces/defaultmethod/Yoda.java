package com.javachallengers.interfaces.defaultmethod;

public class Yoda implements Jedi {

    public static void main(String... defaultMethodExample) {
        new Yoda().useForce();
    }

}

interface Jedi {

    default void useForce() {
        System.out.println("Using the force!");
    }

}
