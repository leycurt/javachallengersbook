package com.javachallengers.encapsulation.builderpattern;

public class IronManBuilderExecutor {

    public static void main(String[] args) {
        IronMan ironMan = new IronMan.Builder("Anthony Edward Stark", "48")
            .withCar("Audi R8")
            .withSpecialWeapon("beam weapon")
            .build();

        System.out.printf("%s , %s , %s , %s", ironMan.getName(),
            ironMan.getAge(), ironMan.getCar(),
            ironMan.getSpecialWeapon());
    }

}
