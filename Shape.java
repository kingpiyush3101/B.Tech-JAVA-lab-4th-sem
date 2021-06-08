/*
QUE: Write a Java Progra to create an abstract class named Shape than
contains two integers and an empty method named printArea(). Provide three
classes named Rectangle,Triangle and Circle such that each one of the classes
extends the class Shape.Each one of the classes contains only the method
printArea() that prints the area of the given shape.
*/
import java.util.Scanner;
abstract class Shape {
    abstract void Printarea();
    int a,b;
    Scanner sc = new Scanner(System.in);
}
class Rectangle extends Shape {

    void Printarea() {
        System.out.println("<--- Rectangle --->");
        System.out.println("Enter length: ");
        a = sc.nextInt();
        System.out.println("Enter bredth: ");
        b = sc.nextInt();
        System.out.println("area of rectangle is "+(a*b));
    }
}
class Triangle extends Shape {
    void Printarea() {
        System.out.println("<--- Triangle --->");
        System.out.println("Enter height: ");
        a = sc.nextInt();
        System.out.println("Enter base: ");
        b = sc.nextInt();
        System.out.println("area of triangle is "+(0.5*a*b));
    }
}
class Circle extends Shape {
    void Printarea() {
        System.out.println("<--- Circle --->");
        System.out.println("Enter radius: ");
        a = sc.nextInt();
        System.out.println("area of circle is "+(3.14*a*a));
    }
}
class display {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("<--- Area Calculator --->\n 1 for Rectangle \n 2 for Triangle \n 3 for Circle \n");
        System.out.println("Enter Choice: ");
        int ch = sc.nextInt();
        switch (ch) {
            case 1:
                Rectangle R = new Rectangle();
                R.Printarea();
                break;
            case 2:
                Triangle T = new Triangle();
                T.Printarea();
                break;
            case 3:
                Circle C = new Circle();
                C.Printarea();
                break;
            default:
                System.out.println("Entered Choice is incorrect");
        }
    }
}
