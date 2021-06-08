/*
QUE: Design a Java interface for ADT Stack.Implement this interface using
array. Provide necessary exception handling in both the implementations.
*/
import java.io.*;
import java.util.*;
interface interface1
{
    void push(int item);
    int pop();
}
class ArrStack implements interface1
{
    int size;
    int[] st;
    private int top;
    private int items_count;
    public ArrStack(int Max)
    {
        size = Max;
        st = new int[size];
        top = -1;
    }
    public void push(int item)
    {
        try
        {
            st[++top] = item;
        }
        catch(Exception e)
        {
            System.out.println("\n Satck Full!! Can not insert element");
        }
    }
    public int pop()
    {
        int item;
        try
        {
            item = st[top];
            top--;
            return item;
        }
        catch(Exception e)
        {
            System.out.println("\n Satck Empty!!Can not pop the element");
            return -1;
        }
    }
public void display()
{
    System.out.println("\n Stack contains:");
    for(int i=top;i>=0;i--)
    {
        if(top==-1)
            System.out.println("Stack is empty");
        else if(size==top)
            System.out.println("Stack is Full");
        else
            System.out.println(" "+st[i]);
    }
}
}
class Stack
{
    public static void main(String[] args)
    {
        ArrStack obj = new ArrStack(10);  // stack holds 10 items
        System.out.println("\n---------------------------------------");
        System.out.println("\n\t Stack using Array");
        System.out.println("\n---------------------------------------");
        obj.push(10);
        obj.push(20);
        obj.push(30);
        obj.display();
        System.out.println("\n The Popped item is "+obj.pop());
        obj.display();
    }
}