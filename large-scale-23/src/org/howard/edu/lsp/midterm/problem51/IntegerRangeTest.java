package org.howard.edu.lsp.midterm.problem51;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

class IntegerRangeTest {
	private IntegerRange myRange;
	@BeforeEach
	void setUp() throws Exception {
		myRange = new IntegerRange(50, 300);
	}

	@AfterEach
	void tearDown() throws Exception {
		myRange = null;
	}

	@Test
	@DisplayName("Test contains method")
	void testContains() {
		assertTrue(myRange.contains(250)); //should return true
		assertFalse(myRange.contains(314)); // should return false
		assertFalse(myRange.contains(304)); //should return False
		assertTrue(myRange.contains(51)); // should return true
	}
	
	@Test
	@DisplayName("Test for overlaps")
	void testOverlaps() throws EmptyRangeException {
		IntegerRange your_range;
		
		your_range = new IntegerRange(50, 75);
		assertTrue(myRange.overlaps(your_range));
		assertTrue(your_range.overlaps(myRange));
		
		your_range = new IntegerRange(89, 143);
		assertTrue(myRange.overlaps(your_range));
		assertTrue(your_range.overlaps(myRange));
		
		your_range = new IntegerRange(-10, 5);
		assertFalse(myRange.overlaps(your_range));
		assertFalse(your_range.overlaps(myRange));
		
		your_range = new IntegerRange(101, 456);
		assertTrue(myRange.overlaps(your_range));
		assertTrue(your_range.overlaps(myRange));
	}
	
	@Test
	@DisplayName("Test for EmptyRangeException")
	void testOverlapsException() {
		IntegerRange your_range = null;
		
		assertThrows(EmptyRangeException.class, () -> myRange.overlaps(your_range));
	}
	
	@Test
	@DisplayName("Test size methods")
	void testSize() {
		//creating Range objects
		IntegerRange nextRange = new IntegerRange(0, 100);
		IntegerRange thirdRange = new IntegerRange(45, 90);
		
		assertEquals(myRange.size(), 250);
		assertEquals(nextRange.size(), 100);
		assertEquals(thirdRange.size(), 45);
	}

}
