package testTravel;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/json/product")
public class Endpoints {

	@GET
	@Path("/testMyEndpoint")
	@Produces("application/json")
	public TestMyTravel getProductInJSON() {
		return new TestMyTravel();
	}
	
	public class TestMyTravel{
		public String testString = "this is a test";
	}
	
}
