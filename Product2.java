package Task_3;

public class Product2 implements Taxable{

    public void calcTax(int eid) {
        for (int i = 0; i < 2; i++) {
            if (pid[i] == eid) {
                double tax = price[i] * salestax;
                int total=price[i]-(int)tax;
                System.out.println("Empid: "+pid[i] + "  Tax10.5: "+tax+" Toatal price: " + total);
            }
        }
    }
    public int[] pid = new int[2];
    String[] proname = new String[2];
    public int[] price = new int[2];


    public void addpro(int[] p, String[] pname, int[] rs) {
        // System.out.println("enter the employee details");

        for (int i = 0; i <2 ; i++) {
            pid[i] = p[i];
            proname[i] = pname[i];
            price[i] = rs[i];

        }
    }

    public void pdispaly() {
        for (int i = 0; i < 2; i++) {
            System.out.println(pid[i] + " " + proname[i] + " " + price[i]);
        }

    }
}
