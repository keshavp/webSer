package Scube.com.scube.webSer;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import javax.json.JsonArray;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("data")
public class StudentReso {

	StucentRepo stucentRepo = new StucentRepo();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)

	public List<Student> getStudents(){
		
		System.out.println(" get all data list ");
		
		return stucentRepo.getStudents();
	}
	
	/*@GET
	@Path("Student/{id}")
	@Produces(MediaType.APPLICATION_XML)
	public Student getStudent(@PathParam("id") int id){
		
		System.out.println(" get all data list "+id);
		
		return stucentRepo.getStudent(id);
	}*/
	
	
	@GET
	@Path("Student/{id}")
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public Student getStudent(@PathParam("id") int id){
		
		System.out.println(" get all data list "+id);
		
		return stucentRepo.getStudent(id);
	}
	
	@POST
	@Path("Student")
	@Consumes(MediaType.APPLICATION_XML)
	@Produces(MediaType.APPLICATION_XML)
	//@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public Response createStudent(Student e) throws URISyntaxException{
		
		 if(e == null){
		        return Response.status(400).entity("Please add employee details !!").build();
		    }
		     
		    if(e.getFname() == null) {
		        return Response.status(400).entity("Please provide the employee name !!").build();
		    }
		    
		    
		    
		    
		    System.out.println("----------------------------------------");
		    System.out.println("----------------------------------------"+e);
		    
		    return Response.created(new URI("/rest/employees/"+e.getId())).build();
	}
}
