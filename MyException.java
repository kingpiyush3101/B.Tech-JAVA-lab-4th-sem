/*
QUE: Write a Java program to implement user defined exception handling.
*/
class MyException extends Exception
{
    String str1;
    MyException(String str2)
    {
        str1=str2;
    }
    public String toString(){
        return ("MyException Occurred: "+str1) ;
    }
}

class exp{
    public static void main(String args[]){
        try{
            System.out.println("Starting of try block");
            throw new MyException("This is My error Message");
        }
        catch(MyException exp){
            System.out.println("Catch Block") ;
            System.out.println(exp) ;
        }
    }
}