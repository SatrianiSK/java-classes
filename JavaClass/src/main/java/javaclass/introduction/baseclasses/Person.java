package javaclass.introduction.baseclasses;

import static com.google.common.base.Preconditions.checkNotNull;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Person {
	/*
	 * Access modifiers from the most restrictive to the less restrictive:
	 * Private: only access from the same class
	 * (Default): access from the same package and class
	 * Protected: access from child classes and from same package and class
	 * Public: access from everywhere
	 */
	
	private String name;
	private int age;
	private List<String> phones = new ArrayList<>();
	
	public Person(String name, int age) {
		// Good practice: check for null parameters.
		this.name = checkNotNull(name, "Name can't be null");
		this.age = age;
	}
	
	// Getters
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public List<String> getPhones() {
		// Good practice: create unmodifiable collections
		return Collections.unmodifiableList(phones);
	}
	
	// Setters
	public void setAge(int age) {
		this.age = age;
	}
	
	// Class methods
	public void addPhone(String phone) {
		this.phones.add(checkNotNull(phone));
	}
	
	public boolean removePhone(String phone) {
		return this.phones.remove(phone);
	}
	
	
	// This method overrides the toString method from Object class.
	@Override
	public String toString() {
		return name + " edad: " + age + " phones: " + phones;
	}
	
}
