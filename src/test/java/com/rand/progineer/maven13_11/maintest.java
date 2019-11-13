package com.rand.progineer.maven13_11;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.*;




class maintest {
	@Test
	void testAddition() {
		    Manipulation n = new Manipulation () ; 
			 int result = n.add(1, 1);
			 assertEquals(2,result);
	}
	
	@Test
	void testSub() {
		    Manipulation n = new Manipulation () ; 
			 int result = n.sub(1, 1);
			 assertEquals(0,result);
	}
	
	@Test
	void testMul() {
		    Manipulation n = new Manipulation () ; 
			 int result = n.mul(2, 2);
			 assertEquals(4,result);
	}
	
	
	

}
