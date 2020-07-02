package com.clough.rockPaperScissorsProject;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class RockPaperScissorsTest {
	
	private static RockPaperScissors rps;
	boolean res;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		rps = new RockPaperScissors();
	}

	@Test
	@Order(1)
	void rockPaperScissors_GivenNoParameters_ShouldContructObject() {
		assertTrue(rps instanceof RockPaperScissors);
	}
	
	@Test
	@Order(2)
	void rockPaperScissors_GivenNoParameters_ShouldConstructMethod() {
		assertEquals(true, rps.getResponse());
		
	}
	
	
	@Test
	@Order(3)
	void rockPaperScissors_GivenNoParameters_ShouldGetUserInput() {
		assertEquals(0, rps.getResponse());
		System.out.println(rps.getResponse());
	}
	
	@Test
	@Order(4)
	void rockPaperScissors_GivenNoParameters_ShouldGetRandomResponse() {
		assertEquals(1, rps.getAnswer());
		
	}
	
	
	@Test
	@Order(5)
	void rockPaperScissors_GivenNoParameters_ShouldGetWinnerFromResponses() {
		assertTrue(rps.getResult(0, 1) instanceof String);
		//System.out.println(rps.getResult());
	}

}
