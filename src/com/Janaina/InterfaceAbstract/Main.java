package com.Janaina.InterfaceAbstract;

import com.Janaina.InterfaceAbstract.models.Cat;
import com.Janaina.InterfaceAbstract.models.Dog;
import com.Janaina.InterfaceAbstract.models.Squirrel;

public class Main {
    public static void main(String[] args) {

        //Instantiate object
        Cat kasper = new Cat();
        Dog fido = new Dog();
        Squirrel benny = new Squirrel();

        benny.eat();        //Abstract method - Implementation
        benny.makeSound();  //Ordinary method

        kasper.name();
        kasper.eat();
        kasper.move();
        kasper.makeSound();
        kasper.sleep();
        kasper.typeOfAnimal("Cat"); //Default method

        fido.name();
        fido.eat();
        fido.move();
        fido.makeSound();
        fido.sleep();
        fido.typeOfAnimal("Dog"); //Default method


    }


}
