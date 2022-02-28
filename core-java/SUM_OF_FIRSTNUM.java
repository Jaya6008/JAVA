package CORE_JAVA;
import java.util.Scanner;

public class SUM_OF_FIRSTNUM {

		private int sum=0;
		public int calculateSum(int n)
		   {
		     for(int i=0;i<=n;i++)
		         {
		            if(i%3==0||i%5==0)
		              {
		                 sum+=i;
		              }
		         }
		            return sum;
		       }
		       public static void main(String[] ar)
		       {
		              SUM_OF_FIRSTNUM s1 = new SUM_OF_FIRSTNUM();
		              Scanner scn= new Scanner(System.in);
		              int n=scn.nextInt();
		              System.out.println(s1.calculateSum(n));
		       }
		}

