package Constructors;

class Books{
    private String title;
    private String author;
    private int price;

    public Books(){
        this.title=" ";
        this.author=" ";
        this.price=0;
    }
    public Books(String title,String author){
        this.title=title;
        this.author=author;
        this.price=0;
    }
    public Books(String title,String author,int price){
        this.title=title;
        this.author=author;
        this.price=price;
    }

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public int getPrice(){
        return price;
    }
}


public class BookSystem {
    public static void main(String[] args) {
    Books book = new Books();
    Books book1= new Books("A BOY","Max");
    Books book2= new Books("The Hippo","Kevin",100);

        System.out.println("Book "+ book.getTitle()+ " " + book.getAuthor() + " " + book.getPrice() );
        System.out.println("Book "+ book1.getTitle()+ " " + book1.getAuthor() + " " + book1.getPrice() );
        System.out.println("Book "+ book2.getTitle()+ " " + book2.getAuthor() + " " + book.getPrice() );
    }
}
