package com.ssmae;

import com.malbright.Pet;

public class PetStore {

	public static void main(String[] args) {
		
		Pet newDog1 = new Pet();
		newDog1.setName("Bandit");
		newDog1.setLocation("Griffith");
		newDog1.setBreed("Border-Collie Mutt");
		newDog1.setAge(10);
		
		Pet newDog2 = new Pet();
		
		newDog2.setName("Tucker");
		newDog2.setLocation("Hammond");
		newDog2.setBreed("Labrador Retriever");
		newDog2.setAge(5);
		
		Pet newDog3 = new Pet();
				
		newDog3.setName("Nugget");
		newDog3.setLocation("Valporaiso");
		newDog3.setBreed("Poodle");
		newDog3.setAge(3);
		
		Pet newDog4 = new Pet();
						
		newDog4.setName("Suki");
		newDog4.setLocation("Crown Point");
		newDog4.setBreed("Bulldog");
		newDog4.setAge(12);
		
		System.out.println(newDog2.getName());
		

	}

}
