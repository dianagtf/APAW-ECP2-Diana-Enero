package apaw.api.dtos;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import apaw.api.dtos.ProfessionalDto;

public class ProfessionalTest {
	
	@Test
	public void testGetType() {
		assertEquals(22222, new ProfessionalDto(22222).getPhone());
	}

}
