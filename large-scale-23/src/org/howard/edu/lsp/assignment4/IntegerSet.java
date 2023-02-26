package org.howard.edu.lsp.assignment4;

/**
 * 
 * @author Brandon Clarke
 * 
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Creating IntegerSet class
public class IntegerSet {
	//create Integer Array List class variable
	private List<Integer> mySet = new ArrayList<Integer>();
	
	//Default Constructor
	public IntegerSet() {};
	
	//Clear the internal representation of the set
	public void clear() {
		mySet.clear();
	};
	
	//returns the length of the set
	public int length() {
		return mySet.size();
	};
	
	//check if given IntegerSet has same elements
	public boolean equals(IntegerSet otherSet) {
		if (this.length() != otherSet.length()) {
			return false;
		}
		else {
			return mySet.containsAll(otherSet.mySet);
		}
	};
	
	//checks if IntegerSet contains given value
	public boolean contains(int value) {
		for (int i = 0; i < mySet.size(); i++) {
			if(mySet.get(i) == value) {
				return true;
			}
		}
		return false;
	};
	
	//returns the largest item in the set. Throws exception if it is empty
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
	
	//returns the smallest item in the set. Throws exception if it is empty
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
	
	
	//returns true if it is an empty set, else False
	public boolean isEmpty() {
		if (this.length() == 0) {
			return true;
		}
		return false;
	};
	
	//adds an item to the set or does nothing if already exist
	public void add(int item) {
		if (!this.contains((item))) {
			mySet.add(item);
		}
	};
	
	//removes the item from the set if exist else foes nothing
	public void remove(int item) throws IntegerSetException{
		if (this.contains(item)) {
			mySet.removeAll(Arrays.asList(item));
		} 
		else {
			throw new IntegerSetException("The value you are trying to remove does not exist in Integers Set");
		}
	};
	
	private List<Integer> getAllElements(){
		return mySet;
	}
	
	//Set Union method
	public void union(IntegerSet intSetb) {
		List<Integer> setB = intSetb.getAllElements();
		for (int i = 0; i < intSetb.length(); i++) {
			if (!this.contains(setB.get(i))) {
				this.add(setB.get(i));
			}
		}
	};
	
	//Set intersection method
	public void intersect(IntegerSet b) {
		mySet.retainAll(b.mySet);
	};
	
	//set difference method
	public void diff(IntegerSet b) {
		for (int i = 0; i < b.length(); i++) {
			if (mySet.contains(b.mySet.get(i)) == true) {
				mySet.remove(b.mySet.get(i));
			}
		}
	};
	
	//converts the set values to a string
	public String toString() {
		String setToString ="";
		for (int i = 0; i < mySet.size(); i++) {
			setToString += mySet.get(i).toString() + ", ";
		}
		return setToString;
	};
};


