package javaclass.introduction.settersandgetters;

import javaclass.introduction.baseclasses.Person;

public class Main {
	public static void main(String[] args) {
		Person person = new Person("Juana", 30);
		System.out.println(person);
		
		// Even if personName and personAge are modified they won't modified the person object, that
		// is because "String" is an immutable object and int is a primitive data type that only
		// returns a copy of the value.
		// If we return phones withouth the unmodifiable collection wrapper then we could modified
		// the person but sinc we only return an unmodifiable list trying to change it would throw
		// an exception.
		String personName = person.getName();
		personName = "Rosa";
		System.out.println(personName);
		
		int personAge = person.getAge();
		personAge = 50;
		System.out.println(personAge);
		
		System.out.println(person);
		
		// this will fail because "personPhones" is an unmodifiable list.
		// List<String> personPhones = person.getPhones();
		// personPhones.add("55555555");
		
		
		// Here we test the methods to manage the phones.
		person.addPhone("5555");
		person.addPhone("4444");
		System.out.println("- Manage phones section");
		System.out.println(person);
		
		person.removePhone(null);
		person.removePhone("5555");
		System.out.println(person);
	}
}
