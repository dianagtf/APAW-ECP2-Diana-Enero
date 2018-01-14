package apaw.api;


import apaw.api.resources.OrderResource;
import apaw.api.resources.ProfessionalResource;
import apaw.api.resources.exceptions.RequestInvalidException;
import apaw.http.HttpRequest;
import apaw.http.HttpResponse;
import apaw.http.HttpStatus;

public class Dispatcher {
	
	private ProfessionalResource professionalResource = new ProfessionalResource();
	private OrderResource orderResource = new OrderResource();

    private void responseError(HttpResponse response, Exception e) {
        response.setBody("{\"error\":\"" + e + "\"}");
        response.setStatus(HttpStatus.BAD_REQUEST);
    }

    public void doGet(HttpRequest request, HttpResponse response) {
    	try {
    		
    		if(request.isEqualsPath(ProfessionalResource.PROFESSIONALS + ProfessionalResource.PHONE)) {
    			
    			response.setBody(professionalResource.readProfessional(Integer.valueOf(request.paths()[1])).toString());
    		
    		}else if(request.isEqualsPath(OrderResource.ORDERS + OrderResource.ID)) {
    			
    			
    			
    		}else {
    			throw new RequestInvalidException(request.getPath());
    		}
    		
    	}catch (Exception e) {
    		responseError(response, e);
    	}
        
    }

    public void doPost(HttpRequest request, HttpResponse response) {
        try {
        	if(request.isEqualsPath(ProfessionalResource.PROFESSIONALS)) {
        		System.out.println("**Professional request: " + request.getBody());
        		professionalResource.createProfessional(request.getBody());
        		response.setStatus(HttpStatus.CREATED);
        	}else if(request.isEqualsPath(OrderResource.ORDERS)) {
        		System.out.println("**Order request: " + request.getBody());
        		orderResource.createOrder(request.getBody());
        		response.setStatus(HttpStatus.CREATED);
        	}else {
        		throw new RequestInvalidException(request.getPath());
        	}
        }catch (Exception e) {
        	responseError(response, e);
        }
    }

    public void doPut(HttpRequest request, HttpResponse response) {
        
    }

    public void doPatch(HttpRequest request, HttpResponse response) {
       
    }

    public void doDelete(HttpRequest request, HttpResponse response) {
        
    }

}
