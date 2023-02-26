package org.howard.edu.lsp.assignment4;

//need to import IntegerSetEception class



//creating a testing class for Driver

//create public class called Driver
public class Driver{
	public static void main(String[] args) throws IntegerSetException {
		
		
		//creating firstSet and testing add, toString, length, and remove functions
		IntegerSet firstSet = new IntegerSet();
		firstSet.add(1);
		firstSet.add(2);
		firstSet.add(2);
		firstSet.add(3);
		firstSet.add(50);
		firstSet.add(-20);
		firstSet.add(42);
		System.out.println("Value of firstSet is: " + firstSet.toString());
		System.out.println("Length of the set is: " + firstSet.length());
		firstSet.remove(2); //removing the integer two from the integerset. This will not throw an error
		System.out.println("Value of firstSet is: " + firstSet.toString());
		System.out.println("Length of the set is: " + firstSet.length());
		
		//creating a second set
		IntegerSet secondSet = new IntegerSet();
		secondSet.add(1);
		secondSet.add(2);
		secondSet.add(50);
		secondSet.add(-20);
		secondSet.add(42);
		System.out.println("Value of firstSet is: " + firstSet.toString());
		System.out.println("Value of secondSet is: " + secondSet.toString());
		System.out.println("firstSet and secondSet are equal: " + firstSet.equals(secondSet));
		
		//testing largest and smallest methods after removing value/s
		try {
			System.out.println("The largest value in firstSet is: " + firstSet.largest());
		} catch (IntegerSetException e) {
			// TODO Auto-generated catch block
			System.out.println("Error: " + e.getMessage());
		}
		try {
			System.out.println("The largest value in firstSet is: " + firstSet.largest());
		} catch (IntegerSetException e) {
			// TODO Auto-generated catch block
			System.out.println("Error: " + e.getMessage());
		}
		try {
			System.out.println("The smallest value in firstSet is: " + firstSet.smallest());
		} catch (IntegerSetException e) {
			// TODO Auto-generated catch block
			System.out.println("Error: " + e.getMessage());
		}
		try {
			System.out.println("The smallest value in secondSet is: " + secondSet.smallest());
		} catch (IntegerSetException e) {
			// TODO Auto-generated catch block
			System.out.println("Error: " + e.getMessage());
		}
		
		//UNCOMMENT THE LINE BELOW TO THROW AN ERROR WHEN REMOVING A VALUE THAT DOES NOT EXIST
		//firstSet.remove(2); //<----------THIS WILL THROW AN ERROR ON PURPOSE
		
		//testing the union, intersection, and difference methods between sets
		System.out.println("firstSet before union: " + firstSet.toString());
		System.out.println("secondSet before union: " + secondSet.toString());
		firstSet.union(secondSet);
		System.out.println("firstSet after union: " + firstSet.toString());
		
		//adding values to second set for testing
		secondSet.add(67);
		secondSet.add(86);
		secondSet.add(33);
		secondSet.add(33);
		
		System.out.println("secondSet before intersection: " + secondSet.toString());
		secondSet.intersect(firstSet);
		System.out.println("secondSet after intersection: " + secondSet.toString());
		firstSet.add(8); //added value of 8 to the first for testing
		System.out.println("firstSet before difference: " + firstSet.toString());
		firstSet.diff(secondSet);
		System.out.println("firstSet after difference: " + firstSet.toString());
		
		//testing isEmpty() method for Integer sets
		System.out.println("firstSet is Empty: " + firstSet.isEmpty());
		firstSet.clear();
		System.out.println("secondSet is Empty: " + secondSet.isEmpty());
		
	}
}