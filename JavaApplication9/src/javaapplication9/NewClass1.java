
package javaapplication9;
import java.io.*;  
public class NewClass1 {
    private int maxSize;
   private int[] stackArray;
   private int top;

   public NewClass1(int size)    
      {
      maxSize = size;
      stackArray = new int[maxSize];
      top = -1;
      }

   public void push(int j)    
      { stackArray[++top] = j; }

   public int pop()           
      { return stackArray[top--]; }

   public int peek()           
      { return stackArray[top]; }

   public boolean isEmpty()    
      { return (top == -1); }

   public boolean isFull()     
      { return (top == maxSize-1); }

   public int size()          
      { return top+1; }

   public int peekN(int n)     
      { return stackArray[n]; }
   
}

 