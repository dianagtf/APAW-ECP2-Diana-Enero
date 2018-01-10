package apaw;
import org.junit.Test;

import apaw.api.resources.ProfessionalResource;
import apaw.http.HttpClientService;
import apaw.http.HttpException;
import apaw.http.HttpMethod;
import apaw.http.HttpRequest;
import apaw.http.HttpRequestBuilder;

public class ProfessionalResourceFunctionalTesting {
	
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
	public void testCreateWithoutProfessionalCity() {
	    HttpRequest request = new HttpRequestBuilder().method(HttpMethod.POST).path(ProfessionalResource.PROFESSIONALS).build();
	    new HttpClientService().httpRequest(request);
	}

}
