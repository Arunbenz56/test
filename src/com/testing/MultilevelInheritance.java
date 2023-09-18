//package com.testing;
//
//
//	// Grandparent class (superclass)
//	class Animal {
//	    void eat() {
//	        System.out.println("The animal is eating.");
//	    }
//
//	    void sleep() {
//	        System.out.println("The animal is sleeping.");
//	    }
//	}
//
//	// Parent class (subclass of Animal)
//	class Dog extends Animal {
//	    void bark() {
//	        System.out.println("The dog is barking.");
//	    }
//	}
//
//	// Child class (subclass of Dog)
//	class GermanShepherd extends Dog {
//	    void guard() {
//	        System.out.println("The German Shepherd is guarding.");
//	    }
//	}
//
//	public class MultilevelInheritance {
//	    public static void main(String[] args) {
//	        // Create an instance of the GermanShepherd class
//	        GermanShepherd myDog = new GermanShepherd();
//
//	        // Call methods from the grandparent class
//	        myDog.eat();
//	        myDog.sleep();
//
//	        // Call methods from the parent class
//	        myDog.bark();
//
//	        // Call method from the child class
//	        myDog.guard();
//	    }
//	}
//
//
