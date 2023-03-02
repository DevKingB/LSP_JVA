package org.howard.edu.lsp.assignment4;

//need to import IntegerSetEception class
import java.util.Random;


//creating a testing class for Driver

//create public class called Driver
/**
 * This script is for testing IntegerSet class
 * @author brtah
 * version 02/26/2023
 *
 */
public class Driver {
	/**
 	 * This is a default constructor kind of
 	 *  	 
 	 *  */
     Driver(){
		
     }
     /**
     * Main function runs test cases for IntegerSet
     * @param args passes in a list of type strings
     * @throws IntegerSetException when test cases encounter an error in the code
     */
	
	public static void main(String[] args) throws IntegerSetException{
		Random random = new Random();
		//Creating an empty set
		System.out.println("Creating a new set...");
		IntegerSet firstSet = new IntegerSet();
		IntegerSet secondSet = new IntegerSet();

		//adding separator to break up the code
		
		//checking if the sets are initially empty
		if (firstSet.isEmpty()) {
			System.out.println("The first set is empty: " + firstSet.toString());
		}
		else{
			System.out.println("The first set is not empty: " + firstSet.toString());
		}
		
		if (secondSet.isEmpty()) {
			System.out.println("The second set is empty: " + secondSet.toString());
		}
		else{
			System.out.println("The first set is not empty: " + secondSet.toString());
		}
		
		System.out.println(""); //printing an empty string for a new line
		System.out.println("******************** TESTING ADD METHOD ******************");
		
		//adding values to the each set. Testing add methods
		System.out.println("Beginning to add random values to each set...");
		for (int i = 0; i <= 9; i++){
			int myValue = random.nextInt(20);
			System.out.println("This is the value being added to the set: " + myValue + "\n");
			firstSet.add(myValue); secondSet.add(myValue);
		}

		//Adding separator line to break up code
		System.out.println("***************** TESTING TO-STRING METHOD *********************");

		//Testing toString method
		System.out.println("Values in the first set: " + firstSet.toString() + "\n");
		System.out.println("Values in the second set: " + secondSet.toString() + "\n");

		//Adding separator line to break up code
		System.out.println("******************* TESTING EQUAL METHOD *******************");

		//printing out sets after values have been added
		System.out.println("Values in the first set: " + firstSet.toString() + "\n");
		System.out.println("Values in the second set: " + secondSet.toString() + "\n");

		//testing equal functionality
		System.out.println("Is the first set equal to the second set? " + firstSet.equals(secondSet) + '\n');
		System.out.println("Is the second set equal to the first set? " + secondSet.equals(firstSet) + '\n');

		//Adding separator line to break up code
		System.out.println("******************* TESTING REMOVE METHOD *******************");

		//Testing remove functionality from the first set
		System.out.println("Let's remove the largest value from the first set...\n");
		System.out.println("Values in the first set before removal: " + firstSet.toString() + "\n");

	
		firstSet.remove(firstSet.largest());

		System.out.println("Values in the first set after removal: " + firstSet.toString() + "\n");

		//Testing remove functionality from the second set
		System.out.println("Now let's remove the smallest value from the second set...\n");
		System.out.println("Values in the second set before removal: " + secondSet.toString() + "\n");

	
		secondSet.remove(secondSet.smallest());

		System.out.println("Values in the second set after removal: " + secondSet.toString() + "\n");

		//Testing Union method for Sets
		System.out.println("****************** TESTING UNION METHOD ********************");
		System.out.println("Now let combine the second set into the first set...");
		System.out.println("Values in the first set before union: " + firstSet.toString() + "\n");
		System.out.println("Values in the second set before union: " + secondSet.toString() + "\n");
		firstSet.union(secondSet);
		System.out.println("First set after union: " + firstSet.toString() + "\n");


		//clearing out first set after union
		System.out.println("****************** TESTING CLEARING METHOD ********************");
		System.out.println("CLEARING first set.....");
		firstSet.clear(); //clearing out first set after union

		System.out.println("Value of first set: " + firstSet.toString());
		System.out.println("Values of second set: " +  secondSet.toString() + "\n");

		//generating new values for first set
		System.out.println("************** ADDING VALUES TO FIRST SET ***************");
		System.out.println("Adding values to first set...\n");
		for (int i = 0; i <= 9; i++){
			int myValue = random.nextInt(20);
			firstSet.add(myValue);
		}

		System.out.println("Value of first set: " + firstSet.toString() + "\n");
		System.out.println("Values of second set: " +  secondSet.toString() + "\n");

		//testing the diff method for the Sets
		System.out.println("****************** TESTING DIFF METHOD ********************");
		System.out.println("Now let's test the difference between the first and second sets \n");
		System.out.println("Value of first set before diff method: " + firstSet.toString() + "\n");
		System.out.println("Values of second set before diff method: " +  secondSet.toString() + "\n");

		firstSet.diff(secondSet); //finding the difference and update the first set

		System.out.println("Value of first set after diff: " + firstSet.toString() + "\n");


		System.out.println("****************** TESTING INTERSECT METHOD ********************");
		secondSet.clear();
		for (int i = 0; i <= 9; i++){
			int myValue = random.nextInt(20);
			secondSet.add(myValue);
		}
		System.out.println("generating new values for second set: " + secondSet.toString() + "\n");
		System.out.println("Value of first set: " + firstSet.toString() + "\n");

		System.out.println("Now let's test the intersection between the first and second sets \n");
		secondSet.intersect(firstSet);

		// System.out.println("Value of first set after intersection method: " + firstSet.toString() + "\n");
		System.out.println("Values of second set after intersection method: " +  secondSet.toString() + "\n");


		System.out.println("****************** TESTING CONTAINS METHOD ********************");
		System.out.println("Testing if random number is in the sets");
		System.out.println("Value of first set: " + firstSet.toString() + "\n");
		System.out.println("Value of second set: " + secondSet.toString() + "\n");

		int myRandomValue = random.nextInt(20);
		System.out.println("Random integer: " + myRandomValue);
		System.out.println("Is this integer in the first set? "  + firstSet.contains(myRandomValue) + '\n');
		System.out.println("Is this integer in the second set? " + secondSet.contains(myRandomValue) + '\n');


		System.out.println("****************** TESTING ERROR HANDLING ********************");
		System.out.println("let's try to force an error message by removing an from an empty set....\n");
		System.out.println("Value of first set: " + firstSet.toString() + "\n");
		System.out.println("CLEARING first set.....");
		firstSet.clear(); //clearing out first set after union

		System.out.println("Value of first set: " + firstSet.toString());
		System.out.println("Now let's remove this value: " + myRandomValue + " from the first set. REMOVING NOW........ TESTING OVER!");
		firstSet.remove(myRandomValue);
	};
};