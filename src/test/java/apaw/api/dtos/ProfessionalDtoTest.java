package apaw.api.dtos;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import org.junit.Before;

import apaw.api.dtos.ProfessionalDto;

public class ProfessionalDtoTest {
	
	ProfessionalDto professional;
	
	@Before
	public void professionalSet() {
		professional = new ProfessionalDto();
		
		professional.setPhone(555777222);
		professional.setCity(28905);
		professional.setType("ok");
	}
	
	@Test
	public void testGetPhone() {
		assertEquals(555777222, professional.getPhone());
	}
	
	@Test
	public void testGetCity() {
		assertEquals(28905, professional.getCity());
	}
	
	@Test
	public void testGetType() {
		assertEquals("ok", professional.getType());
	}

}
