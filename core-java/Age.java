package CORE_JAVA;

	import java.util.Scanner;

	@SuppressWarnings("resource")
	public class Age {
	    public static void main(String[]args) throws Exception{

	      Scanner age = new Scanner (System.in);
	      System.out.println("Enter your age");
	      int a = age.nextInt();
	      System.out.println("Enter you name");
	      String b = age.next();

	  try{  
	     if(a >125 && a<0){         
	        throw new Exception();
	     }          
	    }
	    catch(AgeExcpt ex){
	    System.out.println("You entered an invalid number" + a);        
	    }
	    finally{
	        System.out.println("Your age is " + a);
	        System.out.println("Your name is " + b);
	    }   
	}
	}
	 @SuppressWarnings("serial")
	    public class AgeExcpt extends Exception {

	         public AgeExcpt(){     
	         super("The Age you've entered is not valid");       
	    }
	  }
