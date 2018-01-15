package apaw;
import org.junit.Before;
import org.junit.Test;

import apaw.api.daos.DaoFactory;
import apaw.api.daos.memory.DaoMemoryFactory;
import apaw.api.resources.ProfessionalResource;
import apaw.http.HttpClientService;
import apaw.http.HttpException;
import apaw.http.HttpMethod;
import apaw.http.HttpRequest;
import apaw.http.HttpRequestBuilder;

public class ProfessionalResourceFunctionalTesting {
	
	@Before
	public void before() {
		DaoFactory.setFactory(new DaoMemoryFactory());
	}
	
	private void createProfessional() {
		HttpRequest request = new HttpRequestBuilder().method(HttpMethod.POST).path(ProfessionalResource.PROFESSIONALS).body("1").build();
		System.out.println("Request de createProfessional: " + request);
		new HttpClientService().httpRequest(request);
	}
	
	private void createProfessionalOrder() {
		HttpRequest request = new HttpRequestBuilder().method(HttpMethod.POST).path(ProfessionalResource.PROFESSIONALS).path(ProfessionalResource.PHONE).expandPath("55555").body("1").build();
		new HttpClientService().httpRequest(request);
		System.out.println("Request de createProfessionalOrder: " + request);
		
		HttpRequest request1 = new HttpRequestBuilder().method(HttpMethod.PATCH).path(ProfessionalResource.PROFESSIONALS).path(ProfessionalResource.PHONE).expandPath("55555").body("1").build();
		
		System.out.println("Request de createProfessionalOrder1: " + request1);
		
		new HttpClientService().httpRequest(request1);
	}
	
	@Test
	public void testCreateProfessional() {
		this.createProfessional();
	}
	
	@Test
	public void testCreateProfessionalOrder() {
		this.createProfessionalOrder();
	}
	
	@Test(expected = HttpException.class)
	public void testCreateProfessionalPhoneEmpty() {
	    HttpRequest request = new HttpRequestBuilder().method(HttpMethod.POST).path(ProfessionalResource.PROFESSIONALS).body("").build();
	    new HttpClientService().httpRequest(request);
	}

	@Test(expected = HttpException.class)
	public void testCreateWithoutProfessionalPhone() {
	    HttpRequest request = new HttpRequestBuilder().method(HttpMethod.POST).path(ProfessionalResource.PROFESSIONALS).build();
	    new HttpClientService().httpRequest(request);
	}
	
	@Test
	public void testReadProfessional() {
		this.createProfessional(); //id = 0
		
		HttpRequest request = new HttpRequestBuilder().method(HttpMethod.GET).path(ProfessionalResource.PROFESSIONALS).path(ProfessionalResource.PHONE).expandPath("0").build();
		new HttpClientService().httpRequest(request);
		System.out.println("***Request: " + request);
		
        //assertEquals("{\"id\":1,\"name\":\"uno\"}", new HttpClientService().httpRequest(request).getBody());
	}
	
	@Test
	public void testReadProfessionalOrder() {
		this.createProfessionalOrder(); //id = 1
		
		HttpRequest request1 = new HttpRequestBuilder().method(HttpMethod.GET).path(ProfessionalResource.PROFESSIONALS).path(ProfessionalResource.PHONE).expandPath("55555").build();
		System.out.println("***Request1: " + request1);
		new HttpClientService().httpRequest(request1).getBody();
		
		
	}

}
