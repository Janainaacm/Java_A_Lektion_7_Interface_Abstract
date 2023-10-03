package com.Janaina.InterfaceAbstract.models;

//Abstract - Inheritance (arv)
//As a standard, methods are public
//Uses keyword 'implements'
public interface Animal {

    /*
    TODO
     - Give relevant names
     - Implement inheritance
     Super viktigt: private visual mod
     */


    //Abstract method
   void name();
    void move();
    void eat();
    void sleep();
    void makeSound();


    //Default
    default void typeOfAnimal(String typeOfAnimal){
        System.out.println(typeOfAnimal);


    }

}
