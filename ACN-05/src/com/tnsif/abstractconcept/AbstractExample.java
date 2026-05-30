package com.tnsif.abstractconcept;

abstract class AbstractExample {
    // abstract method; no body
    abstract void bike();
    
    // non-abstract method
    void car() {
        System.out.println("BMW");
    }
    
    //THE MAIN METHOD (Moved inside this class!)
    public static void main(String[] args) {
        Vehicle obj = new Vehicle();
        obj.bike();
        obj.car();
    }
}

// CHILD CLASS (Stays outside at the bottom)
class Vehicle extends AbstractExample {
   
    void bike() {
        System.out.println("Royal Enfield");
    }
}