package Task_3;

import java.util.Scanner;
public class DriverMain {
    static Employee2 ee= new Employee2();
    static Product2 pp=new Product2();
        public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int[] empid=new int[2];
        int[] salary=new int[2];
        String[] empname=new String[2];
        int[] pid=new int[2];
        int[] price=new int[2];
        String[] pname=new String[2];
        System.out.println("Enter the employee details");
        for (int i = 0; i < 2; i++) {
            empid[i] = s.nextInt();
            empname[i] = s.next();
            salary[i] = s.nextInt();
        }
               ee.addemp(empid,empname,salary);
              ee.dispaly();
            System.out.println("enter the empi id");
             int e2=s.nextInt();
             ee.calcTax(e2);
            System.out.println("");

            System.out.println("Enter the product details");
            for (int i = 0; i < 2; i++) {
                pid[i] = s.nextInt();
                pname[i] = s.next();
                price[i] = s.nextInt();
            }
            pp.addpro(pid,pname,price);
            pp.pdispaly();
            System.out.println("enter the pid id");
            int e3=s.nextInt();
            pp.calcTax(e3);

    }
}
