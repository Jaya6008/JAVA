package CORE_JAVA;

import java.awt.color.CMMException;

public class LN_FN
{
public void MyException(String s)
	    {
	        // Call constructor of parent Exception
	        super(s);
	    }
	}
	  
	// A Class that uses above MyException
	public class Main {
	    // Driver Program
	    public static void main(String args[])
	    {
	        try {
	            // Throw an object of user defined exception
	            throw new Exception("GeeksGeeks");
	        }
	        catch (CMMException ex) {
	            System.out.println("Caught");
	  
	            // Print the message from MyException object
	            System.out.println(ex.getMessage());
	        }
	    }
}
