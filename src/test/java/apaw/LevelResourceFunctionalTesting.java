package apaw;

import static org.junit.Assert.assertEquals;

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
	
	private void createLevel() {
		HttpRequest request = new HttpRequestBuilder().method(HttpMethod.POST).path(LevelResource.LEVELS).body("EXPERT").build();
		new HttpClientService().httpRequest(request);
		System.out.println("**testCreateLevel:" + request);
	}
	
	@Test
	public void testCreateLevel() {
		this.createLevel();
	}
	
	@Test(expected = HttpException.class)
	public void testCreateLevelIdEmpty() {
	    HttpRequest request = new HttpRequestBuilder().method(HttpMethod.POST).path(LevelResource.LEVELS).body("").build();
	    new HttpClientService().httpRequest(request);
	}

	@Test(expected = HttpException.class)
	public void testCreateWithoutLevelId() {
	    HttpRequest request = new HttpRequestBuilder().method(HttpMethod.POST).path(LevelResource.LEVELS).build();
	    new HttpClientService().httpRequest(request);
	}
	
	@Test
	public void testReadLevel() {
		this.createLevel();
		
		HttpRequest request = new HttpRequestBuilder().method(HttpMethod.GET).path(LevelResource.LEVELS).path(LevelResource.ID).expandPath("0").build();
		
		System.out.println("***** testReadLevel: " + request);
		System.out.println("**test respuesta: " + new HttpClientService().httpRequest(request).getBody());
		
		assertEquals("{\"id\":0,\"levelName\":\"EXPERT\"}", new HttpClientService().httpRequest(request).getBody());
		/*
		HttpRequest request = new HttpRequestBuilder().method(HttpMethod.GET).path(LevelResource.LEVELS).path(LevelResource.ID).expandPath("0").build();
		new HttpClientService().httpRequest(request);
		System.out.println("** testReadLevel: " + request);*/
	}
	
}
