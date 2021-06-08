/*
QUE: Develop a java application with Employee class with Emp_name Emp_id,Address,Mail_id,Mobile_no
as members. Inherit the classes,Programmer,AssistantProfessor,Associate Professor and Professor from
employee class.Add BasicPay(BP)as the member of all the inherited classes with 97% of BP as DA,
10% of BP as HRA,12% of BP as PF, 0.1% of BP for staff club fund. Generate pay slips for the employees
with their gross and net salary.
*/
import java.util.Scanner;
class Employee
{
    int Emp_id;
    String Emp_name;
    String Address;
    String Mail_Id;
    String Mobile_no;
    Employee(){}
    Employee(int id,String name,String addr,String mail,String mob)
    {
        this.Emp_id = id;
        this.Emp_name = name;
        this.Address = addr;
        this.Mail_Id = mail;
        this.Mobile_no = mob;
    }
}
class Programmer extends Employee
{
    double BP,Gross_salary,Net_salary;
    public Programmer(int id,String name,String addr,String mail,String mob)
    {
        super(id,name,addr,mail,mob);
    }
    void computePay() {
        System.out.print("Enter Basic Pay:");
        Scanner input = new Scanner(System.in);
        BP = input.nextDouble();
        double DA, HRA, PF, Fund;
        DA = (BP * 97 / 100);
        HRA = (BP * 10 / 100);
        PF = (BP * 12 / 100);
        Fund = (BP * 0.1 / 100);
        Gross_salary = BP + DA + HRA;
        Net_salary = BP + DA + HRA - (PF + Fund);
        System.out.println("Emp_ID: " + Emp_id + " Emp_Name: " + Emp_name);
        System.out.println("Address: " + Address);
        System.out.println("Mail_ID: " + Mail_Id + " Mobile Number: " + Mobile_no);
        System.out.println("Gross Pay: " + Gross_salary + " Net Pay: " + Net_salary);
    }
}
class Asst_Professor extends Employee
{
    double BP,Gross_salary,Net_salary;
    public Asst_Professor(int id,String name,String addr,String mail,String mob)
    {
        super(id,name,addr,mail,mob);
    }
    void computePay() {
        System.out.print("Enter Basic Pay:");
        Scanner input = new Scanner(System.in);
        BP = input.nextDouble();
        double DA, HRA, PF, Fund;
        DA = (BP * 97 / 100);
        HRA = (BP * 10 / 100);
        PF = (BP * 12 / 100);
        Fund = (BP * 0.1 / 100);
        Gross_salary = BP + DA + HRA;
        Net_salary = BP + DA + HRA - (PF + Fund);
        System.out.println("Emp_ID: " + Emp_id + " Emp_Name: " + Emp_name);
        System.out.println("Address: " + Address);
        System.out.println("Mail_ID: " + Mail_Id + " Mobile Number: " + Mobile_no);
        System.out.println("Gross Pay: " + Gross_salary + " Net Pay: " + Net_salary);
    }
}
class Associate_Professor extends Employee
{
    double BP,Gross_salary,Net_salary;
    public Associate_Professor(int id,String name,String addr,String mail,String mob)
    {
        super(id,name,addr,mail,mob);
    }
    void computePay() {
        System.out.print("Enter Basic Pay:");
        Scanner input = new Scanner(System.in);
        BP = input.nextDouble();
        double DA, HRA, PF, Fund;
        DA = (BP * 97 / 100);
        HRA = (BP * 10 / 100);
        PF = (BP * 12 / 100);
        Fund = (BP * 0.1 / 100);
        Gross_salary = BP + DA + HRA;
        Net_salary = BP + DA + HRA - (PF + Fund);
        System.out.println("Emp_ID: " + Emp_id + " Emp_Name: " + Emp_name);
        System.out.println("Address: " + Address);
        System.out.println("Mail_ID: " + Mail_Id + " Mobile Number: " + Mobile_no);
        System.out.println("Gross Pay: " + Gross_salary + " Net Pay: " + Net_salary);
    }
}
class Professor extends Employee
{
    double BP,Gross_salary,Net_salary;
    public Professor(int id,String name,String addr,String mail,String mob)
    {
        super(id,name,addr,mail,mob);
    }
    void computePay() {
        System.out.print("Enter Basic Pay:");
        Scanner input = new Scanner(System.in);
        BP = input.nextDouble();
        double DA, HRA, PF, Fund;
        DA = (BP * 97 / 100);
        HRA = (BP * 10 / 100);
        PF = (BP * 12 / 100);
        Fund = (BP * 0.1 / 100);
        Gross_salary = BP + DA + HRA;
        Net_salary = BP + DA + HRA - (PF + Fund);
        System.out.println("Emp_ID: " + Emp_id + " Emp_Name: " + Emp_name);
        System.out.println("Address: " + Address);
        System.out.println("Mail_ID: " + Mail_Id + " Mobile Number: " + Mobile_no);
        System.out.println("Gross Pay: " + Gross_salary + " Net Pay: " + Net_salary);
    }
}
public class PaySlip
{
    public static void main(String[] args)
    {
        Programmer p = new Programmer(10, "AAA", "xxx", "aaa_xxx@gmail.com", "1111111111");
        System.out.println("------- Programmer ----------");
        p.computePay();
        Asst_Professor Ap = new
                Asst_Professor(20, "BBB", "yyy", "bbb_yyy@gmail.com", "2222222222");
        System.out.println("------- Assistant Professor ----------");
        Ap.computePay();
        Associate_Professor As = new
                Associate_Professor(30, "CCC", "zzz", "ccc_zzz@gmail.com", "3333333333");
        System.out.println("------- Associate Professor ----------");
        As.computePay();
        Professor pf = new
                Professor(40, "DDD", "www", "ddd_www@gmail.com", "44444444444");
        System.out.println("------- Professor ----------");
        pf.computePay();
    }
}