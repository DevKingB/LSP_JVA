package org.howard.edu.lsp.assignment5;


/**
 * This script is for creating the IntegerSetException
 * @author brtah
 *
 */
public class IntegerSetException extends Exception {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * taking in errors for exception
	 * @param errors takes in a string as en error for the Errors class
	 */
	public IntegerSetException(String errors) {
        super(errors);
    }
}