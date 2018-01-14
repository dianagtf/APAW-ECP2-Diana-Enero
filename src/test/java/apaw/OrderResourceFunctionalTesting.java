package apaw;

import org.junit.Before;
import org.junit.Test;

import apaw.api.daos.DaoFactory;
import apaw.api.daos.memory.DaoMemoryFactory;
import apaw.api.resources.OrderResource;
import apaw.http.HttpClientService;
import apaw.http.HttpMethod;
import apaw.http.HttpRequest;
import apaw.http.HttpRequestBuilder;

public class OrderResourceFunctionalTesting {
	
	@Before
	public void before() {
		DaoFactory.setFactory(new DaoMemoryFactory());
	}
	
	private void createOrder() {
		HttpRequest request = new HttpRequestBuilder().method(HttpMethod.POST).path(OrderResource.ORDERS).body("1").build();
		new HttpClientService().httpRequest(request);
	}
	
	@Test
	public void testCreateOrder() {
		this.createOrder();
	}
	
	@Test
	public void testReadOrder() {
		this.createOrder();
		HttpRequest request = new HttpRequestBuilder().method(HttpMethod.GET).path(OrderResource.ORDERS).path(OrderResource.ID).expandPath("0").build();
		new HttpClientService().httpRequest(request);
		
	}

}
