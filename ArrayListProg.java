/*
QUE: Write a program to perform string operations using ArrayList.
Write functions for the following :
a. Append - add at end
b. Insert - add at particular index
c. Search
d. List all string starts with given letter
*/
import java.util.*;
class Lst
{
    Scanner sc;
    String str;
    public void append(ArrayList AL) {
        char ans;
        do {
            System.out.println("Enter string: ");
            sc = new Scanner(System.in);
            str = sc.next();
            AL.add(str);
            System.out.println("Do you want to append more string: ");
            ans = sc.next().charAt(0);
        } while (ans == 'y');
        System.out.println("The array elements are... " + AL);
        System.out.println("The array size is...  " + AL.size());
    }
    public void insert(ArrayList AL) {
        System.out.println("Enter string: ");
        sc = new Scanner(System.in);
        str = sc.next();
        System.out.println("Enter index at which the string is to be inserted: ");
        sc = new Scanner(System.in);
        int index = sc.nextInt();
        AL.add(index, str);
        System.out.println("The array elements are... " + AL);
    }
    public void search(ArrayList AL) {
        append(AL);
        String searchStr;
        System.out.println("Enter string for searching ");
        sc = new Scanner(System.in);
        searchStr = sc.next();
        boolean found = false;
        Iterator<String> iter = AL.iterator();
        String curItem = "";
        int pos = 0;
        while (iter.hasNext() == true) {
            pos = pos + 1;
            curItem = (String) iter.next();
            if (curItem.equals(searchStr)) {
                found = true;
                break;
            }
        }
        if (found == false) {
            pos = 0;
        }
        if (pos != 0) {
            System.out.println(searchStr + " String Found in position : " + pos);
        } else {
            System.out.println(searchStr + " String not found");
        }
    }
    public void find(ArrayList AL) {
        append(AL);
        Object[] objs = AL.toArray(new String[0]);
        String[] str_list = new String[objs.length];
        System.arraycopy(objs, 0, str_list, 0, objs.length);
        System.out.println("Enter starting letter: ");
        sc = new Scanner(System.in);
        String searchChar = sc.next();
        System.out.println("The strings starting with letter " + searchChar + " are...");
        for (int i = 0; i < str_list.length; i++)//Iterate through array of strings
        {
            if (str_list[i].startsWith(searchChar))
                System.out.println(str_list[i]);
        }
    }
}
class ArrayListProg
{
    public static void main(String[] args)
    {
        System.out.println("\n\t\t Program for Implementing Array List for List of Strings");
        ArrayList AL=new ArrayList<String>();                //creation of ArrayList
        Lst obj=new Lst();
        char ans;
        do
        {
            System.out.println("Main Menu");
            System.out.println("1. Append \n2. Insert at particular Index \n3. Search \n4. List strings");
            System.out.print("Enter your choice: ");
            Scanner sc=new Scanner(System.in);
            int choice=sc.nextInt();
            switch(choice)
            {
                case 1:obj.append(AL);
                    break;
                case 2:obj.insert(AL);
                    break;
                case 3:obj.search(AL);
                    break;
                case 4:obj.find(AL);
                    break;
            }
            System.out.println("Do you want to go to Main Menu?(y/n): ");
            ans=sc.next().charAt(0);
        }while(ans=='y');
    }
}

