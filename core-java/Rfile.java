package CORE_JAVA;

import java.util.*;
import java.io.*;

class Rfile
{
   public static void main (String args[]) throws IOException
        {
            int j=1;
            char Ch;
            try (Scanner scr = new Scanner(System.in)) {
				System.out.print("\nEnter File name: ");
				String str=scr.next();
				try (FileInputStream f = new FileInputStream(str)) {
					System.out.println("\nContents of the file are");
					int n=f.available();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            System.out.print(j+": ");
            int n = 0;
			for(int i=0;i<n;i++)
            {
                        InputStream f = null;
						Ch=(char)f.read();
                        System.out.print(Ch);
                        if(Ch=='\n')
                        {
                                    System.out.print(++j+": ");
                                   
                        }
                                   
            }
}

}
