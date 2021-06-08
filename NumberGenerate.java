/*
QUE: Write a java program that implements a multi-threaded
application that has three threads. First thread generates a
random integer every 1 second and if the value is even, second
thread computes the square of the number and prints. If the value
is odd, the third thread will print the value of cube of the number.
*/
import java.util.*;
class NumberGenerate
{
    private int value;
    private boolean flag;
    public synchronized void put()
    {
        while (flag)
        {
            try
            {
                wait();
            } catch (InterruptedException e) { }
        }
        flag = true;
        Random random = new Random();
        this.value = random.nextInt(10);
        System.out.println("The generated Number is: "+value);
        notifyAll();
    }
    public synchronized void get1()
    {
        while (!flag) {
            try {
                wait();
            }
            catch (InterruptedException e) { }
        }
        if(value%2==0)
        {
            System.out.println("Second is executing now...");
            int ans=value*value;
            System.out.println(value+" is Even Number and its square is: "+ans);
        }
        flag = false;
        notifyAll();
    }
    public synchronized void get2()
    {
        while (!flag)
        {
            try
            {
                wait();
            }
            catch (InterruptedException e) { }
        }
        if(value%2!=0)
        {
            System.out.println("Third Thread is executing now...");
            int ans=value*value*value;
            System.out.println(value+" is Odd Number and its cube is: "+ans);
        }
        flag = false;
        notifyAll();
    }
}
class main
{
    public static void main(String[] args)
    {
        final NumberGenerate obj = new NumberGenerate();
        Thread producerThread = new Thread()
        {
            public void run()
            {
                for(int i=1;i<=6;i++)
                {
                    System.out.println("Main thread started...");
                    obj.put();
                    try
                    {
                        Thread.sleep(1000);
                    }
                    catch(InterruptedException e){}
                }
            }
        };
        Thread consumerThread1 = new Thread()
        {
            public void run()
            {
                for(int i=1;i<=3;i++)
                {
                    obj.get1();
                    try
                    {
                        Thread.sleep(2000);
                    }
                    catch(InterruptedException e){}
                }
            }
        };
        Thread consumerThread2 = new Thread()
        {
            public void run() {
                for(int i=1;i<=3;i++)
                {
                    obj.get2();
                    try
                    {
                        Thread.sleep(3000);
                    }
                    catch(InterruptedException e){}
                }
            }
        };
        producerThread.start();
        consumerThread1.start();
        consumerThread2.start();
    }
}