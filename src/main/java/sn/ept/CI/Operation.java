package sn.ept.CI;

public class Operation
{
/**
	*This method computes the sum of two double values
	*@param a first double value
	* @param b second double value
	* @return a+b the sum of a and b
	*/
	public int add(int a, int b) {
		return a+b;
	}
	
	public double add(double a, double b) {
		return a + b;
	}
/**
	*This method computes the diff of two double values
	*@param a first double value
	* @param b second double value
	* @return a+b the product of a and b
	*/
    public int sub(int a, int b) {
    	return a-b;
    }
    public double sub(double a, double b) {
    	return a-b;
    }
/**
	*This method computes the product of two double values
	*@param a first double value
	* @param b second double value
	* @return a*b the product of a and b
	*/
    public int multiply(int a, int b) {
    	return a*b;
    }
    public double multiply(double a, double b) {
    	return a*b;
    }
/**
	*This method computes the square of a int value
	*@param a int value
	* @return a*a the product of a and a
	*/
    public int square(int a) {
    	return a*a;
    }
/**
   	*This method computes the double of a int value
   	*@param a int value
   	* @return 2*a the product of a and a
   	*/
       public int twice(int a) {
       	return 2*a;
       }
}
