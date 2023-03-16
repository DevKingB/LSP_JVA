/**
 * 
 */
package org.howard.edu.lsp.assignment5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
//import java.util.*;

/**
 * @author brtah
 *
 */
class IntegerSetTest {
	private IntegerSet mySet;
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	public void setUp() throws Exception {
		mySet = new IntegerSet();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	public void tearDown() throws Exception {
		mySet = null;
	}

	@Test
	@DisplayName("Test case for add method")
	public void testAdd() {
		mySet.add(5);
		assertEquals(1, mySet.length());
		assertTrue(mySet.contains(5));
	}
	
	@Test
	@DisplayName("Test case for remove method")
	public void testRemove() throws IntegerSetException{
		for(int i = 0; i < 7; i++) {
			mySet.add(i);
		}
		mySet.remove(5);
		assertFalse(mySet.contains(5));
	}
	
	@Test
	@DisplayName("Test case for length method")
	public void testLength() {
		for (int i = 0; i < 5; i++) {
			mySet.add(i);
		}
		assertTrue(mySet.length() == 5);
	}
	
	@Test
	@DisplayName("Test case for clear method")
	public void testClear() {
		mySet.add(14); mySet.clear();
		assertEquals(mySet.length(), 0);
	}
	
	@Test
	@DisplayName("Test case for equals method")
	public void testEquals() {
		IntegerSet otherSet = new IntegerSet();
		IntegerSet testSet1 = new IntegerSet();
		IntegerSet testSet2 = new IntegerSet();
		
		for(int i = 0; i < 5; i++) {
			mySet.add(i); otherSet.add(i); testSet1.add(i);
		}
		
		//Testing two objects are equal
		assertEquals(true, mySet.equals(otherSet));
		
		//Testing two objects are not equal
		assertEquals(false, testSet1.equals(testSet2));
		
	}
	
	@Test
	@DisplayName("Test case for contains method")
	public void contains() {
		mySet.add(314);
		
		assertTrue(mySet.contains(314));
		assertFalse(mySet.contains(3000));
	} 
	
	
	@Test
	@DisplayName("Test case for largest method")
	public void testLargest() throws IntegerSetException {
		mySet.add(10);
		mySet.add(20);
		mySet.add(30);
		mySet.add(40);
		mySet.add(50);
		assertTrue(mySet.largest() == 50);
	}
	
	@Test
	@DisplayName("Test case for largest exception thrown")
	public void testLargestException() {
		assertThrows(IntegerSetException.class, () -> mySet.largest());
	}
	
	@Test
	@DisplayName("Test case for smallest method")
	public void testSmallest() throws IntegerSetException {
		mySet.add(20);
		mySet.add(40);
		mySet.add(60);
		mySet.add(80);
		assertTrue(mySet.smallest() == 20);
	}
	
	@Test
	@DisplayName("Test case for smallest exception")
	public void testSmallestException() {
		assertThrows(IntegerSetException.class, () -> mySet.smallest());
	}
	
	@Test
	@DisplayName("Test case for union method")
	public void testUnion() {
		IntegerSet otherSet = new IntegerSet();
		IntegerSet nextSet = new IntegerSet();
		IntegerSet constSet = new IntegerSet();
		
		otherSet.add(1);
		otherSet.add(3);
		otherSet.add(4);
		nextSet.add(3);
		nextSet.add(4);
		
		//adding same values to constSet
		constSet.add(1);
		constSet.add(3);
		constSet.add(4);
		
		//testing union method is same as constSet string
		otherSet.union(nextSet);
		assertEquals(otherSet.toString(), constSet.toString());
		
	}
	
	@Test
	@DisplayName("Test case for intersect method")
	public void testInteserct() {
		IntegerSet otherSet = new IntegerSet();
		IntegerSet constSet = new IntegerSet();
		
		//Adding to mySet
		mySet.add(0);
		mySet.add(1);
		mySet.add(3);
		otherSet.add(3);
		otherSet.add(4);
		otherSet.add(5);
		
		//creating a constant set
		constSet.add(3);
		
		//testing intersection
		mySet.intersect(otherSet);
		assertEquals(mySet.toString(), constSet.toString());
		
	}
	
	@Test
	@DisplayName("Test case for diff method")
	public void testDiff() {
		IntegerSet otherSet = new IntegerSet();
		//IntegerSet nextSet = new IntegerSet();
		IntegerSet constSet = new IntegerSet();
		
		//adding integers to the set
		mySet.add(0); mySet.add(1); mySet.add(2);
		otherSet.add(0); otherSet.add(1);
		
		//adding to the constSet
		constSet.add(2);
		
		//testing diff method that exist
		mySet.diff(otherSet);
		assertEquals(mySet.toString(), constSet.toString());
		
		
	}
	
	@Test
	@DisplayName("Test case for isEmpty method")
	public void testEmpty() {
		assertTrue(mySet.isEmpty());
	}
	
	@Test
	@DisplayName("Test case for toString")
	public void testString() {
		mySet.add(1);
		mySet.add(2);
		mySet.add(3);
		mySet.add(4);
		mySet.add(5);
		
		assertEquals(mySet.toString(), "1, 2, 3, 4, 5, ");
	}
	
}
