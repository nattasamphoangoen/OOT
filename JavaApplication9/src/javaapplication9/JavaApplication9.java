
package javaapplication9;
import java.lang.*;
import java.util.*;
import java.io.*;

import java.util.Stack;

public class JavaApplication9 {
    public static void main(String[] args) throws IOException
      {
      String input;
      int output;

      while(true)         {
         System.out.print("Enter postfix: ");
         System.out.flush();
         input = getString();        
         if( input.equals("") )       
            break;
                                      
         NewClass aParser = new NewClass(input);
         output = aParser.doParse(); 
         System.out.println("Ans = " + output);
         }  
      System.out.println();
      }  

   public static String getString() throws IOException
      {
      InputStreamReader isr = new InputStreamReader(System.in);
      BufferedReader br = new BufferedReader(isr);
      String s = br.readLine();
      return s;
      }
}
