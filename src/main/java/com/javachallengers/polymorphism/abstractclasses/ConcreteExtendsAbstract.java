package com.javachallengers.polymorphism.abstractclasses;

public class ConcreteExtendsAbstract {
}

abstract class Hero { abstract void usePower(); }
abstract class Marvel extends Hero {}

class SpiderMan extends Marvel {
    @Override
    void usePower() {

    }
}
