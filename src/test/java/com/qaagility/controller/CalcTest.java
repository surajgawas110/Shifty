package test.java.com.qaagility.controller;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.java.com.qaagility.javaee.Calcmul;
import main.java.com.qaagility.javaee.Calculator;



 
public class CalcTest {

/*
      public void testSlow() {
        System.out.println("slow");
      }

      public void testSlower() {
        System.out.println("slower");
      }

      public void testFast() {
        System.out.println("fast-updated");
      }

	@Test	
      public void testCalc() {
        assertEquals("Result", 9, 9);
      }

	@Test	
      public void testCalc1() {
        assertEquals("Result - Fail", 9, 9);
      }
      
*/


	@Test
	public void testCal(){

		Calcmul mul = new Calcmul();
		Calculator add = new Calculator();

		assertEquals(add.add(),9);
		assertEquals(add.add(5,5),10);
		assertEquals(add.add(5,15),20);
		assertEquals(mul.mul(),18);
	}
	
	
    }
