# oop_concepts
OOP Concepts

Object Oriented Programming (OOPs) Concept in Java.
OOP have 6 basic concepts, that is:

1. Object

Form or entity. 

Example: chair, pen, table.

2. Class

Blueprint of object.

Example: Class Car, object is bus, sedan, minibus.

3. Inheritance

Child have all properties (field, method) and behaviors of parents.

Example: Class Suzuka extends Motorcycle.
Class Motorcycle have property color, Class Suzuka also have property color

4. Polymorphism

One form can be change to another form.
Example:

Motorcycle motor1 = new SatrioFV();
Motorcycle motor2 = new Varina();

5. Abstraction

Hiding internal details and showing functionality is known as abstraction.

example : we have abstract class Pencil, class PencilMechanic, class PencilWood.
PencilMechanic and PencilWodd extends Pencil.
```
public abstract class Pencil {
	
	abstract void write();
	
	public void click() {
		System.out.println("Click!");
	}
	
	public void sharpen() {
		System.out.println("srrrkkk..srkkk...");
	}
}
```
```
public class PencilMechanic extends Pencil{

	@Override
	void write() {
		System.out.println("Writing using mechanic pencil");
	}
	
}
```
```
public class PencilWood extends Pencil{
	
	@Override
	void write() {
		System.out.println("Writing using wood pencil");
	}

}
```

6. Encapsulation

This is the practice of keeping fields within a class private, then providing access to them via public methods. It’s a protective barrier that keeps the data and code safe within the class itself.
Example:
private String brand;
public String getBrand();
public void setBrand(String brand);

MORE:


7. Cosntructor

Method first time called when class has instantied.

8. Overriding and Overloading

	a. Overriding : Same method in class and extends class

	b. Overloading : Same method different parameters



Source: 
https://www.javatpoint.com/java-oops-concepts
https://stackify.com/oops-concepts-in-java
