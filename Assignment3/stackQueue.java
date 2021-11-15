import java.util.*;
class stackQueue{
    static class Stack{
        //two inbuilt queues
        static Queue<Integer> q1 = new LinkedList<Integer>();
        static Queue<Integer> q2 = new LinkedList<Integer>();
        
        //to maintain current number of elements
        static int curr_size;
        Stack(){
            curr_size=0;
        }
        static void push(int x){
            curr_size++;
            //push x first in empty q2
            q2.add(x);
            //push all the remaining elements in q1 to q2
            while(!q1.isEmpty()){
                q2.add(q1.peek());
                q1.remove();
            }
            //swap the names of two queues
            Queue<Integer> q=q1;
            q1=q2;
            q2=q;
        }
        static void pop(){
            //if no elements are there in q1
            if(q1.isEmpty())
                return;
            q1.remove();
            curr_size--;
        }
        static int top(){
            if(q1.isEmpty())
                return -1;
            return q1.peek();
        }
        static int size(){
            return curr_size;
        }
    }
    //driver code
    public static void main(String[] args){
        Stack s = new Stack();
        s.push(10);
        s.push(54);
        s.push(89);
        s.push(45);
        s.push(3);
        System.out.println("Current Size: "+ s.size());
        System.out.println(s.top());
        s.pop();
        System.out.println(s.top());
        s.pop();
        System.out.println(s.top());

        System.out.println("Current Size: "+ s.size());
    }
}
