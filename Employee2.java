package Task_3;
import java.util.Scanner;

public class Employee2 implements Taxable {
    @Override
        public void calcTax(int eid) {
            for (int i = 0; i < 2; i++) {
                if (empid[i] == eid) {
                    double tax = salary[i] * incometax;
                    int total=salary[i]-(int)tax;
                    System.out.println("Empid: "+empid[i] + " Tax 7%: "+tax+"  Toatalincome: " + total);
                }
            }
        }
     public int[] empid = new int[2];
    String[] empname = new String[2];
    public int[] salary = new int[2];
    int tax;

    public void addemp(int[] eid, String[] name, int[] sal) {
       // System.out.println("enter the employee details");

             for (int i = 0; i <2 ; i++) {
              empid[i] = eid[i];
            empname[i] = name[i];
            salary[i] = sal[i];

        }
    }
        public void dispaly() {
            for (int i = 0; i < 2; i++) {
                System.out.println(empid[i] + " " + empname[i] + " " + salary[i]);
            }

        }
          
}

