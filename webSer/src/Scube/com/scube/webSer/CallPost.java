package Scube.com.scube.webSer;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.glassfish.jersey.client.ClientConfig;

public class CallPost {
	
	
	
	public static void main(String[] args) {
		
		Client client = ClientBuilder.newClient( new ClientConfig().register( CallPost.class ) );
		WebTarget webTarget = client.target("http://localhost:8080/webSer1/webapi/data/").path("Student");
		 
		Student emp = new Student();
		emp.setId(1);
		emp.setFname("David Feezor");
		emp.setLname("David Feezor");
		 
		Invocation.Builder invocationBuilder =  webTarget.request(MediaType.APPLICATION_XML);
		Response response = invocationBuilder.post(Entity.entity(emp, MediaType.APPLICATION_XML));
		 
		System.out.println(response);
		System.out.println(response.getStatus());
		System.out.println(response.readEntity(String.class));
	}

}
