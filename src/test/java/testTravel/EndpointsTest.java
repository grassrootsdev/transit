package testTravel;

import org.junit.Test;

import testTravel.Endpoints.TestMyTravel;

public class EndpointsTest {

	@Test
	public void testGet(){
		Endpoints endpoints = new Endpoints();
		TestMyTravel tv = endpoints.getProductInJSON();
		System.out.println(tv.testString);
	}
}
