import java.util.*;
class StackQueue2 {
 int MAXSIZE=8;
 int stack[]= new int[8];
 int top=-1;
 int isempty(){
    if(top == -1)
        return -1;
    else
        return 0;
 }
 int isfull(){
    if(top == MAXSIZE)
        return 1;
    else
        return 0;
 }
 int peek(){
    return stack[top];
 }
 int pop(){
    int data;
    if(!isempty()){
        data = stack[top];
        top=top-1;
        return data;
    } 
    else {
        System.out.println("Could not retrieve data, Stack is empty.");
    }
 }
 int push(int data){
    if(!isfull()){
        top=top + 1;
        stack[top]=data;
    } 
    else {
        System.out.println("Could not insert data. Stack is full");
    }
 }
public static int main(String[] args){
    //push items on to the stack
    push(3);
    push(5);
    push(9);
    push(1);
    push(12);
    push(15);

    System.out.println("Element at the top of the stack : %d\n", peek());
    System.out.println("Elements: \n");
    //print stack data
    while(!isempty()){
        int data = pop();
        System.out.println("Stack full: \n",isfull()?"true":"false");
        System.out.println("Stack empty: \n",isempty()?"true":"false");
    }
}
 
} 
