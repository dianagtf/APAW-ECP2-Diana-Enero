package apaw;

import org.junit.Before;
import org.junit.Test;

import apaw.api.daos.DaoFactory;
import apaw.api.daos.memory.DaoMemoryFactory;
import apaw.api.resources.LevelResource;
import apaw.api.resources.ProfessionalResource;
import apaw.http.HttpClientService;
import apaw.http.HttpException;
import apaw.http.HttpMethod;
import apaw.http.HttpRequest;
import apaw.http.HttpRequestBuilder;

public class LevelResourceFunctionalTesting {
	
	@Before
	public void before() {
		DaoFactory.setFactory(new DaoMemoryFactory());
	}
	
	private void createLevel(String idLevel) {
		HttpRequest request = new HttpRequestBuilder().method(HttpMethod.POST).path(LevelResource.LEVELS).body(idLevel).build();
		new HttpClientService().httpRequest(request);
	}
	
	@Test
	public void testCreateLevel() {
		this.createLevel("BEGINNER");
	}
	
}
