package org.howard.edu.lsp.midterm.problem51;

public class IntegerRange implements Range{
	private int lower;
	private int upper;
	
	//getter for lower-bound
	public int getLower() {
		return this.lower;
		
	}
	
	//getter for upper-bound
	public int getUpper() {
		return this.upper;
	}
	
	//implementing constructor
	IntegerRange(int lower, int upper){
		this.lower = lower;
		this.upper = upper;
	}
	
	//implementing contain method
	public boolean contains(int value) {
		if ((value >= this.lower) && (value <= this.upper)) {
			return true;
		}
		return false;
	}
	
	//implementing boolean overlaps method
	public boolean overlaps(Range other) throws EmptyRangeException {
        if (other == null) {
            throw new EmptyRangeException("The range is empty");
        }
        else {
            if (this.lower >= other.getLower() && (this.upper <= other.getUpper() || this.upper >= other.getUpper())) {
                if (this.lower > other.getUpper()) {
                    return false;
                }
                return true;
            }
            else if (this.lower <= other.getLower() && (this.upper <= other.getUpper() || this.upper >= other.getUpper())) {
                if (other.getLower() > this.upper) {
                    return false;
                }
                return true;
            }
            else {
                return false;
            }
        }
    }
	
	//implementing size method
	public int size() {
		return this.upper - this.lower;
	}
	
}
