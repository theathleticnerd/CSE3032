import java.util.*;
class Task2
{
static class Node
{
    int data;
    Node next;
}
static Node newNode(int data)
{
    Node new_node = new Node();
    new_node.data = data;
    new_node.next = null;
    return new_node;
}
static Node partition(Node head, int x)
{
    Node smallerHead = null, smallerLast = null;
    Node greaterLast = null, greaterHead = null;
    Node equalHead = null, equalLast =null;
    while (head != null)
    {
        if (head.data == x)
        {
            if (equalHead == null)
                equalHead = equalLast = head;
            else
            {
                equalLast.next = head;
                equalLast = equalLast.next;
            }
        }
        else if (head.data < x)
        {
            if (smallerHead == null)
                smallerLast = smallerHead = head;
            else
            {
                smallerLast.next = head;
                smallerLast = head;
            }
        }
        else
        {
            if (greaterHead == null)
                greaterLast = greaterHead = head;
            else
            {
                greaterLast.next = head;
                greaterLast = head;
            }
        }
        head = head.next;
    }
    if (greaterLast != null)
        greaterLast.next = null;
 
    if (smallerHead == null)
    {
        if (equalHead == null)
            return greaterHead;
        equalLast.next = greaterHead;
        return equalHead;
    }
    if (equalHead == null)
    {
        smallerLast.next = greaterHead;
        return smallerHead;
    }
    smallerLast.next = equalHead;
    equalLast.next = greaterHead;
    return smallerHead;
}
static void printList(Node head)
{
    Node temp = head;
    while (temp != null)
    {
        System.out.print(temp.data + " ");
        temp = temp.next;
    }
}
public static void main(String[] args)
{
    Node head = newNode(10);
    head.next = newNode(4);
    head.next.next = newNode(5);
    head.next.next.next = newNode(30);
    head.next.next.next.next = newNode(2);
    head.next.next.next.next.next = newNode(50);
 
    int x = 3;
    head = partition(head, x);
    printList(head);
}
}