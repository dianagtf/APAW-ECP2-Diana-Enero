package apaw.api.entities;

import static org.junit.Assert.assertEquals;

import java.util.Calendar;

import org.junit.Before;
import org.junit.Test;

import apaw.api.dtos.OrderDto;

public class OrderEntityTest {
	
	OrderDto order;
	Calendar calendar;
	
	@Before
	public void professionalSet() {
		
		calendar = Calendar.getInstance();
		
		order = new OrderDto(1, calendar, 100);
	}
	
	@Test
	public void testGetId() {
		assertEquals(1, order.getId());
	}
	
	@Test
	public void testGetDate() {
		assertEquals(calendar, order.getDate());
	}
	
	@Test
	public void testGetAmount() {
		assertEquals(100, order.getAmount());
	}

}
