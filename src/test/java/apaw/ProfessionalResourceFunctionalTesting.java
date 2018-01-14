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
		new HttpClientService().httpRequest(request);
	}
	
	@Test
	public void testCreateProfessional() {
		this.createProfessional();
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
		this.createProfessional(); //id = 1
		
		HttpRequest request = new HttpRequestBuilder().method(HttpMethod.GET).path(ProfessionalResource.PROFESSIONALS).path(ProfessionalResource.PHONE).expandPath("0").build();
		new HttpClientService().httpRequest(request);
		
		HttpRequest request1 = new HttpRequestBuilder().method(HttpMethod.GET).path(ProfessionalResource.PROFESSIONALS).path(ProfessionalResource.PHONE).expandPath("1").build();
		new HttpClientService().httpRequest(request1);
	}

}
