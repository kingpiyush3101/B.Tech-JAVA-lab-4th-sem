/*
QUE: Develop a Java application to generate electricity bill.
create a class with following members:
1.consumer_name
2.consumer_number
3.previous_reading
4.current_reading
5.eb_connection - domestic,commercial
compute the bill amount using following method :
if type of eb connection is domestic then calculate amount to be paid :
0 to 100 unit - 1 Rs per unit
101 to 200 unit - 2.5 Rs per unit
201 to 500 unit - 4 Rs per unit
above 501 unit - 6 Rs per unit
if type of eb connection is commercial then calculate amount to be paid :
0 to 100 unit - 2 Rs per unit
101 to 200 unit - 4.5 Rs per unit
201 to 500 unit - 6 Rs per unit
above 501 unit - 7 Rs per unit
*/
import java.util.*;
class electricitybill {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner ins = new Scanner(System.in);
        String consumer_name;
        int consumer_number,eb_connection;
        double current_reading,previous_reading,total_bill = 0,units;
        System.out.print("\n\t Enter consumer number:");
        consumer_number = in.nextInt();
        System.out.print("\n\t Enter Type of connection (0 for Domestic or 1 for Commercial):");
        eb_connection = in.nextInt();
        System.out.print("\n\t Enter consumer name:");
        consumer_name = ins.nextLine();
        System.out.print("\n\t Enter previous month reading:");
        previous_reading = in.nextDouble();
        System.out.print("\n\t Enter current month reading:");
        current_reading = in.nextDouble();
        units = current_reading-previous_reading;
        if(eb_connection == 0)
        {
            if (units>=0 && units<=100)
                total_bill = 1 * units;
            else if (units>100 && units<=200)
                total_bill=(100*1)+((units-100)*2.5);
            else if(units>200 && units<=500)
                total_bill=(100*1)+(100*2.5)+((units-200)*4);
            else
                total_bill=(100*1)+(100*2.5)+(300*4)+((units-500)*6);
        }
        else if(eb_connection == 1)
        {
            if (units>=0 && units<=100)
                total_bill = 2 * units;
            else if (units>100 && units<=200)
                total_bill=(100*2)+((units-100)*4.5);
            else if(units>200 && units<=500)
                total_bill=(100*2)+(100*4.5)+((units-200)*6);
            else
                total_bill=(100*2)+(100*4.5)+(300*6)+((units-500)*7);
        }
        System.out.println("This electricity_bill is generated for consumer_number: "+consumer_number+" belongs to: "+consumer_name);
        System.out.println("units used: "+units);
        System.out.println("Total Bill amount: Rs."+total_bill);
    }
}