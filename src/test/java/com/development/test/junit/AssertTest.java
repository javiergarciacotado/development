package com.development.test.junit;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class AssertTest {

	@Rule
	public ExpectedException exception = ExpectedException.none();
	
	@Test
	public void assertBooleanConditions() throws Exception {
		assertTrue(true);
		assertFalse(false);		
	}
	
	@Test
	public void assertNullAndNotNullObjectValues() throws Exception {
		Object object = null;
		assertNull(object);
		object = new String("String value");
		assertNotNull(object);
	}
	
	@Test
	public void assertIntegerEquals() throws Exception {
		Integer anInteger = 10;
		Integer anotherInteger = 10;
		assertEquals(anInteger, anotherInteger);
	}
	
	@Test
	public void assertDoubleEquals() throws Exception {
		double result = .99 + .98;
		//delta (third parameter): To compare floating-point numbers --> use BigDecimal instead of double
		assertEquals(1.97, result, 0.01); 
	}
	
	@Test
	public void assertObjectSameReference() throws Exception {
		Integer anInt = 10;
		Integer anotherInt = anInt;
		assertSame(anInt, anotherInt);
	}
	
	@Test
	public void matcherBehaviour() throws Exception {
		int myAge = 31;
		assertThat(myAge, equalTo(31));
		assertThat(myAge, is(31));
		assertThat(myAge, not(equalTo(33)));
		assertThat(myAge, is(not(33)));
	}
	
	@Test
	public void multipleValues() throws Exception {
		
		double myMarks = 90.00;
		assertThat(myMarks, either(is(100.0)).or(is(90.0)));
		assertThat(myMarks, both(not(99.99)).and(not(60.00)));
		
	}
	
	@Test
	public void verifyCollectionValues() throws Exception {
		List<Double> salary = Arrays.asList(50.0, 200.0, 500.0);
		assertThat(salary, hasItem(50.0));
		assertThat(salary, not(hasItem(1.00)));
	}
	
	@Test
	public void verifyStrings() throws Exception {
		String fullName = "Javier Garcia Cotado";
		assertThat(fullName, startsWith("Javi"));
		assertThat(fullName, containsString("Garcia"));
		assertThat(fullName, not(endsWith("Rus")));
		assertThat(fullName, new LessThanOrEqual<String>("Rus"));
	}
	
	@Test
	public void testExpectedExceptionOneWay() {
		exception.expect(IllegalArgumentException.class);
		exception.expectMessage("Test");
		methodThrowsIllegalArgumentException();
	}
	
	@Test(expected=IOException.class)
	public void testExpectedExceptionSecondWay() throws IOException {
		methodThrowsIOException();
	}
	
	@Test
	public void testExpectedExceptionThirdWay() {
		try {
			methodThrowsIllegalArgumentException();
			fail("There should have thrown an Exception");
		}
		catch(IllegalArgumentException iax) {
			iax.printStackTrace();
		}
	}

	private void methodThrowsIllegalArgumentException() {
		throw new IllegalArgumentException("Test");
	}
	
	private void methodThrowsIOException() throws IOException {
		throw new IOException();
	}
	
}
