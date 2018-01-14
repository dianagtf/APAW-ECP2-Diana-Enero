package apaw.api.entities;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import apaw.api.dtos.LevelDto;

public class LevelEntitiesTest {
	
private LevelDto levelDto;
	
	@Before
	public void orderSet() {
		levelDto = new LevelDto();
		
		levelDto.setId(1);
		levelDto.setLevelName("EXPERT");
	}
	
	@Test
	public void testGetId() {
		assertEquals(1, levelDto.getId());
	}
	
	@Test
	public void testGetLevelName() {
		assertEquals("EXPERT", levelDto.getLevelName());
	}

}
