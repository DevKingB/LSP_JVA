package org.howard.edu.lsp.assignment5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Creating IntegerSet class

/**
 * This script is for generating IntegerSet class and methods
 * @author brtah
 * version 02/26/2023
 */
public class IntegerSet {
	//create Integer Array List class variable
	private List<Integer> mySet = new ArrayList<Integer>();
	
	/**
	 * Integer constructor on initialization
	 */
	public IntegerSet() {};
	
	/**
	 * Clear the internal representation of the set
	 */
	public void clear() {
		mySet.clear();
	};
	
	/**
	 * length of the set
	 * @return the size of the set
	 */
	public int length() {
		return mySet.size();
	};
	
	/**
	 * check if given IntegerSet has same elements
	 * @param otherSet type IntegerSet used for comparison
	 * @return boolean value 
	 */
	public boolean equals(IntegerSet otherSet) {
		if (this.length() != otherSet.length()) {
			return false;
		}
		else {
			return mySet.containsAll(otherSet.mySet);
		}
	};
	
	/**
	 * checks if IntegerSet contains given value
	 * @param value takes in a value of type integer
	 * @return a boolean value
	 */
	public boolean contains(int value) {
		for (int i = 0; i < mySet.size(); i++) {
			if(mySet.get(i) == value) {
				return true;
			}
		}
		return false;
	};
	
	/**
	 * determines the largest value in the set
	 * @return integer type for the largest value in the set
	 * @throws IntegerSetException if the set is empty
	 */
	public int largest() throws IntegerSetException {
		if (mySet.size() == 0) {
			throw new IntegerSetException("IntegerSet is empty!");
		}
		int largestValue = 0;
		for (int i = 0; i < mySet.size(); i++) {
			if (mySet.get(i) >= largestValue) {
				largestValue = mySet.get(i);
			}
		}
		return largestValue;
	};
	
	/**
	 * this method finds smallest value
	 * @return integer type for the smallest value in the set
	 * @throws IntegerSetException if the set is empty
	 */
	public int smallest() throws IntegerSetException {
		if (mySet.size() == 0) {
			throw new IntegerSetException("IntegerSet is Empty");
		}
		int smallestValue = mySet.get(0);
		for (int i = 1; i < mySet.size(); i++) {
			if (mySet.get(i) <= smallestValue) {
				smallestValue = mySet.get(i);
			}
		}
		return smallestValue;
	};
	
	
	/**
	 * This method determines if the set is empty
	 * @return boolean value
	 */
	public boolean isEmpty() {
		if (this.length() == 0) {
			return true;
		}
		return false;
	};
	
	/**
	 * this method adds item to the set
	 * @param item of type integer
	 */
	public void add(int item) {
		if (!this.contains((item))) {
			mySet.add(item);
		}
	};
	
	/**
	 * removes the item from the set if exist
	 * @param item of type integer
	 * @throws IntegerSetException if the value does not exist in the set
	 */
	public void remove(int item) throws IntegerSetException{
		if (this.contains(item)) {
			mySet.removeAll(Arrays.asList(item));
		} 
		else {
			throw new IntegerSetException("The value you are trying to remove does not exist in Integers Set");
		}
	};
	/**
	 * gathers all elements in the IntergerSet and returns the set
	 * @return the IntegerSet type
	 */
	private List<Integer> getAllElements(){
		return mySet;
	}
	
	/**
	 * this method combines all the elements together
	 * @param intSetb of type IntegerSet used for combining
	 */
	public void union(IntegerSet intSetb) {
		List<Integer> setB = intSetb.getAllElements();
		for (int i = 0; i < intSetb.length(); i++) {
			if (!this.contains(setB.get(i))) {
				this.add(setB.get(i));
			}
		}
	};
	
	/**
	 * this method find the common values between both sets
	 * @param b of type IntegerSet for intersection
	 */
	public void intersect(IntegerSet b) {
		mySet.retainAll(b.mySet);
	};
	
	/**
	 * set difference method
	 * @param b of type IntegerSet for differentiation
	 */
	public void diff(IntegerSet b) {
		for (int i = 0; i < b.length(); i++) {
			if (mySet.contains(b.mySet.get(i)) == true) {
				mySet.remove(b.mySet.get(i));
			}
		}
	};
	
	/**
	 * converts the set values to a string
	 */
	public String toString() {
		String setToString ="";
		for (int i = 0; i < mySet.size(); i++) {
			setToString += mySet.get(i).toString() + ", ";
		}
		return setToString;
	};
};


