package pkg;
import java.util.Scanner;
import java.util.Random;


public class Dog {
	// var
	String name;
	int age;
	String breed;


	//contru
	public Dog() {
		name = "Clifford";
		age = 3;
		breed = "big red dog";
	} 

	public Dog(String a) {
		name = a;
		age = 1;
		breed = "dog dog";
	}

	public Dog(String a, String b) {
		name = a;
		age = 1;
		breed = b;
	}

	public Dog(String a, int b) {
		name = a; 
		age = b;
		breed = "dog dog";
	}

	// meth
	public void setName(String a) {
		name = a;
	}

	public void setAge(int a) {
		age = a;
	}

	public void setBreed(String a) {
		breed = a;
	}

	public String getName(){
		return name;
	}

	public int getAge(){
		return age;
	}

	public String getBreed(){
		return breed;
	}

	public boolean isSleeping(){
		boolean a;
		int chance =(int)(2*Math.random());
		if (chance == 0){
			a = true;
		} else {
			a = false;
		}
		return a;
	}

	public void bark(){
		System.out.println(name + ": Woof!");
	}



}
