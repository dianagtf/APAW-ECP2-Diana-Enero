package apaw.api.dtos;

import static org.junit.Assert.assertEquals;

import java.util.Calendar;

import org.junit.Before;
import org.junit.Test;

import apaw.api.dtos.OrderDto;

public class OrderDtoTest {
	
	OrderDto order;
	Calendar calendar;
	
	@Before
	public void professionalSet() {
		order = new OrderDto();

		calendar = Calendar.getInstance();
		
		order.setId(1);
		order.setDate(calendar);
		order.setAmount(100);
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
