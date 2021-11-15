import java.util.Stack;
import java.io.*;
import java.util.*;
 
public class MinStack {
 
   private Stack<Integer> st;
   private Stack<Integer> minSt;
 
   public MinStack() {
      st = new Stack<>();
      minSt = new Stack<>();
   }
 
   public void push(int data) {
 
      int min = data;
 
      if(!minSt.isEmpty() && min > minSt.peek()) {
          min = minSt.peek();
      }
      
      st.push(data);
      minSt.push(min);
   }
 
   public void pop() {
 
      st.pop();
      minSt.pop();
   }
 
   public int top() {
     return st.peek();
   }
 
   public int printMinimum() {
      return minSt.peek();
   }
   
   
 
 
   public static void main(String[] args) {
     
     MinStack minElem = new MinStack();
     int n;
     
     while (true) {
   System.out.println("\nEnter your choice\n1)PUSH\n2)POP\n3)Print Minimum\n4)EXIT");
   Scanner sc = new Scanner(System.in);
   int ch = sc.nextInt();
   switch (ch) {
    case 1:
     System.out.println("Enter Element");
     n = sc.nextInt();
     minElem.push(n);
     
     break;
    case 2:
     //minElem.pop();
     System.out.println("Last entered element has been popped which is :"+minElem.top());
     minElem.pop();
     break;
    case 3:
     System.out.println("The Minimum element is: "+minElem.printMinimum());
     break;
    case 4:
     System.exit(0);
    default:
     System.out.println("Wrong option");
   }
	
	}
	     
 
   }
}