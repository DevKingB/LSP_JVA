package org.howard.edu.lsp.midterm.problem51;


/**
 * This script is for creating the EmptyRangeException
 * @author brtah
 *
 */
public class EmptyRangeException extends Exception {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * taking in errors for exception
	 * @param errors takes in a string as an error for the Errors class
	 */
	public EmptyRangeException(String errors) {
        super(errors);
    }
}