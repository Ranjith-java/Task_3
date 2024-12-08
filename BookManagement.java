package Task_3;

import java.util.Scanner;

public class BookManagement {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] bid = new int[5];
        String[] tt = new String[5], au = new String[5], is = new String[5];
        Library lib=new Library();
        int i;
        System.out.println("Enter five book records");
                for (i = 0; i<5; i++) { //for loop used to get book details
            bid[i] = s.nextInt();
            tt[i] = s.next();
            au[i] = s.next();
            is[i] = s.next();
        }
        for (int j = 0; j < 5; j++) {     // for loop to call addbook function
            int b=bid[j];
            String t=tt[j];
            String a=au[j];
            String iss=is[j];
            lib.addbook(b,t,a,iss);
        }

            // display method called to display the records in list
        System.out.println("please find the book records list with boookid title author and avail status");

        for (int j = 0; j < 5; j++) {
            lib.displaybook();
        }
        // enter value to search book..... enter only book id number
            System.out.println("type bookid to search book");
            int sid=s.nextInt();
            lib.searchbook(sid);
    // enter the bookid to deleted
        System.out.println("enter bookid to be deleted");
        int dd=s.nextInt();
        lib.deletebook(dd);
        lib.displaybook();
}

    }

