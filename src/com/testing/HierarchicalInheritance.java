package com.testing;

	
	// Parent class (superclass)
	class Animal {
	    void eat() {
	        System.out.println("The animal is eating.");
	    }

	    void sleep() {
	        System.out.println("The animal is sleeping.");
	    }
	}

	// Child class 1 (subclass of Animal)
	class Dog extends Animal {
	    void bark() {
	        System.out.println("The dog is barking.");
	    }
	}

	// Child class 2 (subclass of Animal)
	class Cat extends Animal {
	    void meow() {
	        System.out.println("The cat is meowing.");
	    }
	}

	public class HierarchicalInheritance {
	    public static void main(String[] args) {
	        // Create an instance of the Dog class
	        Dog myDog = new Dog();

	        // Create an instance of the Cat class
	        Cat myCat = new Cat();

	        // Call methods from the parent class
	        myDog.eat();
	        myDog.sleep();

	        // Call method from the child class (Dog)
	        myDog.bark();

	        // Call methods from the parent class
	        myCat.eat();
	        myCat.sleep();

	        // Call method from the child class (Cat)
	        myCat.meow();
	    }
	}


