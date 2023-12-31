package com.tecsup.petclinic.services;


import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.tecsup.petclinic.entities.Pet;
import com.tecsup.petclinic.exception.PetNotFoundException;



@SpringBootTest
public class PetServiceTest {

	private static final Logger logger = LoggerFactory.getLogger(PetServiceTest.class);
	
	@Autowired
	private PetService petService;
	
	
	@Test
	void testCreatedPet() {
		
		Pet pet = new Pet("Ponky", 1, 1);
		assertEquals(1,1);
	}
	
	
	@Test
	void testFindPetById() {

		long ID = 1;
		String NAME = "Leo";
		Pet pet = null;
		
		try {
			
			pet = petService.findById(ID);
			System.out.println(pet + "HERE");
			
		} catch (PetNotFoundException e) {
			assertThat(e.getMessage(), false);
		}
		logger.info("" + pet);

		assertThat(pet.getName(), is(NAME));
		


	}





}
