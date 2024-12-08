package Task_3;

public class Library {
    static Book[] b=new Book[5];// array to create class object
    public int bno = 0;
    public int bbno=0;
   // add method to add book details
    public void addbook(int bid, String tt, String au, String isavail) {

        b[bno] = new Book(bid, tt, au, isavail);
        bno++;
    }
            public void searchbook (int bo) { //search methos to search book
                 int i;
                boolean b1 = false;
                for (i = 0; i < b.length; i++) {
                    if ((bo == b[i].bookid)) {
                        b1 = true;
                    }
                }
                if (b1) {
                    System.out.println("avail");
                } else {
                    System.out.println("not avail");
                }
            }

        public void displaybook() {  // display method to display the entered records of book

            System.out.println(b[bbno].toString());
            bbno++;
        }
        public void deletebook(int bo){ //delete method to delete the record
            int i;
            //boolean b1 = false;
            for (i = 0; i < b.length-1; i++) {
                if ((bo == b[i].bookid)) {
                    b[i] = null;
                    System.out.println("record deleted");
                }
            }

        }
    }

