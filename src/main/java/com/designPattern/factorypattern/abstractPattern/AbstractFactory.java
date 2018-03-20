package com.designPattern.factorypattern.abstractPattern;

public abstract class AbstractFactory {

    abstract Color getColor(String color);
    abstract Shape getShape(String shape) ;
}
