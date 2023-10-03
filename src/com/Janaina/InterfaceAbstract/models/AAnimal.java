package com.Janaina.InterfaceAbstract.models;

//Abstract Class - marked by keyword 'abstract'
//TODO - test visibility mod
public abstract class AAnimal {

    //Includes abstract - excludes body: {}
    public abstract void eat();

    //Ordinary method - excludes abstract
    public void makeSound(){
        System.out.println("Random animal noise");

    }


}
