package com.versh.test;

import java.util.Random;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import com.versh.app.Application;
import com.versh.app.model.Customer;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {Application.class},webEnvironment = WebEnvironment.DEFINED_PORT)
public class ApiTest {

	@Autowired
	private TestRestTemplate restTemplate;

	@Test
	public void exampleTest() throws InterruptedException {
		Random r = new Random();
		/*
		 * for (int i=0; i<1000; i++) { Customer c =
		 * this.restTemplate.getForObject("/cus88tomers/{id}", Customer.class,
		 * r.nextInt(3)+1); System.out.println("Customer: " + c); Thread.sleep(500); }
		 */
		
		ResponseEntity<Customer> rc = restTemplate.getForEntity("/customers/1", Customer.class);
		System.out.println(rc.getBody().getName());
	}
	
}