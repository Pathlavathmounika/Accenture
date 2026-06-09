package com.tnsif.abstractclass;

abstract class Animal {

    // Abstract Method
    abstract void makeSound();
}

class Dog extends Animal {

    // Implementing Abstract Method
    void makeSound() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {

        Dog d = new Dog();
        d.makeSound();
    }
}
