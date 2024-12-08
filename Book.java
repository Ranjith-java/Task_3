package Task_3;

public class Book {
    //global variables
    public int bookid;
    public String title, author, isavailable;

    public Book() {            //default constructor

    }
    public Book(int bid,String title,String author,String isavail){ // parameterised constructor
        this.bookid=bid;
        this.title=title;
        this.author=author;
        this.isavailable=isavail;
    }

        public String toString(){     //tostring method overriding
        return this.bookid+" "+this.title+" "+this.author+" "+this.isavailable;

    }
}