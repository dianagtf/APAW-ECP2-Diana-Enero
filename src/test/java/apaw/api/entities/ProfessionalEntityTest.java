package apaw.api.entities;

import org.junit.Test;

import apaw.api.dtos.ProfessionalDto;

import static org.junit.Assert.assertEquals;

import org.junit.Before;

public class ProfessionalEntityTest {
	
	ProfessionalDto professional;
	
	@Before
	public void professionalSet() {
		professional = new ProfessionalDto(88888888, 28905, "Ciudad dormitorio");
	}
	
	@Test
	public void testGetPhone() {
		assertEquals(88888888, professional.getPhone());
	}
	
	@Test
	public void testGetCity() {
		assertEquals(28905, professional.getCity());
	}
	
	@Test
	public void testGetType() {
		assertEquals("Ciudad dormitorio", professional.getType());
	}

}
