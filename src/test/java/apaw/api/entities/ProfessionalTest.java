package apaw.api.entities;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ProfessionalTest {
	
	@Test
	public void testGetPhone() {
		assertEquals(33333, new Professional(33333).getPhone());
	}

}
